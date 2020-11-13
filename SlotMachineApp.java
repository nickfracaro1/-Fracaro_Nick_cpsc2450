/*
 * Nick Fracaro
 * Dr.Klump
 * Vegas Baby
 * 11/13/2020
 * */


import javax.swing.*;//Allows for this main class to take from other classes like SlotMachineFrame

/*
 * SlotMachineFrame allows the game to run
 * */

public class SlotMachineApp //Creates the class for the program
{
    public static void main(String[] args) //Main function that allows the program to run
    {
        JFrame f = new JFrame("Vegas Baby Vegas Slot Machine");//Sets a new frame with the title
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closes the frame by default hen you close it out
        SlotMachineFrame a = new SlotMachineFrame();//calls the SlotMachineFrame class
        //Tile v = new Tile();//Calls the tile class
        new SlotMachineFrame();//extension of the call
        //new Tile();//extension of the call
        //f.add(v);//adds the class to the main function so it can be run
        f.add(a);//adds the class to the main function
        f.setSize(400,500);//sets the initial size of the frame
        f.setVisible(true);//set to be visible
    }
}