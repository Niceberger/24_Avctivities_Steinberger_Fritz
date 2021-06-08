package sample.dal;

import sample.bll.Person;

import java.sql.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonDBDao implements DaoPerson<Person>
{
    @Override
    public ArrayList<Person> getALlPerson() throws SQLException {
        return (ArrayList<Person>) DatabaseManager.getInstance().getAllPersons();
    }

    @Override
    public boolean updatePerson(Person item) {
        return DatabaseManager.getInstance().updatePerson(item);
    }




}
