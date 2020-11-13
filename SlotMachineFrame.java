/*
 * Nick Fracaro
 * Dr.Klump
 * Vegas Baby
 * 11/13/2020
 * */

/*
 * The imports below allow for sections of the code to be ran
 * */
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * SlotMachineFrame allows the game to be visible through the JFrame
 * */
public class SlotMachineFrame extends JPanel
{
		
	 	JMenuBar menuBar;//Defines the variable need for the menuBar
	    JMenu File, Help;//Defines the variable need for the menu
	    JMenuItem LoadTiles, SaveTiles, Print, Restart, EXIT;//Defines the variable need for the JMenuItem for File
	    JMenuItem About;//Defines the variable need for the JMenuItem for Help
	    JTextField txtCa$$h;//Defines the variable need for the textField
	    JLabel lblCash;//Defines the variable need for the JLabel
	    JButton btnMax, btnMid, btnMin;//Defines the variable need for the JButtons
	    JPanel pnlCash, pnlButton;//Defines the variable need for the JPanel
	    
	    public SlotMachineFrame()
	    {
	        menuBar = new JMenuBar();//Creates a new menu bar

	        File = new JMenu("File");//Creates the name for a menuBar button
	        menuBar.add(File);//Adds File to the menu bar
	        LoadTiles = new JMenuItem("LoadTilest");//Create the name for the item to be added to the menu
	        File.add(LoadTiles);//Adds LoadTiles as a sub menu item to File
	        SaveTiles = new JMenuItem("SaveTiles");//Create the name for the item to be added to the menu
	        File.add(SaveTiles);//Adds SaveTiles as a sub menu item to File
	        Restart = new JMenuItem("Restart");//Create the name for the item to be added to the menu
	        File.add(Restart);//Adds restart as a sub menu item to file
	        EXIT = new JMenuItem("Exit");//Create the name for the item to be added to the menu
	        File.add(EXIT);//Adds About as a exit menu item to File
	        
	        Help = new JMenu("Help");//Creates the name for a menuBar button
	        menuBar.add(Help);//Adds Help to the menu bar
	        
	        About = new JMenuItem("About");//Create the name for the item to be added to the menu
	        Help.add(About);//Adds About as a sub menu item to Help
	       
	        btnMax = new JButton("Max");//Create the Max Button
	        btnMid = new JButton("Mid");//Create the Mid Button
	        btnMin = new JButton("Min");//Create the Min Button
	        pnlButton = new JPanel();
	        lblCash = new JLabel("$");//Create the dollar sign label
	        pnlCash = new JPanel();
	        txtCa$$h = new JTextField(3);//The textfield that the user may edit

	        pnlButton.add(btnMax);//Adds the Max Button to the panel
	        pnlButton.add(btnMid);//Adds the Mid Button to the panel
	        pnlButton.add(btnMin);//Adds the Min Button to the panel

	        add(pnlButton, pnlCash);//Adds the label and Buttons to the panel

	        this.setJMenuBar(menuBar);//Sets the menuBar

	        /*LoadTiles = new JMenuItem("Load Tiles");
	        //LoadTiles.addMenuListener(new thisMenuListener());
	        File.add(SaveTiles);
	        */
	    }
	    
	    private void setJMenuBar(JMenuBar menuBar2) {
			// TODO Auto-generated method stub
			
		}

		public void paintComponent(Graphics g )//generates the colors and shapes
		{
			super.paintComponent(g);
			this.setBackground(Color.WHITE);//sets the background color of the frame

			g.setColor(Color.YELLOW);//sets the color for the circle
			g.fillOval(25, 25, 200, 200);// Sets the size of the circle

			g.setColor(Color.BLUE);//sets the color for the first square
			g.fillRect(275, 25, 200, 200);// Sets the size of the first square

			g.setColor(Color.RED);//sets the color for the second square
			g.fillRect(520, 25, 200, 200);// Sets the size of the second square
	    
			g.setColor(Color.RED);//sets the color for the third square
			g.fillRect(775, 25, 200, 200);// Sets the size of the third square
		}
	   
		
}
