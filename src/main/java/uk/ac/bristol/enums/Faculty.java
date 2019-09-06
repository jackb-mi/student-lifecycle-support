package uk.ac.bristol.enums;

public enum Faculty {

    // Whilst creating these there where duplicates on the front end with different values i.e. Faculty of Arts had 3001 and ARTF present.
    // If test start failing then update values to be correct based on current data set.

    FACULTY_OF_ARTS("3001"),
    FACULTY_OF_ENGINEERING("3002"),
    FACULTY_OF_LIFE_SCIENCES("3003"),
    FACULTY_OF_HEALTH_SCIENCES("3004"),
    FACULTY_OF_SCIENCE("3005"),
    FACULTY_OF_SOCIAL_SCIENCE_AND_LAW("3006");

    private String value;

    Faculty(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
