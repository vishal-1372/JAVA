import java.util.Scanner;

class Factorial {
    private int number;

    public Factorial(int num) {
        number = num;
    }

    
    public long calculateFactorial() {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

public class Factorial1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int num = scanner.nextInt();

        // Create an object of Factorial class using constructor
        Factorial factorialObj = new Factorial(num);

        // Calculate factorial
        long result = factorialObj.calculateFactorial();

        System.out.println("Factorial of " + num + " is: " + result);
    }
}
