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

//Base class
//Protected means it is visible in this class, the package and in the subclasses
public class Person 
{
    //Attributes
    protected String FirstName;
    protected String LastName;

    //Constructor that receives 2 parameters and then assigns them to the attributes
    public Person(String FirstName, String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    //Empty constructor
    public Person() {
    }

    //You can have multiple constructors and methods as long as their
    //signatures (the number and types of parameters) are different
}   
