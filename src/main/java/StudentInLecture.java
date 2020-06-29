import java.util.ArrayList;
import java.util.List;

public class StudentInLecture {

    private static int NUMBER_OF_SILS = 0;
    private static List<StudentInLecture> LIST_OF_SILS = new ArrayList<>();
    private int silNumber;
    private int silStudentNumber;
    private int silLectureNumber;

    // DONE
    public StudentInLecture(int silStudentNumber, int silLectureNumber) {
        NUMBER_OF_SILS++;
        this.silNumber = NUMBER_OF_SILS;
        this.silStudentNumber = silStudentNumber;
        this.silLectureNumber = silLectureNumber;
    }

    // DONE
    public static String enrollStudentInLecture(int studentNumber, int lectureNumber) {
        if (checkEnrollment(studentNumber, lectureNumber)) {
            StudentInLecture studentInLecture = new StudentInLecture(studentNumber, lectureNumber);
            LIST_OF_SILS.add(studentInLecture);
            String enrollmentStatus =
                    "Student " + studentNumber + " (" +
                            Student.retrieveStudentName(studentNumber) +
                            ") has been enrolled in lecture " + lectureNumber + " ('" +
                            Lecture.retrieveLectureName(lectureNumber) +
                            "')\nThe student-in-lecture ID is " + studentInLecture.getSilNumber();
            return enrollmentStatus;
        }
        return "Student has already been enrolled";
    }

    public static boolean checkEnrollment(int studentNumber, int lectureNumber) {
        for (int i = 0; i < NUMBER_OF_SILS; i++) {
            if (getListOfSils().get(i).getSilStudentNumber() == studentNumber && getListOfSils().get(i).getSilLectureNumber() == lectureNumber) {
                return false;
            }
        }
        return true;
    }


    // DONE
    public static int[] retrieveSilNumbers(int silNumber) {
        int lectureNumber = 0;
        int studentNumber = 0;
        int[] silInformationAsNumbers = new int[2];
        // ich weiß, kann man abkürzen - ich wollts hald offensichltich haben :)

        for (int i = 0; i < StudentInLecture.getListOfSils().size(); i++) {
            if (StudentInLecture.getListOfSils().get(i).getSilNumber() == silNumber) {
                studentNumber = StudentInLecture.getListOfSils().get(i).getSilStudentNumber();
                lectureNumber = StudentInLecture.getListOfSils().get(i).getSilLectureNumber();
            }
        }
        silInformationAsNumbers[0] = lectureNumber;
        silInformationAsNumbers[1] = studentNumber;
        return silInformationAsNumbers;
    }


    public static String retrieveSilData(int silNumber) {
        int lectureNumber = 0;
        int studentNumber = 0;
        String silInformationAsString = "";

        for (int i = 0; i < StudentInLecture.getListOfSils().size(); i++) {
            if (StudentInLecture.getListOfSils().get(i).getSilNumber() == silNumber) {
                studentNumber = StudentInLecture.getListOfSils().get(i).getSilStudentNumber();
                lectureNumber = StudentInLecture.getListOfSils().get(i).getSilLectureNumber();
            }
        }

        for (int i = 0; i < StudentInLecture.getListOfSils().size(); i++) {
            if (Student.getListOfStudents().get(i).getStudentNumber() == studentNumber) {
                silInformationAsString += Student.getListOfStudents().get(i).getStudentFirstName() +
                        " " + Student.getListOfStudents().get(i).getStudentLastName() + " in ";
            }
        }

        for (int i = 0; i < StudentInLecture.getListOfSils().size(); i++) {
            if (Lecture.getListOfLectures().get(i).getLectureNumber() == lectureNumber) {
                silInformationAsString += Lecture.getListOfLectures().get(i).getLectureName();
            }
        }

        return silInformationAsString;
    }

    public static String printEntireEnrollmentCatalog() {
        String enrollmentCatalogToString = NUMBER_OF_SILS + " enrollment in total:\n";
        for (StudentInLecture studentInLecture : getListOfSils()) {
            enrollmentCatalogToString += "student ID: " +
                    studentInLecture.getSilStudentNumber() +
                    ", lecture ID: " + studentInLecture.getSilLectureNumber() +
                    ", SIL ID " + studentInLecture.getSilNumber() + "\n";
        }
        return enrollmentCatalogToString;
    }

    public static int getNumberOfSils() {
        return NUMBER_OF_SILS;
    }

    public static void setNumberOfSils(int numberOfSils) {
        NUMBER_OF_SILS = numberOfSils;
    }

    public static List<StudentInLecture> getListOfSils() {
        return LIST_OF_SILS;
    }

    public static void setListOfSils(List<StudentInLecture> listOfSils) {
        LIST_OF_SILS = listOfSils;
    }

    public int getSilNumber() {
        return silNumber;
    }

    public void setSilNumber(int silNumber) {
        this.silNumber = silNumber;
    }

    public int getSilStudentNumber() {
        return silStudentNumber;
    }

    public void setSilStudentNumber(int silStudentNumber) {
        this.silStudentNumber = silStudentNumber;
    }

    public int getSilLectureNumber() {
        return silLectureNumber;
    }

    public void setSilLectureNumber(int silLectureNumber) {
        this.silLectureNumber = silLectureNumber;
    }
}
