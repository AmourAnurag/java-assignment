import java.util.Scanner;

public class SumOfSeries2 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit (sure positive number)");
        int n=sc.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+((double)i/(i+1));
        }
        System.out.printf("Sum of the series %.4f ",sum);
        sc.close();
    }
}
