package sample.dal;

import java.sql.SQLException;
import java.util.List;

public interface DaoActivity {
    List<T> getALlActivitys() throws SQLException;

}
