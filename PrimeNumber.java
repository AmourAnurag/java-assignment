import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        if (num < 2) {
            System.out.println(num + " is not Prime");
            return;
        }
        boolean isPrime = true;
        int dev = 2;
        int limit = (int) Math.sqrt(num);

        while (dev <= limit) {
            if (num % dev == 0) {
                isPrime = false;
                break;
            }
            dev++;
        }
        if (isPrime) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is not Prime");

        }

    }

    // TIME COMPLEXITY OF THIS CODE IS O(ROOT N)
}


