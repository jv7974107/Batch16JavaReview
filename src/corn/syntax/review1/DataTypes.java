package corn.syntax.review1;

public class DataTypes {

    public static void main(String[] args) {

        /*

            Data types in Java = 2
            1. primitive = 8
                    numberic:
                              whole numbers: byte, short, int, long
                              decimal number: float, double
                    non numeric: char, boolean
            2. non primitive = many
         */

        byte door=4;
        short horsePower=300;
        int mileage=30000; // used the most
        long vinNumber=878878788282L;

        float weight=6000.5F;
        double price=50788.5;  // used the most

        boolean electric=true;
        char symbol='A';

        System.out.println(horsePower);// 300
        System.out.println("horsePower"); //horsepower
        //System.out.println(horsepower);error - always checks spelling


    }
}
