import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberToGuess = 9;
        int userGuess = -1;

        System.out.println("Indtast det tal du tror der står i boksen");
        while (userGuess != numberToGuess) {
            userGuess = input.nextInt();
            System.out.println("Du har gættet på " + userGuess);
            if(userGuess == numberToGuess) {
                System.out.println("Det er helt rigtigt!");
            } else {
                System.out.println("Det er desværre helt forkert - prøv igen");
            }
        }




    }
}
