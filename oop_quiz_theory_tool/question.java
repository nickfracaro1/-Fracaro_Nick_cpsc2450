package oop_quiz_theory_tool;

/*
 * This class is set to present the questions and answers
 * */
public class question 
{
    private String question;
    private String[] choices;
    private String answer;

    public String getQuestions() 
    {
        return question;
    }

    public void setQuestions(String question) 
    {
        this.question = question;
    }

    public String[] getChoices() {
        return choices;
    }

    public void setChoices(String[] choices) 
    {
        this.choices = choices;
    }

    public String getAnswers() 
    {
        return answer;
    }

    public void setAnswers(String answer) 
    {
        this.answer = answer;
    }
    
    public question(String question, String[] choices, String answer)
    {
        setQuestions(question);
        setChoices(choices);
        setAnswers(answer);
    }
   
}