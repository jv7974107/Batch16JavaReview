package corn.syntax.review2;

public class NestedIf {
    public static void main(String[] args) {

        boolean driverLicense=true;
        boolean car=false;
        if (driverLicense) {
            System.out.println("Lets check if you have a car");
            if (car){
                System.out.println("You can drive to work");
            }else{
                System.out.println("You will need to take the bus or uber");
            }
        }else {
            System.out.println("You should get a DL");
        }


    }
}
