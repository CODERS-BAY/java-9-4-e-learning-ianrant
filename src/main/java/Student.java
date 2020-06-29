import java.util.ArrayList;
import java.util.List;

public class Student {

    private static List<Student> LIST_OF_STUDENTS = new ArrayList<>();
    private static int NUMBER_OF_STUDENTS = 0;
    private String studentFirstName;
    private String studentLastName;
    private int studentNumber;


    // DONE
    public Student(String studentFirstName, String studentLastName) {
        NUMBER_OF_STUDENTS++;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentNumber = NUMBER_OF_STUDENTS;
    }


    // DONE
    public static String createNewStudent(String studentFirstName, String studentLastName) {
        Student student = new Student(studentFirstName, studentLastName);
        LIST_OF_STUDENTS.add(student);
        return "New student " + student.getStudentFirstName() + " " + student.getStudentLastName() + " has been registered.";
    }


    // DONE
    public static String retrieveStudentName(int studentNumber) {
        for (int i = 0; i < LIST_OF_STUDENTS.size(); i++) {
            if (LIST_OF_STUDENTS.get(i).getStudentNumber() == studentNumber) {
                return LIST_OF_STUDENTS.get(i).getStudentFirstName() + " " + LIST_OF_STUDENTS.get(i).getStudentLastName();
            }
        }
        return "Error: Student information could not be found.";
    }


    // DONE
    public static String printEntireStudentBody() {
        String studentBodyToString = NUMBER_OF_STUDENTS + " students in total:\n";
        for (Student student : getListOfStudents()) {
            studentBodyToString += student.getStudentFirstName() + " " + student.getStudentLastName() + ", ID: " + student.getStudentNumber() + "\n";
        }
        return studentBodyToString;
    }


    public static int getNumberOfStudents() {
        return NUMBER_OF_STUDENTS;
    }

    public static void setNumberOfStudents(int numberOfStudents) {
        NUMBER_OF_STUDENTS = numberOfStudents;
    }

    public static List<Student> getListOfStudents() {
        return LIST_OF_STUDENTS;
    }

    public static void setListOfStudents(List<Student> listOfStudents) {
        LIST_OF_STUDENTS = listOfStudents;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }


}
