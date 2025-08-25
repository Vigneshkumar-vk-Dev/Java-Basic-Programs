// Program: Class with Method in Java

// Defining a class
class Calculator {
    // Method to add two numbers
    int add(int a, int b) {
        return a + b;
    }

    // Method to multiply two numbers
    int multiply(int a, int b) {
        return a * b;
    }
}

public class ClassWithMethodExample {
    public static void main(String[] args) {
        // Creating an object of Calculator
        Calculator calc = new Calculator();

        // Calling methods
        int sum = calc.add(10, 5);
        int product = calc.multiply(4, 3);

        // Printing results
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}

/*
 Output:
 Sum: 15
 Product: 12
 */
