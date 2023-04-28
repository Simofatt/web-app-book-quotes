package comm.octest.dao;

import java.sql.SQLException;
import java.util.List;

import comm.octest.beans.Observer;
import comm.octest.beans.User;

public interface UserDAO {
	
	 boolean validerInput(String name, String email, String password, String passwordc) throws SQLException, ClassNotFoundException;
	 boolean validEmail(String email, String currentEmail) throws SQLException;
	 void registration(Observer user);
	 boolean authentification(Observer user) ;
	 List<User> getUser(String email, int idUserConnected) throws SQLException;
	 int getId(String email) throws SQLException ;
	 void updateUserInfo(Observer user) throws SQLException;
	 void addLikedQuote(Observer user) throws SQLException;
	 void removeLikedQuote(Observer user) throws SQLException;
	 void insertNotification(int id_quote, int id_user) throws SQLException;
	 List<Observer> getUsers(int idUserConnected) throws SQLException;
	 void addFriend(int idUser1, int idUser2) throws SQLException;
	 
}