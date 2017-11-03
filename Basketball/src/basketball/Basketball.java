
package basketball;

/**
 * @author: Levi Bowser
 *          HW 2: Java Program - Basketball random generated scores
 *          1/23/15
 */

import java.util.Random; //made sure to pull the pre-set code for random


public class Basketball {

    public static void main(String[] args) {
        Random rndGenerator; //sets rndGenerator as a variable for type Random
        
        rndGenerator= new Random(); /** I separated the code into two to make sure I
                                      * understood the concepts presented in the class.
                                      */
        
        int iBYU; //Setting variables for integers to compare later
        int iGON;
        
                        
        iBYU = rndGenerator.nextInt( 100 ); //Making the integers randomly populated
        iGON = rndGenerator.nextInt( 100 );
        
            System.out.println("BYU's Final Score\t" + iBYU); //Making sure to output
            System.out.println("Gonzaga's Final Score\t" + iGON + "\n");
                                          //Making sure to add extra space with "\n"
            
            if(iBYU == iGON) //Setting a catch for ties before any more code is needed.
                System.out.println("It's a tie!");
            
            else         
                if(iBYU > iGON) /**Print the result after comparing the integers randomly
                                  *generator by past code
                                  */
                    System.out.println("BYU WINS!");
                else
                    System.out.println("Gonzaga Wins!");
                                             
    }
    
}
