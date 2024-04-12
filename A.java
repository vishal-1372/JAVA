import java.util.Scanner;

public class A{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();
        
        String[] words = inputString.split(" ");
        
        for (String word : words) {
            int vowelCount = countVowels(word);
            System.out.println(word + ": " + vowelCount + " vowels");
        }
    }
    
    public static int countVowels(String word) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        
        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(String.valueOf(word.charAt(i)))) {
                count++;
            }
        }
        
        return count;
    }
}
