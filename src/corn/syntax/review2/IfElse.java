package corn.syntax.review2;

public class IfElse {
    public static void main(String[] args) {
        int age = 18;

        if (age <= 18) {// does not change when i change the <=>=
            System.out.println("You Can get a DL");
        } else {
            System.out.println("Your too young to drive.");
        }
        System.out.println(" ____________ ");
        String expected = "Best Seller";// Seller is not Sellers
        if (expected.equals("Best Sellers")) {  //Sellers

        } else {
            System.out.println("Test Fail");
        }

    }
}
