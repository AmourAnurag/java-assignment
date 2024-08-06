import java.util.Scanner;

public class SumOfSeries2 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit ");
        int n=sc.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+(i/(i+1.0));
        }
        System.out.printf("Sum of the series %.4f ",sum);
    }
}
