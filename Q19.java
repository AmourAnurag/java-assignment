public class Q19 {
    public static void main(String args){
        if (args.length()==0) {
            System.out.println("No argument is provided");
        }
        for(int i=0;i<args.length();i+=2){
           System.out.println(args[i]);
        }
    }
}
