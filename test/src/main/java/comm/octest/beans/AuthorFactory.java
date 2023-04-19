package comm.octest.beans;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthorFactory {
	private static Map<String, Author> authors = new HashMap<>();

	public Author addAuthor(String author_name) throws SQLException {
		// CREATE THE KEY
		String key = author_name;
		System.out.print(key);
		fetchAuthors();
		Author author = (Author) authors.get(key);
		System.out.print("AAAA");
		// IF IT DOESN'T EXIST, CREATE A NEW ONE IN THE MAP
		if (author == null) {
			author = new Author(author_name);
			authors.put(key, author);
			author.save();
		}

		return author;
	}

	public void fetchAuthors() throws SQLException {
		Author author = new Author();
		List<Author> authorsList = author.fetchAuthor();
		for (Author a : authorsList) {
			String key = a.getAuthor_name();
			authors.put(key, a);

		}
	}

}