
package projectone;

//Levi Bowser
//Project 1 - Student Array Loop - Main Class (person)
//2.28.15 update: 3.13.15

public class Person 
{
    protected String sFirstName; //making so the subclass can see it and manipulate it
    protected String sLastName;// and use super to call it.
    
    
    public Person(String sFirst, String sLast) //listed below are all the get functions as well
    {                                           // the use for the super.
        this.sFirstName = sFirst;
        this.sLastName = sLast; //making sure to use this. becuase the names are the same.
    }

    public String getsFirstName() { //getters and setter in case of specific calls for each.
        return sFirstName;
    }

    public void setsFirstName(String sFirstName) {
        this.sFirstName = sFirstName;
    }

    public void setsLastName(String sLastName) { //more getter and setters for a more robust program.
        this.sLastName = sLastName;
    }
    
    public String getsLastName() {
        return sLastName;
    }
    
}