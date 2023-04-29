<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>

<%@ page import ="java.util.List" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
         <style>   <%@include file="/WEB-INF/ressources/css/chat.css"%> </style>
            <% 
	            String email        =  (String) session.getAttribute("email") ;
	            String withClientId =  (String) request.getParameter("withClientId") ;
              %>
           
   <script type="text/javascript">

      window.addEventListener("load", function (event) {
        let pseudo = "<%=email%>";
        let destinataire = "<%=withClientId%>";
        let ws = new WebSocket("ws://localhost:8085/test/chatroom/" + pseudo);
        let txtHistory = document.getElementById("discussion");
        let txtMessage = document.getElementById("txtMessage");
        txtMessage.focus();
        

        ws.addEventListener("open", function (evt) {
            console.log("Connection established");
        });
        
        
        let btnSend = document.getElementById("btnSend");
        btnSend.addEventListener("click", function (clickEvent) {
        	let fileInput = document.getElementById("fileInput");
            let file = fileInput.files[0];
            let reader = new FileReader();
        	  reader.onload = function(event) {
        	     let data = event.target.result;
        	     
            let message = {
                to: destinataire,
                from : pseudo,
                message: txtMessage.value,
                file: data
            };
            reader.readAsBinaryString(file);
            ws.send(JSON.stringify(message));
            txtHistory.innerHTML += '<div class="chat outgoing"> <div class="details"> <p>'+ txtMessage.value + '</p></div> </div>';
            txtMessage.value = "";
            txtMessage.focus();
        });
      });
        
        ws.addEventListener("message", function (evt) {
            let message_infos = evt.data;
            let infos_arr = message_infos.split(",");
            if(infos_arr[0] == destinataire){
            	console.log("Receive new message: " + message_infos);
                txtHistory.innerHTML += '<div class="chat incoming"> <div class="details"> <p>'+ infos_arr[2]+ '</p></div> </div>';
            }
        });
    

        ws.addEventListener("close", function (evt) {
            console.log("Connection closed");
        });

        let btnClose = document.getElementById("btnClose");
        btnClose.addEventListener("click", function (clickEvent) {
            ws.close();
        });

    });

</script>
     
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"/>

    </head>
    <body>

    <div class="wrapper">
        <section class="chat-area">
            <header>
                <a href="ContactsServlet" class="back-icon"><i class="fas fa-arrow-left"></i></a>
                <img src="imageProfileServlet" alt="">
                <div class="details">
                    <span><%=withClientId%></span>
                    <p>status</p>
                </div>
            </header>
            

            <div id="discussion" class="chat-box">

            </div>
            <div class="typing-area">
                <input type="text" class="incoming_id" name="incoming_id" value="<?php echo $user_id; ?>" hidden>
                <input type="text" name="message" id="txtMessage" class="input-field" placeholder="Type a message here..." autocomplete="off">
                <button id="btnSend"><i class="fab fa-telegram-plane"></i></button>
            </div>
        </section>
    </div>

    </body>
   
</html>
