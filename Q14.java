import java.util.*;
public class Q14 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]= new int[10];
        System.out.println("Enter the element of the array");

        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("You can do following operations with this array using choose options");
        System.out.println("Press 1 for find sum of all element ");
        System.out.println("Press 2 for find largest element in array");
        System.out.println("Press 3 for reversing array and display it");
        System.out.println("Press 4 for finding element is present in array or not ");
        System.out.println("Enter your choice : ");
        int choice=sc.nextInt();

        switch (choice) {
            case 1:
                int sum=0;
                for(int i=0;i<10;i++)
                sum+=arr[i];
                System.out.println("Sum of the array element : "+sum);
                break;
            case 2:
                int largest = Integer.MIN_VALUE;
                for(int i=0;i<10;i++){
                   if (arr[i]>largest) {
                    largest=arr[i];
                   }
                }
                System.out.println("Largest element : "+largest);
                break;
            case 3:
                for(int i=0;i<5;i++){
                    int temp = arr[i];
                    arr[i]=arr[10-(i+1)];
                    arr[10-(i+1)]=temp;
                }
                System.out.println("Printing of array element");
                for(int i=0;i<10;i++)
                System.out.print(arr[i]+" ");
                break;
            case 4:
                System.out.println("Enter the element which you want to search");
                int number=sc.nextInt();
                for(int i=0;i<10;i++){
                    if (number==arr[i]) {
                        System.out.println("Element is found at index "+(i+1));
                    }
                }
                System.out.println("Element is not found ");
                break;
        
            default:
            System.out.println("Please enter the valid case ");
                break;
        }
    }
}
