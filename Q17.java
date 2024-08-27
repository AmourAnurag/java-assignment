import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of first matrix : ");
        int arr[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                arr[i][j] = sc.nextInt();
        }
        System.out.println("Enter the element of first matrix : ");
        int arr1[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                arr1[i][j] = sc.nextInt();
        }
        Q16 obj = new Q16();
        obj.printarray(arr);
        obj.printarray(arr1);

        int arr3[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                arr3[i][j] = arr[i][j] + arr1[i][j];
        }
        System.out.println("Sum of the matrix : ");
        obj.printarray(arr3);
        for (int k = 0; k < 3; k++) {

            for (int i = 0; i < 3; i++) {
                arr3[k][i] = 0;
                for (int j = 0; j < 3; j++)
                    arr3[k][i] += arr[k][j] * arr1[j][i];
            }

        }
        System.out.println("multiplication of the matrix : ");
        obj.printarray(arr3);

    }
}
