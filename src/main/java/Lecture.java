import java.util.ArrayList;
import java.util.List;

public class Lecture {

    private static List<Lecture> LIST_OF_LECTURES = new ArrayList<>();
    private static int NUMBER_OF_LECTURES = 0;
    private String lectureName;
    private int lectureNumber;
    private int studentNumber;


    // DONE
    public Lecture(String lectureName) {
        NUMBER_OF_LECTURES++;
        this.lectureName = lectureName;
        this.lectureNumber = NUMBER_OF_LECTURES;
    }

    // DONE
    public static String createNewLecture(String lectureName) {
        Lecture lecture = new Lecture(lectureName);
        LIST_OF_LECTURES.add(lecture);

        return "New lecture " + lecture.getLectureName() + " has been offered.";
    }

    // DONE
    public static String printEntireLectureCatalog() {
        String lectureCatalogToString = NUMBER_OF_LECTURES + " lectures in total:\n";
        for (Lecture lecture : getListOfLectures()) {
            lectureCatalogToString += "'" + lecture.getLectureName() + "', lecture ID: " + lecture.getLectureNumber() + "\n";
        }
        return lectureCatalogToString;
    }

    // DONE
    public static String retrieveLectureName(int lectureNumber) {
        for (int i = 0; i < LIST_OF_LECTURES.size(); i++) {
            if (LIST_OF_LECTURES.get(i).getLectureNumber() == lectureNumber) {
                return LIST_OF_LECTURES.get(i).getLectureName();
            }
        }
        return "Error: Lecture information could not be found.";
    }


    public static int getNumberOfLectures() {
        return NUMBER_OF_LECTURES;
    }

    public static void setNumberOfLectures(int numberOfLectures) {
        NUMBER_OF_LECTURES = numberOfLectures;
    }

    public static List<Lecture> getListOfLectures() {
        return LIST_OF_LECTURES;
    }

    public static void setListOfLectures(List<Lecture> listOfLectures) {
        LIST_OF_LECTURES = listOfLectures;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
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


}
