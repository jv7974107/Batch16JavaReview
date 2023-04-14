package corn.syntax.Review4;

public class ContinueKeyword {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            if (i==3){
                continue;  // works inside the statement
            }
            System.out.println(i);
            System.out.println("HI");
            System.out.println("Bye");

        }
    }
}
