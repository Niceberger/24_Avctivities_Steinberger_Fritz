package sample.bll;

import java.util.Objects;

public class Person {
    Integer id;
    Integer idActivity;
    String firstname;
    String lastname;

    public Person(Integer id, Integer idActivity, String firstname, String lastname) {
        this.id = id;
        this.idActivity = idActivity;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id.equals(person.id) &&
                idActivity.equals(person.idActivity) &&
                firstname.equals(person.firstname) &&
                lastname.equals(person.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idActivity, firstname, lastname);
    }

    @Override
    public String toString() {
        return "Season{" +
                "id=" + id +
                ", idActivity=" + idActivity +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
