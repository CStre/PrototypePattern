package pattern;
/**
The Square class implements the Shape interface and represents a concrete prototype of a square object.
It contains a color field to store the color of the square.
*/
public class Square implements Shape
{
    private String color;

    /**
     * Constructor for Square class that takes a color parameter.
     * @param color The color of the square.
     */
    public Square(String color) 
    {
        this.color = color;
    }

    /**
     * Draws the square object using the stored color.
     */
    public void draw() 
    {
        System.out.println("\nDrawing a " + color + " square");
    }

    /**
     * Sets the color of the square object.
     * @param color The new color for the square.
     */
    public void setColor(String color) 
    {
        this.color = color;
    }

    /**
     * Creates and returns a new Square object that is a copy of the current object.
     * @return A new Square object with the same color as the current object.
     */
    public Shape clone() 
    {
        return new Square(color);
    }
}
