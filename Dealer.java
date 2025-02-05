/**
 * Write a description of class Dealer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;
import java.util.ArrayList;
public class Dealer extends Actor
{
    private Deck deck;
    private int numCardsInDeck, triplesRemaining;
    private ArrayList<Card> cardsSelected = new ArrayList<>();
    
    public Dealer(int cardsInDeck)
    {
        numCardsInDeck = cardsInDeck;
        triplesRemaining  = cardsInDeck / 3;
        deck = new Deck(numCardsInDeck);
    }
    
    public void addedToWorld(World world)
    {
        dealBoard();
        setUI();
    }
    
    // Returns the list of currently selected cards.
    public ArrayList<Card> getSelectedCards() 
    {
        return cardsSelected;
    }

// Adds a card to the selection.
    public void addSelectedCard(Card card) 
    {
        if (!cardsSelected.contains(card)) 
        {
            cardsSelected.add(card);
        }
    }

// Removes a card from the selection.
    public void removeSelectedCard(Card card) 
    {
        cardsSelected.remove(card);
    }

// Resets the selection by updating the card images and clearing the list.
    public void resetSelectedCards() 
    {
        for (Card card : cardsSelected) 
        {
            card.setIsSelected(false);
            card.setImage(card.getCardImage());
        }
        cardsSelected.clear();
    }

    
    public void dealBoard()
    {
        Greenfoot.playSound("shuffle.wav");
        for (int i=0;i<5; i++)
        {
            for (int j=0; j<3; j++)
            {
                if (deck.getNumCardsInDeck() == 0)
                {
                    break;
                }
                else
                {
                    getWorld().addObject(deck.getRandomCard(), j * 130 + 80, i * 80 + 60);
                }   
            }
        }
        System.out.println(deck.getShuffledDeck());
        
    }
    
    public void setUI() 
    {
        Integer cardsRemaining = new Integer(deck.getNumCardsInDeck());
        Integer score = new Integer(Scorekeeper.getScore());
        getWorld().getBackground().drawString(score.toString(), 305, 510);
        getWorld().getBackground().drawString(cardsRemaining.toString(), 305, 475);
        
    }

    public void endGame()
    {
        
    }

    
    public void checkIfTriple() 
    {
        isTriple(cardsSelected.get(0), cardsSelected.get(1), cardsSelected.get(2));
    }

    
    public void actionIfTriple() 
    {
        
    }

    public void setCardsSelected(ArrayList<Card> cardList, ArrayList<Integer> indexList, Card[] cardArray) 
    {
        for (int i = 0; i<3;i++)
        {
            cardsSelected.add(i, cardArray[i]);
        }
    }
    
    
    public boolean isTriple(Card card1, Card card2, Card card3)
    {
        /**
        if (!(card1.getColor() == card2.getColor() && card2.getColor() == card3.getColor()))
        {
            if (!((card1.getColor() != card2.getColor()) && (card2.getColor() != card3.getColor()) && (card1.getColor() != card3.getColor())))
            {
                return false;
            }
        }
        
        if (!(card1.getShape() == card2.getShape() && card2.getShape() == card3.getShape()))
        {
            if (!((card1.getShape() != card2.getShape()) && (card2.getShape() != card3.getShape()) && (card1.getShape() != card3.getShape())))
            {
                return false;
            }
        }
        
        if (!(card1.getNumberOfShapes() == card2.getNumberOfShapes() && card2.getNumberOfShapes() == card3.getNumberOfShapes()))
        {
            if (!((card1.getNumberOfShapes() != card2.getNumberOfShapes()) && (card2.getNumberOfShapes() != card3.getNumberOfShapes()) && (card1.getNumberOfShapes() != card3.getNumberOfShapes())))
            {
                return false;
            }
        }
        
        if (!(card1.getShading() == card2.getShading() && card2.getShading() == card3.getShading()))
        {
            if (!((card1.getShading() != card2.getShading()) && (card2.getShading() != card3.getShading()) && (card1.getShading() != card3.getShading())))
            {
                return false;
            }
        }
        
        return true;
        */
       System.out.println(card1.attributes);
       System.out.println(card2.attributes);
       System.out.println(card3.attributes);
       for (int i = 0; i < 4; i++) {
        Object a1 = card1.attributes.get(i);
        Object a2 = card2.attributes.get(i);
        Object a3 = card3.attributes.get(i);
        // "all same" OR "all different"
        if (!((a1.equals(a2) && a2.equals(a3)) ||
              (!a1.equals(a2) && !a2.equals(a3) && !a1.equals(a3)))) {
            System.out.println("not");
            return false;
        }
    }
    System.out.println("is");
    return true;


    }
    
}
