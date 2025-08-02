public class Nested {
    public static void main(String[] args) {
        System.out.println("Right triangle pattern:");
        
        // Corrected the inner loop to print stars
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) { // Changed to 'i' for the right triangle
                System.out.print("* ");
            }
            System.out.println(); // Corrected the method name
        }

        System.out.println("\nMultiplication table:");
        
        // Corrected the printf syntax
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%4d", i * j); // Added parentheses for printf
            }
            System.out.println();
        }

        System.out.println("\nUsing break and continue:");
        
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Skipping 5"); // Fixed the string quotes
                continue;  
            }

            if (i == 8) {
                System.out.println("Breaking at 8"); // Fixed the method name
                break;  
            }
            System.out.println("Number: " + i);
        }
    }
}
