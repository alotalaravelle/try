public class Student {
    //  encapsulation
    private String firstName;
    private String lastName;
    private String studentID;
    private double grades;

    // class constructor with four parameters
    public Student(String firstName, String lastName, String studentID, double grades){

        this.firstName=firstName;
        this.lastName=lastName;
        this.studentID=studentID;
        this.grades=grades;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStudentID() {
        return studentID;
    }

    public double getGrades() {
        return grades;
    }
   
}