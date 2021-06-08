package sample.dal;

import sample.bll.Person;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface DaoPerson <T>{
    ArrayList<T> getALlPersons();

    boolean updatePerson(Person item);
}


