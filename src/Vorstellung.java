import java.util.ArrayList;

public class Vorstellung {
    ArrayList<Film> filmeList = new ArrayList<Film>();

    //change for later -> generator
    public void createFilm(){
        Film Titanik = new Film("Titanik", "22.04.2020", "12:00 AM", 1);
        Film Terminator = new Film("Terminator", "23.04.2020", "12:00 PM", 1);

        filmeList.add(Titanik);
        filmeList.add(Terminator);
    }

    public void printFilms(){
        createFilm();
        int fnum = 1;
        for (Film film : filmeList){
            String fnumString = String.valueOf(fnum);
            System.out.println(fnumString + ". " + film);
            fnum++;
        }
    }
}
