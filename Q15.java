import java.util.*;

public class Q15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        
        int[] binaryArray = new int[32];
        int index = 0;
        
        if (number == 0) {
            System.out.println(0);
            return;
        }

        while (number > 0) {
            binaryArray[index++] = number % 2;
            number = number / 2;
        }
        
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binaryArray[i]);
        }
        System.out.println();
        
        sc.close();

    }
}
