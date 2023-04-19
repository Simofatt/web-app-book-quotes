package comm.octest.beans;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import comm.octest.db.DAO;

public class User {

	private String full_name;
	private String email;
	private int id_user;
	private String country;
	private String password;
	private Timestamp created_at;
	private String profile_img;
	private int id_type;
	private int id_quote;
	private String city;

	public User() {

	}

	public User(String name, String email) {
		this.full_name = name;
		this.email = email;

	}

	// CONSTRUCTOR TO GET THE USER INFO
	public User(String name, String country, String city, String password, Timestamp created_at) {
		this.full_name = name;
		this.country = country;
		this.city = city;
		this.created_at = created_at;
		this.password = password;

	}

	public List<User> getInfo(String email) throws SQLException {
		List<User> userInfo = new ArrayList<>();
		DAO pseudo = new DAO();
		userInfo = pseudo.getUser(email);
		return userInfo;

	}

	public boolean updateUserInfo(User user, String email_session) throws SQLException {

		DAO pseudo = new DAO();
		boolean valide = pseudo.validEmail(user.getEmail(), email_session);
		if (valide) {
			pseudo.updateUserInfo(user);
			return valide;

		}
		return valide;
	}

	public void popularPeople(int user_id) {
		// SQL REQUEST TO ADD IN THE MOSTPOPULARPEOPLE TABLE
	}

	// GETTERS AND SETTERS
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}

	public String getProfile_img() {
		return profile_img;
	}

	public void setProfile_img(String profile_img) {
		this.profile_img = profile_img;
	}

	public int getId_type() {
		return id_type;
	}

	public void setId_type(int id_type) {
		this.id_type = id_type;
	}

	public int getId_quote() {
		return id_quote;
	}

	public void setId_quote(int id_quote) {
		this.id_quote = id_quote;
	}

	public String getName() {
		return full_name;
	}

	public void setName(String name) {
		this.full_name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
