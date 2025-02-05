import java.util.ArrayList;
import greenfoot.*;

public class Deck 
{
    private ArrayList<Card> deck;
    private final int NUM_CARDS_IN_DECK;
    
    public Deck(int numOfCardsInDeck)
    {
        // Limit the number of cards to either 27 or 81 (as per your rules)
        numOfCardsInDeck = limitNumCardsInDeck(numOfCardsInDeck);
        
        // Instantiate the deck ArrayList before adding cards
        deck = new ArrayList<Card>();
        
        // Populate the unshuffled deck with the proper card objects
        populateUnshuffledDeckWithCards(numOfCardsInDeck);
        
        NUM_CARDS_IN_DECK = numOfCardsInDeck;
    }
    
    public Card getRandomCard()
    {
        if (deck.isEmpty()) {
            return null;
        }
        int randomIndex = (int)(Math.random() * deck.size());
        return deck.remove(randomIndex);
    }
    
    public int getNumCardsInDeck()
    {
        return deck.size();
    }
    
    public Card getTopCard()
    {
        return deck.remove(0);
    }
    
    public ArrayList<Card> getShuffledDeck()
    {
        return deck;
    }
    
    protected int limitNumCardsInDeck (int number)
    {
        if (number <= 27)
        {
            return 27;
        }
        else
        {
            return 81;
        }
    }
    
    protected Card getShuffledCard(int index)
    {
        return deck.get(index);
    }
    
    /**
     * This method populates the ArrayList 'deck' with Card objects.
     * The first set of cards is always added and additional cards are added
     * if numOfCardsInDeck is greater than 27 and 54, respectively.
     */
    private void populateUnshuffledDeckWithCards(int numOfCardsInDeck)        
    {
        // Always add the blank card (index 0)
        deck.add(new Card(Card.Shape.NO_SHAPE, Card.Color.NO_COLOR, 0, 0,
                new GreenfootImage("Triplets_0/blank_0_0_0.png"), 
                new GreenfootImage("Triplets_0/blank_0_0_0.png")));
        
        // First block of cards (for level 0)
        deck.add(new Card(Card.Shape.CIRCLE, Card.Color.BLUE, 1, 0,
                new GreenfootImage("Triplets_0/circle_blue_1_0.png"), 
                new GreenfootImage("Triplets_0/circle_blue_1_0_selected.png")));
        deck.add(new Card(Card.Shape.CIRCLE, Card.Color.BLUE, 2, 0,
                new GreenfootImage("Triplets_0/circle_blue_2_0.png"), 
                new GreenfootImage("Triplets_0/circle_blue_2_0_selected.png")));
        deck.add(new Card(Card.Shape.CIRCLE, Card.Color.BLUE, 3, 0,
                new GreenfootImage("Triplets_0/circle_blue_3_0.png"), 
                new GreenfootImage("Triplets_0/circle_blue_3_0_selected.png")));
        deck.add(new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 1, 0,
                new GreenfootImage("Triplets_0/circle_green_1_0.png"), 
                new GreenfootImage("Triplets_0/circle_green_1_0_selected.png")));
        deck.add(new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 2, 0,
                new GreenfootImage("Triplets_0/circle_green_2_0.png"), 
                new GreenfootImage("Triplets_0/circle_green_2_0_selected.png")));
        deck.add(new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 3, 0,
                new GreenfootImage("Triplets_0/circle_green_3_0.png"), 
                new GreenfootImage("Triplets_0/circle_green_3_0_selected.png")));
        deck.add(new Card(Card.Shape.CIRCLE, Card.Color.RED, 1, 0,
                new GreenfootImage("Triplets_0/circle_red_1_0.png"), 
                new GreenfootImage("Triplets_0/circle_red_1_0_selected.png")));
        deck.add(new Card(Card.Shape.CIRCLE, Card.Color.RED, 2, 0,
                new GreenfootImage("Triplets_0/circle_red_2_0.png"), 
                new GreenfootImage("Triplets_0/circle_red_2_0_selected.png")));
        deck.add(new Card(Card.Shape.CIRCLE, Card.Color.RED, 3, 0,
                new GreenfootImage("Triplets_0/circle_red_3_0.png"), 
                new GreenfootImage("Triplets_0/circle_red_3_0_selected.png")));
        deck.add(new Card(Card.Shape.SQUARE, Card.Color.BLUE, 1, 0,
                new GreenfootImage("Triplets_0/square_blue_1_0.png"), 
                new GreenfootImage("Triplets_0/square_blue_1_0_selected.png")));
        deck.add(new Card(Card.Shape.SQUARE, Card.Color.BLUE, 2, 0,
                new GreenfootImage("Triplets_0/square_blue_2_0.png"), 
                new GreenfootImage("Triplets_0/square_blue_2_0_selected.png")));
        deck.add(new Card(Card.Shape.SQUARE, Card.Color.BLUE, 3, 0,
                new GreenfootImage("Triplets_0/square_blue_3_0.png"), 
                new GreenfootImage("Triplets_0/square_blue_3_0_selected.png")));
        deck.add(new Card(Card.Shape.SQUARE, Card.Color.GREEN, 1, 0,
                new GreenfootImage("Triplets_0/square_green_1_0.png"), 
                new GreenfootImage("Triplets_0/square_green_1_0_selected.png")));
        deck.add(new Card(Card.Shape.SQUARE, Card.Color.GREEN, 2, 0,
                new GreenfootImage("Triplets_0/square_green_2_0.png"), 
                new GreenfootImage("Triplets_0/square_green_2_0_selected.png")));
        deck.add(new Card(Card.Shape.SQUARE, Card.Color.GREEN, 3, 0,
                new GreenfootImage("Triplets_0/square_green_3_0.png"), 
                new GreenfootImage("Triplets_0/square_green_3_0_selected.png")));
        deck.add(new Card(Card.Shape.SQUARE, Card.Color.RED, 1, 0,
                new GreenfootImage("Triplets_0/square_red_1_0.png"), 
                new GreenfootImage("Triplets_0/square_red_1_0_selected.png")));
        deck.add(new Card(Card.Shape.SQUARE, Card.Color.RED, 2, 0,
                new GreenfootImage("Triplets_0/square_red_2_0.png"), 
                new GreenfootImage("Triplets_0/square_red_2_0_selected.png")));
        deck.add(new Card(Card.Shape.SQUARE, Card.Color.RED, 3, 0,
                new GreenfootImage("Triplets_0/square_red_3_0.png"), 
                new GreenfootImage("Triplets_0/square_red_3_0_selected.png")));
        deck.add(new Card(Card.Shape.TRIANGLE, Card.Color.BLUE, 1, 0,
                new GreenfootImage("Triplets_0/triangle_blue_1_0.png"), 
                new GreenfootImage("Triplets_0/triangle_blue_1_0_selected.png")));
        deck.add(new Card(Card.Shape.TRIANGLE, Card.Color.BLUE, 2, 0,
                new GreenfootImage("Triplets_0/triangle_blue_2_0.png"), 
                new GreenfootImage("Triplets_0/triangle_blue_2_0_selected.png")));
        deck.add(new Card(Card.Shape.TRIANGLE, Card.Color.BLUE, 3, 0,
                new GreenfootImage("Triplets_0/triangle_blue_3_0.png"), 
                new GreenfootImage("Triplets_0/triangle_blue_3_0_selected.png")));
        deck.add(new Card(Card.Shape.TRIANGLE, Card.Color.GREEN, 1, 0,
                new GreenfootImage("Triplets_0/triangle_green_1_0.png"), 
                new GreenfootImage("Triplets_0/triangle_green_1_0_selected.png")));
        deck.add(new Card(Card.Shape.TRIANGLE, Card.Color.GREEN, 2, 0,
                new GreenfootImage("Triplets_0/triangle_green_2_0.png"), 
                new GreenfootImage("Triplets_0/triangle_green_2_0_selected.png")));
        deck.add(new Card(Card.Shape.TRIANGLE, Card.Color.GREEN, 3, 0,
                new GreenfootImage("Triplets_0/triangle_green_3_0.png"), 
                new GreenfootImage("Triplets_0/triangle_green_3_0_selected.png")));
        deck.add(new Card(Card.Shape.TRIANGLE, Card.Color.RED, 1, 0,
                new GreenfootImage("Triplets_0/triangle_red_1_0.png"), 
                new GreenfootImage("Triplets_0/triangle_red_1_0_selected.png")));
        deck.add(new Card(Card.Shape.TRIANGLE, Card.Color.RED, 2, 0,
                new GreenfootImage("Triplets_0/triangle_red_2_0.png"), 
                new GreenfootImage("Triplets_0/triangle_red_2_0_selected.png")));
        deck.add(new Card(Card.Shape.TRIANGLE, Card.Color.RED, 3, 0,
                new GreenfootImage("Triplets_0/triangle_red_3_0.png"), 
                new GreenfootImage("Triplets_0/triangle_red_3_0_selected.png")));
        
        // If more than 27 cards are desired, add the level 1 cards.
        if(numOfCardsInDeck > 27)
        {
            deck.add(new Card(Card.Shape.CIRCLE, Card.Color.BLUE, 1, 1,
                    new GreenfootImage("Triplets_1/circle_blue_1_1.png"), 
                    new GreenfootImage("Triplets_1/circle_blue_1_1_selected.png")));
            deck.add(new Card(Card.Shape.CIRCLE, Card.Color.BLUE, 2, 1,
                    new GreenfootImage("Triplets_1/circle_blue_2_1.png"), 
                    new GreenfootImage("Triplets_1/circle_blue_2_1_selected.png")));
            deck.add(new Card(Card.Shape.CIRCLE, Card.Color.BLUE, 3, 1,
                    new GreenfootImage("Triplets_1/circle_blue_3_1.png"), 
                    new GreenfootImage("Triplets_1/circle_blue_3_1_selected.png")));
            deck.add(new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 1, 1,
                    new GreenfootImage("Triplets_1/circle_green_1_1.png"), 
                    new GreenfootImage("Triplets_1/circle_green_1_1_selected.png")));
            deck.add(new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 2, 1,
                    new GreenfootImage("Triplets_1/circle_green_2_1.png"), 
                    new GreenfootImage("Triplets_1/circle_green_2_1_selected.png")));
            deck.add(new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 3, 1,
                    new GreenfootImage("Triplets_1/circle_green_3_1.png"), 
                    new GreenfootImage("Triplets_1/circle_green_3_1_selected.png")));
            deck.add(new Card(Card.Shape.CIRCLE, Card.Color.RED, 1, 1,
                    new GreenfootImage("Triplets_1/circle_red_1_1.png"), 
                    new GreenfootImage("Triplets_1/circle_red_1_1_selected.png")));
            deck.add(new Card(Card.Shape.CIRCLE, Card.Color.RED, 2, 1,
                    new GreenfootImage("Triplets_1/circle_red_2_1.png"), 
                    new GreenfootImage("Triplets_1/circle_red_2_1_selected.png")));
            deck.add(new Card(Card.Shape.CIRCLE, Card.Color.RED, 3, 1,
                    new GreenfootImage("Triplets_1/circle_red_3_1.png"), 
                    new GreenfootImage("Triplets_1/circle_red_3_1_selected.png")));
            deck.add(new Card(Card.Shape.SQUARE, Card.Color.BLUE, 1, 1,
                    new GreenfootImage("Triplets_1/square_blue_1_1.png"), 
                    new GreenfootImage("Triplets_1/square_blue_1_1_selected.png")));
            deck.add(new Card(Card.Shape.SQUARE, Card.Color.BLUE, 2, 1,
                    new GreenfootImage("Triplets_1/square_blue_2_1.png"), 
                    new GreenfootImage("Triplets_1/square_blue_2_1_selected.png")));
            deck.add(new Card(Card.Shape.SQUARE, Card.Color.BLUE, 3, 1,
                    new GreenfootImage("Triplets_1/square_blue_3_1.png"), 
                    new GreenfootImage("Triplets_1/square_blue_3_1_selected.png")));
            deck.add(new Card(Card.Shape.SQUARE, Card.Color.GREEN, 1, 1,
                    new GreenfootImage("Triplets_1/square_green_1_1.png"), 
                    new GreenfootImage("Triplets_1/square_green_1_1_selected.png")));
            deck.add(new Card(Card.Shape.SQUARE, Card.Color.GREEN, 2, 1,
                    new GreenfootImage("Triplets_1/square_green_2_1.png"), 
                    new GreenfootImage("Triplets_1/square_green_2_1_selected.png")));
            deck.add(new Card(Card.Shape.SQUARE, Card.Color.GREEN, 3, 1,
                    new GreenfootImage("Triplets_1/square_green_3_1.png"), 
                    new GreenfootImage("Triplets_1/square_green_3_1_selected.png")));
            deck.add(new Card(Card.Shape.SQUARE, Card.Color.RED, 1, 1,
                    new GreenfootImage("Triplets_1/square_red_1_1.png"), 
                    new GreenfootImage("Triplets_1/square_red_1_1_selected.png")));
            deck.add(new Card(Card.Shape.SQUARE, Card.Color.RED, 2, 1,
                    new GreenfootImage("Triplets_1/square_red_2_1.png"), 
                    new GreenfootImage("Triplets_1/square_red_2_1_selected.png")));
            deck.add(new Card(Card.Shape.SQUARE, Card.Color.RED, 3, 1,
                    new GreenfootImage("Triplets_1/square_red_3_1.png"), 
                    new GreenfootImage("Triplets_1/square_red_3_1_selected.png")));
            deck.add(new Card(Card.Shape.TRIANGLE, Card.Color.BLUE, 1, 1,
                    new GreenfootImage("Triplets_1/triangle_blue_1_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_blue_1_1_selected.png")));
            deck.add(new Card(Card.Shape.TRIANGLE, Card.Color.BLUE, 2, 1,
                    new GreenfootImage("Triplets_1/triangle_blue_2_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_blue_2_1_selected.png")));
            deck.add(new Card(Card.Shape.TRIANGLE, Card.Color.BLUE, 3, 1,
                    new GreenfootImage("Triplets_1/triangle_blue_3_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_blue_3_1_selected.png")));
            deck.add(new Card(Card.Shape.TRIANGLE, Card.Color.GREEN, 1, 1,
                    new GreenfootImage("Triplets_1/triangle_green_1_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_green_1_1_selected.png")));
            deck.add(new Card(Card.Shape.TRIANGLE, Card.Color.GREEN, 2, 1,
                    new GreenfootImage("Triplets_1/triangle_green_2_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_green_2_1_selected.png")));
            deck.add(new Card(Card.Shape.TRIANGLE, Card.Color.GREEN, 3, 1,
                    new GreenfootImage("Triplets_1/triangle_green_3_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_green_3_1_selected.png")));
            deck.add(new Card(Card.Shape.TRIANGLE, Card.Color.RED, 1, 1,
                    new GreenfootImage("Triplets_1/triangle_red_1_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_red_1_1_selected.png")));
            deck.add(new Card(Card.Shape.TRIANGLE, Card.Color.RED, 2, 1,
                    new GreenfootImage("Triplets_1/triangle_red_2_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_red_2_1_selected.png")));
            deck.add(new Card(Card.Shape.TRIANGLE, Card.Color.RED, 3, 1,
                    new GreenfootImage("Triplets_1/triangle_red_3_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_red_3_1_selected.png")));
        }
        
        // If more than 54 cards are desired, add the level 2 cards.
        if(numOfCardsInDeck > 54)
        {
            deck.add(new Card(Card.Shape.CIRCLE, Card.Color.BLUE, 1, 2,
                    new GreenfootImage("Triplets_2/circle_blue_1_2.png"), 
                    new GreenfootImage("Triplets_2/circle_blue_1_2_selected.png")));
            deck.add(new Card(Card.Shape.CIRCLE, Card.Color.BLUE, 2, 2,
                    new GreenfootImage("Triplets_2/circle_blue_2_2.png"), 
                    new GreenfootImage("Triplets_2/circle_blue_2_2_selected.png")));
            deck.add(new Card(Card.Shape.CIRCLE, Card.Color.BLUE, 3, 2,
                    new GreenfootImage("Triplets_2/circle_blue_3_2.png"), 
                    new GreenfootImage("Triplets_2/circle_blue_3_2_selected.png")));
            deck.add(new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 1, 2,
                    new GreenfootImage("Triplets_2/circle_green_1_2.png"), 
                    new GreenfootImage("Triplets_2/circle_green_1_2_selected.png")));
            deck.add(new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 2, 2,
                    new GreenfootImage("Triplets_2/circle_green_2_2.png"), 
                    new GreenfootImage("Triplets_2/circle_green_2_2_selected.png")));
            deck.add(new Card(Card.Shape.CIRCLE, Card.Color.GREEN, 3, 2,
                    new GreenfootImage("Triplets_2/circle_green_3_2.png"), 
                    new GreenfootImage("Triplets_2/circle_green_3_2_selected.png")));
            deck.add(new Card(Card.Shape.CIRCLE, Card.Color.RED, 1, 2,
                    new GreenfootImage("Triplets_2/circle_red_1_2.png"), 
                    new GreenfootImage("Triplets_2/circle_red_1_2_selected.png")));
            deck.add(new Card(Card.Shape.CIRCLE, Card.Color.RED, 2, 2,
                    new GreenfootImage("Triplets_2/circle_red_2_2.png"), 
                    new GreenfootImage("Triplets_2/circle_red_2_2_selected.png")));
            deck.add(new Card(Card.Shape.CIRCLE, Card.Color.RED, 3, 2,
                    new GreenfootImage("Triplets_2/circle_red_3_2.png"), 
                    new GreenfootImage("Triplets_2/circle_red_3_2_selected.png")));
            deck.add(new Card(Card.Shape.SQUARE, Card.Color.BLUE, 1, 2,
                    new GreenfootImage("Triplets_2/square_blue_1_2.png"), 
                    new GreenfootImage("Triplets_2/square_blue_1_2_selected.png")));
            deck.add(new Card(Card.Shape.SQUARE, Card.Color.BLUE, 2, 2,
                    new GreenfootImage("Triplets_2/square_blue_2_2.png"), 
                    new GreenfootImage("Triplets_2/square_blue_2_2_selected.png")));
            deck.add(new Card(Card.Shape.SQUARE, Card.Color.BLUE, 3, 2,
                    new GreenfootImage("Triplets_2/square_blue_3_2.png"), 
                    new GreenfootImage("Triplets_2/square_blue_3_2_selected.png")));
            deck.add(new Card(Card.Shape.SQUARE, Card.Color.GREEN, 1, 2,
                    new GreenfootImage("Triplets_2/square_green_1_2.png"), 
                    new GreenfootImage("Triplets_2/square_green_1_2_selected.png")));
            deck.add(new Card(Card.Shape.SQUARE, Card.Color.GREEN, 2, 2,
                    new GreenfootImage("Triplets_2/square_green_2_2.png"), 
                    new GreenfootImage("Triplets_2/square_green_2_2_selected.png")));
            deck.add(new Card(Card.Shape.SQUARE, Card.Color.GREEN, 3, 2,
                    new GreenfootImage("Triplets_2/square_green_3_2.png"), 
                    new GreenfootImage("Triplets_2/square_green_3_2_selected.png")));
            deck.add(new Card(Card.Shape.SQUARE, Card.Color.RED, 1, 2,
                    new GreenfootImage("Triplets_2/square_red_1_2.png"), 
                    new GreenfootImage("Triplets_2/square_red_1_2_selected.png")));
            deck.add(new Card(Card.Shape.SQUARE, Card.Color.RED, 2, 2,
                    new GreenfootImage("Triplets_2/square_red_2_2.png"), 
                    new GreenfootImage("Triplets_2/square_red_2_2_selected.png")));
            deck.add(new Card(Card.Shape.SQUARE, Card.Color.RED, 3, 2,
                    new GreenfootImage("Triplets_2/square_red_3_2.png"), 
                    new GreenfootImage("Triplets_2/square_red_3_2_selected.png")));
            deck.add(new Card(Card.Shape.TRIANGLE, Card.Color.BLUE, 1, 2,
                    new GreenfootImage("Triplets_2/triangle_blue_1_2.png"), 
                    new GreenfootImage("Triplets_2/triangle_blue_1_2_selected.png")));
            deck.add(new Card(Card.Shape.TRIANGLE, Card.Color.BLUE, 2, 2,
                    new GreenfootImage("Triplets_2/triangle_blue_2_2.png"), 
                    new GreenfootImage("Triplets_2/triangle_blue_2_2_selected.png")));
            deck.add(new Card(Card.Shape.TRIANGLE, Card.Color.BLUE, 3, 2,
                    new GreenfootImage("Triplets_2/triangle_blue_3_2.png"), 
                    new GreenfootImage("Triplets_2/triangle_blue_3_2_selected.png")));
            deck.add(new Card(Card.Shape.TRIANGLE, Card.Color.GREEN, 1, 2,
                    new GreenfootImage("Triplets_2/triangle_green_1_2.png"), 
                    new GreenfootImage("Triplets_2/triangle_green_1_2_selected.png")));
            deck.add(new Card(Card.Shape.TRIANGLE, Card.Color.GREEN, 2, 2,
                    new GreenfootImage("Triplets_2/triangle_green_2_2.png"), 
                    new GreenfootImage("Triplets_2/triangle_green_2_2_selected.png")));
            deck.add(new Card(Card.Shape.TRIANGLE, Card.Color.GREEN, 3, 2,
                    new GreenfootImage("Triplets_2/triangle_green_3_2.png"), 
                    new GreenfootImage("Triplets_2/triangle_green_3_2_selected.png")));
            deck.add(new Card(Card.Shape.TRIANGLE, Card.Color.RED, 1, 2,
                    new GreenfootImage("Triplets_2/triangle_red_1_2.png"), 
                    new GreenfootImage("Triplets_2/triangle_red_1_2_selected.png")));
            deck.add(new Card(Card.Shape.TRIANGLE, Card.Color.RED, 2, 2,
                    new GreenfootImage("Triplets_2/triangle_red_2_2.png"), 
                    new GreenfootImage("Triplets_2/triangle_red_2_2_selected.png")));
            deck.add(new Card(Card.Shape.TRIANGLE, Card.Color.RED, 3, 2,
                    new GreenfootImage("Triplets_2/triangle_red_3_2.png"), 
                    new GreenfootImage("Triplets_2/triangle_red_3_2_selected.png")));
        }
    }
}
