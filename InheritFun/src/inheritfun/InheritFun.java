/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritfun;

import java.util.Scanner;

/**
 *
 * @author profgreg
 */

public class InheritFun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner osScan = new Scanner(System.in);
        Scanner oiScan = new Scanner(System.in);
        
        //Create an empty array that someday will hold student objects
        Student aoStudent[] = null;
        
        String sFirst;
        String sLast;
        int iAge;
        
        int iStudCount;
        
        System.out.println("How many names?");
        iStudCount = oiScan.nextInt();
        
        if (iStudCount > 0)
            //Re-Size the array and create the mailboxes
            //however, there is nothing in each box
            aoStudent = new Student[iStudCount];
        
        for (int iCount = 0; iCount < iStudCount; iCount++)
        {
            System.out.println("Enter the First Name:");
            sFirst = osScan.nextLine();

            System.out.println("Enter the Last Name:");
            sLast = osScan.nextLine();

            System.out.println("What is your age:");
            iAge = oiScan.nextInt();

            System.out.println("\n\n");
            
            //Create an object by calling the student constructor and
            //then store it in the array element
            aoStudent[iCount] = new Student(sFirst, sLast, iAge);  

            //I could also have called this
            //System.out.println(aoStudent[iCount].getFirstName() + " " + aoStudent[iCount].getLastName());

            System.out.println(aoStudent[iCount].displayFullName());
        }
    }
    
}
