package src.models;

import java.util.List;

public class Pilot extends Profession {

    protected Pilot(String name, double salary, List<String> duties) {
        super(name, salary, duties);
    }

    @Override
    public void work() {
        System.out.println("Flying the plane...");
    }

}
