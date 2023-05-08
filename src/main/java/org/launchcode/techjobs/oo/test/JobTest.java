package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;
import java.util.ArrayList;

import static org.junit.Assert.*;


/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)

public class JobTest {
    @Test
    public void testSettingJobId(){
        Job jobT=new Job();
        Job jobTwoT=new Job();
        assertNotEquals(jobT.getId(),jobTwoT.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job jobT= new Job("product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("product tester", jobT.getName());
        assertEquals("ACME", jobT.getEmployer().getValue());
        assertEquals("Desert", jobT.getLocation().getValue());
        assertEquals("Quality control", jobT.getPositionType().getValue());
        assertEquals("Persistence", jobT.getCoreCompetency().getValue());



        assertTrue(jobT.getEmployer() instanceof Employer);
        assertTrue(jobT.getLocation() instanceof Location);
        assertTrue(jobT.getPositionType() instanceof PositionType);
        assertTrue(jobT.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(!jobT.getName().isEmpty());
    }

    @Test
    public void testJobsForEquality(){
        Job jobTOne= new Job("peas", new Employer("peas"), new Location("peas"),
                new PositionType("peas"), new CoreCompetency("peas"));
        Job jobTTwo= new Job("peas", new Employer("peas"), new Location("peas"),
                new PositionType("peas"), new CoreCompetency("peas"));
        assertFalse(jobTOne.getId()==jobTTwo.getId());

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job jobT= new Job("peas", new Employer("peas"), new Location("peas"),
                new PositionType("peas"), new CoreCompetency("peas"));
        String jobToString=jobT.toString();

        char firstChar=jobToString.charAt(0);
        char lastChar=jobToString.charAt(jobToString.length()-1);

        assertEquals('\n',firstChar);
        assertEquals('\n', lastChar);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job jobT= new Job("peas", new Employer("peas"), new Location("peas"),
                new PositionType("peas"), new CoreCompetency("peas"));
        String[] lines =jobT.toString().split("\n");

        assertEquals("ID: "+jobT.getId(),lines[1]);
        assertEquals("Name: "+jobT.getName(),lines[2]);
        assertEquals("Employer: " + jobT.getEmployer(), lines[3]);
        assertEquals("Location: " + jobT.getLocation(), lines[4]);
        assertEquals("Position Type: " + jobT.getPositionType(), lines[5]);
        assertEquals("Core Competency: " + jobT.getCoreCompetency(), lines[6]);
    }
    @Test
    public void testToStringHandlesEmptyField(){
        Job jobT = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String jobString = jobT.toString();
        assertTrue(jobString.contains("Name: Data not available"));
        assertTrue(jobString.contains("Employer: Data not available"));
        assertTrue(jobString.contains("Location: Data not available"));
        assertTrue(jobString.contains("Position Type: Data not available"));
        assertTrue(jobString.contains("Core Competency: Data not available"));
    }
}

