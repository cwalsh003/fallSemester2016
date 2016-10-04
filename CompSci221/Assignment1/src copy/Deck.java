import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/**
 * Created by cwalsh on 9/10/16.
 */
public class Deck {
    Random rand = new Random();



    public static void main(String[] args){
        Deck d = new Deck();
        System.out.println("\n\nThis is a newly created deck: \n");
        d.printDeck();
        System.out.println("\n\nThis is a shuffled Deck: \n");
        d.shuffle();
        d.printDeck();
        System.out.println("\n\nThis is a sorted deck: \n");
        d.sortDeck();
        d.printDeck();
        System.out.println("\n\nhis is the deck with the first card removed: \n");
        d.removeCard();
        d.printDeck();
        System.out.println("\n\nThis is the deck with a 2 of hearts added to it and sorted: \n");
        d.addCard(2, "hearts");
        d.addCard(3, "diamonds");
        d.addCard(4, "spades");
        d.addCard(5, "clubs");

        d.sortDeck();
        d.printDeck();

    }
    private String[] suit = new String[] {"hearts", "diamonds", "spades", "clubs"};
    private ArrayList<Card> deck;

    public Deck(){
        deck = new ArrayList<>();
        for(int i = 0; i < 13; i++){
            for(String s : suit){
                deck.add(new Card(i, s));
            }
        }
    }

    public void printDeck(){
        for(Card c : deck){
            String numString = " ";
            int numberValue = c.getNumberValue();
            switch (numberValue){
                case 0: numString = "2";
                    break;
                case 1: numString = "3";
                    break;
                case 2: numString = "4";
                    break;
                case 3: numString = "5";
                    break;
                case 4: numString = "6";
                    break;
                case 5: numString = "7";
                    break;
                case 6: numString = "8";
                    break;
                case 7: numString = "9";
                    break;
                case 8: numString = "10";
                    break;
                case 9: numString = "J";
                    break;
                case 10: numString = "K";
                    break;
                case 11: numString = "Q";
                    break;
                default: numString ="A";

            }
            System.out.println( numString + ", " + c.getSuit());
        }
    }

    public void shuffle(){
      for(int j = 0; j < 10; j++) {
          for (int i = 0; i < 51; i++) {
              int n = rand.nextInt(52);
              Collections.swap(deck, i, n);
          }
      }
    }

    public void sortDeck(){
        Collections.sort(deck, new MyComparator());

    }
    class MyComparator implements Comparator<Card> {
        @Override
        public int compare(Card o1, Card o2) {
            if (o1.getNumberValue() < o2.getNumberValue()) {
                return -1;
            } else if (o1.getNumberValue() > o2.getNumberValue()) {
                return 1;
            }
            return 0;
        }}

    public void removeCard(){
        deck.remove(0);
        deck.trimToSize();
    }

    public void addCard(int val, String suit2){
        Card c = new Card(val - 2, suit2);
        deck.add(c);
    }
}


