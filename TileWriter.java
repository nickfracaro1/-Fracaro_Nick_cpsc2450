package Vegas_Baby;//This is displayed among each class to help make it run under the package it is ran under

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

/*
 * When the user saves their tiles, it allows them to save as different types
 * */
public class TileWriter
{
	
	public static boolean writeToText(String fileName, ArrayList<Tile> tiles) 
	{
		File f = new File(fileName);
		return writeToText(f,tiles);
	}
	
	public static boolean writeToText(File f, ArrayList<Tile> tiles) 
	{
		try 
		{
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));
			for (Tile tile : tiles) 
			{
				pw.println(tile);
			}
			pw.close();
			return true;
		} catch (Exception ex) 
		
		{
			return false;
		}
	}
	
	
	public static boolean writeToBinary(String fname, ArrayList<Tile> tiles) 
	{
		File f = new File(fname);
		return writeToBinary(f,tiles);
	}
	
	
	public static boolean writeToBinary(File f, ArrayList<Tile> tiles) 
	{
		try 
		{
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
			oos.writeObject(tiles);
			oos.close();
			return true;
		} catch (Exception ex) 
		{
			return false;
		}
	}
	
 boolean write(String fileName, ArrayList<Tile> tiles) 
	{
		File f = new File(fileName);
		return write(f,tiles);
	}
	
	
	public boolean writeToXML(String fileName, ArrayList<Tile> tiles) 
	{
		File f = new File(fileName);
		return writeToXML(f,tiles);
	}
	
	
	public static boolean writeToXML(File f, ArrayList<Tile> tiles) 
	{
		try 
		{
			XMLEncoder enc = new XMLEncoder(new 
					BufferedOutputStream(new FileOutputStream(f)));
			enc.writeObject(tiles);
			enc.close();
			return true;
		} catch (Exception ex) 
		{
			return false;
		}
	}
	
	public static boolean write(File f, ArrayList<Tile> tiles) {
		try {
			/*
			 * The listed file types
			 * */
			String fileType = f.getName().toUpperCase();
			if (fileType.endsWith(".TXT")) 
			{
				return writeToText(f,tiles);
			} 
			else if (fileType.endsWith(".BIN")) 
			{
				return writeToBinary(f,tiles);
			} 
			else if (fileType.endsWith(".XML")) 
			{
				return writeToXML(f,tiles);
			} 
			else 
			{
				return false;
			}
		} 
		catch (Exception ex) 
		{
			return false;
		}
	}
	
}