
import java.io.LineNumberReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.InputStreamReader;
import java.io.FileInputStream;

class Baseball
{
    public static void main(String[] args) throws FileNotFoundException
    {
        /**
         * Below is the header that welcomes the user to the program
         *  */
        System.out.println("*****************************************");
        System.out.println("*      Baseball Standings Analyser      *");
        System.out.println("*****************************************");
        System.out.println("This program reads a file that contains");
        System.out.println("current baseball standings and adds to");
        System.out.println("more detailed statistics. It also prints");
        System.out.println("overall standings in the American and");
        System.out.println("national leagues.");
       
        /**
         * Prompts user to enter the file name and then scans the machine for the document
         */
        System.out.println("Enter the name of the standings file:");
        Scanner truefile = new Scanner(System.in);
        String filename = truefile.nextLine();

        /**
         * Places the users options in to a while loop, so this way it will continue the prompt after the user selects a number
         */
        while (true)
        {

        System.out.println("1. AL East");
        System.out.println("2. AL Central");
        System.out.println("3. AL West");
        System.out.println("4. NL East");
        System.out.println("5. Nl Central");
        System.out.println("6. NL West");
        System.out.println("7. Overall");
        System.out.println("8. Exit");
        System.out.println("Enter the number of your choice: ");
        
        /**
         * Allows the user to enter in their input for which option they choose
        */
        Scanner choice = new Scanner(System.in);
        int answer = choice.nextInt();

        if(answer == 8)
        {
            System.exit(0);
        }
        else if(answer == 7)
        {
            File file = new File(filename);
            Scanner scan = new Scanner(file);

            while(scan.hasNextLine())
            {
                System.out.println(scan.nextLine());
            }

        }
        else if(answer == 1)
        {
          System.out.println("Help");
                
        }
        else if(answer == 6)
        {
            File file = new File("/home/nick/Desktop/baseball_standings.txt");
            Scanner scan = new Scanner(file);

            while(scan.hasNextLine())
            {
                System.out.println(scan.nextLine());
            }

        }
        else if(answer == 5)
        {
            File file = new File(filename);
            Scanner scan = new Scanner(file);

            while(scan.hasNextLine())
            {
                System.out.println(scan.nextLine());
            }

        }
        else if(answer == 4)
        {
            File file = new File(filename);
            Scanner scan = new Scanner(file);

            while(scan.hasNextLine())
            {
                System.out.println(scan.nextLine());
            }

        }
        else if(answer == 3)
        {
            File file = new File(filename);
            Scanner scan = new Scanner(file);

            while(scan.hasNextLine())
            {
                System.out.println(scan.nextLine());
            }

        }
        else if(answer == 2)
        {
            File file = new File(filename);
            Scanner scan = new Scanner(file);

            while(scan.hasNextLine())
            {
                System.out.println(scan.nextLine());
            }

        }
        else if(answer > 8)
        {
            System.out.println("Please select a number between 1 and 8");
        }
        else if(answer < 1)
        {
            System.out.println("Please select a number between 1 and 8");
        }
        
    }
}
}