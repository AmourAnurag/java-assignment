import java.util.Scanner;

class Q26 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string ");
        String str = sc.next();
        System.out.println("Enter the Second string ");
        String str1 = sc.next();
        if (str.compareTo(str1) > 0) {
            System.out.println(str);
        } else {
            System.out.println(str1);
        }
        sc.close();
    }
}