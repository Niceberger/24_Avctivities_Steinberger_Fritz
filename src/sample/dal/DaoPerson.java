package sample.dal;

import sample.bll.Person;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface DaoPerson <T>{
    List<T> getALlPersons();
    T getById(int id);
    boolean insert(T item);
    boolean delete (int id);

    boolean updatePerson(T item);
}


