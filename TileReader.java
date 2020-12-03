package Vegas_Baby;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Below is the classes used to read the type that the tile file is saved under
 * */
public class TileReader 
{
	
	public ArrayList<Tile> readFromText(String fileType) 
	{
		File f = new File(fileType);
		return readFromText(f);
	}
	
	
	public static ArrayList<Tile> readFromText(File f) 
	{
		try 
		{
			ArrayList<Tile> tileRead = new ArrayList<Tile>();
			Scanner fsc = new Scanner(f);
			String line;
			String[] parts;
			int x, y;
			Tile tile;
			while (fsc.hasNextLine()) 
			{
				line = fsc.nextLine();
				parts = line.split(" ");
				x = Integer.parseInt(parts[0]);
				y = Integer.parseInt(parts[1]);
				tile = new Tile(x,y);
				tileRead.add(tile);
			}
			fsc.close();
			return tileRead;
		} catch (Exception ex) 
		{
			return null; 
						  
		}
	}
	
	public ArrayList<Tile> readFromBinary(String fileType) 
	{
		File f = new File(fileType);
		return readFromBinary(f);
	}
	
	
	public static ArrayList<Tile> readFromBinary(File f) 
	{
		try 
		{
			ArrayList<Tile> tileRead;
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
			tileRead = (ArrayList<Tile>)ois.readObject();
			ois.close();
			return tileRead;
		} catch (Exception ex) 
		{
			return null;
		}
	}
	
	
	public ArrayList<Tile> readFromXML(String fileType) 
	{
		File f = new File(fileType);
		return readFromXML(f);
	}
	public static ArrayList<Tile> readFromXML(File f) 
	{
		try 
		{
			ArrayList<Tile> tilesRead;
			XMLDecoder dec = new XMLDecoder(
					new BufferedInputStream(new FileInputStream(f)));
			tilesRead = (ArrayList<Tile>)dec.readObject();
			dec.close();
			return tilesRead;
		} 
		catch (Exception ex) 
		{
			return null;
		}
	}
	public static ArrayList<Tile> read(String fileName) 
	{
		File f = new File(fileName);
		return read(f);
	}
	
	
	public static ArrayList<Tile> read(File f) 
	{
		try 
		{
			/*
			 * The listed file types
			 * */
			String fileType = f.getName().toUpperCase();
			if (fileType.endsWith(".TXT")) 
			{
				return readFromText(f);
			} 
			
			else if (fileType.endsWith(".BIN")) 
			{
				return readFromBinary(f);
			} 
			
			else if (fileType.endsWith(".XML")) 
			{
				return readFromXML(f);
			}
			else 
			{
				return null;
			}
		} 
		catch (Exception ex) 
		{
			return null;
		}
	
	}
}