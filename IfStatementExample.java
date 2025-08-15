// Program: Conditional Statements in Java
// Demonstrates if, if-else, if-else-if, and nested if statements

public class IfStatementsExample {
    public static void main(String[] args) {

        // 1️⃣ If Statement
        System.out.println("If Statement:");
        int number1 = 10;
        if (number1 > 0) {
            System.out.println(number1 + " is positive.");
        }

        // 2️⃣ If-Else Statement
        System.out.println("\nIf-Else Statement:");
        int number2 = 7;
        if (number2 % 2 == 0) {
            System.out.println(number2 + " is even.");
        } else {
            System.out.println(number2 + " is odd.");
        }

        // 3️⃣ If-Else-If Statement
        System.out.println("\nIf-Else-If Statement:");
        int number3 = 0;
        if (number3 > 0) {
            System.out.println(number3 + " is positive.");
        } else if (number3 < 0) {
            System.out.println(number3 + " is negative.");
        } else {
            System.out.println(number3 + " is zero.");
        }

        // 4️⃣ Nested If Statement
        System.out.println("\nNested If Statement:");
        int number4 = 8;
        if (number4 > 0) {
            if (number4 % 2 == 0) {
                System.out.println(number4 + " is positive and even.");
            } else {
                System.out.println(number4 + " is positive but odd.");
            }
        } else {
            System.out.println(number4 + " is not positive.");
        }
    }
}

/*
Output:
If Statement:
10 is positive.

If-Else Statement:
7 is odd.

If-Else-If Statement:
0 is zero.

Nested If Statement:
8 is positive and even.
*/
