package uk.ac.bristol.enums;

public enum ProgrammeType {
    POSTGRADUATE_RESEARCH("Postgraduate Research"),
    POSTGRADUATE_TAUGHT("Postgraduate Taught"),
    SUB_DEGREE("Sub-degree"),
    UNDERGRADUATE("Undergraduate");

    private String value;

    ProgrammeType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
