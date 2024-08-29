import java.util.Scanner;

public class Table {
    public void table(int start,int end){
        for (int i = start; i <= end; i++) {
            System.out.println("Multiplication table for " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); 
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting range ");
        int start=sc.nextInt();
        System.out.println("Enter the ending range ");
        int end=sc.nextInt();
        Table obj=new Table();
        obj.table(start, end);
        sc.close();
    }
}
