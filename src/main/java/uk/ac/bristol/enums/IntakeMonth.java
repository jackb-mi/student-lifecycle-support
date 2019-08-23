package uk.ac.bristol.enums;

public enum IntakeMonth {
    OCTOBER_START("10"),
    JANUARY_START("01");

    private String value;

    IntakeMonth(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
