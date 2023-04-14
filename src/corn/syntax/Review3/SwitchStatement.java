package corn.syntax.Review3;

public class SwitchStatement {
    public static void main(String[] args) {

        String color="Red";

        switch (color.toLowerCase()){ // .toLowerCase take whatever value to lower case
            case "red":
                System.out.println("Stop");
                break;
            case "orange":
                System.out.println("Yield");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Unknown color, action is also unknown");
        }
    }
}
