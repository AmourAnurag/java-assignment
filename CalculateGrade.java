import java.util.Scanner;

public class CalculateGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the " + (i + 1) + " subject marks ");
            arr[i] = sc.nextInt();
        }
        int total = arr[0] + arr[1] + arr[2];
        int percentage = (total * 100) / 300;
        System.out.println("Your percentage " + percentage + "%");
        if (percentage >= 80) {
            System.out.println("You got the grade A");
        } else if (percentage >= 60 && percentage < 80) {
            System.out.println("You got the grade B");

        } else if (percentage >= 40 && percentage < 60) {
            System.out.println("You got the grade C");

        } else {
            System.out.println("You got the grade D");

        }
    }
}
