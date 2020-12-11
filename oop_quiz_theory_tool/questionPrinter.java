package oop_quiz_theory_tool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class questionPrinter 
{
    private int correct;
    
    public void quizQuestions(ArrayList<question> questions, int numberOfQuestions)
    {
        Scanner scan = new Scanner(System.in);
        
        //Uses a for loop to allow the user to go back and forth to the different choices
        for(int i=0;i<numberOfQuestions;i++)
        {
            System.out.println(questions.get(i).getQuestions());
            System.out.println(String.format("a. %s",questions.get(i).getChoices()[0]));
            System.out.println(String.format("b. %s",questions.get(i).getChoices()[1]));
            System.out.println(String.format("c. %s",questions.get(i).getChoices()[2]));
            System.out.println(String.format("d. %s",questions.get(i).getChoices()[3]));
            System.out.print("Type the letter of your choice: ");
            String userAnswer = scan.nextLine();
            if(userAnswer.equals(questions.get(i).getAnswers()))
            {
                System.out.println("Correct!\n");
                correct++;
            }else
                System.out.println("Sorry the correct answer is "+questions.get(i).getAnswers()+"\n");
        }
        System.out.println("You answered "+ correct +" correct out of "+numberOfQuestions+" questions asked.\n");
    }

    public void setCorrect(int correct)
    {
        this.correct = correct;
    }

    public int getCorrect() 
    {
        return correct;
    }
    public void peek(ArrayList<question> questions)
    {
        for(int i=0;i<questions.size();i++)
        {
          System.out.println(String.format((i+1)+". %s",questions.get(i).getQuestions()));
        }
        System.out.println();
    }
    public void exit()
    {
        System.exit(1);
    }
}