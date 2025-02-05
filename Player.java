import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * This is the player. It acts as the player
 * 
 * Cameron 
 * V.1
 */

public class Player extends Actor
{
    private Dealer dealer;
    
    public Player(Dealer dealer)
    {
        this.dealer = dealer;
    }
    
    public void act()
    {
        // Retrieve the current cards on the board directly from the world.
        List<Card> cardsOnBoard = getWorld().getObjects(Card.class);
        
        // Check each card for mouse clicks.
        for (Card card : cardsOnBoard)
        {
            if (Greenfoot.mouseClicked(card))
            {
                if (card.getIsSelected())
                {
                    // Deselect the card if it is already selected.
                    card.setIsSelected(false);
                    card.setImage(card.getCardImage());
                    dealer.removeSelectedCard(card);
                }
                else 
                {
                    // Select the card and update its image.
                    card.setIsSelected(true);
                    card.setImage(card.getSelectedCardImage());
                    dealer.addSelectedCard(card);
                }
            }
        }
        
        // If exactly three cards have been selected, check for a triple and reset the selection.
        if (dealer.getSelectedCards().size() == 3)
        {
            dealer.checkIfTriple();
            dealer.resetSelectedCards();
        }
    }
}
