package corn.syntax.Review3;

import java.util.Scanner;

public class WhileLoopScanner {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Please enter integer values");
        while (sc.hasNextInt()) {

            int num = sc.nextInt();
            sum += num;
        }
        System.out.println("Sum ="+sum);
    }
}
