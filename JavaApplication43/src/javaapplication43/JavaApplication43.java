
package javaapplication43;

//practice for chapter 2. it is an array inside an array.

import java.util.Scanner;

class Rebels
{
    protected String sFirstName;
    protected String sLastName;

    public Rebels(String sFirstName, String sLastName) {
        this.sFirstName = sFirstName;
        this.sLastName = sLastName;
    }

    
    public String getsFirstName() {
        return sFirstName;
    }

    public void setsFirstName(String sFirstName) {
        this.sFirstName = sFirstName;
    }

    public String getsLastName() {
        return sLastName;
    }

    public void setsLastName(String sLastName) {
        this.sLastName = sLastName;
    }
}


class Ship
{
    private String sShipName;

    public Ship() {
        
    }
    
    

    public Ship(String sShipName) {
        this.sShipName = sShipName;
    }
    

    public String getsShipName() {
        return sShipName;
    }

    public void setsShipName(String sShipName) {
        this.sShipName = sShipName;
    }   
}


class Pilot extends Rebels
{
    private double dRating;
    protected Ship aoShips[] = null; //an array of 'ship' classes called aoShips[];its reserving space

    public Pilot(double dRating, String sFirstName, String sLastName) {
        super(sFirstName, sLastName);
        this.dRating = dRating;
    }

    public double getdRating() {
        return dRating;
    }

    public void setdRating(double dRating) {
        this.dRating = dRating;
    }
}




public class JavaApplication43 {

    
    public static void main(String[] args) {
        
        Pilot aoPilot[] = null; //creates an array named aoPilot from pilot class.
        
        Scanner iScan = new Scanner(System.in);
        Scanner sScan = new Scanner(System.in);
        
        int iPilotNum;
        int iShipNum;
        
        String sFirstName;
        String sLastName;
        double dRating;
        String sShipName;
        
        
        System.out.println("How many pilots?");
            iPilotNum = iScan.nextInt();
        
                
        System.out.println("How many ships per pilot?");
            iShipNum = iScan.nextInt();
        
            
        aoPilot = new Pilot[iPilotNum]; //in the array it creates a number of slots each with pilot class inside
        
        for(int iCount = 0; iCount < aoPilot.length; iCount++){
            System.out.println("What is the pilot's first name?");
                sFirstName = sScan.nextLine();
                
            System.out.println("What is the pilot's last name?");
                sLastName = sScan.nextLine();
                
            System.out.println("What is the pilot's rating? (1 - 10 *10 being high)");
                dRating = iScan.nextInt();
                
            aoPilot[iCount] = new Pilot(dRating, sFirstName, sLastName); //fills the slot with a new pilot object constucted with the rating and the first and the last name
            
            aoPilot[iCount].aoShips = new Ship[iShipNum]; //creates the arry previously memtioned in the pilot class with a certain number of slots equal to the number of ships the user put in.
            
                for(int iCount2 = 0; iCount2 < aoPilot[iCount].aoShips.length; iCount2++){ //this goes through the array in the pilot class that has the number of ships
                    System.out.println("What is the ship's name?");
                        sShipName = sScan.nextLine();
                        
                    aoPilot[iCount].aoShips[iCount2] = new Ship(sShipName); //this gets the pilot of a certain number, grabs a certain ship in his array of ships, and sets the name taken from the user
                }
               
        }
        
        for(int iCount = 0; iCount < aoPilot.length; iCount++){
            System.out.println("");
            System.out.println
                    (aoPilot[iCount].getsFirstName() + " " +
                     aoPilot[iCount].getsLastName() + " " +     
                     aoPilot[iCount].getdRating());
            System.out.println("");
                            
            for(int iCount2 = 0; iCount2 < aoPilot[iCount].aoShips.length; iCount2++){ //uses a specific pilot and uses the legnth of his array to determine the how mnay time you go through the loop
                System.out.println(aoPilot[iCount].aoShips[iCount2].getsShipName());
            }
                
        }
        
    }
    
}
