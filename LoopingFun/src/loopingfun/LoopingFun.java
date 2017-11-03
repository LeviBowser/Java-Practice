/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopingfun;

import java.util.Scanner;

/**
 *
 * @author Wyatt
 */
public class LoopingFun {

    

    public static void main(String[] args) {
        
        String sDateName;
        boolean bContinue = true;
        int iRating;
        String sResponse;
        
        Scanner oScan = new Scanner(System.in);
        
        System.out.println("Do you want to play? (Y/N)");
        sResponse = oScan.nextLine(); //nextLine is whatever they put in till they press the enter key
        
        while ((bContinue == true) && (sResponse.equalsIgnoreCase("Y")))
        {
            System.out.println("What is the person's Name?");
            sDateName = oScan.nextLine();
            
            System.out.println("How did the date go (1 to 10)?");
            iRating = oScan.nextInt();
            
            if(iRating >= 9)
            {
                System.out.println("Yahoo! Lets get sealed!");
                bContinue = false;
                
            }
            else if (iRating >= 5)
                    {
                        System.out.println("Time to date her again and spend more money");
                        bContinue = true;
                    }
            else
            {
                System.out.println("I have to wash my hair");
            }
            
            oScan.nextLine();
        
        if (bContinue == true)
        {
        System.out.println("Do you want to play? (Y/N)");
        sResponse = oScan.nextLine();
                
        }
    
    }
        
    }
}