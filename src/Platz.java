import static java.lang.System.out;

public class Platz {

    private int nummer;
    private int reihe;
    private boolean freiheit;
    private static Platz instance;


    public static Platz getInstance(){
        if (instance == null){
            instance = new Platz();
        }
        return instance;
    }
    //nach public kommt "Object"
    public void setGanzerPlatz(int reihe, int nummer, boolean freiheit){
            this.reihe = reihe;
            this.nummer = nummer;
            this.freiheit = freiheit;
            out.println("Ein neuer Sitz wurde erstellt: ");
            out.println("Reihe: " +reihe +" Platznummer: "+ nummer);
            out.println("Frei: " + freiheit);
            out.print("\n");
            //return null;
    }
}