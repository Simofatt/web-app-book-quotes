package comm.octest.dao;

import java.sql.SQLException;
import java.util.List;

public interface BookAuthorDAO<T> {
		List<T> fetch() throws SQLException ;
		public void insert (T object) throws SQLException;
		void update(T object) throws SQLException  ;
		void remove(T object) throws SQLException;
		void updateId(T object) throws SQLException ;

}
