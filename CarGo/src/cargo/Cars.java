
package cargo;


public class Cars 
{        
    String Color;
    String Make;
    String Model;
    int Mpg;
    
    void fudgeMPG()
    {
        Mpg = Mpg * 2;
    }
    
    String getMakeMpg()
    {
        return (Make + " mpg is " + Mpg);
    }
}
