package org.launchcode.techjobs.oo.JobField;
import org.launchcode.techjobs.oo.Employer;

import java.util.Objects;
public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public static int getNextId() {
        return nextId;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    public JobField() {
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public String toString() {
        return value;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId() && getValue().equals(jobField.getValue());
    }


    public int hashCode() {
        return Objects.hash(getId());
    }

}
