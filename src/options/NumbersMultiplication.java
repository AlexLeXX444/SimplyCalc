package options;

public class NumbersMultiplication {
    private static NumbersMultiplication numbersMultiplication;

    public static synchronized NumbersMultiplication numbersMultiplication() {
        if (numbersMultiplication == null) {
            return new NumbersMultiplication();
        }
        return numbersMultiplication;
    }

    private NumbersMultiplication() {

    }

    public static double answer(String n1, String n2) {
        return IsNumber.check(n1) * IsNumber.check(n2);
    }
}
