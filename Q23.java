import java.util.Scanner;

public class Q23 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name ");
        String name=sc.nextLine();
        String words[]=name.split(" ");

        for(int i=0;i<words.length;i++){
            System.out.print(words[i].charAt(0)+" ");
        }
        sc.close();
    }
}
