public class ØvelseBasis {
    public static void main(String[] args) {

        String Alfabet = "ABCDEFGHIJKLMNOPQRSTUVXYZÆØÅ";
        System.out.print("Længden på alfabetet er " + Alfabet.length());
        System.out.println(" bogstaver langt.");

        boolean isJavafun = true;
        boolean isJavaEasy = false;

        System.out.println(isJavaEasy);
        System.out.println(isJavafun);

int x = 20;
int y = 10;

        System.out.println(x>y); //fordi x er større en y udskriver den "true"

        int z = 15;
        System.out.println(z == z); //den printer true fordi at værdien er den samme på hver side af '=='
        System.out.println(z != z); /*fordi at værdien er den samme på hver side , og '!=' betyder 'ikke lig med' printer den false.
        Have værdien ikke været den samme ville den havde printet true*/
    }
}
