import java.util.Scanner;

class Student {
    int marks1, marks2, marks3, res;
    Scanner sc = new Scanner(System.in);

    void getdata() {
        System.out.println("Enter the marks of three subject :");
        marks1 = sc.nextInt();
        marks2 = sc.nextInt();
        marks3 = sc.nextInt();
    }

    void calculateResult() {
        res = ((marks1 + marks2 + marks3) * 100) / 300;
    }

    void show() {
        calculateResult();
        System.out.println("Result is " + res + "%");
    }
  
}
public class Q20 {

    public static void main(String args[]) {
        Student obj = new Student();
        obj.getdata();
        obj.show();
    }
}
