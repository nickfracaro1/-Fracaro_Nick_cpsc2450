package Vegas_Baby;
import java.awt.Color;
import java.io.Serializable;
import java.util.Random;

public class Tile implements Serializable 
{
	/*
	 * Below sets up the colors of the tiles
	 * */
	private static final Color[] colors = {Color.YELLOW, Color.BLUE, Color.RED, Color.ORANGE};//colors are set
	private static final String[] colorNames = {"yellow","blue","red","orange"};//types of colors
	private static final String[] shapes = {"circle","square"};//Types of shapes
	private int color;
	private int shape;
	
	public Tile() 
	{
		color = 3;
		shape = 0;
	}
	public Tile(int color, int shape) 
	{
		setColor(color);
		setShape(shape);
	}
	
	public int getColor() 
	{
		return color;
	}
	
	public void setColor(int color) 
	{
		if (color < 0) 
		{
			this.color = 0;
		} 
		
		else if (color > 4) 
		{
			this.color = 4;
		} 
		
		else 
		{
			this.color = color;
		}
	}
	
	public void setRandomly(Random rnd) 
	{
		color = rnd.nextInt(colors.length);
		shape = rnd.nextInt(shapes.length);
	}
	public Color getActualColor() 
	{
		return colors[color];
	}
	
	public String getColorName() 
	{
		return colorNames[color];
	}
	
	public int getShape() 
	{
		return shape; 
	}
	
	public void setShape(int shape)
	{
		if (shape < 0) 
		{
			this.shape = 0;
		} 
		else if (shape > 1) 
		{
			this.shape = 1;
		} 
		else 
		{
			this.shape = shape;
		}
	}
	
	public String getShapeAsString() 
	{
		return shapes[shape];
	}
	
	public String toStringFancy() 
	{
		return String.format("%s %s", getColorName(), getShapeAsString());
	}
	
	@Override
	public String toString()
	{
		//changes the color of the shape
		return String.format("%d %d",color,shape);
	}
	
	public int getShapeColor() 
	{
		return color*10+shape;
	}
}