import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    ArrayList<Card> deck = new ArrayList<>();
    ArrayList<Object> cambios = new ArrayList<>();

    Random rand = new Random();




    public String shuffle() {
        if (deck.size() == 0) {
            return "Deck Vacio";
        } else {
            Collections.shuffle(deck);
            return "Se mezclo el deck";
        }
    }

    public String head() {
        return "Quedan ";
    }

    public String pick() {
        return "Quedan ";
    }

    public String hand() {
        return "Quedan ";
    }

}





