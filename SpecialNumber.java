import java.util.Scanner;

public class SpecialNumber {
    public static int factoral(int num){
        int mul=1;
        while (num>0) {
            mul=mul*num;
            num--;
        }
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        int sum=0;
        int number=num;
        while (num>0) {
            int rem=num%10;
            sum=sum+factoral(rem);
            num/=10;
        }
        if (sum==number) {
            System.out.println(number+" it is special number");
        } else {
            System.out.println(number+" it is not special number");

        }
    }
}
