// Program: Example of an Object in Java

class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ObjectExample {
    public static void main(String[] args) {
        // Creating object of Student
        Student s1 = new Student();
        s1.name = "Vignesh";
        s1.age = 21;

        // Calling method using object
        s1.display();
    }
}

/*
 Output:
 Name: Vignesh, Age: 21
 */