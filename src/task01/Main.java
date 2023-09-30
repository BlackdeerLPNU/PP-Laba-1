package task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstNumber;
        char operation;
        double secondNumber;


        System.out.println("Input number operation number");
        firstNumber = scanner.nextDouble();
        operation = scanner.next().charAt(0);
        secondNumber = scanner.nextDouble();

//================================================================

        double result;
        if (secondNumber != 0) {
            switch (operation) {
                case '+' -> {
                    result = firstNumber + secondNumber;
                    System.out.println(result);
                }
                case '-' -> {
                    result = firstNumber - secondNumber;
                    System.out.println(result);
                }
                case '/' -> {
                    result = firstNumber / secondNumber;
                    System.out.println(result);
                }
                case '*' -> {
                    result = firstNumber * secondNumber;
                    System.out.println(result);
                }
                default -> System.out.println("We dont have this operation");
            }
        } else {
            System.out.println("We can't divide by 0");
        }

        scanner.close();
    }
}
