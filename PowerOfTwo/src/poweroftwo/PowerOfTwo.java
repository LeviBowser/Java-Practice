/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poweroftwo;

/**
 *
 * @author Wyatt
 */
public class PowerOfTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int e;
        int result;
        int i;
        
        for( i = 0; i <10; i++)
        {
            result = 1;
            e = i;
            
            while(e > 0)
            {
                result *= 2;
                e--;
            }
            
            System.out.println("2 to the power " + i + " is " + result);
        }
        
    }
    
}
