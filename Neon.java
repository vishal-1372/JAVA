import java.util.Scanner;

class NeonNumber {
    private int number;

    // Constructor
    public NeonNumber(int num) {
        number = num;
    }

    // Method to check if the number is neon
    public boolean isNeon() {
        int square = number * number;
        int sumOfDigits = 0;

        // Calculate the sum of digits of the square
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }

        // Check if the sum of digits is equal to the original number
        return sumOfDigits == number;
    }
}

public class Neon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a neon number: ");
        int num = scanner.nextInt();

        // Create an object of NeonNumber class using constructor
        NeonNumber neonNum = new NeonNumber(num);

        // Check if the number is neon
        boolean isNeon = neonNum.isNeon();

        if (isNeon)
            System.out.println(num + " is a neon number.");
        else
            System.out.println(num + " is not a neon number.");
    }
}
