/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplearray;

import java.util.Scanner;

/**
 *
 * @author profgreg
 */
class Team
{
    String Name;
    String GameScore[] = new String[3];
}

public class SampleArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iCount;
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
            oTeam[iCount] = new Team();
            
            System.out.println("\n\nWhat is the team name?");
            oTeam[iCount].Name = osScan.nextLine();
            
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
                    oTeam[iCount].Name);
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
