import java.util.Scanner;

public class NumberToWords {
    // Arrays to store the words for numbers
    private static final String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    // Function to convert a number less than 1000 to words
    public static String convertToWords(int num) {
        if (num == 0) {
            return "zero";
        }

        StringBuilder words = new StringBuilder();

        // Handling hundreds place
        int hundreds = num / 100;
        if (hundreds > 0) {
            words.append(ones[hundreds]).append(" hundred ");
            num %= 100;
        }

        // Handling tens and ones place
        if (num > 0) {
            if (num >= 11 && num <= 19) {
                words.append(teens[num - 10]);
            } else {
                int tensDigit = num / 10;
                int onesDigit = num % 10;
                if (tensDigit > 0) {
                    words.append(tens[tensDigit]).append(" ");
                }
                if (onesDigit > 0) {
                    words.append(ones[onesDigit]);
                }
            }
        }

        return words.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number less than 1000: ");
        int num = scanner.nextInt();

        if (num < 1 || num >= 1000) {
            System.out.println("Please enter a valid natural number less than 1000.");
        } else {
            String words = convertToWords(num);
            System.out.println("Number in words: " + words);
        }
    }
}
