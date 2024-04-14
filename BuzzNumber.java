import java.util.Scanner;

public class BuzzNumber {
    // Function to check if a number is a Buzz number
    public static boolean isBuzz(int num) {
        // Check if the number ends with 7 or is divisible by 7
        return num % 10 == 7 || num % 7 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a Buzz number: ");
        int num = scanner.nextInt();

        // Check if the number is a Buzz number
        if (isBuzz(num))
            System.out.println(num + " is a Buzz number.");
        else
            System.out.println(num + " is not a Buzz number.");
    }
}
