
/**
 * Created by cwalsh on 9/10/16.
 */
public class Card {
    private  int numberValue;
    private  String suit;

    public Card(int numberValue, String suit) {
        this.numberValue = numberValue;
        this.suit = suit;
    }

    public int getNumberValue() {
        return numberValue;
    }

    public String getSuit() {
        return suit;
    }
}
