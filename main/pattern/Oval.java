package pattern;

/**
 * The Oval class implements the Shape interface and represents a concrete prototype of an oval object.
 * It contains a color field to store the color of the oval.
 */
public class Oval implements Shape {
    private String color;

    /**
     * Constructor for Oval class that takes a color parameter.
     *
     * @param color The color of the oval.
     */
    public Oval(String color) {
        this.color = color;
    }

    /**
     * Draws the oval object using the stored color.
     */
    public void draw() {
        System.out.println("\nDrawing a " + color + " oval");
    }

    /**
     * Sets the color of the oval object.
     *
     * @param color The new color for the oval.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Creates and returns a new Oval object that is a copy of the current object.
     *
     * @return A new Oval object with the same color as the current object.
     */
    public Shape clone() {
        return new Oval(color);
    }
}

