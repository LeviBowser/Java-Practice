/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble;

import java.text.DecimalFormat;

/**
 *
 * @author Wyatt
 */
public class Bubble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        
        int a, b, t;
        int size;
        
        size = 10; //number of elements to sort.
        
        System.out.print("Original array is:"); // display original display
        for( int i=0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println("\n");
        
            
        for( a=1; a < size; a++) //This is the bubble sort.
            for( b=size - 1; b >= a; b--)
            {
                if(nums[b-1] > nums[b]) // if out of order
                {
                    t = nums[b-1]; //exchange elements
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        
        System.out.print("Sorted array is: "); //display sorted arraw
        for(int i=0; i < size; i++)
            System.out.print(nums[i] + ", ");
        System.out.println();
        
    }
    
}
