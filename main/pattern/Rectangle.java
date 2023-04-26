package pattern;
/**
The Rectangle class implements the Shape interface and represents a concrete prototype of a rectangle object.
It contains a color field to store the color of the rectangle.
*/
public class Rectangle implements Shape
{
    private String color;

    /**
     * Constructor for Rectangle class that takes a color parameter.
     * @param color The color of the rectangle.
     */
    public Rectangle(String color) 
    {
        this.color = color;
    }

    /**
     * Draws the rectangle object using the stored color.
     */
    public void draw() 
    {
        System.out.println("\nDrawing a " + color + " rectangle");
    }

    /**
     * Sets the color of the rectangle object.
     * @param color The new color for the rectangle.
     */
    public void setColor(String color) 
    {
        this.color = color;
    }

    /**
     * Creates and returns a new Rectangle object that is a copy of the current object.
     * @return A new Rectangle object with the same color as the current object.
     */
    public Shape clone() 
    {
        return new Rectangle(color);
    }
}

