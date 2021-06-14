package sample.dal;

import sample.bll.Person;

import java.util.List;

public class DBdao  implements  DaoPerson<Person> {

    @Override
    public List<Person> getALlPersons() {
        return DatabaseManager.getInstance().getAllPersons();
    }

    @Override
    public Person getById(int id) {
        return null;
    }

    @Override
    public boolean insert(Person item) {
        return DatabaseManager.getInstance().insertPerson(item);
    }



    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean updatePerson(Person item) {
        return DatabaseManager.getInstance().updatePerson(item);
    }

}
