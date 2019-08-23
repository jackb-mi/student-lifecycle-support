package uk.ac.bristol.enums;

public enum Titles {
    MR("MR"),
    MISS("MISS"),
    MS("MS"),
    MRS("MRS"),
    MX("MX"),
    DR("DR"),
    PROFESSOR("PROFESSOR"),
    SIR("MRS"),
    LADY("LADY"),
    LORD("LORD"),
    REVEREND("REV"),
    SISTER("SISTER"),
    FATHER("FATHER"),
    ING("ING");

    private String value;

    Titles(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
