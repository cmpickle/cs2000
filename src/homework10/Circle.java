package homework10;
import java.awt.Graphics;
import java.awt.Color;

/**
 * Circle objects represent a circle shape
 * drawn to the screen at a particular position
 * with some size and color.
 *
 * @author Peter Jensen
 * @author modifier Cameron Pickle
 * @version Fall 2012
 */
public class Circle extends Shape
{
    // Instance variables.

    private int x, y;
    private Color color;
    private int diameter;

    /**
     * Constructor - initializes the position, diameter, and
     * color of this circle object.
     *
     * @param x
     *         the x coordinate of this object's position
     *
     * @param y
     *         the x coordinate of this object's position
     *
     * @param diameter
     *              the diameter of this circle
     *
     * @param color
     *             the color of this circle
     */
    public Circle (int x, int y, int diameter, Color color)
    {
	// Save the size.
	
	this.x = x;
	this.y = y;
	this.color = color;
	this.diameter = diameter;
    }

    /**
     * Changes the position of this shape by
     * the specified amount.  Note that this does
     * not set the position absolutely, the deltas
     * specify how far to move the shape from its
     * current position.
     *
     * @param deltaX
     *              how far to move the shape horizontally
     *
     * @param deltaY
     *              how far to move the shape vertically
     */
    public void move (int deltaX, int deltaY)
    {
	x = x + deltaX;
	y = y + deltaY;
    }

    /**
     * Draws the circle at it's current position and color
     * to the specified graphics object.
     *
     * @param g
     *         the graphics object (where to draw to)
     */
    public void draw (Graphics g)
    {
	g.setColor (color);
	g.fillOval (x, y, diameter, diameter);
    }  
    
    /**
     * Returns true if the coordinates are within the circle.
     *
     * @param targetX
     *               an x coordinate
     *
     * @param targetY
     *               a y coordinate
     *
     * @return
     *        true if the coordinates are within the shape
     */
    public boolean isInside (int targetX, int targetY)
    {
	int cx = x + diameter / 2;  // Calculate the center point
	int cy = y + diameter / 2;
	
	int deltaX = cx - targetX;  // Calculate the deltas to the click
	int deltaY = cy - targetY;
	
	return (deltaX * deltaX + deltaY * deltaY) * 4 <= diameter * diameter;
    }
}
