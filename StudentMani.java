import java.util.Scanner;

public class StudentMani{
    public static void main(String[] args){
 
        int countA=0;
        int countB=0;
        int countC=0;
        int countD=0;
        int countF=0;

        
        int size=5; 
        Student[] studentArray = new Student[size]; 
        Scanner input = new Scanner(System.in);

        for (int x=0; x< studentArray.length; x++){
            System.out.print("Enter student first name: ");
            String fName = input.next();
            System.out.print("Enter student Last name: ");
            String lName = input.next();
            System.out.print("Enter student ID: ");
            String studentID = input.next();
            System.out.print("Student Grades:  ");
            double marks = input.nextDouble();
            System.out.println();

            
            Student student = new Student(fName, lName, studentID, marks); 

            studentArray[x]=student; 
        }

        
        for (int x=0; x< studentArray.length; x++){
            if (studentArray[x].getGrades()<39){
                countF+=1;
                System.out.println("First name: "+ studentArray[x].getFirstName() + "Last name: "+studentArray[x].getLastName() + "Student ID: " + studentArray[x].getStudentID() + "Grades: " + studentArray[x].getGrades() + "Grade: F");
            }

            if (studentArray[x].getGrades()>39 && studentArray[x].getGrades()<63){
                countD+=1;
                System.out.println("First name: "+ studentArray[x].getFirstName() + "Last name: "+studentArray[x].getLastName() + "Student ID: " + studentArray[x].getStudentID() + "Grades: " + studentArray[x].getGrades() + "Grade: D");
            }

            if (studentArray[x].getGrades()>63 && studentArray[x].getGrades()<75){
                countC+=1;
                System.out.println("First name: "+ studentArray[x].getFirstName() + "Last name: "+studentArray[x].getLastName() + "Student ID: " + studentArray[x].getStudentID() + "Grades: " + studentArray[x].getGrades() + "Grade: C");
            }

            if (studentArray[x].getGrades()>75 && studentArray[x].getGrades()<87){
                countB+=1;
                System.out.println("First name: "+ studentArray[x].getFirstName() + "Last  name: "+studentArray[x].getLastName() + "Student ID: " + studentArray[x].getStudentID() + "  Grades: " + studentArray[x].getGrades() + "Grade: B");
            }

            if (studentArray[x].getGrades()>87 && studentArray[x].getGrades()<=100){
                countA+=1;
                System.out.println("First name: "+ studentArray[x].getFirstName() + "Last  name: "+studentArray[x].getLastName() + "Student ID: " + studentArray[x].getStudentID() + "Grades: " + studentArray[x].getGrades() + "Grade: A");
            }
        }

        
        System.out.println();
        System.out.println("Grade Analysis");
        System.out.println();
        System.out.println("Grade A: "+countA+ " students");
        System.out.println("Grade B: "+countB+ " students");
        System.out.println("Grade C: "+countC+ " students");
        System.out.println("Grade D: "+countD+ " students");
        System.out.println("Grade F: "+countF+ " students");
    }
}

