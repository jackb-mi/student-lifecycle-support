package uk.ac.bristol.enums;

public enum CommitteeLevel {
    POSTGRADUATE("PG"),
    UNDERGRADUATE("UG");

    private String value;

    CommitteeLevel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
