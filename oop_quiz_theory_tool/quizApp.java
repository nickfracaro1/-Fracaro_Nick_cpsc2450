package oop_quiz_theory_tool;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.parser.ParseException;



public class quizApp
{
    public static void main(String[] args) 
    {
    	/*
    	 * The introductory message
    	 * */
        System.out.println("*        What could possibly be more fun than this?         *"
                         + "*************************************************************"
                         + "*          OOP Theory and Concept questions                 *"
                         + "*************************************************************" 
                         + "*          Nothing. Nothing at All. Nope. Nada              *");
        
        
        ArrayList<question> questionAr = new ArrayList<question>();//Takes the questions on the JSon and making it into an array
        questionReader questReader = new questionReader();
        quizzer quiz = new quizzer();
        questionPrinter questPrinter = new questionPrinter();
        String path;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the file containing questions: ");//Asks the user to enter the name of the file
        path = scan.nextLine();
        //Below will call on the question reader class and 
        try {
            questionAr = questReader.readFromJSON(path);
        } catch (IOException | ParseException ex) 
        {
            Logger.getLogger(quizApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(questionAr==null)
            System.exit(1);
        System.out.println("File Found!\n");
        int choice=0;
        //Displays the menu choices in string form
        while(choice!=3){
            System.out.print("Here are your choices:" 
            		+ "1. Take the Quiz\"\r\n"
            		+ "2. See questions and answers\"\r\n"
            		+ "3. Exit\"\r\n"
            		+ "Enter the Number of your Choice: ");
            choice = scan.nextInt();
            //collects the input in int form
            if(choice==1)
            {
                System.out.print("\nHow many questions would you like? ");
                int Questions = scan.nextInt();
                quiz.getRandomQuestion(questionAr, Questions);
                questPrinter.runQuiz(quiz.getRandomQuestion(questionAr, Questions),Questions);  
                quiz.setCorrectAnswer(questPrinter.getCorrect());
            }else if(choice==2)
            {
                questPrinter.peek(questionAr);
            }else if(choice==3){
            	//Closes the program
                System.exit(0);
            }   
        }
        //The closing message
        System.out.println("*************************************************************"
                         + "*             Thank you for taking CPCS 24500               *"
                         + "*************************************************************");
    }
}