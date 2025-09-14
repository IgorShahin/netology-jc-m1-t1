package ru.netology;

/**
 * ОШИБКА: ArithmeticException: / by zero
 * <p>
 * ПРИЧИНА: В строке calc.devide.apply(a, b) происходит деление числа a (которое равно 3)
 * на число b (которое равно 0). В Java деление целого числа на ноль вызывает исключение
 * ArithmeticException.
 * <p>
 * ОБЪЯСНЕНИЕ:
 * <p>
 * a = calc.plus.apply(1, 2) = 3
 * <p>
 * b = calc.minus.apply(1, 1) = 0
 * <p>
 * calc.devide.apply(a, b) = calc.devide.apply(3, 0) = 3 / 0 -> ArithmeticException
 * <p>
 * СПОСОБЫ РЕШЕНИЯ:
 * <p>
 * Обработать исключение с помощью try-catch
 */
public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        try {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка деления на ноль!");
        }
    }
}
