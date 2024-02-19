import java.util.Random;
public class Terningkast {
    public static void main(String[] args) {

        Random rand = new Random();

        int sum = 0;
        int terningKast1 = 0;
        int terningKast2 = 0;
        int forsøg = 0;

        //while betyder "så længe"
        //Her betyder det, at så længe summen ikke er 7 vil den blive ved med at genere terningkast - når den rammer 7 vil den stoppe.
        while (sum != 7) {
            terningKast1 = rand.nextInt(1, 6);
            terningKast2 = rand.nextInt(1, 6);
            sum = terningKast2 + terningKast1;
            forsøg++;

            System.out.println(terningKast1 + " + " + terningKast2 + " = " + (terningKast2 + terningKast1));
        }
        //Her får jeg den til at skrive hvor mange forsøg det tog vha. forsøg++
        System.out.println("Det tog dig " + forsøg + " forsøg at ramme tallet 7");

    }
}