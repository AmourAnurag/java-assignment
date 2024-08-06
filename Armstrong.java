import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check the armstrong or not");
        int number = sc.nextInt();
        int num1 = number;
        int sum = 0;
        while (number > 0) {
            int rem = number % 10;
            sum = sum + (rem * rem * rem);
            number /= 10;
        }
        if (num1 == sum) {
            System.out.println(num1 + " is armstrong");
        } else {
            System.out.println(num1 + " is not armstrong");

        }
    }
}
