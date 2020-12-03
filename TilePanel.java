package Vegas_Baby;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;
/*
 * Below allows the tiles to change color at random upon the user clicking on them
 * */
public class TilePanel extends JPanel implements MouseListener
{
	private static ArrayList<Tile> tiles;
	private static Random rand;
	
	
	public void mouseClicked(MouseEvent e) 
	{
		int whichTile = e.getX()/(this.getWidth()/4);
		Tile tile = tiles.get(whichTile);
		tile.setRandomly(rand);
		repaint();
	}
	
	public TilePanel() 
	{
		tiles = new ArrayList<Tile>();
		Tile tile;
		rand = new Random();
		for (int i = 0; i < 4; i++) 
		{
			tile = new Tile();
			tile.setRandomly(rand);
			tiles.add(tile);
		}
		addMouseListener(this);
	}
	
	public static void spin()
	{
		for(int i = 0; i<400; i++)
		{
			if(i < 100)
			{
				for(int j = 0; j<4; j++)
				{
					tiles.get(j).setRandomly(rand);
				}	
			}
			else if(i<200)
			{
				for(int j = 0; j<3; j++)
				{
					tiles.get(j).setRandomly(rand);
				}	
			}
			
			else if(i<300)
			{
				for(int j = 0; j<2; j++)
				{
					tiles.get(j).setRandomly(rand);
				}	
			}
			
			else 
			{
					tiles.get(0).setRandomly(rand);
			}
			
			try 
			{
				Thread.sleep(10);
			}
			catch(Exception ex)
			{
				
			}
			
			
		}
	}
	
	public static ArrayList<Tile> getTiles()
	{
		return tiles;
	}
	
	public void setTiles(ArrayList<Tile> tiles) 
	{
		this.tiles = tiles;
	}
	
	@Override
	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		int cellWidth = this.getWidth() / 4;
		int tileSize = 4*cellWidth/5;
		int shape;
		Color color;
		Tile tile;
		for (int i = 0; i < tiles.size(); i++) 
		{
			tile = tiles.get(i);
			shape = tile.getShape();
			color = tile.getActualColor();
			g.setColor(color);
			if (shape == 0) 
			{
				g.fillOval(i*cellWidth + cellWidth/10, cellWidth/10, tileSize, tileSize); 
			} else if (shape == 1) 
			{
				g.fillRect(i*cellWidth + cellWidth/10, cellWidth/10, tileSize, tileSize);
			} 
		}
	}
	/*
	 * Classes for the mouse events when the user click the tiles
	 * */
	public void mouseEntered(MouseEvent e) 
	{
		
	}
	public void mouseExited(MouseEvent e) 
	{
		
	}
	public void mousePressed(MouseEvent e)
	{
		
	}
	public void mouseReleased(MouseEvent e)
	{
		
	}
	
}