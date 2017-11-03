
package test2practice;

import java.util.Scanner;



    
    class Person
    {
        protected String sFirstName;
        protected String sLastName;

        public Person(String sFirstName, String sLastName) {
            this.sFirstName = sFirstName;
            this.sLastName = sLastName;
        }
        
        public String getsFirstName() {
            return sFirstName;
        }

        public void setsFirstName(String sFirstName) {
            this.sFirstName = sFirstName;
        }

        public String getsLastName() {
            return sLastName;
        }

        public void setsLastName(String sLastName) {
            this.sLastName = sLastName;
        }
    }
    
    class Student extends Person
    {
        private int iTestAvg;
        private int iHomeworkAvg;
        private String sHairColor;

        public Student(int iTestAvg, int iHomeworkAvg, String sHairColor, String sFirstName, String sLastName) {
            super(sFirstName, sLastName);
            this.iTestAvg = iTestAvg;
            this.iHomeworkAvg = iHomeworkAvg;
            this.sHairColor = sHairColor;
        }

        public int getiTestAvg() {
            return iTestAvg;
        }

        public void setiTestAvg(int iTestAvg) {
            this.iTestAvg = iTestAvg;
        }

        public int getiHomeworkAvg() {
            return iHomeworkAvg;
        }

        public void setiHomeworkAvg(int iHomeworkAvg) {
            this.iHomeworkAvg = iHomeworkAvg;
        }

        public String getsHairColor() {
            return sHairColor;
        }

        public void setsHairColor(String sHairColor) {
            this.sHairColor = sHairColor;
        }
    }       
    
        class Teacher
        {
            private String sFirstName;
            private String sLastName;
            private String sHairColor;
            private String sEyeColor;
            
            Student aoStudent[] = null;

            public Teacher(String sFirstName, String sLastName, String sHairColor, String sEyeColor) {
                this.sFirstName = sFirstName;
                this.sLastName = sLastName;
                this.sHairColor = sHairColor;
                this.sEyeColor = sEyeColor;
            }
            
            public String getsHairColor() {
                return sHairColor;
            }

            public void setsHairColor(String sHairColor) {
                this.sHairColor = sHairColor;
            }

            public String getsEyeColor() {
                return sEyeColor;
            }

            public void setsEyeColor(String sEyeColor) {
                this.sEyeColor = sEyeColor;
            }

            public String getsFirstName() {
                return sFirstName;
            }

            public void setsFirstName(String sFirstName) {
                this.sFirstName = sFirstName;
            }

            public String getsLastName() {
                return sLastName;
            }

            public void setsLastName(String sLastName) {
                this.sLastName = sLastName;
            }
        }

   public class Test2practice { 
    public static void main(String[] args) {
        
        Scanner iScan = new Scanner(System.in);
        Scanner sScan = new Scanner(System.in);
        
        int iNumTeachers;
        int iNumStudents;
        int iHomeworkAvg;
        int iTestAvg;
        
        String sFirstName;
        String sLastName;
        String sHairColor;
        String sEyeColor;
        
        System.out.println("How Many Teachers?");
            iNumTeachers = iScan.nextInt();
            
            Teacher aoTeacher[] = new Teacher[iNumTeachers];
            
        System.out.println("How many Students per teacher?");
            iNumStudents = iScan.nextInt();
            
            for(int iCount = 0; iCount < aoTeacher.length; iCount++){
                System.out.println("What is the teacher" + (iCount+1) + "'s first name?");
                    sFirstName = sScan.nextLine();
                System.out.println("What is the teacher" + (iCount+1) + "'s last name?");
                    sLastName = sScan.nextLine();
                System.out.println("What is the teacher" + (iCount+1) + "'s hair color?");
                    sHairColor = sScan.nextLine();
                System.out.println("What is the teacher" + (iCount+1) + "'s eye color?");
                    sEyeColor = sScan.nextLine();

                aoTeacher[iCount] = new Teacher(sFirstName, sLastName, sHairColor, sEyeColor);
                aoTeacher[iCount].aoStudent = new Student[iNumStudents];
                
                for(int iCount2 = 0; iCount2 < iNumStudents; iCount2++){
                    System.out.println("What is student " + (iCount2+1) + "'s first name?");
                        sFirstName = sScan.nextLine();
                    System.out.println("What is student " + (iCount2+1) + "'s last name?");
                        sLastName = sScan.nextLine();
                    System.out.println("What is student " + (iCount2+1) + "'s Hair Color?");
                        sHairColor = sScan.nextLine();
                    System.out.println("What is student " + (iCount2+1) + "'s test average?");
                        iTestAvg = iScan.nextInt();
                    System.out.println("What is student" + (iCount2+1) + "'s homework average?");
                        iHomeworkAvg = iScan.nextInt();
                        
                    aoTeacher[iCount].aoStudent[iCount2] = new Student(iTestAvg, iHomeworkAvg, sFirstName, sLastName, sHairColor);
                }
                
            }
            
            for(int iCount = 0; iCount < iNumTeachers; iCount++)
            {
                System.out.println(aoTeacher[iCount].getsFirstName() + " " +
                                   aoTeacher[iCount].getsLastName() + " " +
                                   aoTeacher[iCount].getsHairColor() + " " +
                                   aoTeacher[iCount].getsEyeColor());
                for(int iCount2 = 0; iCount2 < iNumStudents; iCount2++){
                    
                    System.out.println("\t" + aoTeacher[iCount].aoStudent[iCount2].getsFirstName() + " " +
                                       "\t" + aoTeacher[iCount].aoStudent[iCount2].getsLastName() + " " +
                                       "\t" + aoTeacher[iCount].aoStudent[iCount2].getsHairColor() + " " +
                                       "\t" + aoTeacher[iCount].aoStudent[iCount2].getiHomeworkAvg() + " " +
                                       "\t" + aoTeacher[iCount].aoStudent[iCount2].getiTestAvg());
                }
            }
            
    }
    
}
