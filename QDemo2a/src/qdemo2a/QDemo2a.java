
package qdemo2a;

class Queue
{
    private char q[]; //this array holds the queue
    private int putloc, getloc; // the put and get indices
    
    
    Queue (int size) 
    {
        q = new char[size]; //allocate memory for the queue
        putloc = getloc = 0;
    }
    
    Queue (Queue ob) //contruct a queue from a queue
    {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];
        
        for(int i = getloc; i < putloc; i++)
            q[i] = ob.q[i];
    }
    
    Queue(char a[]) //construct a queue with initial variables
    {
        putloc = 0;
        getloc = 0;
        q = new char[a.length];
        
        for(int i = 0; i < a.length; i++)
        {
            put(a[i]);
        }
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

public class QDemo2a {

    public static void main(String[] args) 
    {
        Queue q1 = new Queue(10); //construct 10-elecment empty queue
        
        char name[] = {'T', 'o', 'm'}; //construct queue from array
        Queue q2 = new Queue(name);
        
        char ch;
        int i;
        
        for(i=0; i < 10; i++) //put some characters into q1
            q1.put((char) ('A' + i));
        
        Queue q3 = new Queue(q1); //construct queue frmo another queue
        
        System.out.print("Contents of q1: ");        
        for(i=0; i<10; i++)
        {
            ch = q1.get();
            System.out.print(ch);
        }
       
        System.out.println("\n");
        
        System.out.print("Contents of q2: ");
        for(i=0; i < 3; i++)
        {
            ch = q2.get();
            System.out.print(ch);
        }
        
        System.out.println("\n");
        
        System.out.print("Contents of q3: ");
        for(i=0; i < 10; i++)
        {
            ch = q3.get();
            System.out.print(ch);
        }
    }
    
}
