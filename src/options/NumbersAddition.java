package options;

public class NumbersAddition {
    private static NumbersAddition numbersAddition;

    public static synchronized NumbersAddition numbersAddition() {
        if (numbersAddition == null) {
            return new NumbersAddition();
        }
        return numbersAddition;
    }

    private NumbersAddition() {

    }

    public static double answer(String n1, String n2) {
        return IsNumber.check(n1) + IsNumber.check(n2);
    }
}
