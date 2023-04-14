package corn.syntax.review1;

public class Concatention {

    public static void main(String[] args) {
        int date = 23;
        String month = "March";

        /*
        = is assigment operator
        + is concatenation operator
         */
        System.out.println(month +" " + date);

        String domain="Syntax";
        // Hello from Syntax

        System.out.println("Hello from " +domain);

        String fruit="apple";
        double price=2.99;
        char sign='$';

        //the price of the apple is $2.99

        System.out.println("The price of the "+fruit+ " is "+sign+price);

        String num="10";
        String num2="20";

        System.out.println(num+num2);

        int number=10;
        int number2=20;

        System.out.println(number + number2);

        int a=10;
        int b=20;
        String c="Hello";
        String d="Bye";

        System.out.println(a+b+c+d);

        System.out.println(a+c+b+d);

        System.out.println(c+d+a+b);

        System.out.println(c+d+(a+b));




    }
}
