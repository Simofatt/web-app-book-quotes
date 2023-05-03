package comm.octest.beans;

import java.sql.SQLException;
import java.util.List;

public interface BookFlyweight {

	void save(BookFlyweight book) throws SQLException;

	List<BookFlyweight> fetchBooks() throws SQLException;

	int getId_book();

	String getName_book();

	String getBook_img();

	String getAuthor();

	String getType();

	void setId_book(int id_book);

	void setName_book(String name_book);

	void setBook_img(String book_img);

	void setAuthor(String author);

	void setType(String type);

	public int getId_quote();

	public void setId_quote(int id_quote);

	void updateBook(BookFlyweight book2) throws SQLException;

	void updateId(BookFlyweight book) throws SQLException;

	void removeBook(BookFlyweight book) throws SQLException;


}
