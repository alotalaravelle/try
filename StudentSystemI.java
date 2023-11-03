import java.util.Scanner;
    class Student {
        private String name;
        private String course;
        private int age;

    public Student() {
        this.name = "";
        this.course = "";
        this.age = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Name: " + name + ", Program: " + course + ", Age: " + age;
    }

    public void clear() {
        this.name = "";
        this.course = "";
        this.age = 0;
    }
}

    public class StudentSystemI {
        public static void main(String[] args) {
            Student[] students = new Student[3];
            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < students.length; i++) {
                students[i] = new Student();
            }

            int choice;
          do {
            System.out.println("Menu");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. View Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < students.length; i++) {
                        if (students[i].getName().isEmpty()) {
                            System.out.print("Enter student name: ");
                            students[i].setName(scanner.next());
                            System.out.print("Enter student course: ");
                            students[i].setCourse(scanner.next());
                            System.out.print("Enter student age: ");
                            students[i].setAge(scanner.nextInt());
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter the index of the student you want to edit: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < students.length) {
                        System.out.print("Enter new name: ");
                        students[index].setName(scanner.next());
                        System.out.print("Enter new course: ");
                        students[index].setCourse(scanner.next());
                        System.out.print("Enter new age: ");
                        students[index].setAge(scanner.nextInt());
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 3:
                    System.out.println("Student Information:");
                    for (int i = 0; i < students.length; i++) {
                        if (!students[i].getName().isEmpty()) {
                            System.out.println("Student " + i + ": " + students[i]);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter the stated number of student you want to delete: ");
                    int deleteIndex = scanner.nextInt();
                    if (deleteIndex >= 0 && deleteIndex < students.length) {
                        students[deleteIndex].clear();
                        System.out.println("Student deleted.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
