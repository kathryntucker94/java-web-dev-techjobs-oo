package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job test_job_1;
    Job test_job_2;
    Job test_job_3;
    Job test_job_4;

    @Before
    public void createJobObjects(){

        test_job_1 = new Job();
        test_job_2 = new Job();
        test_job_3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        test_job_4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));

    }

    @Test
    public void testSettingJobId(){

        assertTrue(test_job_2.getId() - test_job_1.getId() == 1);
    }

    @Test
    public void testJobConstructorSetsAllFields(){

        assertTrue(test_job_3.getName() instanceof String);
        assertTrue(test_job_3.getEmployer() instanceof Employer);
        assertTrue(test_job_3.getLocation() instanceof Location);
        assertTrue(test_job_3.getPositionType() instanceof PositionType);
        assertTrue(test_job_3.getCoreCompetency() instanceof CoreCompetency);

    }

    @Test
    public void testJobsForEquality(){

        assertFalse(test_job_3.equals(test_job_4));

    }

//    @Test
//    public void testToStringHasBlankLinesBeforeAndAfter(){
//        String testString = test_job_3.toString();
//        assertEquals(,"");
//        //assertEquals(testString.charAt(testString.length()-1), "");
//    }

    @Test
    public void testToStringContainsLabels(){
        String test_string = test_job_3.toString();
        assertTrue(test_string.contains("ID"));
        assertTrue(test_string.contains("Name"));
        assertTrue(test_string.contains("Employer"));
        assertTrue(test_string.contains("Location"));
        assertTrue(test_string.contains("Position Type"));
        assertTrue(test_string.contains("Core Competency"));
    }
    @Test
    public void testToStringContainsData(){
        String test_string = test_job_3.toString();
        assertTrue(test_string.contains("3"));
        assertTrue(test_string.contains("Product tester"));
        assertTrue(test_string.contains("ACME"));
        assertTrue(test_string.contains("Desert"));
        assertTrue(test_string.contains("Quality Control"));
        assertTrue(test_string.contains("Persistence"));
    }

    @Test
    public void testToStringReturnsMessageIfFieldIsEmpty(){
        String test_string = test_job_1.toString();
        assertTrue(test_string.contains("Data not available"));
    }
}
