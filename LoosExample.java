public class LoopsExample {
    public static void main(String[] args) {

        // For Loop
        System.out.println("For Loop:");
        for(int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // While Loop
        System.out.println("\nWhile Loop:");
        int j = 1;
        while(j <= 5) {
            System.out.println("Count: " + j);
            j++;
        }

        // Do-While Loop
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println("Count: " + k);
            k++;
        } while(k <= 5);
    }
}

/*
Output:
For Loop:
Count: 1
Count: 2
Count: 3
Count: 4
Count: 5

While Loop:
Count: 1
Count: 2
Count: 3
Count: 4
Count: 5

Do-While Loop:
Count: 1
Count: 2
Count: 3
Count: 4
Count: 5
*/
