import java.util.Scanner;
import static java.lang.System.out;

public class Kinobesuchsystem {
  public int PN;
  public int RN;
  public Scanner uInput;
  public void verwalten(){
    uInput = new Scanner(System.in);

    out.println("Reservieren Sie eine Platznummer: \n" + freie_Plaetze);
    PN = uInput.nextInt(); //Holt Platznummer

    out.println("Wählen Sie eine Reihe aus: \n" + freie_Reihen);
    RN = uInput.nextInt(); //Holt Reihennummer

    Platzreservierung PR = new Platzreservierung();
    PR.setPlatzNummer(PN);
    PR.setReihenNummer(RN);



  }
}
