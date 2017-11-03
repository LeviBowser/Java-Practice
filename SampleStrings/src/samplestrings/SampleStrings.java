
package samplestrings;

import java.util.Random;
import java.util.Scanner;

/**
 * Levi Bowser
 * Samples Strings examples 1/14/15
 */
public class SampleStrings {

    
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        String sFirst;
        String sLast;
        int iHome;
        int iAway;
        
        Scanner oScan = new Scanner(System.in);
        Random rndGenerator = new Random();
        
        System.out.println("Enter the home score:");
        iHome = oScan.nextInt();
        oScan.nextLine();
        
        System.out.println("Enter your First Name:");
        sFirst = oScan.nextLine();
        
        System.out.println("Enter your Last Name:");
        sLast = oScan.nextLine();
                
        System.out.println("\nHello " + sFirst + " " + sLast);
        
        System.out.println(iHome);
        
        
        
        iAway = rndGenerator.nextInt( 100 );
    }
    
    
}
