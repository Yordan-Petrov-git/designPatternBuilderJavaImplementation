package src.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public abstract class Profession {

    private final String name;

    private final double salary;

    private final List<String> duties;

    protected Profession(String name, double salary, List<String> duties) {
        this.name = name;
        this.salary = salary;
        this.duties = duties == null ? new ArrayList<>() : new ArrayList<>(duties);
    }

    public abstract void work();

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public List<String> getDuties() {
        return Collections.unmodifiableList(duties);
    }

    @Override
    public String toString() {
        return "Name :" + name +
                "Salary :" + salary +
                "Duties :" + duties;
    }
}
