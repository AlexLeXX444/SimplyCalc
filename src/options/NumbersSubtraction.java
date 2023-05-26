package options;

public class NumbersSubtraction {
    private static NumbersSubtraction numbersSubtraction;

    public static synchronized NumbersSubtraction numbersSubtraction() {
        if (numbersSubtraction == null) {
            return new NumbersSubtraction();
        }
        return numbersSubtraction;
    }

    private NumbersSubtraction() {

    }

    public static double answer(String n1, String n2) {
        return IsNumber.check(n1) - IsNumber.check(n2);
    }
}
