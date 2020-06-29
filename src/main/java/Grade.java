import java.util.ArrayList;
import java.util.List;

public class Grade {


    private static List<Grade> LIST_OF_GRADES = new ArrayList<>();
    private int lectureNumber;
    private int studentNumber;
    private Integer finalGrade;

    public Grade(int lectureNumber, int studentNumber, Integer finalGrade) {
        this.lectureNumber = lectureNumber;
        this.studentNumber = studentNumber;
        this.finalGrade = finalGrade;
    }

    // DONE
    public static String calculateFinalGrade(int silNumber) {

        int[] silInformation = StudentInLecture.retrieveSilNumbers(silNumber);
        int lectureNumber = silInformation[0];
        int studentNumber = silInformation[1];
        int numberOfAssignments = 0;
        int sumOfAssigmentGrades = 0;
        Integer finalGrade;

        if (!lectureIsGraded(silInformation)) {
            for (int i = 0; i < Assignment.getListOfAssignments().size(); i++) {
                if (Assignment.getListOfAssignments().get(i).getSilNumber() == silNumber) {
                    if (Assignment.getListOfAssignments().get(i).getAssignmentGrade() != null) {
                        sumOfAssigmentGrades += Assignment.getListOfAssignments().get(i).getAssignmentGrade();
                        numberOfAssignments++;
                    } else {
                        return "Final grade cannot be determined, one or more assignments are not yet graded!";
                    }

                }
            }

            if (numberOfAssignments > 1) {
                finalGrade = sumOfAssigmentGrades / numberOfAssignments;
            } else {
                finalGrade = sumOfAssigmentGrades;
            }

            Grade grade = new Grade(lectureNumber, studentNumber, finalGrade);
            LIST_OF_GRADES.add(grade);
            return "Final grade is " + finalGrade + " for student "; //+ StudentInLecture.retrieveSilData(silNumber);
        }
        return "Final grade has already been entered";
    }

    // DONE
    public static String printTranscript(int studentNumber) {

        String studentName = Student.retrieveStudentName(studentNumber);
        String transcript = "\nTranscript for " + studentNumber + " (" + studentName + ") :\n";

        for (int i = 0; i < LIST_OF_GRADES.size(); i++) {
            if (getListOfGrades().get(i).getStudentNumber() == studentNumber) {
                transcript += Lecture.retrieveLectureName(getListOfGrades().get(i).getLectureNumber()) +
                        " ...... " + getListOfGrades().get(i).getFinalGrade() + "\n";
            }
        }
        return transcript;
    }

    // DONE
    public static boolean lectureIsGraded(int[] silInformation) {
        int lectureNumber = silInformation[0];
        int studentNumber = silInformation[1];

        for (int i = 0; i < LIST_OF_GRADES.size(); i++) {
            if (getListOfGrades().get(i).getLectureNumber() == lectureNumber && getListOfGrades().get(i).getStudentNumber() == studentNumber) {
                if (getListOfGrades().get(i).getFinalGrade() != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static List<Grade> getListOfGrades() {
        return LIST_OF_GRADES;
    }

    public static void setListOfGrades(List<Grade> listOfGrades) {
        LIST_OF_GRADES = listOfGrades;
    }

    public int getLectureNumber() {
        return lectureNumber;
    }

    public void setLectureNumber(int lectureNumber) {
        this.lectureNumber = lectureNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Integer getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(Integer finalGrade) {
        this.finalGrade = finalGrade;
    }
}
