package pattern;

/**
 * The Triangle class implements the Shape interface and represents a concrete prototype of a triangle object.
 * It contains a color field to store the color of the triangle.
 */
public class Triangle implements Shape {

    private String color;

    /**
     * Constructor for Triangle class that takes a color parameter.
     *
     * @param color The color of the triangle.
     */
    public Triangle(String color) {
        this.color = color;
    }

    /**
     * Draws the triangle object using the stored color.
     */
    public void draw() {
        System.out.println("\nDrawing a " + color + " triangle");
    }

    /**
     * Sets the color of the triangle object.
     *
     * @param color The new color for the triangle.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Creates and returns a new Triangle object that is a copy of the current object.
     *
     * @return A new Triangle object with the same color as the current object.
     */
    public Shape clone() {
        return new Triangle(color);
    }
}

