import java.util.Scanner;
import static java.lang.System.out;

public class Kinobesuchsystem {
  public int PN;
  public int RN;
  public Scanner uInput;
  public int freie_Plaetze = 1; //Anzahl freie Plaetzen?
  public int freie_Reihen = 1;

  public void getPN(){
    out.println("Reservieren Sie eine Platznummer " + "(" + "Freie Plaetze: " + freie_Plaetze + "): ");
    PN = uInput.nextInt(); //Holt Platznummer Liste
  }
  public void getRN(){
    out.println("Wählen Sie eine Reihe aus " + "(" + "Freie Reihen: " + freie_Reihen + "): ");
    RN = uInput.nextInt(); //Holt Reihennummer Liste
  }

  public void verwalten(){

    uInput = new Scanner(System.in);

    try{
      getPN();
      getRN();
      Platzreservierung PR = new Platzreservierung();
      PR.setReihe_PlatzNummer(RN, PN);
    }
    catch(Exception  e){
      out.println("Bitte, geben Sie ein Zahl");
      verwalten();
    }
  }
}
