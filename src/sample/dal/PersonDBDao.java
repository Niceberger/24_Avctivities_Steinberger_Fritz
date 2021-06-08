package sample.dal;

import sample.bll.Person;

import java.sql.SQLException;
import java.util.List;

public class PersonDBDao {
    @Override
    public List<Person> getALlPerson() throws SQLException {
        return DatabaseManager.getInstance().getAllPersons();
    }

    @Override
    public boolean updatePerson(Person item) {
        return DatabaseManager.getInstance().updatePerson(item);
    }
}
