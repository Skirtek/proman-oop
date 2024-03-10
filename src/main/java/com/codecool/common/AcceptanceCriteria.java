package com.codecool.common;

public class AcceptanceCriteria {
    private String description;

    public AcceptanceCriteria(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
