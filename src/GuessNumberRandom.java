import java.util.Random;
import java.util.Scanner;

public class GuessNumberRandom {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int userGuess = -1;
        int numberToGuess = rand.nextInt(1,10);
        int guessCount = 0;
        //guessCount++ tilføjes lige under while som tæller for antal forsøg

                System.out.println("Indtast det tal mellem 1 og 10 som du tror at der står i boksen");
        while (userGuess != numberToGuess) {
            userGuess = input.nextInt();
            guessCount++;
            System.out.println("Du har gættet på " + userGuess);
            if(userGuess == numberToGuess) {
                System.out.println("Det er helt rigtigt!");
            } else if (userGuess <numberToGuess)
                System.out.println("Beklager, tallet er større end dit gæt - prøv igen");
                else System.out.println("Beklager, tallet er mindre end dit gæt - prøv igen");
        }
        System.out.println("Du har brugt " + guessCount + " forsøg på at gætte tallet");
    }
}
