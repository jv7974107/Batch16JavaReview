package corn.syntax.Review3;

public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println("------- LOGICAL AND ------");
        boolean loginButtonDisplayed=true;
        boolean loginClickable=true;

        if (loginButtonDisplayed && loginClickable){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
        System.out.println("------- LOGICAL OR ------");
        boolean pictureDisplayed=true;
        String accountName="Syntax";

        if (pictureDisplayed||accountName.equals("Syntax")){
            System.out.println("Login Successful");
        }else{
            System.out.println("Login not successful");
        }
        System.out.println("------- LOGICAL NOT ------");
        boolean hungry=!true;
        System.out.println(hungry);

        boolean cold=false;
        System.out.println(!cold);
        String str="Hello";

        if (!str.equals("Hello")){
            System.out.println("Value of the string is NOT Hello");
        }

        boolean confirmSelected=false;

        if (!confirmSelected){
            System.out.println("Lets click on confirm checkbox");
        }
        System.out.println("Click on Pay Button");
    }
}
