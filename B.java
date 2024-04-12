import java.util.Scanner;

public class  B{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        System.out.print("Enter the sub string: ");
        String subString = scanner.nextLine();
        scanner.close();
        
        mainString = mainString.toLowerCase();
        subString = subString.toLowerCase();
        
        int count = countSubstring(mainString, subString);
        
        System.out.println("Number of times the substring is present: " + count);
    }
    
    public static int countSubstring(String mainString, String subString) {
        int count = 0;
        int lastIndex = 0;
        
        while (lastIndex != -1) {
            lastIndex = mainString.indexOf(subString, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += subString.length();
            }
        }
        
        return count;
    }
}
