import java.util.Scanner;

public class AtoPowerb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        System.out.println("Enter the value of y");
        int y = sc.nextInt();
        double ans = 1;
        if (y > 0) {
            while (y > 0) {
                ans = ans * x;
                y--;
            }
        } else if (y == 0) {
            ans = 1;
        } else {
            if (x == 0) {
                System.out.println("x should not be zero");
                return;
            }
            while (y < 0) {
                ans = ans / x;
                y++;
            }
        }
        System.out.println("The answer is " + ans);

    }
}