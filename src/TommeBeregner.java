import java.util.Scanner;

public class TommeBeregner {

    public static void main(String[] args) {

        final double TOMME_LÆNGDE = 2.54;

        System.out.println("Indsæt værdi i tommer her:");

        Scanner input = new Scanner(System.in);

        double tomme = input.nextDouble();

        System.out.println(tomme + " tommer" + " svarer til " + (tomme*TOMME_LÆNGDE) + " centimeter");






    }
}
