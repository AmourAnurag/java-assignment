
// sum of series 1+1/2+1/3+1/4........1/n
import java.util.*;
public class SumOfSeries1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int number=sc.nextInt();
        double sum=0;
        for(int i=1;i<=number;i++){
            sum=sum+(1.0/i);
        }
        System.out.printf("Sum of series  %.4f" ,sum);
    }
}
