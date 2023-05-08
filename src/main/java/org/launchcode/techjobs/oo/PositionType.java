package org.launchcode.techjobs.oo;

import org.launchcode.techjobs.oo.JobField.JobField;

import java.util.Objects;

public class PositionType extends JobField {
    public PositionType(String value) {
        super(value);
    }

    public PositionType() {
    }
@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionType positionType = (PositionType) o;
        return getId() == positionType.getId() && getValue().equals(positionType.getValue());
    }

@Override
    public int hashCode() {
        return Objects.hash(getId());
    }

// TODO: Add a custom toString() method that returns the data stored in 'value'.

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.




    // Getters and Setters:





}
