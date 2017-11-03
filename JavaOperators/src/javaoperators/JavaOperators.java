
package javaoperators;


public class JavaOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iCount= 0;
        int iSum = 0;
        int iNum = 7;
                       
        if (iNum > 5)
        
            System.out.println("I am greater than 5");
        
        
            System.out.println("This line will print"); 
//will always print, becuase the 'if' statement uses the closest code, unless included in
//curly braces
        
        
    }
       
        
       // iSum = ++iCount + iCount - 10;
       // System.out.println(iSum);
        
        /**move the ++ before the first iCount, see what happens:
        * the ++ (pre) activates before the rest of the code or equation making it -8
        * the ++ (post) activates after the code making it -9
        */
        
       // System.out.println(iCount);
        //iCount += 2; //iCount = iCount + 2
        //System.out.println(iCount);
    
    
}
