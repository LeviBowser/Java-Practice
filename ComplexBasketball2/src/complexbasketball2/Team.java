
package complexbasketball2;

/** Levi Bowser
 *  HW Java 5 Program - Class creation with methods
 *  2.21.15
 */
public class Team //minor instance variables. chances are they are being set up for private eventually.
{
    String sTeamName;
    int iWins;   
    int iLosses;    
    int iTotalPointsFor;
    int iTotalPointsAgainst;
    double dWinLossPct;
    
    String getTeam() //returns the name with the method is called
    {
        return sTeamName;
    }
    
    void setTeam(String TeamName) //it can set the name by just adding the name in the parameters.
    {
        sTeamName = TeamName;
    }
    
    void setWinsLosses(int Wins, int Losses) //allows wins and losses to be input
    {
        iWins = Wins;
        iLosses = Losses;
        
        dWinLossPct = (Wins/(Wins + Losses));  //calculates the winlosspct even though it doesnt return it.         
    }
    
    int getWins()
    {
        return iWins;
    }
    
    int getLosses()
    {
        return iLosses;
    }
    
    void addPointsFor(int PointsFor) //i used += incase in the future they go over multiple instances
    {                                //of games where you put in more and more scores or points.
        iTotalPointsFor += PointsFor;
    }
    
    void addPointsAgainst(int PointsAgainst)// same as about as far as the += is concerned
    {
        iTotalPointsAgainst += PointsAgainst;
    }
    
    String getAllPoints() //long refernces to make sure things are printed correctly from when variables were defined.
    {
        return ("Points For " + iTotalPointsFor + " and Points Against " + iTotalPointsAgainst);
    }
  
}
 