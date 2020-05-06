import java.util.Scanner;
import static java.lang.System.out;

public class Kinobesuchsystem {
    public int PN;
    public int RN;
    public int film;
    public Scanner uInput;

    Kinosaal kinosaal = new Kinosaal();
    public int freie_Plaetze = kinosaal.getCountOfFreePlaces();
    Vorstellung vorstellung = new Vorstellung();
    public int activeFilms = vorstellung.getCountOfFilms();


    public void welcomeToKino(){
        out.println("Helzlich welcommen ins Kino!");
    }

    public String getUserEmail(){
        out.println("Bitte geben Sie Ihren Email: \n");
        return uInput.nextLine();
    }

    public int films(){
        out.println("Es gibt solche Filmen:" + "(" + activeFilms + ")" + "\n");
        Vorstellung vorstellung = new Vorstellung();
        vorstellung.printFilms();
        out.println("Bitte geben Sie gewünschte Film(Nummer)");
        return film = uInput.nextInt();
    }

    public void kinosaal(){
        kinosaal.printKinosaal();
    }

    public int getRN(){
        out.println("Wählen Sie eine Reihe aus " + "(" + "Freie Plaetze: " + freie_Plaetze + "): ");
        return RN = uInput.nextInt(); //Holt Reihennummer Liste
    }

    public int getPN(){
        out.println("Reservieren Sie eine Platznummer: ");
        return PN = uInput.nextInt(); //Holt Platznummer Liste
    }

    public void verwalten(){
        uInput = new Scanner(System.in);

        try{
            welcomeToKino();
            String userEmail = getUserEmail();
            int filmNum = films();
            String filmData = vorstellung.getFilmName(filmNum);
            kinosaal();
            int uRN = getRN();
            int uPN = getPN();
            kinosaal.setPlace(uRN-1, uPN-1);
            kinosaal();
            Platzreservierung platzreservierung = new Platzreservierung();
            //String userEmail, String filmData, int reihe, int plaetz
            platzreservierung.saveBooking(userEmail, filmData, uRN, uPN);
        }
        catch(Exception e){
            out.println("Bitte, geben Sie ein Zahl");
            verwalten();
        }
    }
}
