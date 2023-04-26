package pattern;

/**
 * The MobiusStrip class implements the Shape interface and represents a concrete prototype of a Mobius strip object.
 * It contains a color field to store the color of the Mobius strip.
 */
public class MobiusStrip implements Shape {
    private String color;

    /**
     * Constructor for MobiusStrip class that takes a color parameter.
     * @param color The color of the Mobius strip.
     */
    public MobiusStrip(String color) {
        this.color = color;
    }

    /**
     * Draws the Mobius strip object using the stored color.
     */
    public void draw() {
        System.out.println("\nDrawing a " + color + " Mobius strip");
    }

    /**
     * Sets the color of the Mobius strip object.
     * @param color The new color for the Mobius strip.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Creates and returns a new MobiusStrip object that is a copy of the current object.
     * @return A new MobiusStrip object with the same color as the current object.
     */
    public Shape clone() {
        return new MobiusStrip(color);
    }
}

