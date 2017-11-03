/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritfun;

/**
 *
 * @author profgreg
 */

//Student class inherits from the Person class
//This means it gets everything the parent class has that is either
//public or protected
public class Student extends Person
{
    //Private attributes. If you created another class based upon the student
    //class then you would not have access to these attributes since they
    //are private
    private int Age;
    private String Status;

    //In essence, after the inheritance you can think that the attributes 
    //a student object would have are: firstName, lastName, Age, and Status
    
    //Constructor for the student class that receives parameters
    public Student(String FirstName, String LastName, int iAge) {
        
        //calls the parent constructor - which in this case is the Person class
        //AND passes 2 parameters to the Person constructor
        super(FirstName, LastName);

        //You should always make a call to the parent class constructor or method
        //first using super BEFORE you try to do anything else
        
        
        this.Age = iAge;
        
        if (this.Age > 50)
            this.Status = "You are old!";
        else
            this.Status = "You are young";
    }
    
    //Method to return a string whenever it is called 
    String displayFullName()
    {
        String sReturn;
        
        if (this.FirstName.equalsIgnoreCase("greg"))
            sReturn = this.FirstName + " " + this.LastName + ",you're my hero";
        else 
            sReturn = this.FirstName + " " + this.LastName;
        
        return sReturn;
    }
    
}
