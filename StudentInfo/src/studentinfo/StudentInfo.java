
package studentinfo;

import java.util.Scanner;

public class StudentInfo 
{
   
    public static void main(String[] args) 
    {
      String sName;
      int iStudents;
      int iStudentNumber;
      int iQuiz_Ave;
      int iTest_Ave;
      int iHomework_Ave;
      double dFinal_Ave;
      String sLetter_Grade;
      
      
      Scanner sScan = new Scanner(System.in);
      Scanner iScan = new Scanner(System.in);
      //Scanner dScan = new Scanner(System.in); this was for a test, i dont know all the requirements anymore
      
       
        System.out.println("How many students are in your class?");
        iStudents = iScan.nextInt();
        
        
        for (iStudentNumber = 0; iStudentNumber < iStudents; iStudentNumber++)
        {
                    
        System.out.println("Enter the Name of student " + (iStudentNumber + 1) + ":");
        sName = sScan.nextLine();
            System.out.println();
            
        System.out.println("Enter the quiz ave:");
        iQuiz_Ave = iScan.nextInt();
            System.out.println();
            
        System.out.println("Enter the test ave:");
        iTest_Ave = iScan.nextInt();
            System.out.println();
            
        System.out.println("Enter the homework ave:");
        iHomework_Ave = iScan.nextInt();
            System.out.println();
        
        dFinal_Ave = ((iQuiz_Ave*.4) + (iHomework_Ave*.2) + (iTest_Ave*.4));
        
            if (dFinal_Ave >= 90)
            {
                System.out.println("A");
                sLetter_Grade = "A";                      
            }
            else if (dFinal_Ave >= 80)
            {
                    System.out.println("B");
                    sLetter_Grade = "B"; 
            }       
            else if (dFinal_Ave >= 70)
            {   
                    System.out.println("C");
                    sLetter_Grade = "C"; 
            }
                
            else
            { 
                System.out.println("E");
                sLetter_Grade = "E"; 
            }
        
        System.out.println("Name \t" + "Ave \t" + "Grade \t");
        System.out.println(sName + "\t" + dFinal_Ave + "\t" + sLetter_Grade + "\t");
    }
    
}
}