package uk.ac.bristol.enums;

public enum DistanceLearning {
    ON_CAMPUS("C"),
    DISTANCE_LEARNING("D"),
    OVERSEAS("O");

    private String value;

    DistanceLearning(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
