/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forfun;

import java.util.Scanner;


public class ForFun {

    /**
     *
     * @param args
     */
    public static void main(String[] args) 
    {
       int iCount;
       int iMax;
       Scanner oiScan = new Scanner(System.in);
                   
       System.out.println("How many chips do you want to eat?");
       iMax = oiScan.nextInt();
       
       System.out.println();
      
       
       for (iCount = 1; iCount <= iMax; iCount++)  //first section is the variable number you are use, second section is the condidion you want met, while the 3rd part is if the condition isnt true what happens
        {
            System.out.println(iCount);
        }
    }
    
    
}
