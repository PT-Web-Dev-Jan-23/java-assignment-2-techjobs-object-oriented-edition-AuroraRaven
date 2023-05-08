package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
    @Override
    public String toString(){
        String nameString;
        if (this.name == null || this.name.equals("")) {
            nameString = "Data not available";
        } else {
            nameString = this.name;
        }

        String employerString;
        if (this.employer == null || this.employer.getValue().equals("")) {
            employerString = "Data not available";
        } else {
            employerString = this.employer.toString();
        }

        String locationString;
        if (this.location == null || this.location.getValue().equals("")) {
            locationString = "Data not available";
        } else {
            locationString = this.location.toString();
        }

        String positionTypeString;
        if (this.positionType == null || this.positionType.getValue().equals("")) {
            positionTypeString = "Data not available";
        } else {
            positionTypeString = this.positionType.toString();
        }

        String coreCompetencyString;
        if (this.coreCompetency == null || this.coreCompetency.getValue().equals("")) {
            coreCompetencyString = "Data not available";
        } else {
            coreCompetencyString = this.coreCompetency.toString();
        }

        return "\n" +
                "ID: " + id +
                "\nName: " + nameString +
                "\nEmployer: " + employerString +
                "\nLocation: " + locationString +
                "\nPosition Type: " + positionTypeString +
                "\nCore Competency: " + coreCompetencyString +
                "\n";
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }



    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
