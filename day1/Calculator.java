package day1;
class Addition {
    public void calculate(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
}

class Subtraction {
    public void calculate(int a, int b) {
        int difference = a - b;
        System.out.println("Difference: " + difference);
    }
}

class Multiplication {
    public void calculate(int a, int b) {
        int product = a * b;
        System.out.println("Product: " + product);
    }
}

class Division {
    public void calculate(int a, int b) {
        if (b != 0) {
            float quotient = (float) a / b;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Error: Division by zero");
        }
    }
}

public class Calculator {
    public static void main(String[] args) {
        Addition addition = new Addition();
        addition.calculate(10, 20);

        Subtraction subtraction = new Subtraction();
        subtraction.calculate(20, 10);

        Multiplication multiplication = new Multiplication();
        multiplication.calculate(10, 20);

        Division division = new Division();
        division.calculate(20, 0);
    }
}
