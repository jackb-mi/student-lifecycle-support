package uk.ac.bristol.helpers;

public class RandomData {

    private static final String ALPHA_STRING = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMERIC_STRING = "1234567890";
    private static final String ALPHA_NUMERIC_STRING = ALPHA_STRING + NUMERIC_STRING;

    public static String alphaString(int count) {
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int) (Math.random() * ALPHA_STRING.length());
            builder.append(ALPHA_STRING.charAt(character));
        }

        return builder.toString();
    }

    public static String alphaNumericString(int count) {
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }

        return builder.toString();
    }

    public static String numericString(int count) {
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int) (Math.random() * NUMERIC_STRING.length());
            builder.append(NUMERIC_STRING.charAt(character));
        }

        return builder.toString();
    }
}
