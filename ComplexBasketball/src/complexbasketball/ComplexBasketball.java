
package complexbasketball;

import java.text.DecimalFormat; //imports of classes
import java.util.Random;
import java.util.Scanner;

/** Levi Bowser
 *  HW - 4 Java Program - Complex Basketball season
 *  2.10.15
 */
public class ComplexBasketball 
{
   
    public static void main(String[] args) 
            
    {
    
        Scanner sScan = new Scanner(System.in);  //new classes formed to be used
        Random RndGenerator = new Random();
        DecimalFormat decimalFormat = new DecimalFormat("0.000"); //this was an interesting way. originally i just multiplied it by 100 and into an int
        
        Team sHome = new Team(); //import new class for a new team
        
        int iHomeScore1; //setting variables for home team
        int iHomeScore2; //2nd score with the added 5. different to make sure change of home team didnt affect it.
        
        String sAway; //setting variables for away team
        
        int iAwayScore; //set the score like this       
        
        String sYes = ("y"); //2 seperate strings to make it exclusive to be able to input y or n.
        String sNo = ("n");
        String sAnswer; //gave the answer a value for the same reason above. more manuvarability.
        
        int iTeamRotation = 0; // i set up a rotation where if odd, user's team would be home.
        float fNumberOfGames; //change into a float so avoid the "divide by 0" issue that kept rising up      
                              //if you ever typed "n" in beginning. it would form an error.
                
        System.out.println("Would You Like To Play A Game? (Y/N)"); //main decision
        sAnswer = sScan.nextLine();
            System.out.println("");
            
            while (!((sYes.equalsIgnoreCase(sAnswer)) || (sNo.equalsIgnoreCase(sAnswer))))  //only while you do not put in y or n does it loop.
                                                                                            // so while the sAnswer does !equal 'y' or 'n'
                                                                                            //this loop repeats.
                    {
                        System.out.println("Would You Like To Play A Game? (Y/N)");
                        System.out.println("Please Enter " + "Y " + "or N.");                       
                        sAnswer = sScan.nextLine();
                        System.out.println("");
                        
                    }
               
            while (sYes.equalsIgnoreCase(sAnswer)) //beginning of main loop for game playing.
                {                    
                    iTeamRotation++; // never resets to make sure that home and visiting team (as well as 5 pt addition) keep switching
                                                                    
                if (sHome.sTeamName.equalsIgnoreCase("None")) //set to ask for team name only if the sTeamName was still "none" which my original initilize.
                    {                                         // since the team name no longer equaled "none" after the first round, it bypasses this statement.
                        System.out.println("What is your team name?");
                            sHome.sTeamName = sScan.nextLine();
                        System.out.println();
                    }
        
                    
                    System.out.println("What is the opposing team's name?");//self explanatory
                    sAway = sScan.nextLine();
                        System.out.println();
                    
                        
                        
                    iHomeScore1 = RndGenerator.nextInt( 101 ); //random number generated for scores of home team                   
                    iAwayScore = RndGenerator.nextInt( 101 );
                    
                    iHomeScore2 = iHomeScore1 + 5; //i made a second variable to be able to add the 5 without having the OT add another 5 in the loop.
                    
                    int iOverTime = 0; //reset overtime counter or initializes it to 0 in the beginning.
                    
                    while (iHomeScore2 == iAwayScore)
                        { 
                           iOverTime++; //counter of everytime this loops is utilized
                           iHomeScore2 += RndGenerator.nextInt( 16 ); // OT score added to the home team already with the 5 pt addition
                           iAwayScore += RndGenerator.nextInt( 16 );
                        }
                    
                    if (iTeamRotation %2 != 0) //the team rotation code where if odd, user's team was home.
                        {
                            System.out.println(sHome.sTeamName + "\t" + iHomeScore2); //user was currently the home team with the score
                                System.out.println();
                            sHome.iTotalPointsFor += iHomeScore2;
                        
                            System.out.println(sAway + "\t" + iAwayScore);
                                System.out.println();
                            sHome.iTotalPointsAgainst += iAwayScore;
                            
                            if (iHomeScore2 > iAwayScore)
                                { 
                                    System.out.println(sHome.sTeamName + " Wins");
                                    sHome.iWins += 1;               //added the count to wins
                                        System.out.println();
                            
                                }
                            else
                                {
                                    System.out.println(sHome.sTeamName + " Losses");
                                    sHome.iLosses += 1;             //added the count to losses
                                        System.out.println();
                                }
                        }
                    else  //team rotation if the user's TeamRotation was even. user's team is away
                          //i had to switch the points for and points against as well as the
                          //the increments for losses or wins. at this point the user's team is the
                          //away team.
                        {
                            System.out.println(sAway + "\t" + iHomeScore2);
                                System.out.println();
                            sHome.iTotalPointsAgainst += iHomeScore2;
                            
                            System.out.println(sHome.sTeamName + "\t" + iAwayScore); //user was away team
                                System.out.println();
                            sHome.iTotalPointsFor += iAwayScore;
                            
                            if (iHomeScore2 > iAwayScore) //as such this would be a loss
                                { 
                                    System.out.println(sHome.sTeamName + " Losses");
                                    sHome.iLosses += 1;
                                        System.out.println();                            
                                }
                            else
                                {
                                    System.out.println(sHome.sTeamName + " Wins"); //otherwise it would be a wine becuase they have a higher score.
                                    sHome.iWins += 1;
                                        System.out.println();
                                }
                        }
                    
                            if (iOverTime > 0)  //the print of the OT only if OT occured
                                {
                                    System.out.println(iOverTime + " OT");
                                    System.out.println();
                                }
                    
                    System.out.println("Would You Like To Play Again? (Y/N)");
                        sAnswer = sScan.nextLine();
                        System.out.println("");
                        
                    if (sYes.equalsIgnoreCase(sAnswer))  //if the answer was still yes, it would continue the while loop
                        System.out.println();
                        
                    else //else it would change the sAnswer to no, and would leave the while loop.
                        {                                
                            fNumberOfGames = (sHome.iWins + sHome.iLosses); //calculated the total number of games
                            sHome.dWinLossPct = (sHome.iWins / fNumberOfGames); //win loss percentage
                    
                                System.out.println(   //printed everything with tabs to line things up.
                                    "Team Name \t" 
                                    + "W \t" 
                                    + "L \t" 
                                    + "Pct \t" 
                                    + "Points For \t"
                                    + "Points Against \t");  

                                        System.out.println();
                
                                System.out.println(   //printed everything with tabs to line things up.
                                    "--------" 
                                    + "-\t" 
                                    + "-\t" 
                                    + "-\t" 
                                    + "----\t"
                                    + "----------\t"
                                    + "--------------\t");

                                        System.out.println();

                                System.out.println(   //printed everything with tabs to line things up.
                                    sHome.sTeamName + "\t" +"\t" 
                                    + sHome.iWins + "\t"
                                    + sHome.iLosses + "\t"
                                    + decimalFormat.format(sHome.dWinLossPct) + "\t"  //decimalFormat class used with 3 decimal places.
                                    + sHome.iTotalPointsFor + "\t" + "\t"
                                    + sHome.iTotalPointsAgainst);
                                
                                         System.out.println("");
                        }                
                       
                } 
            
           System.out.println("Have a Nice Day.");  //a nice little ending. but it also let me know if
                                                    //things were lined up correctly as well as if things ended
                                                    //then if it passed this, it had the potential to pass other code.
                                                    //this was just a viewable catch which actually helped me with the
                                                    //divide by 0 issue.
    }            
}

    
    
                   
      
   
