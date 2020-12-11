package oop_quiz_theory_tool;

import java.util.ArrayList;
import java.util.Random;

/*
 * This class is designed to print out the questions in a random order each time
 * It also takes in the amount of questions that the user would like to attempt
 * and the total they get correct
 * */
public class quizzer
{
    private int correctAnswer;
    private int runningTotal;
    
    public int getTotal()
    {
        return runningTotal;
    }

    public void setTotal(int total)
    {
        this.runningTotal = total;
    }

    public int getCorrectAnswer() 
    {
    	//takes the correct answer
        return correctAnswer;
    }

    public void setCorrectAnswer(int correct)
    {
        this.correctAnswer = correct;
    }
    
    public ArrayList<question> getRandomQuestion(ArrayList<question> question, int totalCorrect)
    {
        Random rand = new Random();
        setTotal(totalCorrect);
        ArrayList<question> newList = new ArrayList<question>();
        for(int i=0;i<totalCorrect;i++)
        {
            int randomIndex = rand.nextInt(question.size());
            newList.add(question.get(randomIndex));
            question.remove(randomIndex);
        }
        return newList;
    }


    
}