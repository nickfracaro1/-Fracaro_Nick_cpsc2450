/**
* Imports the necessary libraries to make the game functional
*/
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class GameZone
{

    public static void main(String[] args)
    {
        boolean mainLoop = true;

         /**
         * Below is the main loop which makes it so that if you do not select the a number from the menu
         * It loops so you have to pick one or quit
         */
        int choice;
        while(true)
        {
            /**
             * Below is the welcome message and the menu. Gives players direction and options
             */
            System.out.println("******************************************************");
            System.out.println("*               Welcome to the GameZone              *");
            System.out.println("******************************************************");
            System.out.println("What would you like to play?");
            System.out.println("1. Twenty-One");
            System.out.println("2. Rock, Papper Scissors");
            System.out.println("3. Neither - I'm Done");

            /*
            *Reads the users choice and loops the menu over until a number from the menu is chosen
            */
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the number of your choice: ");
            choice = input.nextInt();
            
            if(choice > 3 && choice < 1)
            {
                System.out.println("Please select a number from the menu");
            }

            /*
            *Below switch cases are used to split the game options
            *Case 1 is for twenty-one, 2 is for Rock, Papper, Scissors, and 3 is to exit
            */
            switch(choice)
            {
                case 1:

                while(true)
                {
                    Random radius = new Random();

                    int deck  = radius.nextInt(13);

                    System.out.println("You drew: " + deck);
                    System.out.println("Your current total is: " + deck);

                    Scanner blackjack = new Scanner (System.in);
                    System.out.println("Would you like to draw again? 1(Yes) 2(No)");
                    int decision = blackjack.nextInt();

                    /*
                    *If statements are used to cycle through the process of raching 21 or winning
                    */
                    if(decision == 1)
                    {
                       int result = deck + deck;

                        if(result >= 21)
                        {
                            System.out.println("You drew " + deck);
                            System.out.println("Your current total is: " + result);
                            System.out.println("You lost.");
                        }
                        else if(result < 21)
                        {
                            int result2 = result+ deck;

                            Scanner blackjack2 = new Scanner (System.in);
                            System.out.println("Would you like to draw again?");
                            int decision2 = blackjack2.nextInt();

                            if(result2 >= 21)
                        {
                            System.out.println("You drew " + deck);
                            System.out.println("Your current total is: " + result2);
                            System.out.println("You lost.");
                        }
                        else if(result2 < 21)
                        {
                            Scanner blackjack3 = new Scanner (System.in);
                            System.out.println("Would you like to draw again?");
                            int decision3 = blackjack2.nextInt();

                            System.out.println("You drew " + deck);
                            System.out.println("Your current total is: " + result2);
                        }
                        }
                    }
                    else if(decision == 2)
                    {
                        break;
                    }
                
                }
            
                case 2:
                case2Loop:
                while(true)
                {  
                /*
                * All three possibilites are put into an array
                * The user and computer player are randomly chosen from the array
                */                  
                List<String> givenList = Arrays.asList("Scissors", "Rock", "Paper");
                Random rand = new Random();
                String User = givenList.get(rand.nextInt(givenList.size()));
                String Computer = givenList.get(rand.nextInt(givenList.size()));
                
                /*
                * Goes through if else statements to produce results
                */
                
                if(User=="Rock" && Computer=="Scissors"||User=="Scissors" && Computer=="Paper"||User=="Paper" && Computer=="Rock")
                {
                    System.out.println("You played "+ User + " and the Computer played "+ Computer);
                    System.out.println("You win!");
                    
                }
                else if(User=="Scissors" && Computer=="Rock"||User=="Paper" && Computer=="Scissors"||User=="Rock" && Computer=="Paper")
                {
                    System.out.println("You played "+ User + " and the Computer selected "+ Computer);
                    System.out.println("You Lost");
                
                }
                else if(User=="Rock" && Computer=="Rock"||User=="Paper" && Computer=="Paper"||User=="Scissors" && Computer=="Scissors")
                {
                    System.out.println("You played "+ User + " and the Computer selected "+ Computer);
                    System.out.println("It was a tie.");
                    
                }

                /*
                * If the user says Yes(1) it will continue the game, if they pick 2(No) it will end
                */
                Scanner First = new Scanner(System.in);
                System.out.println("Would you like to play again?1(Yes) 2(No)");
                int choice1 = First.nextInt();

                if(choice1 == 1)
                {
                    continue case2Loop;
                }
                else if(choice1 == 2)
                {
                    break;
                }
                else if(choice1 > 2 && choice1 <1)
                {
                    System.out.println("Please select 1 or 2");
                }
                }
                
            
                case 3:
                    /*
                    *Ends the game
                    */
                    System.out.println("Thank you for playing!");
                    System.exit(0);
                    break;

            }
        
        }
    }

}