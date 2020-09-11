package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

        //An attempt to test that the correct values are assigned, need to know if this is even necessary?
//        assertEquals("Product tester", test_job_3.getName());
//        assertEquals("ACME", test_job_3.getEmployer().toString());
//        assertEquals("Desert", test_job_3.getLocation().toString());
//        assertEquals("Quality Control", test_job_3.getPositionType().toString());
//        assertEquals("Persistance", test_job_3.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality(){

        assertFalse(test_job_3.equals(test_job_4));

    }

//    @Test
//    public void testToStringHasBlankLinesBeforeAndAfter(){
//
//        assertEquals();
//    }
}
