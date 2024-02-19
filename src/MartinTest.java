import java.util.Scanner;

public class MartinTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Indtast månedens salgstal:");

        int salgstalIKR = input.nextInt();

        String udsagn = "0";
        String udsagn1 = "godt";
        String udsagn2 = "super";
        String udsagn3 = "perfekt";
        String udsagn4 = "latterligt flot!";

        if (salgstalIKR > 100) {
            if (salgstalIKR >= 100 && salgstalIKR <= 150) {
                udsagn = udsagn1;
            } else if (salgstalIKR >= 151 && salgstalIKR <= 300) {
                udsagn = udsagn2;
            } else if (salgstalIKR <=500) {
                udsagn = udsagn3;
            } else {
                udsagn = udsagn4;
            }

            System.out.println("Dit månedlige salgstal er " + salgstalIKR + ", og det er bare " + udsagn);
        } else {
            System.out.println("Dit månedlige salgstal er " + salgstalIKR + ", og det er bare for ringe!");
        }

    }
}