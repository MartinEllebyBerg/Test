import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sentinel = -1;
        int sum = 0;
        int brugerTal = 0;

        System.out.println("Indtast de tal der skal lægges sammen, eller -1 for at stoppe");

        while (brugerTal != sentinel) {

            brugerTal = input.nextInt();
            sum+= brugerTal;
        }
        int sum1 = sum+1;
        System.out.println("Din sum er " + sum1);
        }
    }


