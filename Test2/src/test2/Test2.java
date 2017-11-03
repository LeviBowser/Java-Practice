package test2;

import java.util.Scanner;

//Levi bowser
//Test 2
//an array inside of an array. asks how many students in the array, and then asks what classes they have.
//3.18.2015

class Person //creating a person class to be extended into the student
{

    public Person() {
        
    }

    
    public Person(String sFirstName, String sLastName) { //this is creeating a constructor to make sure the subclass has it too
        this.sFirstName = sFirstName;
        this.sLastName = sLastName;
    }
    
    
    protected String sFirstName;
    protected String sLastName; //protected makes sure that only subclasses can see it.

    public String getsFirstName() {
        return sFirstName;
    }

    public void setsFirstName(String sFirstName) {//getters and setters
        this.sFirstName = sFirstName;
    }

    public String getsLastName() {
        return sLastName;
    }

    public void setsLastName(String sLastName) {
        this.sLastName = sLastName;
    }
    
}

class Student extends Person //the student extends person so that it can use the first and last name attributes
{

    public Student(String sFirstName, String sLastName) { //the contstructor using super on the extended class for the attributes
        super(sFirstName, sLastName);
    }
   
   private double dGPA;
    
        protected Course aoCourses[] = null; //creating space in the class for an array

    public double getdGPA() { //getters for a gpa slot.
        return dGPA;
    }

    public void setdGPA(double dGPA) {
        this.dGPA = dGPA;
    }
    
}

class Course //a class course to make an array with course names and allows an array to be made
{
    private String sCourseTitle; //so no one can see or change the variable   

    public String getsCourseTitle() { //allows methods to change the variable (getters and setters)
        return sCourseTitle;
    }

    public void setsCourseTitle(String sCourseTitle) {
        this.sCourseTitle = sCourseTitle;
    }
    
}




public class Test2 { //main class

    public static void main(String[] args) {
        
        Scanner iScan = new Scanner(System.in); //multiple scanners to avoid flushing the buffer
        Scanner sScan = new Scanner(System.in);
        
        int iNumStudents;
        int iNumCourses; //setting amounts for upcoming arrays
        
        
        String sFirst;
        String sLast;
        String sCourse; //instance variables fro the constructors.
        
        
        System.out.println("How many students to enter?");
            iNumStudents = iScan.nextInt();
            
            Student aoStudent[] = new Student[iNumStudents]; //creating an array of students with a certaain number
            
        System.out.println("How many courses will each student have?");   
            iNumCourses = iScan.nextInt();//how many courses to have an array created in each student.
            
            
            
        for(int iCount = 0; iCount < iNumStudents; iCount++){ //first for loop to get info for the student
            
            System.out.println("What is the student " + (iCount+1) + "'s first name?");
                sFirst = sScan.nextLine();
                
            System.out.println("What is the student " + (iCount+1) + "'s last name?");
                sLast = sScan.nextLine();
                
                aoStudent[iCount] = new Student(sFirst, sLast); //used a constructor instead of methods
                aoStudent[iCount].aoCourses = new Course[iNumCourses]; //creates an array of a specific size inside the object of student.
                
                for(int iCount2 = 0; iCount2 < iNumCourses; iCount2++){ //2nd for loop to put information into the array for the courses for each specific student.
                                      
                    System.out.println("What is the name of course " + (iCount2+1) + "?");
                        sCourse = sScan.nextLine(); //getting the name of the course from the user
                        
                    aoStudent[iCount].aoCourses[iCount2] = new Course(); //creates an object of course class to put in the slots of the array
                    
                    aoStudent[iCount].aoCourses[iCount2].setsCourseTitle(sCourse); //i created a constructor to put the name for the course in the specific slot.
                                            
                }
        }
        
        for(int iCount = 0; iCount < iNumStudents; iCount++){ //the for loop to print the specific students name
            System.out.println(aoStudent[iCount].getsFirstName() + " " + aoStudent[iCount].getsLastName());
            System.out.println(""); //added space for readability.
            
            for(int iCount2 = 0; iCount2 < iNumCourses; iCount2++){ //the second for loop to display all the classes in the array under the specific student object
                System.out.println(aoStudent[iCount].aoCourses[iCount2].getsCourseTitle()); //retreives teh course title each time through the loop
            }
        }
        
        
      
    }
    
}
