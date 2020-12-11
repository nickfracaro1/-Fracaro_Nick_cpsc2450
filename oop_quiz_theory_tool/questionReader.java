package oop_quiz_theory_tool;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/*
 * This class will read the questions on the JSon file
 * It will also check to see if the user entered the name of the file correctly 
 * */
public class questionReader 
{

    public ArrayList<question> readFromJSON(String fileName) throws FileNotFoundException, IOException, ParseException
    {
        try
        {
        	String questions;
            String answers;
            ArrayList<question> questionArray = new ArrayList<question>();
            FileReader reader = new FileReader(new File(fileName));
            JSONParser parser = new JSONParser();
            JSONObject all = (JSONObject)parser.parse(reader);
            JSONArray arr = (JSONArray)all.get("Questions");
            JSONObject questionObject;
            Iterator itr = arr.iterator();
            
            
            while(itr.hasNext())
            {
                String[] answer = new String[4];
                questionObject = (JSONObject)(itr.next());
                question = questionObject.get("question").toString();
                answer[0] = questionObject.get("a").toString();
                answer[1] = questionObject.get("b").toString();
                answer[2] = questionObject.get("c").toString();
                answer[3] = questionObject.get("d").toString();
                answers = questionObject.get("Answer").toString();
                questionArray.add(new question(questions,answer,answers));
            }
            return questionArray;
        } catch(Exception e){
        	//Will output an error message if the program cannot find the file
            System.out.println("404: File not Found!");
            return null;
        }
    }
    public ArrayList<question> read(String fname)
    {
        
        try
        {
            return readFromJSON(fname);
        } catch (Exception ex)
        {
                return null;
        }
    }
}