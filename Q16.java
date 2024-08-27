import java.util.*;

public class Q16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element : ");
        int arr[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                arr[i][j] = sc.nextInt();
        }
        System.out.println("Matrix Enter by You ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }

        System.out.println("Enter 1 for sum of each row");
        System.out.println("Enter 2 for sum of each column");
        System.out.println("Enter 3 for sum of main diagonal");
        System.out.println("Enter 4 for sum second diagonal");
        System.out.println("Enter 5 Transpose of the matrix");
        System.out.println("Enter the choice for performing the upper task");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    int sum = 0;
                    for (int j = 0; j < 3; j++)
                        sum += arr[i][j];
                    System.out.println("Sum of " + (i + 1) + " row : " + sum);
                }
                break;
            case 2:
                for (int i = 0; i < 3; i++) {
                    int sum = 0;
                    for (int j = 0; j < 3; j++)
                        sum += arr[j][i];
                    System.out.println("Sum of " + (i + 1) + " column : " + sum);
                }
                break;
            case 3:
                int sum = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++)
                        if (i == j)
                            sum += arr[j][i];
                }
                System.out.println("Sum of  main diagonal : " + sum);
                break;
            case 4:
                int sumof2 = 0;
                
                for (int i = 0; i < 3; i++) {
                
                        sumof2+=arr[i][2-i];
                        
                }
                System.out.println("Sum of  second diagonal : " + sumof2);
                break;
            case 5:
                int sumof2 = 0;
                
                for (int i = 0; i < 3; i++) {
                
                        sumof2+=arr[i][2-i];
                        
                }
                System.out.println("Sum of  second diagonal : " + sumof2);
                break;

            default:
                break;
        }

    }
}
