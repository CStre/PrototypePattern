package pattern;
/**
The Circle class implements the Shape interface and represents a concrete prototype of a circle object.
It contains a color field to store the color of the circle.
*/
public class Circle implements Shape
{
    private String color;
    
    /**
     * Constructor for Circle class that takes a color parameter.
     * @param color The color of the circle.
     */
    public Circle(String color) 
    {
        this.color = color;
    }

    /**
     * Draws the circle object using the stored color.
     */
    public void draw() 
    {
        System.out.println("\nDrawing a " + color + " circle");
    }

    /**
     * Sets the color of the circle object.
     * @param color The new color for the circle.
     */
    public void setColor(String color) 
    {
        this.color = color;
    }

    /**
     * Creates and returns a new Circle object that is a copy of the current object.
     * @return A new Circle object with the same color as the current object.
     */
    public Shape clone() 
    {
        return new Circle(color);
    }
}
