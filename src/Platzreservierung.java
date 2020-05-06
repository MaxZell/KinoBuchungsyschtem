import java.io.FileWriter;

public class Platzreservierung {
    //to txt
    public static void saveBooking(String userEmail, String filmData, int reihe, int plaetz){
        try {
            FileWriter myWriter = new FileWriter("out\\order.txt");
            myWriter.write("User Email: " + userEmail + "\n" + filmData + "Reihe: " + reihe + "\n" + "Plaetz Nummer: " + plaetz + "\n" + "\n");//user data
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (Exception e) {
            System.out.println("An error with txt file occurred.");
            e.printStackTrace();
        }
    }
}
