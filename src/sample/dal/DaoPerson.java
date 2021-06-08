package sample.dal;

import java.sql.SQLException;
import java.util.List;

public interface DaoPerson<T> {
    List<T> getALlBooks() throws SQLException;

    boolean updateBook(T item);
}
