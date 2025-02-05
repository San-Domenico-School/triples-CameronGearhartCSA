import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card extends Actor
{
    public enum Color 
    {
        RED, BLUE, GREEN, NO_COLOR
    }
    
    public enum Shape
    {
        CIRCLE, TRIANGLE, SQUARE, NO_SHAPE
    }
    public ArrayList<Object> attributes = new ArrayList();
    private Shape shape;
    private Color color;
    private boolean isSelected;
    private int numberOfShapes, shading;
    private GreenfootImage cardImage; 
    private GreenfootImage selectedCardImage;
    
    public Card
    (
    Shape cardShape,
    Color cardColor,
    int cardNumberOfShapes, 
    int cardShading, 
    GreenfootImage cardImage,
    GreenfootImage selectedCardImage) 
    {
        this.shape = cardShape;
        this.color = cardColor;
        this.numberOfShapes = cardNumberOfShapes;
        this.shading = cardShading;
        this.cardImage = cardImage;
        this.selectedCardImage = selectedCardImage;
        this.isSelected = false;
        attributes.add(shape);
        attributes.add(color);
        attributes.add(numberOfShapes);
        attributes.add(shading);
        setImage(cardImage);
    }
    
    public Shape getShape()
    {
        return shape;
    }
    
    public void setShape(Shape newShape)
    {
        shape = newShape;
    }
    
    public Color getColor()
    {
        return color;
    }
    
    public void setColor(Color newColor)
    {
        color = newColor;
    }
    
    public int getNumberOfShapes()
    {
        return numberOfShapes;
    }
    
    public void setNumberOfShapes(int newNumberOfShapes)
    {
        numberOfShapes = newNumberOfShapes;
    }
    
     public boolean getIsSelected() 
    {
        return isSelected;
    }

    public void setIsSelected(boolean isSelected) 
    {
        this.isSelected = isSelected;
    }

    public int getShading() 
    {
        return shading;
    }

    public void setShading(int shading) 
    {
        shading = shading;
    }

    public GreenfootImage getCardImage() 
    {
        return cardImage;
    }

    public void setCardImage(GreenfootImage cardImage) 
    {
        cardImage = cardImage;
    }

    public GreenfootImage getSelectedCardImage() 
    {
        return selectedCardImage;
    }

    public void setSelectedCardImage(GreenfootImage selectedCardImage) 
    {
        selectedCardImage = selectedCardImage;
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
