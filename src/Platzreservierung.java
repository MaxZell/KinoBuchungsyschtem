import java.io.*;

public class Platzreservierung {
    //to txt
    public static void saveBooking(String userEmail, String filmData, int reihe, int plaetz){
        try {
            FileWriter fstream = new FileWriter("order.txt",true);
            BufferedWriter out = new BufferedWriter(fstream);
//            out.write(new java.util.Date() + "\n" + "User Email: " + userEmail + "\n" + filmData + "Reihe: " + reihe + "\n" + "Plaetz Nummer: " + plaetz + "\n" + "\n");//user data
            //to txt
            out.write(new java.util.Date() + "\n");
            out.write("User Email: " + userEmail +"\n");
            out.write(filmData);
            out.write("Reihe: " + reihe + "\n");
            out.write("Plaetz Nummer: " + plaetz + "\n");
            out.newLine();
            out.close();
            System.out.println("Successfully wrote to the file.");
        } catch (Exception e) {
            System.out.println("An error with txt file occurred.");
            e.printStackTrace();
        }
    }
}
