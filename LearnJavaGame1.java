/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UshanthaR
 */
public class LearnJavaGame1 {

    int score;
   
    //check if the answer is correct if so, add one point to score 
    protected int checkIfCorrect(String answer, String correctAns)
    {
    if (correctAns.equals(answer))
    {
    System.out.println("Awsome job!");
    return score++;
    }
    else 
    { 
    System.out.println("opps");    
    return score;
    }
    
    }
    
    protected void exitGame(int exitOrNo)
    {
      if (exitOrNo == 0)
      {
          System.out.println("Good Bye!");
          System.exit(0);  
      }
      else if (exitOrNo == 1)
      {
      System.out.println("Next -> ");
      }
    }
    
    protected void getScore ( )
    {
         System.out.println("score : " + score);
    }
    
    protected void showRightAnswer(String correctAns)
    {
        System.out.println("Correct answer is : " + correctAns);
    }
    
    protected void gradeForPoint(String answer, String correctAns)
    {
        if (correctAns.equals(answer))
        {
        System.out.println("you got +1 point");
        }
        else 
        {
        System.out.println("you got 0 point");
        }
    }
    
}

    
    
