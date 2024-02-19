import java.util.Scanner;
public class BMIberegner {
    public static void main(String[] args) {

       /*
       double Højde = 1.92;
        double Vægt = 95.4;

        double BMIUdregning = Vægt / (Højde * Højde);

        System.out.println(BMIUdregning);
        */

        //Med scanner input herunder
        Scanner input = new Scanner(System.in);

        System.out.println("Indtast din højde i centimer her (fx. 175):");

        double højdeIMeter = input.nextDouble()/100;

        System.out.println("Indtast din vægt i kilogram her (fx. 72):");

        double vægtIKilogram = input.nextDouble();
        double beregnetBMI = vægtIKilogram/(højdeIMeter*højdeIMeter);

        System.out.println("Dit BMI tal er " + vægtIKilogram/(højdeIMeter*højdeIMeter));

    // Ny opgave begynder her
        if (beregnetBMI <18.5){
            System.out.println("Du er undervægtig");
    } else if (beregnetBMI <25) {
            System.out.println("Du er normal");
        } else if (beregnetBMI <30) {
            System.out.println("Du er overvægtig");
        } else System.out.println("Du er svært overvægtig");
        }

        }


