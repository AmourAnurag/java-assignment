public class Q21 {
    public static void main(String args[]){
       int arr[]={5,12,45,89,65,32,75,84};
       int min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
        if (arr[i]>max) {
            if (arr[i]<min) {
                min=arr[i];
            }
            max=arr[i];
        }
       }
       System.out.println("Largest number is "+max+" smallest number is "+min);
    }
}
