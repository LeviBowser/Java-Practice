/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuedemo;

class Qu //qu = queue
{
    private char q[]; //this array holds the queue
    private int putloc, getloc; // the put and get indices  
    
    Qu (int size) {
        q = new char[size]; //allocate memory for the queue
        putloc = getloc = 0;
}
    void put(char ch) //put a character into the queue
    {
        if(putloc == q.length)
        {
            System.out.println(" - Queue is full.");
            return;
        }
    
        q[putloc++] = ch; 
    }   
        char get() //get a character from the queue
        {
            if(getloc == putloc)
            {
              System.out.println(" - Queue is empty.");
            return (char) 0;  
            }
            
    return q[getloc++];
    }
}
    
public class QueueDemo {

    public static void main(String[] args) 
    {
        Qu bigQ = new Qu(100); //Qu is the queue class name
        Qu smallQ = new Qu(4);
        char ch;
        int i;
        
        System.out.println("Using bigQ to store the alphabet.");
        for(i=0; i < 26; i++) //put some numbers into bigQ
            bigQ.put((char) ('A' + i));
        
        System.out.print("Contents of bigQ: "); // retrieve and siplay elements from the bigQ
        for(i=0; i < 26; i++)
        {
            ch = bigQ.get();
            if(ch != (char) 0)
                System.out.print(ch + " ");
        }
        
        System.out.println("\n");
        
        System.out.println("Using smallQ to generate error.");
            System.out.println("");
        for(i=0; i < 5; i++) //now, use smallQ to generate some errors
        {
            System.out.print("Attempting to store " + (char) ('Z' - i));
            
            smallQ.put((char) ('Z' - i));
            
            System.out.println("");
        }
        
        System.out.println("");
        
        System.out.print("Contents for smallQ: "); //more errors on smallQ
        for(i=0; i < 5; i++)
        {
            ch = smallQ.get();
            
            if(ch != (char) 0)
                System.out.print(ch);
        }
    }    
}
