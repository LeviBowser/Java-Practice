/**
 * Levi Bowser
 * March Madness/NIT Tournament/See You Next Year 
 * 1.30.15
 */
package marchmadness;

import java.util.Random;// getting what i need for random # generator
import java.util.Scanner; //getting what i need for input


public class MarchMadness {

    public static void main(String[] args) {
        
        Scanner sScan = new Scanner(System.in); //scanner for string input
        Scanner iScan = new Scanner(System.in); //scanner for integer input
        Random RndGenerator = new Random(); //random number generator
        
        String sInputHome; //variables are defined
        String sInputAway;
        
        int iNumberOfGames;
        int iNumberGamesPlayed;
        int iHomeScore;
        int iAwayScore;
        int iFinalWins = 0; //set equal to 0 so each game can increment if won
        int iFinalLoss = 0; //set equal to 0 so each game lost can increment
        
        double WinLossRatio; //set up a double variable to get a double for ratio
        
        
        System.out.println("Who is your home basketball team name?"); //getting input for strings
            sInputHome = sScan.nextLine();
            System.out.println();
            
            //no need to flush buffer becuase of different objects pulled
            
        System.out.println("How many games do you want to play this season?");//getting input for int
            iNumberOfGames = iScan.nextInt();
            System.out.println();
                    
        for (iNumberGamesPlayed = 1; iNumberGamesPlayed <= iNumberOfGames; iNumberGamesPlayed++)
            //started at one game to make sure it didn't count 0 as a game. set # of games to input int
                {
                
                System.out.println("What is your opponent's basketball team name?");
                    sInputAway = sScan.nextLine();
                    System.out.println();
                    
                iHomeScore = RndGenerator.nextInt( 100 ); //random number generated
                iAwayScore = RndGenerator.nextInt( 100 );
                
                System.out.println(sInputHome + " " + iHomeScore + "\n"); //random numbers used
                
                System.out.println(sInputAway + " " + iAwayScore + "\n");
                
                    while (iHomeScore == iAwayScore)//while in a tie, system reruns for overtime score
                        {
                        
                            iHomeScore = RndGenerator.nextInt( 100 );
                            iAwayScore = RndGenerator.nextInt( 100 );
                
                            System.out.println(sInputHome + "'s Over Time Final Score: " + iHomeScore + "\n");
                
                            System.out.println(sInputAway + "'s Over Time Final Score: " + iAwayScore + "\n");
                        }
                
                    if (iHomeScore > iAwayScore) //printing out win or lose dependent on score
                        {
                            System.out.println("Win");
                            iFinalWins++;
                        }
                    else
                        { 
                            System.out.println("Lose");
                            iFinalLoss++;
                        }
                    System.out.println();
                }
        
        System.out.println("Season's Final Results:"); /*left out and extra \n space becuase everything
                                                        was looking double spaced, i also did it with the 
                                                        above entries of team names.
                                                       */
        
        System.out.println(sInputHome + " " + iFinalWins + "-"+ iFinalLoss + "\n"); //extra space for readability
        WinLossRatio = ((double)iFinalWins / (double)iNumberOfGames * 100);
        
                /* set winlossratio to a double to me used now and casting the ints to make sure the result is a decimal
                    multiply by 100 to make double a int and make it easy
                    I just maintain using the same winlossratio variable to
                    make addidtional coding easy.
                */
            if (WinLossRatio >= 75) //set new double variable to determine true or false statements
                { 
                    System.out.println("March Madness"); //whats printed if true first and ends
                }    
            else if (WinLossRatio >= 50)
                
                /*create and else if to make a if ladder. if one fails, it checks
                the next if statement, if thats not true, continues to the else as
                a catch all.
                */
                    {
                        System.out.println("NIT Tournament"); //whats printed if true and ends
                    }   
                   else
                    {
                        System.out.println("See You Next Year"); //if all else is false
                    }
                }
               
    }


