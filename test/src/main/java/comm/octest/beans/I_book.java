package comm.octest.beans;

import java.sql.SQLException;
import java.util.List;

public interface I_book {

	void save() throws SQLException;

	List<Book> fetchBook() throws SQLException;

	String getId_book();

	String getName_book();

	String getBook_img();

	String getAuthor();

	String getType();

	void setId_book(String id_book);

	void setName_book(String name_book);

	void setBook_img(String book_img);

	void setAuthor(String author);

	void setType(String type);

}