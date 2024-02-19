import java.util.Scanner;

public class TidsberegnerDouble {


    public static void main(String[] args) {

        double tidSidenMidnat = 0;
        double sekunderPåEtDøgn = 0;

        System.out.println("Vi skal finde ud af hvor mange sekunder der er gået siden midnat.");
        System.out.println("Hvor mange timer er der gået?");

        Scanner input = new Scanner(System.in);

        double timer = input.nextDouble();

        System.out.println("Der er nu gået " + timer + " timer siden midnat");
        System.out.println("Hvor mange minutter er der gået?");

        double minutter = input.nextDouble();

        System.out.println("Der er nu gået " + timer + " timer og " + minutter + " minutter siden midnat");
        System.out.println("Hvor mange sekunder er der gået?");

        double sekunder = input.nextDouble();

        System.out.println("Der er nu gået " + timer + " timer, " + minutter + " minutter og " + sekunder + " sekunder siden midnat.");

        tidSidenMidnat = ((minutter*60)+(timer*60*60)+(sekunder));
        sekunderPåEtDøgn = (24*60*60);

        System.out.println("Det svarer til " + tidSidenMidnat + " sekunder");

    }
}
