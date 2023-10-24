package projects;

import java.util.Scanner;

class Calculator {

  double operation(double num1, double num2, char operator) {
    switch (operator) {
      case '+':
        return num1 + num2;
      case '-':
        return num1 - num2;
      case '*':
        return num1 * num2;
      case '/':
        if (num2 != 0) {
          return num1 / num2;
        } else {
          System.out.println("Cannot divide by zero");
          return 0;
        }
      case '%':
        if (num2 != 0) {
          return num1 % num2;
        } else {
          System.out.println("Cannot perform modulus with zero");
          return 0;
        }
      default:
        System.out.println("Wrong choice");
        return 0;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Calculator calculator = new Calculator();

    System.out.print("Enter the first number: ");
    double num1 = scanner.nextDouble();

    System.out.print("Enter the second number: ");
    double num2 = scanner.nextDouble();

    System.out.print("Enter the operator (+, -, *, /, %): ");
    char operator = scanner.next().charAt(0);

    double result = calculator.operation(num1, num2, operator);
    System.out.println("Result: " + result);

    scanner.close();
  }
}
