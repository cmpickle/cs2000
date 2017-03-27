package homework10;

import java.awt.Color;

public class Square extends Rectangle
{
	/**
	 * Square objects represent a square shape
	 * drawn to the screen at a particular position
	 * with some size and color.
	 *
	 * @author Cameron Pickle
	 * @version Fall 2012
	 */
	public Square(int x, int y, int size, Color color) {
		super(x, y, size, size, color);
	}

}
