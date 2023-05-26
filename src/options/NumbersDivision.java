package options;

import exceptions.DivisionByZeroException;

public class NumbersDivision {
    private static NumbersDivision numbersDivision;

    public static synchronized NumbersDivision numbersDivision() {
        if (numbersDivision == null) {
            return new NumbersDivision();
        }
        return numbersDivision;
    }

    private NumbersDivision() {

    }

    public static double answer(String n1, String n2) {
        if (IsNumber.check(n2) != 0.0) {
            return IsNumber.check(n1) / IsNumber.check(n2);
        } else {
            throw new DivisionByZeroException("Division by zero!!!");
        }
    }
}
