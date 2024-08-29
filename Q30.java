import java.util.Scanner;

public class Q30 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting point");
        int start = sc.nextInt();
        System.out.println("Enter the last point");
        int end = sc.nextInt();
        Table obj = new Table();
        obj.table(start, end);
    }
}
