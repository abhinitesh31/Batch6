package basic.April11;

import java.util.Scanner;

public class Lab010_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int number1 = sc.nextInt();


        System.out.println("Enter the number 2");
        int number2 = sc.nextInt();

        int sum = sum(number1, number2);
        int substarct = substarct(number1, number2);
        int multiply = multiply(number1, number2);
        float division = division(number1, number2);
        System.out.println("Sum is" + sum);
        System.out.println("Substract is" + substarct);
        System.out.println("Multiply is" + multiply);
        System.out.println("Division is" + division);
    }

    private static float division(float number1, float number2) {
        return (float) (number1/number2);
    }

    static int multiply(int number1, int number2) {
         return (int) number1 * number2;
    }

    static int substarct(int number1, int number2) {
        return (int) number1 - number2;
    }

    static int sum(int a, int b) {
        return  (int) a + b;
    }
}




