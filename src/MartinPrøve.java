import java.util.Scanner;

public class MartinPrøve {
    public static void main(String[] args) {

        String navn;
        String meddelelse;

        Scanner hilsen = new Scanner(System.in);

        System.out.println("Hvem vil du gerne sige hej til? Martin eller Max?");
        navn = hilsen.next();

        System.out.println("Vil du gerne sige godmorgen eller godaften");
        meddelelse = hilsen.next();

        if (navn.equals("Martin") && meddelelse.equals("godmorgen")) {
            System.out.println("Godmorgen Martin!");
        } else if (navn.equals("Max") && meddelelse.equals("godaften")) {
            System.out.println("Godaften Max");
        } else {
            System.out.println("kan ikke udskrives");
        }
    }
}