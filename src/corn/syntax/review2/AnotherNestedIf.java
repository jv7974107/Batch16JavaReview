package corn.syntax.review2;

public class AnotherNestedIf {
    public static void main(String[] args) {

        boolean vaccine = true;
        int dose = 3;
        if (vaccine) {

            if (dose == 1) {
                System.out.println("You need second dose.");
            } else if (dose == 2) {
                System.out.println("Full vaccinated.");
            } else if (dose == 3) {
                System.out.println("Fully vaccinated with booster");
            }
        }
    }
}