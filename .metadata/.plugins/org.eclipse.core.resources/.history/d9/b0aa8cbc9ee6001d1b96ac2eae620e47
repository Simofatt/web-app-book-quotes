package comm.octest.beans;

import java.io.IOException;
import java.io.StringReader;
import java.util.Hashtable;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.json.Json;
import javax.json.JsonObject;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import javax.websocket.server.ServerEndpointConfig;

@ServerEndpoint(value = "/chatroom/{pseudo}", configurator = ChatRoom.EndpointConfigurator.class)
public class ChatRoom {

	private static ChatRoom singleton = new ChatRoom();

	public ChatRoom() {
	}

	public static ChatRoom getInstance() {
		return ChatRoom.singleton;
	}

	private Hashtable<String, Session> sessions = new Hashtable<>();

	@OnOpen
	public void open(Session session, @PathParam("pseudo") String pseudo) {

		session.getUserProperties().put("pseudo", pseudo);
		sessions.put(session.getId(), session);

		sendMessage("Admin >>> Connection established for " + pseudo, "", pseudo);
	}

	@OnClose
	public void close(Session session) {
		String pseudo = (String) session.getUserProperties().get("pseudo");
		sessions.remove(session.getId());
		sendMessage("Admin >>> Connection closed for " + pseudo, "admin", pseudo);
	}

	@OnError
	public void onError(Throwable error) {
		System.out.println("Error: " + error.getMessage());
	}

	@OnMessage
	public void handleMessage(String message, Session session, @PathParam("destinataire") String destinataire)
			throws IOException {
		JsonObject json = Json.createReader(new StringReader(message)).readObject();
		String to = json.getString("to");
		AtomicBoolean isConnected = new AtomicBoolean(false);
		int x = 0;
		sessions.forEach((key, value) -> {
			if (value.getUserProperties().get("pseudo").equals(to)) {
				isConnected.set(true);
			}
		});

		if (isConnected.get() == false) {
			System.out.println("************Message Inserted in DB*************");
		}

		String messageContent = json.getString("message");
		String expediteur = (String) session.getUserProperties().get("pseudo");
		String fullMessage = messageContent;
		sendMessage(fullMessage, expediteur, to);
	}

	private void sendMessage(String message, String expediteur, String destinataire) {
		System.out.println(expediteur + " >>> " + message);

		// Recherche de la session du destinataire
		Session sessionDestinataire = null;
		for (Session s : sessions.values()) {
			String email = (String) s.getUserProperties().get("pseudo");
			if (email.equals(destinataire)) {
				sessionDestinataire = s;
				break;
			}
		}

		if (sessionDestinataire != null) {
			try {
				sessionDestinataire.getBasicRemote().sendText(expediteur + "," + destinataire + "," + message);
			} catch (Exception exception) {
				System.out.println("ERROR: cannot send message to " + sessionDestinataire.getId());
			}
		}
	}

	public static class EndpointConfigurator extends ServerEndpointConfig.Configurator {
		@Override
		@SuppressWarnings("unchecked")
		public <T> T getEndpointInstance(Class<T> endpointClass) {
			return (T) ChatRoom.getInstance();
		}
	}
}