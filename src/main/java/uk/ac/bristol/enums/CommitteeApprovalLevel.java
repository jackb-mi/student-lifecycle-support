package uk.ac.bristol.enums;

public enum CommitteeApprovalLevel {

    SCHOOL_COMMITTEE("020"),
    FACULTY_COMMITTEE("030"),
    UNIVERSITY_EDUCATION_COMMITTEE("040");

    private String value;

    CommitteeApprovalLevel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
