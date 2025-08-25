// Program: All 8 Types of Java Operators
// Demonstrates arithmetic, relational, logical, bitwise, assignment, unary, ternary, and shift operators

public class Operators {
    public static void main(String[] args) {

        int a = 10, b = 5;

        // 1 Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2 Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // 3 Logical Operators
        System.out.println("\nLogical Operators:");
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // 4 Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~a: " + (~a));

        // 5 Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = 7;
        System.out.println("c = " + c);
        c += 3; System.out.println("c += 3 → " + c);
        c -= 2; System.out.println("c -= 2 → " + c);
        c *= 2; System.out.println("c *= 2 → " + c);
        c /= 3; System.out.println("c /= 3 → " + c);
        c %= 4; System.out.println("c %= 4 → " + c);

        // 6 Unary Operators
        System.out.println("\nUnary Operators:");
        int d = 5;
        System.out.println("++d → " + (++d));
        System.out.println("d++ → " + (d++));
        System.out.println("--d → " + (--d));
        System.out.println("d-- → " + (d--));
        System.out.println("Unary plus (+d) → " + (+d));
        System.out.println("Unary minus (-d) → " + (-d));
        System.out.println("Logical NOT (!true) → " + (!true));

        // 7 Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b: " + max);

        // 8 Shift Operators
        System.out.println("\nShift Operators:");
        int e = 8; // binary: 1000
        System.out.println("e << 1: " + (e << 1)); // left shift
        System.out.println("e >> 1: " + (e >> 1)); // right shift
        System.out.println("e >>> 1: " + (e >>> 1)); // unsigned right shift
    }
}

/*
Output:
Arithmetic Operators:
a + b = 15
a - b = 5
a * b = 50
a / b = 2
a % b = 0

Relational Operators:
a == b: false
a != b: true
a > b: true
a < b: false
a >= b: true
a <= b: false

Logical Operators:
x && y: false
x || y: true
!x: false

Bitwise Operators:
a & b: 0
a | b: 15
a ^ b: 15
~a: -11

Assignment Operators:
c = 7
c += 3 → 10
c -= 2 → 8
c *= 2 → 16
c /= 3 → 5
c %= 4 → 1

Unary Operators:
++d → 6
d++ → 6
--d → 6
d-- → 6
Unary plus (+d) → 5
Unary minus (-d) → -5
Logical NOT (!true) → false

Ternary Operator:
Max of a and b: 10

Shift Operators:
e << 1: 16
e >> 1: 4
e >>> 1: 4
*/