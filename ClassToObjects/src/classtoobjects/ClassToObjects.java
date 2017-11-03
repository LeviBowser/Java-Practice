
package classtoobjects;

import java.util.Scanner;


class Student
{
    String FName;
    String LName;
    String Grade;
    double Average;
    
}

public class ClassToObjects {

    
    public static void main(String[] args) 
    {
       Scanner osScan = new Scanner(System.in); //object student
       Scanner odScan = new Scanner(System.in); //
       Scanner oiScan = new Scanner(System.in);
       
       int iStudCount;
       
       Student oStud1 = new Student(); //uses attributes from the "class Student" above
       Student oStud2 = new Student(); // made 3 student objects
       Student oStud3 = new Student(); // each hold own block of memory
       
       
       System.out.println("How many students?");
       iStudCount = odScan.nextInt();
       
       
       //This only creates the array in memory
       //but it does not have any objects yet!
       Student aoStud1 [] = new Student[iStudCount]; //iStudCount is how big the array will be
       
            
       for (int iCount = 0; iCount < iStudCount; iCount++)
       {
           //make a new student object and put it in the 0 address
           //of the array .
           aoStud1[iCount] = new Student();
           
       
           System.out.println("Enter a first name:");
           aoStud1[iCount].FName = osScan.nextLine();
           
           System.out.println("Enter a last name:");
           aoStud1[iCount].LName = osScan.nextLine();
           
           System.out.println("Enter the letter grade:");
           aoStud1[iCount].Grade = osScan.nextLine();
           
           System.out.println("Enter the average:");
           aoStud1[iCount].Average = oiScan.nextDouble();
           
           
       }  
       
        for (Student aoStud11 : aoStud1) {
            System.out.println(aoStud11.FName);
        }
       }          
       
    }
    


