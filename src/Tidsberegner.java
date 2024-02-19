import java.util.Scanner;

public class Tidsberegner {
    public static void main(String[] args) {

        int tidSidenMidnat = 0;
        int sekunderPåEtDøgn = 0;

        System.out.println("Vi skal finde ud af hvor mange sekunder der er gået siden midnat.");
        System.out.println("Hvor mange timer er der gået?");

        Scanner input = new Scanner(System.in);

        int timer = input.nextInt();

        System.out.println("Der er nu gået " + timer + " timer siden midnat");
        System.out.println("Hvor mange minutter er der gået?");

        int minutter = input.nextInt();

        System.out.println("Der er nu gået " + timer + " timer og " + minutter + " minutter siden midnat");
        System.out.println("Hvor mange sekunder er der gået?");

        int sekunder = input.nextInt();

        System.out.println("Der er nu gået " + timer + " timer, " + minutter + " minutter og " + sekunder + " sekunder siden midnat.");

        tidSidenMidnat = ((minutter*60)+(timer*60*60)+(sekunder));
        sekunderPåEtDøgn = (24*60*60);

        System.out.println("Det svarer til " + tidSidenMidnat + " sekunder");

    }
}
