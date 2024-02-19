import java.util.Scanner;

public class CentimenterBeregner {

    public static void main(String[] args) {

        final double TOMME_LÆNGDE = 2.54;

        System.out.println("Indsæt antal centimer du ønsker at omregne til tommer:");

        Scanner input = new Scanner(System.in);

        double centimeter = input.nextDouble();

        System.out.println(centimeter/TOMME_LÆNGDE);
    }
}
