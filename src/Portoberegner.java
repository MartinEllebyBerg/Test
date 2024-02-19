import java.util.Scanner;

public class Portoberegner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hvor meget vejer dit brev i gram?");

        int vægtIGram = input.nextInt();

        System.out.println("Du har svaret at dit brev vejer " + vægtIGram + " gram");

        int porto = 0;
        int pris1 = 25;
        int pris2 = 50;
        int pris3 = 75;

        if (vægtIGram > 0 && vægtIGram <= 2000) {
            if (vægtIGram > 0 && vægtIGram <= 100) {
                porto = pris1;
            } else if (vægtIGram > 100 && vægtIGram <= 250) {
                porto = pris2;
            } else {
                porto = pris3;
            }

            System.out.println("Dit brev vejer " + vægtIGram + " gram, så din pris for porto bliver " + porto + " kr");
        } else {
            System.out.println("Et brev med denne vægt kan vi ikke sende");
        }
    }
}
