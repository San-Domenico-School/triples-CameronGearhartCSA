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
    private ArrayList<Card> cardOnBoard;
    private ArrayList<Integer> selectedCardsIndex;
    private Card[] cardsSelected;
    private int numCardsInDeck, triplesRemaining;
    
    public Dealer(int cardsInDeck)
    {
        numCardsInDeck = cardsInDeck;
        triplesRemaining  = cardsInDeck / 3;
        deck = new Deck(numCardsInDeck);
        cardsSelected = new Card[3];
    }
    
    public void addedToWorld(World world)
    {
        dealBoard();
        setUI();
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
                    getWorld().addObject(deck.getTopCard(), j * 130 + 80, i * 80 + 60);
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
        
    }

    
    public void actionIfTriple() 
    {
        
    }

    public void setCardsSelected(ArrayList<Card> cardList, ArrayList<Integer> indexList, Card[] cardArray) 
    {
        
    }
    
    
    public boolean isTriple(Card card1, Card card2, Card card3)
    {
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
    }
}
