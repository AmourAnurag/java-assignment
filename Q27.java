import java.util.Scanner;

public class Q27 {
    private static String[] units = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
            "Seventeen", "Eighteen", "Nineteen"
    };
    private static String[] tens = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };
    private static String[] thousands = {
            "", " Thousand ", " Million ", " Billion "
    };

    public static String convertToWords(int number) {
        if (number == 0) {
            return "Zero";
        }
        int i = 0;
        String words = "";
        while (number > 0) {
            if (number % 1000 != 0) {
                words = convertLessThanThousand(number % 1000) + thousands[i] + " " + words;
            }
            number /= 1000;
            i++;
        }
        return words.trim();
    }

    public static String convertLessThanThousand(int number) {
        String word;
        if (number % 100 < 20) {
            word = units[number % 100];
            number /= 100;
        } else {
            word = units[number % 10];
            number /= 10;
            word = tens[number % 10] + " " + word;
            number /= 10;
        }
        if (number == 0)
            return word;
        return units[number] + " Hundred " + word;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to convert in words");
        int number = sc.nextInt();
        System.out.println("Number in words :" + convertToWords(number));
        sc.close();
    }
}
