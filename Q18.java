public class Q18 {
    public static void main(String[] args) {
       
        if (args.length == 0) {
            System.out.println("No numbers provided. Please pass some numbers as command line arguments.");
            return;
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (String arg : args) {
            int num = Integer.parseInt(arg);

            sum += num;

            if (num > max) {
                max = num;
            }
        }

        System.out.println("Sum of all elements: " + sum);
        System.out.println("Largest number: " + max);
    }
}
