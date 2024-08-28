import java.util.Scanner;

public class Q22 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();
        sc.close();
        int dummy = number;
        int sum = 0;
        while (number > 0) {
            int res = number % 10;
            sum = sum * 10 + (res);
            number/=10;
        }
        if (sum==dummy) {
            System.out.println("yes number is palindrome");
        } else {
            System.out.println("yes number is not palindrome");

        }
    }
}
