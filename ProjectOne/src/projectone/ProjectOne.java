
package projectone;

//Levi Bowser
//Project 1 - Student Array Loop - Main Program
//2.28.15 updated: 3.13.15


import java.util.Scanner; //import to use scanner objects


public class ProjectOne {

    public static void main(String[] args) 
    {
        String sFirst; //i create all the variables that i am going to be using to 
        String sLast;//make sure that when i use the constuctor for the objects i have the variables
        int iHomework;//ready to be put in.
        int iQuiz;
        int iProject;
        int iTest;
               
        Scanner iScan = new Scanner(System.in);
        Scanner sScan = new Scanner(System.in);//2 scanner objects to avoid flushing
                
        
        int iChoice;
        int iNumberOfStudents; //setting up variables for use in array.
        int iCount;
                   
        System.out.println("1. \t New Class List\n");
        System.out.println("2. \t Search for a Student\n");
        System.out.println("3. \t Exit");
        System.out.print("Choose one: ");
        
        iChoice = iScan.nextInt();
        while (iChoice == 2) //i put this in the program to make sure that if you chose option 2
        {                   //you could still run and go back and correct everything.
            System.out.println("");
            System.out.println("Please make a new class list.");
            System.out.println("1. \t New Class List\n");
            System.out.println("2. \t Search for a Student\n");
            System.out.println("3. \t Exit");
            System.out.print("Choose one: ");
            
            iChoice = iScan.nextInt();
        }
               
            while (iChoice == 1)
            {
                
                System.out.println("Enter the Number of Students");
                iNumberOfStudents = iScan.nextInt(); //inputting the number of students from the keyboard.

                    Student soStudent[] = new Student[iNumberOfStudents]; //creating an array of student objects according to the number of students.

                        for(iCount = 0; iCount < iNumberOfStudents; iCount++) //loop set to fill all of the arrays according to the size of the array
                        {
                            System.out.println("Enter Student " + (iCount + 1) + "'s" + " First Name:");
                                sFirst = (sScan.nextLine()); //setting variables to be used in the constructor of the following object

                            System.out.println("Enter Student " + (iCount + 1) + "'s" + " Last Name:");
                                sLast = (sScan.nextLine()); //each variable is differnt to make sure they are put in the right place with the constructor.

                            System.out.println("Enter Student " + (iCount + 1) + "'s" + " Homework Average score:");
                                iHomework = (iScan.nextInt()); //used a different scanner (integer) to avoid flushing.

                            System.out.println("Enter Student " + (iCount + 1) + "'s" + " Quiz Average score:");
                                iQuiz = (iScan.nextInt());    

                            System.out.println("Enter Student " + (iCount + 1) + "'s" + " Project Average score:");
                                iProject = (iScan.nextInt());

                            System.out.println("Enter Student " + (iCount + 1) + "'s" + " Test Average score:");
                                iTest = (iScan.nextInt());
                                System.out.println("");//extra space for user readability.
                                
                            soStudent[iCount] = new Student(sFirst, sLast, iHomework, iQuiz, iProject, iTest); //constructing the object and putting it in the array at certain location.
                        }
                        

                    System.out.println("1. \t New Class List\n"); //after the array is filled. they are taken back to the main menu.
                    System.out.println("2. \t Search for a Student\n");
                    System.out.println("3. \t Exit");
                    System.out.print("Choose one: ");

                    iChoice = iScan.nextInt(); //next decision, set it up so as the iChoice changed it would move out.

        
                    while (iChoice == 2) //kept choice 2 included in (while == 1)operation to make sure choice 2 could see the array and its contents becuase of scope.
                    {

                        System.out.println("What is the Student's Last Name?"); //resetting variable to search the arrays for specific strings
                            sLast = sScan.nextLine();

                        System.out.println("What is the Student's First Name?"); //same as above except for the first name.
                            sFirst = sScan.nextLine();
                            System.out.println("");


                        boolean bError = true; //set a boolean to be true as long as the student couldn't be found. it hasnt been found yet, so the error is active.
                        iCount = 0; //set counter to 0 to cycle through everything on the array

                        while(iCount < iNumberOfStudents) //the loop to determine the duration.
                        {
                            if(sLast.equalsIgnoreCase(soStudent[iCount].getsLastName()) && sFirst.equalsIgnoreCase(soStudent[iCount].getsFirstName())) //this is comparing the variables
                            {                                                                       //for the first and last name to student objects in the array and the values returned
                                System.out.println(soStudent[iCount].getFullInfo());                //from their own last and first name variables that were input.
                                System.out.println(""); //prints full info as one method.
                                bError = false;//the error is now false becuase the student was found.
                                break;
                            }
                            else //if the names didnt match, it would add icount to make sure assess the next object in the array.
                            {
                                iCount += 1; //searches the array and compares each value against the set first and last name
                            }
                        }

                        if(bError) //if after the array has been searched, a student isnt found, the error is still true and puts an error message.
                        {
                            System.out.println("Error: Could Not Find Student.");
                        }
                        else //if the error is now false, it asks the user to select another action and will display the list.
                        {
                            System.out.println("Select Another Action.");
                        }

                        System.out.println("1. \t New Class List\n");
                        System.out.println("2. \t Search for a Student\n"); //reiteration to make sure to restart
                        System.out.println("3. \t Exit");
                        System.out.print("Choose one: ");

                        iChoice = iScan.nextInt(); //this is the end of the while loop, but its inside 2, allowing for another search. and inside 1 allowing another list 
                    }                               //to be created to start over.
            }    
                    
            if(iChoice == 3) //exit the loop and end program
            {
                System.out.println("Have A Good Day"); //a display message to make sure evertyihng is good.
            }
                
    }
                

}



        
    
