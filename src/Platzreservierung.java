import static java.lang.System.out;

public class Platzreservierung {

  /*Vorstellung VG = new Vorstellung();
  int Platznummer = VG.Platznummer;
  int Reihennummer = VG.Reihennummer;*/

  Kinobesuchsystem kinobesuchsystem = new Kinobesuchsystem();
  int RN = kinobesuchsystem.RN;
  int PN = kinobesuchsystem.PN;


  public int getPlatzNummer(){
    out.println("Gets dä Platznummer");
    return PN;
  }
  public int getReihenNummer(){
    out.println("Gets dä Reihennummer");
    return RN;
  }
  public void setReihe_PlatzNummer(int RN, int PN){
    this.RN = RN;
    this.PN = PN;
    out.println("Reihennummer und Platznummer werden geprueft...");
    Kinosaal KS = new Kinosaal(RN, PN);
    KS.Kinosaalgenerator();



  }
  public void setPlatzNummer(int PN){
    this.PN = PN;
    out.println("Platznummer: ok");
  }
}
