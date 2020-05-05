import static java.lang.System.out;

public class Kinosaal {

    static Object[][] kinosaal={
            {true, true, true, true, true, true, true, true, true, true},
            {true, true, true, true, true, true, true, true, true, true},
            {true, true, true, true, true, true, true, true, true, true},
            {true, true, true, true, true, true, true, true, true, true},
            {true, true, true, true, true, true, true, true, true, true},
            {true, true, true, true, true, true, true, true, true, true},
            {true, true, true, true, true, true, true, true, true, true},
            {true, true, true, true, true, true, true, true, true, true},
            {true, true, true, true, true, true, true, true, true, true},
            {true, true, true, true, true, true, true, true, true, true}};

    public void printKinosaal(){
        int ynum = 1;
        System.out.println("                                    Bildschirm");
        System.out.println("                                ------------------");
        System.out.println("  1       2       3       4       5       6       7       8       9      10");
        for (Object[] strings : kinosaal) {    //search by x
            for (Object string : strings) {   //search by y

                System.out.print(string + "\t");
            }
            String fnumString = String.valueOf(ynum);
            System.out.print(fnumString);
            System.out.println();
            ynum++;
        }
    }


    //for later
    public void Kinosaalgenerator() {
        int anzahlReihe = 1;
        int anzahlSitze = 1;
        int GewuehnschteReihe = 5; //Reihen die generiert werden sollten
        int GewuehnschtePlaetze = 5; //Plätze die generiert werden sollten

        while (anzahlReihe <= GewuehnschteReihe){
            while (anzahlSitze <= GewuehnschtePlaetze){
                out.println("Anzahl Sitze ergänzt");
                //*********
                out.println("\n");
                anzahlSitze++;
            }
            anzahlSitze = 0;
            anzahlReihe++;
        }
        out.print("ready");
    }
}
