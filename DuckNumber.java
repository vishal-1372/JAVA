import java.util.Scanner;

public class DuckNumber {
    // Function to check if a number is a Duck number
    public static boolean isDuck(long num) {
        String numString = Long.toString(num);
        
        // Check if the number contains a zero but not at the beginning
        return numString.contains("0") && numString.charAt(0) != '0';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a Duck number: ");
        long num = scanner.nextLong();

        // Check if the number is a Duck number
        if (isDuck(num))
            System.out.println(num + " is a Duck number.");
        else
            System.out.println(num + " is not a Duck number.");
    }
}
