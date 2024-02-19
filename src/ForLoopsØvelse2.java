public class ForLoopsØvelse2 {
    public static void main(String[] args) {

        /*
        2  4  6  8  10  12

        4  19  34  49  64  79

        30  20  10  0 -10  -20

        -7  -3  1  5  9  13

        97  94  91  88  85  82
         */


        for (int i = 2; i < 13; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println(" ");

        for (int i = 4; i < 80; i += 15) {
            System.out.print(i + " ");
        }

        System.out.println(" ");

        for (int i = 30; i >= -20; i -= 10) {
            System.out.print(i + " ");
        }

        System.out.println(" ");

        for (int i =-7; i <= 13; i +=4) {
            System.out.print(i + " ");
        }

        System.out.println(" ");

        for (int i = 97; i >= 82; i -=3) {
            System.out.print(i + " ");
        }

        System.out.println(" ");

    }
}