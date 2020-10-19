/*
 * The program below is designed to chart either the cumulative or daily deaths on a line graph
 * related to covid-19
 * */
package covid_plotter;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Scanner;
import javax.swing.JFrame;
import org.math.plot.Plot2DPanel;
import java.awt.Container;
import java.awt.BorderLayout;

public class covid_plotter
{
    public static LinkedHashMap<String,double []> readData(Scanner fsc)
    {
        LinkedHashMap<String,double[]> result = new LinkedHashMap<String,double[]>();
        fsc.nextLine(); 
        String name;
        String line; 
        String[] parts;
        double[] deaths;  
        while (fsc.hasNextLine())
        {
            line = fsc.nextLine();
            parts = line.split("\t");
            name = parts[0];
            deaths = new double[parts.length-1];
            
            // Takes in the totals of the deaths
            for (int i = 1; i < parts.length; i++)
            {
                deaths[i-1] = Double.parseDouble(parts[i]);
            }
            //prints the results of the deaths
            result.put(name,deaths);
        }
        // all the accounts info will now be returned.
        return result;
    }
    // used to generate day numbers for the x axis plots
    public static double[] getDays(int howMany)
    {
        double[] result = new double[howMany];
        for (int i = 0; i < howMany; i++) 
        {
            result[i] = i;
        }
        return result;
    }
    public static void setUpAndShowPlot(Plot2DPanel plot)
    {
    	/*
    	 * This function is for the daily deaths of each country
    	 * The code is the same for the cumulative because the 
    	 * frame to create both should be about the same
    	 * */
        JFrame frame = new JFrame();
        frame.setBounds(100,100,500,500);
        frame.setTitle("Daily Deaths");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        Container c = frame.getContentPane();
        c.setLayout(new BorderLayout());
        plot.addLegend("SOUTH");
        plot.setAxisLabels("Day","Deaths");
        c.add(plot,BorderLayout.CENTER);
        frame.setVisible(true);
    }
    public static void setUpAndShowPlot1(Plot2DPanel plot)
    {
    	/*
    	 * The code for cumulative is the same as the one above with minor changes
    	 * */
        JFrame frame = new JFrame();
        frame.setBounds(100,100,500,500);
        frame.setTitle("Cumulative Deaths");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container c = frame.getContentPane();
        c.setLayout(new BorderLayout());
        plot.addLegend("SOUTH");
        plot.setAxisLabels("Day","Deaths");
        c.add(plot,BorderLayout.CENTER);
        frame.setVisible(true);
    }
    public static void main(String[] args) throws Exception
    {

    	System.out.println("****************************************************");
        System.out.println("*      INTERNATIONAL COVID-19 MORTALITY RATES      *");
        System.out.println("****************************************************");
        //This line is to prompt the user to enter the file name and then it reads the file
        //Was unable to make it work in the final version.
        System.out.println("Enter the name of data file: ");

        //Scans the names of the countries that the user inputs
        LinkedHashMap<String,double[]> countries;
        String countryNames;
        String[] names;
        Scanner scan = new Scanner(System.in);
        double[] deathCount;
        //begins to read the file and go trough the process to plot the points
        try 
        {
        	/*
        	 * This just reads the file straight from within the program rather than having
        	 * the user enter the file name
        	 * */
            Scanner filename = new Scanner(new File("countries_deaths.txt"));
            countries = readData(filename);
        } catch (Exception except)
        {
            countries = null;
        }
        if (countries == null)
        {
        	//This is an error message for the user if the program cannot find the file
            System.out.println("404 file not found");
        } else 
        {
            /*
             * The code below prompts a user to enter in their countries name. 
             * It will continuosly do so until you end the program
             * 
             * */
            do 
            {
            	//The question that the user isprompted with
                System.out.print("Enter countries to plot, separated by commas(or quit to end): ");
                countryNames = scan.nextLine();
                //If the user does not enter quit. They will then be prompeted a 
                if (!countryNames.equalsIgnoreCase("quit"))
                {
                    //This will genereate a panel for the countries data to be printed
                    Plot2DPanel plot = new Plot2DPanel();
                    //The entries get read and the comma that seperates them is taken into account
                    names = countryNames.split(",");
                    for (String name : names)
                    {
                        name = name.trim();
                        if (!countries.containsKey(name))
                        {
                            System.out.printf("%s is not in the data.\n", name);
                        } else {
                            deathCount = countries.get(name);
                            plot.addLinePlot(name, getDays(deathCount.length), deathCount);
                        }
                    }
                    //setup to show the Daily Deaths
                    setUpAndShowPlot(plot);
                    
                    
                }
                //This will end the loop upn the user entering in "quit"
            } while (!countryNames.equalsIgnoreCase("quit"));
            //Prints the user a closing message
            System.out.println("Your only task...");
            System.out.println("              ...is to wear a mask.");
        }
    }
}