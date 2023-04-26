// Import necessary packages
package client;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

import pattern.Shape;
import pattern.Circle;
import pattern.Square;

public class PrototypeDemo
{

    // Initialize a map of shapes to be used as prototypes
    private static Map<String, Shape> shapes = new HashMap<>();

    // Populate the map with concrete prototype objects
    static 
    {
        shapes.put("circle", new Circle("color"));
        shapes.put("square", new Square("color"));
        shapes.put("rectangle", new Circle("color"));
        shapes.put("triangle", new Square("color"));
        shapes.put("oval", new Circle("color"));
        shapes.put("nonagon", new Square("color"));
        shapes.put("mobius strip", new Square("color"));
    }

    public static void main(String[] args) 
    {
        // Print welcome message and brief description of the program
        System.out.println("\n______________Welcome to the Prototype Demo!!__________________");
        System.out.println("______This program demonstrates the Prototype pattern!_________");
        System.out.println("Which allows you to create new objects by cloning existing ones.");

        // Initialize scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Loop indefinitely until user chooses to exit
        while (true) 
        {
            // Print menu options
            System.out.println();
            System.out.println("Select an option:");
            System.out.println("1. About this program");
            System.out.println("2. Draw a shape");
            System.out.println("3. Exit");

            // Read user's choice
            String choice = scanner.nextLine();

            // Take action based on user's choice
            switch (choice) 
            {
                // Print a detailed description of the program and the Prototype pattern
                case "1":
                    System.out.println("\n              This program demonstrates the Prototype pattern, which "
                        + "is a creational design pattern that allows you to create new objects by \n"
                        + "cloning existing ones. In this program, we have implemented the Shape "
                        + "interface and provided seven concrete prototypes.\n"
                        + "To create a new shape, you can clone one of these prototypes and specify "
                        + "the color of the new shape. This allows you to avoid the cost of\n"
                        + "creating a new object from scratch, and can be especially useful when "
                        + "creating complex objects with many properties.\n\n" +
                        "               In this program, when you select the 'Draw a shape' option, you will be prompted "
                        + "to enter the name of the shape you want to\n"
                        + "draw from a list of seven and the color of the shape. The program will then clone the corresponding prototype, "
                        + "set the color of the new \n" 
                        + "shape, and draw it.\n");
                    break;
                // Allow user to draw a shape by specifying the type and color
                case "2":
                    System.out.println("\nEnter the name of the shape to draw from the list provided below:\n"
                        + "1. circle\n2. square\n3. triangle\n4. rectangle\n5. oval\n6. nonagon\n7. mobius strip");
                    String shapeType = scanner.nextLine().toLowerCase();
                    if (!shapeType.equals("circle") && !shapeType.equals("square") 
                        && !shapeType.equals("triangle") && !shapeType.equals("rectangle") 
                        && !shapeType.equals("oval") && !shapeType.equals("nonagon") 
                        && !shapeType.equals("mobius strip")) 
                    {
                        System.out.println("\nInvalid shape type. Please try again.\n");
                        break;
                    }
                    System.out.println("\nEnter the color of the shape:");
                    String color = scanner.nextLine().toLowerCase();

                    // Clone the appropriate prototype and set the color, then draw the shape
                    if (shapes.containsKey(shapeType)) 
                    {
                        Shape shape = shapes.get(shapeType).clone();
                        shape.setColor(color);
                        shape.draw();
                    } 
                    // Handle case where user enters an invalid shape type
                    else 
                    {
                        System.out.println("\nShape not found. Please try again.\n");
                    }
                    break;
                // Exit the program
                case "3":
                    System.out.println("\nGoodbye!\n");
                    System.exit(0);
            }
        }
    }
}