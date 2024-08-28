import java.util.Scanner;

public class Q28 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name ");
        String name=sc.nextLine();
        String words[]=name.split(" ");

        for(int i=words.length-1;i>=0;i--){
            System.out.print(words[i]+" ");
        }
        sc.close();
    }
}
