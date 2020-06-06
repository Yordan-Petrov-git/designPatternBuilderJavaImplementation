package src.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ProfessionBuildersTest {

    //---------------------------------------------------------------------------------
// ENGINEER TESTS
    @Test
    public void canCreateEmptyNewEngineerWithBuilder(){

       //GIVEN
        Engineer engineer =
                ProfessionBuilders.newEngineer()
                        .build();

     //THEN
        Assertions.assertNull(engineer.getName());

    }


    @Test
    public void canCreateNewEngineerWithNameWithBuilder(){

        //GIVEN
        Engineer engineer =
                ProfessionBuilders.newEngineer()
                        .name("TestName")
                        .build();
        //THEN
        Assertions.assertEquals(engineer.getName(),"TestName");

    }
    @Test
    public void canCreateNewEngineerWithSalaryMaxDoubleWithBuilder(){

        //GIVEN
        Engineer engineer =
                ProfessionBuilders.newEngineer()
                        .salary(Double.MAX_VALUE)
                        .build();
        //THEN
        Assertions.assertEquals(engineer.getSalary(),Double.MAX_VALUE);

    }

    @Test
    public void canCreateNewEngineerWithSalaryWithBuilder(){

        //GIVEN
        Engineer engineer =
                ProfessionBuilders.newEngineer()
                        .salary(100)
                        .build();
        //THEN
        Assertions.assertEquals(engineer.getSalary(),100);

    }


    @Test
    public void canCreateNewEngineerWithOneDutyParameterInTheListWithBuilder(){

        //GIVEN
        Engineer engineer =
                ProfessionBuilders.newEngineer()
                        .duty("Code")
                        .build();
        //WHEN
        List<String> duties = new ArrayList<String>();
        duties.add("Code");

        //THEN
        Assertions.assertEquals(engineer.getDuties(), duties );

    }


    @Test
    public void canCreateNewEngineerWithTwoDutyParameterInTheListWithBuilder(){

        //GIVEN
        Engineer engineer =
                ProfessionBuilders.newEngineer()
                        .duty("Code")
                        .duty("CodeSomeMooreCode")
                        .build();

        //WHEN
        List<String> duties = new ArrayList<String>();
        duties.add("Code");
        duties.add("CodeSomeMooreCode");

        //THEN
        Assertions.assertEquals(engineer.getDuties(), duties );

    }


    @Test
    public void expectedExceptionThrowOnCreateNewEngineerWithEmptyStringForNameWithBuilder(){

        //THEN
        Assertions.assertThrows(IllegalArgumentException.class ,
                ()-> ProfessionBuilders.newEngineer()
                        .name("")
                        .build());

    }



    @Test
    public void expectedExceptionThrowOnCreateNewEngineerWithEmptyStringForDutyWithBuilder(){

        //THEN
        Assertions.assertThrows(IllegalArgumentException.class ,
                ()-> ProfessionBuilders.newEngineer()
                        .duty("")
                        .build());

    }

    @Test
    public void expectedExceptionThrowOnCreateNewEngineerWithTwoEmptyStringForDutyWithBuilder(){

        //THEN
        Assertions.assertThrows(IllegalArgumentException.class ,
                ()-> ProfessionBuilders.newEngineer()
                        .duty("")
                        .duty("")
                        .build());

    }

    @Test
    public void expectedExceptionThrowOnCreateNewEngineerWithMultipleEmptyStringForDutyWithBuilder(){

        //THEN
        Assertions.assertThrows(IllegalArgumentException.class ,
                ()-> ProfessionBuilders.newEngineer()
                        .duty("")
                        .duty("")
                        .duty("")
                        .duty("")
                        .duty("")
                        .build());

    }

    @Test
    public void expectedExceptionThrowOnCreateNewEngineerWithNegativeDoubleForSalaryWithBuilder(){

        //THEN
        Assertions.assertThrows(IllegalArgumentException.class ,
                ()-> ProfessionBuilders.newEngineer()
                        .salary(-1.0)
                        .build());

    }

    @Test
    public void expectedExceptionThrowOnCreateNewEngineerWithMaxNegativeDoubleForSalaryWithBuilder(){

        //THEN
        Assertions.assertThrows(IllegalArgumentException.class ,
                ()-> ProfessionBuilders.newEngineer()
                        .salary(-Double.MAX_VALUE)
                        .build());

    }


//---------------------------------------------------------------------------------
// PILOT TESTS

    @Test
    public void canCreateEmptyNewPilotWithBuilder(){

        //GIVEN
        Pilot pilot =
                ProfessionBuilders.newPilot()
                        .build();

        //THEN
        Assertions.assertNull(pilot.getName());

    }


    @Test
    public void canCreateNewPilotWithNameWithBuilder(){

        //GIVEN
        Pilot pilot =
                ProfessionBuilders.newPilot()
                        .name("TestName")
                        .build();
        //THEN
        Assertions.assertEquals(pilot.getName(),"TestName");

    }

    @Test
    public void canCreateNewPilotWithZeroSalaryWithBuilder(){

        //GIVEN
        Pilot pilot =
                ProfessionBuilders.newPilot()
                        .salary(0.0)
                        .build();
        //THEN
        Assertions.assertEquals(pilot.getSalary(),0.0);

    }

    @Test
    public void canCreateNewPilotWithSalaryWithBuilder(){

        //GIVEN
        Pilot pilot =
                ProfessionBuilders.newPilot()
                        .salary(100.0)
                        .build();
        //THEN
        Assertions.assertEquals(pilot.getSalary(),100.0);

    }


    @Test
    public void canCreateNewPilotWithDoubleMaxSalaryWithBuilder(){

        //GIVEN
        Pilot pilot =
                ProfessionBuilders.newPilot()
                        .salary(Double.MAX_VALUE)
                        .build();
        //THEN
        Assertions.assertEquals(pilot.getSalary(),Double.MAX_VALUE);

    }


    @Test
    public void canCreateNewPilotWithOneDutyParameterInTheListWithBuilder(){

        //GIVEN
        Pilot pilot =
                ProfessionBuilders.newPilot()
                        .duty("FlyThePlane")
                        .build();
        //WHEN
        List<String> duties = new ArrayList<String>();
        duties.add("FlyThePlane");

        //THEN
        Assertions.assertEquals(pilot.getDuties(), duties );

    }


    @Test
    public void canCreateNewPilotWithTwoDutyParameterInTheListWithBuilder(){

        //GIVEN
        Pilot pilot =
                ProfessionBuilders.newPilot()
                        .duty("FlyThePlane")
                        .duty("FlyThePlaneSomeMooreCode")
                        .build();

        //WHEN
        List<String> duties = new ArrayList<String>();
        duties.add("FlyThePlane");
        duties.add("FlyThePlaneSomeMooreCode");

        //THEN
        Assertions.assertEquals(pilot.getDuties(), duties );

    }


    @Test
    public void expectedExceptionThrowOnCreateNewPilotWithEmptyStringForNameWithBuilder(){

        //THEN
        Assertions.assertThrows(IllegalArgumentException.class ,
                ()-> ProfessionBuilders.newPilot()
                        .name("")
                        .build());

    }


    @Test
    public void expectedExceptionThrowOnCreateNewPilotWithEmptyStringForDutyWithBuilder(){

        //THEN
        Assertions.assertThrows(IllegalArgumentException.class ,
                ()-> ProfessionBuilders.newPilot()
                        .duty("")
                        .build());

    }

    @Test
    public void expectedExceptionThrowOnCreateNewPilotWithTwoEmptyStringForDutyWithBuilder(){

        //THEN
        Assertions.assertThrows(IllegalArgumentException.class ,
                ()-> ProfessionBuilders.newPilot()
                        .duty("")
                        .duty("")
                        .build());

    }

    @Test
    public void expectedExceptionThrowOnCreateNewPilotWithMultipleEmptyStringForDutyWithBuilder(){

        //THEN
        Assertions.assertThrows(IllegalArgumentException.class ,
                ()-> ProfessionBuilders.newPilot()
                        .duty("")
                        .duty("")
                        .duty("")
                        .duty("")
                        .duty("")
                        .build());

    }

    @Test
    public void expectedExceptionThrowOnCreateNewPilotWithNegativeDoubleForSalaryWithBuilder(){

        //THEN
        Assertions.assertThrows(IllegalArgumentException.class ,
                ()-> ProfessionBuilders.newPilot()
                        .salary(-1.0)
                        .build());

    }

    @Test
    public void expectedExceptionThrowOnCreateNewPilotWithMaxNegativeDoubleForSalaryWithBuilder(){

        //THEN
        Assertions.assertThrows(IllegalArgumentException.class ,
                ()-> ProfessionBuilders.newPilot()
                        .salary(-Double.MAX_VALUE)
                        .build());

    }


}