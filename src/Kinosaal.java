import static java.lang.System.out;

public class Kinosaal {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

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
                String colorS = String.valueOf(string);
                if (colorS=="true"){
                    System.out.print(ANSI_GREEN + string + "\t" + ANSI_RESET);
                }else{
                    System.out.print(ANSI_RED + string + "\t" + ANSI_RESET);
                }

            }
            String fnumString = String.valueOf(ynum);
            System.out.print(fnumString);
            System.out.println();
            ynum++;
        }
    }

    public int getCountOfFreePlaces(){
        int placesCount = 0;
        for (int i = 0; i < kinosaal.length; i++) {
            for (int j = 0; j < kinosaal[i].length; j++) {
                boolean myPlace = (boolean) kinosaal[i][j];
                if(myPlace){
                    placesCount++;
                }
            }
        }
        return placesCount;
    }

    public void setPlace(int col, int row){
        kinosaal[col][row] = false;
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
