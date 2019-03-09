import java.util.ArrayList;

public class ListOfFilms {

    public static void main(String[] args) {
        ArrayList<String> movieList = new ArrayList<>();

        movieList.add("Scary movie");
        movieList.add("Neverending Story");
        movieList.add("Breaking Bad");

        for (String list : movieList) {
            System.out.println(list);
        }

        movieList.remove(movieList.size()-1);
        movieList.remove(0);
        System.out.println();
        for (int i = 0; i < movieList.size(); i++) {
            System.out.println(movieList.get(i));
        }
    }
}
