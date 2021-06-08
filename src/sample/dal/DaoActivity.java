package sample.dal;

import java.sql.SQLException;
import java.util.List;

public interface DaoActivity <T>{
    List<T> getALlActivitys();

}
