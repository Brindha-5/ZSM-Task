import java.util.*;

public class StudentPojo1 {
    private String name;
    private int id;

    public StudentPojo1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "StudentPojo1{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}






