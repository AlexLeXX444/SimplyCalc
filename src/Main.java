import options.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Добро пожаловать в калькулятор!
                Основные функции: сложение, вычитание, умножение и деление чисел.
                ВАЖНО! Если вводите дробные числа, то вводить через симол ТОЧКА, иначе получите ошибку ввода.""");
        System.out.println("---------------------------------------------------------------------------------\n");

        System.out.println("Введите первое число:\n");
        Scanner in = new Scanner(System.in);
        String number1 = in.nextLine();

        System.out.println("Введите второе число:\n");
        String number2 = in.nextLine();

        System.out.println("Выберите операцию (введите нужный символ):\n");
        System.out.println("""
                "+" - сложение;
                "-" - вычитание;
                "*" - умножение;
                "/" - деление.\s
                """);
        String mathOperation = in.nextLine();

        switch (mathOperation) {
            case "+" -> System.out.println(NumbersAddition.answer(number1, number2));
            case "-" -> System.out.println(NumbersSubtraction.answer(number1, number2));
            case "*" -> System.out.println(NumbersMultiplication.answer(number1, number2));
            case "/" -> System.out.println(NumbersDivision.answer(number1, number2));
            default -> System.out.println("Неверный ввод! Повторите.");
        }
        in.close();
    }
}