/**
 * Author: Nick Fracaro
 * Teacher: Dr. Klump
 * November 02, 2020
 * Pumpkin_Maker
*/

/**
 * Below is the imported libraries to help make the frame visible
 */

import javax.swing.JFrame;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Below is the class for the Pumpkin_Maker program
 */
public class Pumpkin_Maker
{
    /**
     * Below is the main function for the program
     * The code that allows for the frame to be generated is held inside the function
     * @param args
     */
    public static void main(String [] args)
    {
        TextFrame frm = new TextFrame("Pumpkin_Maker", 100, 100, 640, 480, JFrame.EXIT_ON_CLOSE);//Genereate the Frame for the buttons and field
        frm.setVisible(true);//Allows to make the frame visible
    }
}

/**
 * The section below is used for holding the code that holds the button, labels, and text fields
 */

class TextFrame extends JFrame//Textframe extends the JFrame which calls up to main to generate the frame
{
    public TextFrame()
    {
        this("Pumpkin_Maker", 100, 100, 500, 500,EXIT_ON_CLOSE);
    }
    //Sets up the frame that holds the title and other varables for the frame
    public TextFrame(String title, int left,int top, int width, int height, int closeOp)
    {
        setLook(title, left, top, width, height);//Sets what the TextFrame searches fro
        setDefaultCloseOperation(closeOp);
    }
    public void setLook(String title, int left, int top, int width, int height)//Sets the ints below
    {
        setTitle(title);//Sets the title
        setBounds(left, top, width,height);//sets the bounds
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        JPanel panSouth = new JPanel();
        panSouth.setLayout(new FlowLayout());
        panSouth.add(new JLabel("Left: "));//Label for the left
        JTextField txtLeft = new JTextField(5);//Text field for the left
        panSouth.add(txtLeft);
        panSouth.add(new JLabel("Top: "));//Label for the top
        JTextField txtTop = new JTextField(5);//Text field for the top
        panSouth.add(txtTop);
        panSouth.add(new JLabel("Width: "));//Label for the width
        JTextField txtWidth = new JTextField(5);//Text field for the width
        panSouth.add(txtWidth);
        panSouth.add(new JLabel("Height: "));//Label for the height
        JTextField txtHeight = new JTextField(5);//Text field for the height
        panSouth.add(txtHeight);
        panSouth.add(new JLabel("Eye(C S T): "));//Label for the eye
        JTextField txtEye = new JTextField(5);//Text field for the eye
        panSouth.add(txtEye);
        panSouth.add(new JLabel("Nose(C S T): "));//Label for the nose
        JTextField txtNose = new JTextField(5);//Text field for the nose
        panSouth.add(txtNose);
        panSouth.add(new JLabel("Mouth(O R): "));//Label for the mouth
        JTextField txtMouth = new JTextField(5);//Text field for the mouth
        panSouth.add(txtMouth);
        JButton btnDraw = new JButton("Draw");//Creates the btn
        btnDraw.addActionListener(new ActionListener()//Sets up the action listener for the button
        {
            public void actionPerformed(ActionEvent e)
            {
              //The code that allows the button to perform it's actions placed in here
              //g.OvalDraw(10,10,100,200);
              //g.OvalDraw(10,10,100,200);

            }
        });
        /**
         * Sets of the border layout and button
         */
        panSouth.add(btnDraw);
        c.add(panSouth, BorderLayout.SOUTH);
    }
}