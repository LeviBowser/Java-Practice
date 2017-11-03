/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findfactors;

/**
 *
 * @author Wyatt
 */
public class FindFactors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        for(int i=2; i <= 100; i++)
        {
            System.out.print("Factors of " + i + ": ");
            for(int j = 2; j < i; j++)
                if((i%j) == 0) System.out.print(j + " ");
            System.out.println("");
        }
    }
    
}
