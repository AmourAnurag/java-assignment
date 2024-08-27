public class Q19 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments provided. Please pass some values as command line arguments.");
            return;
        }

        System.out.println("Alternate elements:");

        for (int i = 0; i < args.length; i += 2) { 
            System.out.print(args[i] + " ");
        }

        System.out.println();  
    }
}
