package pattern;
/**
The Nonagon class implements the Shape interface and represents a concrete prototype of a nonagon object.
It contains a color field to store the color of the nonagon.
*/
public class Nonagon implements Shape
{
    private String color;

    /**
     * Constructor for Nonagon class that takes a color parameter.
     * @param color The color of the nonagon.
     */
    public Nonagon(String color) 
    {
        this.color = color;
    }

    /**
     * Draws the nonagon object using the stored color.
     */
    public void draw() 
    {
        System.out.println("\nDrawing a " + color + " nonagon");
    }

    /**
     * Sets the color of the nonagon object.
     * @param color The new color for the nonagon.
     */
    public void setColor(String color) 
    {
        this.color = color;
    }

    /**
     * Creates and returns a new Nonagon object that is a copy of the current object.
     * @return A new Nonagon object with the same color as the current object.
     */
    public Shape clone() 
    {
        return new Nonagon(color);
    }
}
