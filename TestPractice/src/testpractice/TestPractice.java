
package testpractice;

import java.util.Scanner;

class SchoolWork
{

    public SchoolWork(int iGrade) {
        this.iGrade = iGrade;
    }
    protected int iGrade;
}

class Tests extends SchoolWork
{

    public Tests(int iDuration, int iGrade) {
        super(iGrade);
        this.iDuration = iDuration;
    }
    
    private int iDuration;   

    public int getiDuration() {
        return iDuration;
    }

    public void setiDuration(int iDuration) {
        this.iDuration = iDuration;
    }

    public int getiGrade() {
        return iGrade;
    }

    public void setiGrade(int iGrade) {
        this.iGrade = iGrade;
    }
    
}

class Student
{

    public Student(String sFirst) {
        this.sFirst = sFirst;
    }
    private String sFirst;

    public String getsFirst() {
        return sFirst;
    }

    public void setsFirst(String sFirst) {
        this.sFirst = sFirst;
    }

    public Tests[] getAoTests() {
        return aoTests;
    }

    public void setAoTests(Tests[] aoTests) {
        this.aoTests = aoTests;
    }
    
    
    Tests aoTests[] = null;
    
}

public class TestPractice {

    
    public static void main(String[] args) {
        
        Scanner iScan = new Scanner(System.in);
        Scanner sScan = new Scanner(System.in);
        
        int iNumStudents;
        int iDuration;
        String sFirst;
        int iGrade;
        int iTestNum;
        
        
        System.out.println("How Many Students?");
            iNumStudents = iScan.nextInt();
        System.out.println("How many tests will there be?");
            iTestNum = iScan.nextInt();
            
            Student aoStudent[] = new Student[iNumStudents];
            
               
            for(int iCount=0; iCount<iNumStudents; iCount++){
                    System.out.println("What is  student " +(iCount+1)+"'s first name?");
                        sFirst = sScan.nextLine();
                    aoStudent[iCount] = new Student(sFirst);
                    
                    aoStudent[iCount].aoTests = new Tests[iTestNum];
                    
                    for(int iCount2 = 0; iCount2 < iTestNum; iCount2++){
                        
                        
                        
                        System.out.println("How many days do you have to take test" + (iCount2+1) + "?");
                            iDuration = iScan.nextInt();
                            
                        System.out.println("What is the average percentage on homework?");
                            iGrade = iScan.nextInt();
                            
                        aoStudent[iCount].aoTests[iCount2] = new Tests(iDuration, iGrade);
                            
                    }
                        
            }
            
            for(int iCount = 0; iCount < iNumStudents; iCount++){
                System.out.println(aoStudent[iCount].getsFirst());
            
                for(int iCount2 = 0; iCount2 < iTestNum; iCount2++){
                    System.out.println(aoStudent[iCount].aoTests[iCount2].getiGrade());
            }
            }
                 
            
        
    }
    
}
