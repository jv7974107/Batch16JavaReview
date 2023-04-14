package corn.syntax.review2;

import java.util.Scanner;

public class NotScanner {
    public static void main(String[] args) {
        int i=10;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter full Sentence");
        String sentence=scanner.nextLine();
        System.out.println("Please enter one word");
        String word = scanner.next();
        System.out.println("Hello " + word);

        System.out.println("Please enter integer value");
        int number=scanner.nextInt();
        System.out.println("Entered number is = "+number);

        System.out.println("Please enter decimal value");
        double decimal=scanner.nextDouble();
        System.out.println("Decimal Value = "+decimal);
    }
}
