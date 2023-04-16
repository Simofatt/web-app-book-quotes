package comm.octest.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import comm.octest.beans.User;

public class pseudo {

	private String email;
	Connection connexion = null;
	Statement statement = null;
	ResultSet resultat = null;

	public pseudo() {
	}

	public pseudo(String email) {
		this.email = email;
	}

	public ArrayList<String> getContacts() {
		ArrayList<String> contacts = new ArrayList<String>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/chat", "root", "");
			statement = connexion.createStatement();

			PreparedStatement preparedStatement = connexion.prepareStatement(
					"SELECT pseudo_ami,pseudo_user FROM friends WHERE pseudo_user = ? or pseudo_ami=?");
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, email);
			System.out.println("email : " + email);
			ResultSet resultat = preparedStatement.executeQuery();

			while (resultat.next()) {
				String PseudoAmi = resultat.getString("pseudo_ami");
				String PseudoUser = resultat.getString("pseudo_user");
				if (PseudoAmi.equals(email)) {
					contacts.add(PseudoUser);
				} else {
					contacts.add(PseudoAmi);
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return contacts;

	}

	public void insert(User user) {

		String email = user.getEmail();
		String password = user.getPassword();
		System.out.println(user.getEmail());

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/chat", "root", "");
			System.out.println("Connexion reussite ");
			PreparedStatement preparedStatement = connexion
					.prepareStatement("INSERT INTO user(email, password) VALUES (?,?)");
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			preparedStatement.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public boolean authentification(User user) {

		String email = user.getEmail();
		String password = user.getPassword();
		boolean auth = false;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/chat", "root", "");
			PreparedStatement preparedStatement = connexion
					.prepareStatement("SELECT password FROM user WHERE email = ?");
			preparedStatement.setString(1, email);
			ResultSet resultat = preparedStatement.executeQuery();

			if (resultat.next()) {
				String passwordBb = resultat.getString("password");
				if (password.equals(passwordBb)) {
					auth = true;
				}
			} else {
				auth = false;
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		return auth;
	}

}
