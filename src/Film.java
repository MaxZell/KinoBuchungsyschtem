public class Film {
    public final String filmName;
    public final String datum;
    public final String zeit;
//    public final String ort;  //Kinotheater adresse
    public final int saalnummer;

    public Film(String filmName, String datum, int saalnummer){
        //this.filmName = filmName;
        //this.datum = datum;
        //this.saalnummer = saalnummer;

        //default film info
        this.filmName = "Titantik";
        this.datum = "22.04.2020";
        this.zeit = "12:00 AM";
        this.saalnummer = 1;
    }
}