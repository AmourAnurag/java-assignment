import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int row = sc.nextInt();
        System.out.println("Enter the number of column");
        int col = sc.nextInt();
        System.out.println("Enter the choice for pattern print A to E");
        char choice = sc.next().charAt(0);
        char ch = Character.toUpperCase(choice);
        switch (ch) {
            case 'A':
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < (i + 1); j++)
                        System.out.print((j + 1) + " ");
                    System.out.println();
                }
                break;

            case 'B':
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < (i + 1); j++)
                        System.out.print((i + 1) + " ");
                    System.out.println();
                }
                break;

            case 'C':
                int a, b;
                for (int i = 0; i < row; i++) {
                    a = 0;
                    b = 1;
                    for (int j = 0; j <= i; j++) {
                        if (j == 0) {
                            System.out.print(a + " ");
                        } else if (j == 1) {
                            System.out.print(b + " ");
                        } else {
                            int nextNumber = a + b;
                            System.out.print(nextNumber + " ");
                            a = b;
                            b = nextNumber;
                        }
                    }
                    System.out.println(); // Move to the next line
                }
                break;

            case 'D':
                int k = 1;
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < (i + 1); j++) {
                        System.out.print(k + " ");
                        k++;
                    }
                    System.out.println();
                }
                break;

            case 'E':

                break;

            default:
                break;
        }
    }
}
