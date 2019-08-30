package uk.ac.bristol.enums;

public enum Length {

    ONE("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9");;

    private String value;

    Length(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
