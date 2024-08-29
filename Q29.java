import java.util.Scanner;

//check the matrix is magic or not
public class Q29 {
    public static void main(String args[]) {
        int row, col;
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of matrix");
        row = sc.nextInt();
        System.out.println("Enter the number of column of the matrix");
        col = sc.nextInt();
        int matrix[][] = new int[row][col];
        System.out.println("Enter the element of the matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix enter by you ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();

        }
        int sumOfRow = 0;
        for (int i = 0; i < row; i++)
            sumOfRow += matrix[0][i];

        for (int i = 0; i < row; i++) {
            int RowSum = 0;
            for (int j = 0; j < col; j++) {
                RowSum += matrix[i][j];

            }
            if (RowSum != sumOfRow) {
                System.out.println("Not magic");
                return;
            }

        }
        for (int i = 0; i < row; i++) {
            int ColSum = 0;
            for (int j = 0; j < col; j++) {
                ColSum += matrix[j][i];

            }
            if (ColSum != sumOfRow) {
                System.out.println("Not magic");
                return;
            }

        }
        sc.close();
        System.out.println("Yes matrix is magic");
    }
}
