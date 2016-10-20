
import java.util.ArrayList;

public class EAGY_A03_Q04 {
    public enum suit {
        HEARTS, SPADES, CLUBS, DIAMONDS
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static class Card {
        private suit mySuit;
        private String value;

        public Card(String value, suit mySuit) {
            this.mySuit = mySuit;
            this.value = value;
        }
        
        public String toString() {
            String suit; 
            switch(mySuit) {
                case HEARTS:
                    suit = "Hearts"; 
                    break;
                case SPADES:
                    suit = "Spades";
                    break;
                case CLUBS:
                    suit = "Clubs";
                    break;
                case DIAMONDS: 
                    suit = "Diamonds";
                    break;
                default:
                    suit = null;
                    break;
            }
            
            return value + " of " + suit; 
        }
    }
    
    public static class Deck {
        final int DECKSIZE = 52;
        
        ArrayList<Card> deck = new ArrayList<Card>(52);
        
        public Deck() {        
            for(int i = 0; i < DECKSIZE/4; i++) {
                deck.add(i, new Card("one", suit.HEARTS));
            }
        }
    }
}
