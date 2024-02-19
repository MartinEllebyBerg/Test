import java.util.Arrays;

public class ArraysØvelse {
    public static void main(String[] args) {


        int[] arrayTabel = new int[8];
        arrayTabel[0] = 34;
        arrayTabel[arrayTabel.length-1] = 117;
        // Hvis vi ikke kender længden af vore table kan vi skrive arrayTabel.lenght-1

        System.out.println(Arrays.toString(arrayTabel));

        for (int i = 0; i < arrayTabel.length; i++) {
            System.out.println(arrayTabel[i]);
        }

        String[] arrayString = {"Hej", "med", "dig"};
        {

            System.out.println(Arrays.toString(arrayString));
        }

        for (String i : arrayString) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        double[] arrayTal2 = {3.4, 2.5, 1.2, 6.7};{
            System.out.println(arrayTal2[2]);
            System.out.println("Længden for vores Array er " + arrayTal2.length);
        }
    }
}

