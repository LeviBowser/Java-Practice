
package cargo;

import java.util.Scanner;


public class CarGo {

    public static void main(String[] args)
    {
        Cars oCars = new Cars();
        Scanner osScan = new Scanner(System.in);
        Scanner oiScan = new Scanner(System.in);
        String sResult;
        
        System.out.println("Enter the Make of the car:");
        oCars.Make = osScan.nextLine();
        
        System.out.println("Enter the Model of the car:");
        oCars.Model = osScan.nextLine();
        
        System.out.println("Enter the MPG of the car:");
        oCars.Mpg = oiScan.nextInt();
        
        oCars.fudgeMPG();
       
        System.out.println(oCars.Mpg);
        
        sResult = oCars.getMakeMpg();
        System.out.println(sResult);
        
        
    }
    
}
