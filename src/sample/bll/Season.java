package sample.bll;

import java.util.Objects;

public class Season {
 Integer id;
 String identifier;

    public Season(Integer id, String identifier) {
        this.id = id;
        this.identifier = identifier;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "Season{" +
                "id=" + id +
                ", identifier='" + identifier + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Season season = (Season) o;
        return Objects.equals(id, season.id) &&
                Objects.equals(identifier, season.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, identifier);
    }
}

