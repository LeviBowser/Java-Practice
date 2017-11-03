
package projectone;



import java.text.DecimalFormat;
//Levi Bowser
//Project 1 - Student Array Loop - Sub Class (student)
//2.28.15 updated: 3.13.15

public class Student extends Person //the class extending from person class. it recieves whatever is protected or public.
{
    private int iHomeworkAvg; 
    private int iQuizAvg;
    private int iProjectAvg;
    private int iTestAvg;
    private double dFinalGrade;  //setting all of the variables to private. so they cant be changed directly
    private String sLetterGrade; //or called directly.
    
    DecimalFormat dfFinal = new DecimalFormat("0.00"); //decimal format used in this case to make sure there weren't a thousand decimal places.


    public Student(String sFirst, String sLast, int iHomeworkAvg, int iQuizAvg, int iProjectAvg, int iTestAvg) 
                                                    //constructor so if i wanted i could have everything put in at once using multiple variables
    {
        super(sFirst, sLast);
        this.iHomeworkAvg = iHomeworkAvg;
        this.iQuizAvg = iQuizAvg;
        this.iProjectAvg = iProjectAvg; //making sure that everything gets set using the constructor becuase the variables are private above.
        this.iTestAvg = iTestAvg; // this. is making sure to refer back to the variables in the class itself.
        
        dCalcGrade();//Final Grade and Final Letter Grade are included in this method
                            //with their initialization as variables also.
                
    }
    
    private String dCalcGrade() //set to string becuase a number can be converted to a string easier than string to a double
    {
        dFinalGrade = ((iHomeworkAvg * .15) + (iQuizAvg * .05) + (iProjectAvg * .4) + (iTestAvg * .4)); //math is fun. weighted averages.
            
            if(dFinalGrade >= 90) //distinction between grades, i used a "if" statement instead of a switch becuase its easier with range of number.
                {
                    sLetterGrade = "A";
                }
            else if(dFinalGrade >= 80)
                {
                    sLetterGrade = "B"; //setting letter grades specific to whatever the gpa turns out to be.
                }
            else if(dFinalGrade >= 70)
                {
                    sLetterGrade = "C";
                }
            else if(dFinalGrade >= 60)
                {
                    sLetterGrade = "D";
                }
            else
                {
                    sLetterGrade = "F";                   
                }
        return dFinalGrade + sLetterGrade; //this returns the specific initilization of the variables to be used in the object when it is created from the contructor.
    }
    
    

    public void setiHomeworkAvg(int iHomeworkAvg) {  //series of sets and gets and their return values
        this.iHomeworkAvg = iHomeworkAvg;
    }

    public void setiQuizAvg(int iQuizAvg) {
        this.iQuizAvg = iQuizAvg;
    }

    public void setiProjectAvg(int iProjectAvg) {
        this.iProjectAvg = iProjectAvg;
    }

    public void setiTestAvg(int iTestAvg) {
        this.iTestAvg = iTestAvg;
    }
    
    public int getiHomeworkAvg() {// more gets and sets for more robust code.
        return iHomeworkAvg;
    }

    public int getiQuizAvg() {
        return iQuizAvg;
    }

    public int getiProjectAvg() {
        return iProjectAvg;
    }

    public int getiTestAvg() {
        return iTestAvg;
    }

    public String getFullInfo(){ //i used a method here, that when called it gave whatever the constructor had made.
       return (sLastName + ", " + sFirstName + "\n" + (dfFinal.format(dFinalGrade)+ "% " + sLetterGrade)); //using the decimal format object to make sure the final grade was only 
                                                                                                            //2 decimal places long.
    }
}

