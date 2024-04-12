import java.util.Scanner;

public class AmicableNumberChecker {
    private int num1;
    private int num2;

    public AmicableNumberChecker(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public boolean areAmicable() {
        return (sumOfDivisors(num1) == num2) && (sumOfDivisors(num2) == num1);
    }

   
    private int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.close();

        
        AmicableNumberChecker checker = new AmicableNumberChecker(num1, num2);

        if (checker.areAmicable()) {
            System.out.println(num1 + " and " + num2 + " are amicable numbers.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not amicable numbers.");
        }
    }
}
