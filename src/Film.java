public class Film {
    public final String filmName;
    public final String datum;
    public final String time;
    public final int saalnummer;
    //for later
//    public final String overview;

    public Film(String filmName, String datum, String time, int saalnummer){

        this.filmName = filmName;
        this.datum = datum;
        this.time = time;
        this.saalnummer = saalnummer;
    }
    public String toString(){
        return filmName + "\n" + datum + "\n" + time + "\n" + saalnummer + "\n";
    }
}