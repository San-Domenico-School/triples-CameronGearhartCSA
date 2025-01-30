import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private ArrayList<Card> cardsOnBoard;
    private ArrayList<Integer> selectedCardsIndex;
    private Card[] cardsSelected;
    private Dealer dealer;
    
    public Player(Dealer inDealer)
    {
        dealer = inDealer;
        cardsSelected = new Card[3];
        cardsOnBoard = new ArrayList<>();
        selectedCardsIndex = new ArrayList<>();
    }
    
    public void act()
    {
        selectCards();
        boolean threeCardsHaveBeenSelected = setCardsSelected();
        if (threeCardsHaveBeenSelected)
        {
            dealer.setCardsSelected(cardsOnBoard, selectedCardsIndex, cardsSelected);
            dealer.checkIfTriple();
            resetCardsSelected();
        }
    }
    
    public void addedToWorld(World inWorld)
    {
        cardsOnBoard = (ArrayList) getWorld().getObjects(Card.class);
    }
    
    private void selectCards()
    {
        for (Card card : cardsOnBoard)
        {
            if(Greenfoot.mouseClicked(card))
            {
                if (card.getIsSelected())
                {
                    card.setIsSelected(false);
                    card.setImage(card.getCardImage());
                    selectedCardsIndex.remove(card);
                }
                else 
                {
                    card.setIsSelected(true);
                    card.setImage(card.getSelectedCardImage());
                    selectedCardsIndex.add(cardsOnBoard.indexOf(card));
                }
            }
        }
    }
    private void resetCardsSelected()
    {
        for (Card card : cardsOnBoard)
        {
            card.setImage(card.getCardImage());
            card.setIsSelected(false);
            selectedCardsIndex.clear();
        }
    }
    
    private boolean setCardsSelected()
    {
        return selectedCardsIndex.size() == 3;
    }
    
    
}
