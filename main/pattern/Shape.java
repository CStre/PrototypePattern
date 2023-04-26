package pattern;

/**
 * The Shape interface defines the common methods that all concrete shapes must implement.
 * This interface follows the Prototype pattern, which allows for the creation of new shapes
 * by cloning existing ones.
 */

public interface Shape
{
    //The draw method is responsible for drawing the shape on the screen.
    void draw();

    //The setColor method is responsible for setting the color of the shape.
    void setColor(String color);

    //The clone method is responsible for creating a new instance of the shape.
    Shape clone();
}
