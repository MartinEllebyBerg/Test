public class Tid {
    public static void main(String[] args) {
        int time = 11;
        int minuter = 12;
        int sekunder = 13;
        int tidSidenMidnat = 0;
        int sekunderPåEtDøgn = 0;


        tidSidenMidnat = ((minuter*60)+(time*60*60)+(sekunder));
        sekunderPåEtDøgn = (24*60*60);

        System.out.println("sekunder: " + sekunder);
        System.out.println("Siden midnat er der gået " + tidSidenMidnat + " sekunder");
        System.out.println("På et døgn er der " + sekunderPåEtDøgn + " sekunder");
        System.out.println("Der er " + (sekunderPåEtDøgn-tidSidenMidnat) + " sekunder tilbage i døgnet");






    }
}