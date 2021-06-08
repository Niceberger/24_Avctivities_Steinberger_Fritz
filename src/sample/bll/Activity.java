package sample.bll;

import java.util.Objects;

public class Activity {
    Integer id;
    Integer idSeason;
    String identifier;

    public Activity(Integer id, Integer idSeason, String identifier) {
        this.id = id;
        this.idSeason = idSeason;
        this.identifier = identifier;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdSeason() {
        return idSeason;
    }

    public void setIdSeason(Integer idSeason) {
        this.idSeason = idSeason;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", idSeason=" + idSeason +
                ", identifier='" + identifier + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activity activity = (Activity) o;
        return Objects.equals(id, activity.id) &&
                Objects.equals(idSeason, activity.idSeason) &&
                Objects.equals(identifier, activity.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idSeason, identifier);
    }
}
