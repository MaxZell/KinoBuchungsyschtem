import java.util.Scanner;
import static java.lang.System.out;

public class Kinobesuchsystem {
    public int PN;
    public int RN;
    public int Film;
    public Scanner uInput;

    /**
     * DELETE
     * */
    public int freie_Plaetze = 1; //Anzahl freie Plaetzen?
    public int freie_Reihen = 1;


    public void welcomeToKino(){
        out.println("Helzlich welcommen ins Kino!");
    }
    public void films(){
        out.println("Es gibt solche Filmen: \n");
        Vorstellung vorstellung = new Vorstellung();
        vorstellung.printFilms();
        out.println("Bitte geben Sie gewünschte Film(Nummer)");
        Film = uInput.nextInt();
    }

    public void kinosaal(){
        Kinosaal kinosaal = new Kinosaal();
        kinosaal.printKinosaal();
    }

    public void getRN(){
        out.println("Wählen Sie eine Reihe aus " + "(" + "Freie Reihen: " + freie_Reihen + "): ");
        RN = uInput.nextInt(); //Holt Reihennummer Liste
    }

    public void getPN(){
        out.println("Reservieren Sie eine Platznummer " + "(" + "Freie Plaetze: " + freie_Plaetze + "): ");
        PN = uInput.nextInt(); //Holt Platznummer Liste
    }

    public void verwalten(){
        uInput = new Scanner(System.in);

        try{
            welcomeToKino();
            films();
            kinosaal();
            getRN();
            getPN();

            /**
             * DELETE
             * */
//            Platzreservierung PR = new Platzreservierung();
//            PR.setReihe_PlatzNummer(RN, PN);
        }
        catch(Exception e){
            out.println("Bitte, geben Sie ein Zahl");
            verwalten();
        }
    }
}
