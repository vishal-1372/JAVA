import java.util.Scanner;

public class DenominationProgram {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();
        scanner.close();

        displayDenomination(amount);
        displayAmountInWords(amount);
    }

    public static void displayDenomination(int amount) {
        int[] denominations = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
        int[] count = new int[denominations.length];

        for (int i = 0; i < denominations.length; i++) {
            if (amount >= denominations[i]) {
                count[i] = amount / denominations[i];
                amount %= denominations[i];
            }
        }

        System.out.println("Denominations:");
        for (int i = 0; i < denominations.length; i++) {
            if (count[i] > 0) {
                System.out.println(denominations[i] + " : " + count[i] + " notes");
            }
        }
    }

    public static void displayAmountInWords(int amount) {
        String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        
        String amountInWords = "";

        if (amount == 0) {
            amountInWords = "Zero";
        } else {
            amountInWords = convertToWords(amount, units, teens, tens);
        }

        System.out.println("Amount in words: " + amountInWords);
    }

    public static String convertToWords(int num, String[] units, String[] teens, String[] tens) {
        if (num < 10) {
            return units[num];
        } else if (num < 20) {
            return teens[num - 10];
        } else if (num < 100) {
            return tens[num / 10] + " " + units[num % 10];
        } else if (num < 1000) {
            return units[num / 100] + " Hundred " + convertToWords(num % 100, units, teens, tens);
        } else if (num < 10000) {
            return units[num / 1000] + " Thousand " + convertToWords(num % 1000, units, teens, tens);
        } else {
            return "Number out of range";
        }
    }
}
