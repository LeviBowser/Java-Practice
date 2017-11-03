/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplearray1;

import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author profgreg
 */
class Team
{
    private String Name; //private makes it so you can't get to the 'name' attribute outside the class
    String GameScore[] = new String[3];
    private int Wins;
    private int Losses;
    
    Team(String sName, int iWins, int iLosses) //constructor
    {
        Name = sName;
        Wins = iWins;
        Losses = iLosses;
    }
    
    
    //mutator or setter method
    void setName(String sName)
    {
        Name = sName; //setter or mutator. changing the value of name. only public spot so you can change it.
    }
    
    String getName()
    {
        return Name;
    }
    
    void setWinsLosses(int iWins,int iLosses)
    {
        Wins = iWins; //since the wins and losses are private, they have to be accessed
        Losses = iLosses;//through this method to be changed in the encapsulation
        
        // ??????? System.out.println("The wins are " + Wins); //this wouldnt print anything unless
                                                               //you called it specifically
    }                                              
    
}

public class SampleArray1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iCount;
        int iWins;
        int iLosses;
        Scanner oiScan = new Scanner(System.in);
        Scanner osScan = new Scanner(System.in);
        
        System.out.println("How many teams?");
        iCount = oiScan.nextInt();
        
        //Allocate the memory for the array
        //But there is nothing in it yet
        //SOMEDAY it will hold a bunch of team objects
        Team oTeam[] = new Team[iCount];
        
        for (iCount = 0; iCount < oTeam.length; iCount++)
        {
            //Create a team object and put it in the array that
            //holds all of the team objects in separate
            //mailboxes
            oTeam[iCount] = new Team("byu", 10, 20); //creates object, and passes the numbers
                                                    //into the contructor to set it up.
            System.out.println("\n\nWhat is the team name?");
            oTeam[iCount].setName(osScan.nextLine());
            
            System.out.println("\nHOw many Wins?");
            iWins = oiScan.nextInt();
            
            System.out.println("\nHow many Losses?");
            iLosses = oiScan.nextInt();
            
            oTeam[iCount].setWinsLosses(iWins, iLosses);
            
            
            for (int iGameCount = 0; iGameCount < oTeam[iCount].GameScore.length; iGameCount++)
            {
                System.out.println("What is the score of game " + 
                        (iGameCount+1) + "?");
                oTeam[iCount].GameScore[iGameCount] = osScan.nextLine();
            }
        }
        
        for (iCount = 0; iCount < oTeam.length; iCount++)
        {
            System.out.println("\n\nTeam " + 
                    oTeam[iCount].getName());
            System.out.println("\nHere are their games:");
            
            for (int iGameCount = 0; iGameCount < oTeam[iCount].GameScore.length; iGameCount++)
            {
                System.out.println("Game " + 
                        (iGameCount+1) + ": " + 
                        oTeam[iCount].GameScore[iGameCount]);
            }
        }        
    }
    
}
