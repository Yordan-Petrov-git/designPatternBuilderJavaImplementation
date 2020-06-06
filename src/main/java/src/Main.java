package src;


import src.models.Engineer;
import src.models.Pilot;
import src.models.ProfessionBuilders;

public class Main {

    public static void main(String[] args) {

        Engineer engineer =
                ProfessionBuilders.newEngineer()
                        .name("Junior Engineer TestNameOne")
                        .salary(2_000)
                        .duty("CodeSomeBasicJavaStuff")
                        .duty("CodeSomeOtherBasicJavaStuff")
                        .duty("CodeSomeTests")
                        .build();
        System.out.println(engineer);

        Engineer engineer1 =
                ProfessionBuilders.newEngineer()
                        .name("Senior Engineer TestNameOne")
                        .salary(5_000)
                        .duty("CodeSomeOtherAdvancedJavaStuff")
                        .build();
        System.out.println(engineer1);

        Pilot pilot =
                ProfessionBuilders.newPilot()
                        .name("Pilot one")
                        .salary(10_000)
                        .duty("FlyThePlane")
                        .build();
        System.out.println(pilot);

        Pilot pilot1 =
                ProfessionBuilders.newPilot()
                        .name("Pilot two")
                        .salary(15_000)
                        .duty("FlyThePlaneBetter")
                        .build();
        System.out.println(pilot1);


    }


}
