
package complexbasketball2;

import java.util.Scanner; //imports

//Levi Bowser
//Hw 5 - Java Program with methods in Basketball Class
//2.21.15


public class ComplexBasketball2 {

    
    public static void main(String[] args) 
    {
        int iCount; //setting random variable to makes sure things are kept in line
        int iWins;
        int iLosses;// wins and losses are ints to make sure to transfer using method
        String sName;//asking for the name and used to compare against the different objects in the array
        boolean bSearch; //code for searching.
        
        Scanner oiScan = new Scanner(System.in); //setting different scanners
        Scanner osScan = new Scanner(System.in); // everyone hates the buffer
        
        Team oTeam[] = new Team[3]; //creats an array with 3 spaces for objects
        
        for (iCount = 0; iCount < oTeam.length; iCount++) //uses the spaces pronounced earlier to determine how many rounds for would go though.
            {
                
                oTeam[iCount] = new Team(); //each loop creates another object
                
                    System.out.println("What is the Team Name?"); //user input of data into each method
                    oTeam[iCount].setTeam(osScan.nextLine());
                    
                    System.out.println("How many wins does this team have?");
                    iWins = oiScan.nextInt();
                    
                    System.out.println("How many losses does this team have?");
                    iLosses = oiScan.nextInt();
                    
                        oTeam[iCount].setWinsLosses(iWins, iLosses); //using 2 variables to easily use method
                    
                    System.out.println("How many points were scored for this team?");
                    oTeam[iCount].addPointsFor(oiScan.nextInt());
                    
                    System.out.println("How many points were scored against this team?");
                    oTeam[iCount].addPointsAgainst(oiScan.nextInt());
                    
            }
                    
        
            System.out.println("");
        System.out.println("Search for team name:");
        sName = osScan.nextLine();
        
        bSearch = true;
        iCount = 0;
        
        while (bSearch == true) // searches until it find the name and then makes the while loop false to continue on and end the program.
            {
                if (oTeam[iCount].sTeamName.equalsIgnoreCase(sName))
                {        
                    bSearch = false;
                    //it was just easier that if it found the correct name to just display everything. no reason to wait till it drops out.
                    System.out.println("Name\t\tWins\t\tLosses\t\tPoints");
                    System.out.println("----\t\t----\t\t------\t\t------");
                    System.out.println
                                       (
                                           oTeam[iCount].getTeam() + "\t\t"
                                         + oTeam[iCount].getWins() + "\t\t" //tabs for lining up everything
                                         + oTeam[iCount].getLosses() + "\t\t"
                                         + oTeam[iCount].getAllPoints() + "\t"
                                       );
                }
                else
                {
                    iCount++; //incase the object in space 0 didnt work, it would up the count
                }             //to be able to cycle through however many objects with the classes
            }                   // as was needed.
        
        
    }
    
}
