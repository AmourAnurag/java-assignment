/**
 * Fibonachi
 */
import java.util.*;
public class Fibonachi {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the term :");
        int n=sc.nextInt();
        int x=0;
        int y=1;
        System.out.print(x+",");
        System.out.print(y);
        int i=2;
        while (i<n) {
            int z=x+y;
            System.out.print(","+z);
            x=y;
            y=z;
            i++;
        }
    }
}