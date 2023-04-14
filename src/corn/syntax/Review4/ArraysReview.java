package corn.syntax.Review4;

public class ArraysReview {
    public static void main(String[] args) {
        int aa=10;
        int[] arr=new int[3];
        // we store elementes based on indexes
        arr[0]=10;
        arr[1]=11;
        //arr[3]=12;== ArrayIndexOutOfBoundsException
        for (int a:arr){

        }
        //access also by indexes
        System.out.println(arr[2]); // = 0

        String[] planets={"Earth", "Mars", "Jupiter", "Saturn", "Neptune"};

        System.out.println("Enhanced for loop");
        // enhanced for loop is ONLY with arrays and collections
        for (String planet:planets) {
            System.out.println(planet);

        }
        //System.out.println(planets[0]);
        //System.out.println(planets[1]);
        //System.out.println(planets[2]);
        for (int j = 0; j < planets.length; j++) {
            System.out.println(planets[j]);

        }

    }
}
