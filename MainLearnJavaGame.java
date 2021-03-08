
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UshanthaR
 */
public class MainLearnJavaGame {

    public static void main(String[] args) {
        // TODO code application logic here
        
    LearnJavaGame1 game = new LearnJavaGame1();
    Scanner scan = new Scanner(System.in);
    int input;
    String userAns;
    String rightAns;
    int ifYesorNo;
    System.out.println("please press 1 to start the java learning game");
    input = scan.nextInt();
    
    if (input == 1) 
    { 
    System.out.println (" ___ num = 5" + " " + " fill in the blank");
    userAns = scan.next();
    rightAns = "int";
    game.checkIfCorrect(userAns, rightAns);
    game.showRightAnswer(rightAns);
    game.gradeForPoint(userAns, rightAns);
    game.getScore();
    System.out.println ("press  0 if you wanna exit, or press key 1 to continue!");
    ifYesorNo = scan.nextInt();
    game.exitGame(ifYesorNo);
    
    System.out.println( "how to read a String value ________" + " " + " fill in the blank");
    userAns = scan.next();
    rightAns = ".next()";
    game.checkIfCorrect(userAns, rightAns);
    game.showRightAnswer(rightAns);
    game.gradeForPoint(userAns, rightAns);
    game.getScore();
    System.out.println ("press  0 if you wanna exit, or press key 1 to continue!");
    ifYesorNo = scan.nextInt();
    game.exitGame(ifYesorNo);

    System.out.println("Object name for an array______" + " " + "fill in the blank");
    userAns = scan.next();
    rightAns = "ArrayList";
    game.checkIfCorrect(userAns, rightAns);
    game.showRightAnswer(rightAns);
    game.gradeForPoint(userAns, rightAns);
    game.getScore();
    System.out.println ("press  0 if you wanna exit, or press key 1 to continue!");
    ifYesorNo = scan.nextInt();
    game.exitGame(ifYesorNo);

    System.out.println("what is the datatype name for a character ______ ? "+ " " + " fill in the blank");
    userAns = scan.next();
    rightAns="char";
    game.checkIfCorrect(userAns, rightAns);
    game.showRightAnswer(rightAns);
    game.gradeForPoint(userAns, rightAns);
    game.getScore();
    System.out.println ("press  0 if you wanna exit, or press key 1 to continue!");
    ifYesorNo = scan.nextInt();
    game.exitGame(ifYesorNo);

    System.out.println("what are is ost simple name you can give as a variable name for number 6 _____? "+ " " + " fill in the blank");
    userAns = scan.next();
    rightAns="num";
    game.checkIfCorrect(userAns, rightAns);
    game.showRightAnswer(rightAns);
    game.gradeForPoint(userAns, rightAns);
    game.getScore();
    System.out.println ("press  0 if you wanna exit, or press key 1 to continue!");
    ifYesorNo = scan.nextInt();
    game.exitGame(ifYesorNo);

    System.out.println("which method type allow you to have methods only available for that class"+ " " + " fill in the blank");
    userAns = scan.next();
    rightAns="private";
    game.checkIfCorrect(userAns, rightAns);
    game.showRightAnswer(rightAns);
    game.gradeForPoint(userAns, rightAns);
    game.getScore();
    System.out.println ("press  0 if you wanna exit, or press key 1 to continue!");
    ifYesorNo = scan.nextInt();
    game.exitGame(ifYesorNo);

    game.getScore();  
    }
    
    }
    
}

