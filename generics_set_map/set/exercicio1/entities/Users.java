package generics_set_map.set.exercicio1.entities;

import java.time.LocalDateTime;
import java.util.Objects;

public class Users {
    private String name;
    private String date;

    public Users(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(name, users.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
