package options;

import exceptions.NotNumberException;

public class IsNumber {
    private static IsNumber isNumber;
    private static String incomeString;

    public static synchronized IsNumber isNumber() {
        if (isNumber == null) {
            return new IsNumber();
        }
        return isNumber;
    }

    private IsNumber() {

    }

    public static double check(String value) {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            throw new NotNumberException("Invalid incoming data! Value: " + value + " is not a valid number.");
        }
    }
}
