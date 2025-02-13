import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card extends Actor
{
    private enum Color 
    {
        red, blue, green
    }
    
    private enum Shape
    {
        circle, triangle, square
    }
    
    private Shape shape;
    private Color color;
    private boolean isSelected;
    private int numberOfShapes, shading;
    private GreenfootImage cardImage, selectedCardImage;
    
    public Card
    (
    Shape cardShape,
    Color cardColor,
    int cardNumberOfShapes, 
    int cardShading, 
    GreenfootImage cardImage, 
    GreenfootImage selectedCardImage) 
    {
        shape = cardShape;
        color = cardColor;
        numberOfShapes = cardNumberOfShapes;
        shading = cardShading;
        cardImage = cardImage;
        selectedCardImage = selectedCardImage;
        isSelected = false;
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
     public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean isSelected) {
        isSelected = isSelected;
    }

    public int getShading() {
        return shading;
    }

    public void setShading(int shading) {
        shading = shading;
    }

    public GreenfootImage getCardImage() {
        return cardImage;
    }

    public void setCardImage(GreenfootImage cardImage) {
        cardImage = cardImage;
    }

    public GreenfootImage getSelectedCardImage() {
        return selectedCardImage;
    }

    public void setSelectedCardImage(GreenfootImage selectedCardImage) {
        selectedCardImage = selectedCardImage;
    }
    public void act()
    {
        // Add your action code here.
    }
}
