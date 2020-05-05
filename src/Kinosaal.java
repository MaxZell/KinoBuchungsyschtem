import static java.lang.System.out;

public class Kinosaal {
    int anzahlReihe = 1;
    int anzahlSitze = 1;
    int GewuehnschteReihe = 5; //Reihen die generiert werden sollten
    int GewuehnschtePlaetze = 5; //Plätze die generiert werden sollten

    public Kinosaal(int RN, int PN) {
    }

    public void Kinosaalgenerator() {
        Platz PZ = Platz.getInstance();
        System.out.print("Kinosaalrunner geöffnet " + anzahlSitze);

        while (anzahlReihe <= GewuehnschteReihe){
            while (anzahlSitze <= GewuehnschtePlaetze){
                out.println("Anzahl Sitze ergänzt");

                PZ.setGanzerPlatz(anzahlReihe, anzahlSitze, true);

                //print array
//                for(int i = 0 ; i < 3 ; i++){
//                    for(int j = 0 ; j < 2; j++)
//                    {
//                        System.out.print(sitze[i][j] + " " );
//                    }

                out.println("\n");
                anzahlSitze++;
            }
            anzahlSitze = 0;
            anzahlReihe++;
        }
        out.print("ready");
    }
}

//    public void Kinosaalgenerator() {
//        Platz PZ = Platz.getInstance();
//        System.out.print("Kinosaalrunner geöffnet " + anzahlSitze);
//
//        while (anzahlReihe<=GewuehnschteReihe){
//            while (anzahlSitze<=GewuehnschtePlaetze){
//                out.println("Anzahl Sitze ergänzt");
//                PZ.setGanzerPlatz(anzahlReihe, anzahlSitze, true);
//                anzahlSitze++;
//            }
//            anzahlSitze=0;
//            anzahlReihe++;
//        }
//        out.print("ready");
//    }