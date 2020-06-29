import java.util.ArrayList;
import java.util.List;

public class Assignment {

    private static List<Assignment> LIST_OF_ASSIGNMENTS = new ArrayList<>();
    private static double ASSIGNMENT_MAX_POINTS = 150;
    private static int NUMBER_OF_ASSIGNMENTS = 0;
    private String assignmentName;
    private int assignmentNumber;
    private int silNumber;
    private Integer assignmentGrade;
    private Double assignmentAchievedPoints;


    // DONE
    public Assignment(String assignmentName, int silNumber) {
        NUMBER_OF_ASSIGNMENTS++;

        this.assignmentNumber = NUMBER_OF_ASSIGNMENTS;
        this.assignmentName = assignmentName;
        this.assignmentGrade = null;
        this.assignmentAchievedPoints = null;
        this.silNumber = silNumber;
    }


    // DONE
    public static String createNewAssignment(String assignmentName, int silNumber) {
        Assignment assignment = new Assignment(assignmentName, silNumber);
        LIST_OF_ASSIGNMENTS.add(assignment);
        return assignment.getAssignmentName() + " has been given.";
    }

    // DONE
    public static String gradeAssignment(int assignmentNumber, int grade) {
        if (!assigmentIsGraded(assignmentNumber)) {
            for (int i = 0; i < LIST_OF_ASSIGNMENTS.size(); i++) {
                if (LIST_OF_ASSIGNMENTS.get(i).getAssignmentNumber() == assignmentNumber) {
                    LIST_OF_ASSIGNMENTS.get(i).setAssignmentGrade(grade);
                    return "Assignment #" + assignmentNumber + " '" + retrieveAssignmentName(assignmentNumber) + "' has been graded: " + grade;
                }
            }
        } else {
            return "This assignment has already been graded.";
        }
        return "Unknown Error: Assignment could not be found.";
    }


    // DONE
    public static String calculateAssignmentGrade(int assignmentNumber) {

        double achievedPoints = 0;
        int assignmentGrade = 0;
        int assignmentInList = 0;

        if (!assigmentIsGraded(assignmentNumber)) {
            for (int i = 0; i < LIST_OF_ASSIGNMENTS.size(); i++) {
                if (LIST_OF_ASSIGNMENTS.get(i).getAssignmentNumber() == assignmentNumber) {
                    if (LIST_OF_ASSIGNMENTS.get(i).getAssignmentAchievedPoints() != null) {
                        achievedPoints = LIST_OF_ASSIGNMENTS.get(i).getAssignmentAchievedPoints();
                        assignmentInList = i;
                        break;
                    } else {
                        return "No points have been entered yet.";
                    }
                }
            }
        } else {
            return "The assignment has already been graded.";
        }

        double pointsToPercent = (achievedPoints / ASSIGNMENT_MAX_POINTS) * 100;
        if (pointsToPercent <= 50) {
            assignmentGrade = 5;
        } else if (pointsToPercent >= 51 && pointsToPercent <= 65) {
            assignmentGrade = 4;
        } else if (pointsToPercent >= 66 && pointsToPercent <= 80) {
            assignmentGrade = 3;
        } else if (pointsToPercent >= 81 && pointsToPercent <= 90) {
            assignmentGrade = 2;
        } else if (pointsToPercent >= 91) {
            assignmentGrade = 1;
        }

        LIST_OF_ASSIGNMENTS.get(assignmentInList).setAssignmentGrade(assignmentGrade);

        return "Assignment #" + assignmentNumber + " has been graded: " + assignmentGrade;
    }


    // DONE
    public static String enterAssignmentPoints(int assignmentNumber, double assignmentAchievedPoints) {
        for (int i = 0; i < LIST_OF_ASSIGNMENTS.size(); i++) {
            if (LIST_OF_ASSIGNMENTS.get(i).getAssignmentNumber() == assignmentNumber) {
                LIST_OF_ASSIGNMENTS.get(i).setAssignmentAchievedPoints(assignmentAchievedPoints);
                return "Points for assignment #" + assignmentNumber + " '" +
                        retrieveAssignmentName(assignmentNumber) +
                        "' have been set:\n" +
                        assignmentAchievedPoints + " out of " + ASSIGNMENT_MAX_POINTS;
            }
        }
        return "Error: Assignment information could not be found.";
    }


    // DONE
    public static boolean assigmentIsGraded(int assignmentNumber) {
        for (int i = 0; i < getListOfAssignments().size(); i++) {
            if (LIST_OF_ASSIGNMENTS.get(i).getAssignmentNumber() == assignmentNumber) {
                if (LIST_OF_ASSIGNMENTS.get(i).getAssignmentGrade() != null) {
                    return true;
                }
            }
        }
        return false;
    }


    // DONE
    public static String printEntireAssigmentList() {
        String assigmentListToString = NUMBER_OF_ASSIGNMENTS + " assignments in total:\n";
        for (Assignment assignment : LIST_OF_ASSIGNMENTS) {
            assigmentListToString += assignment.getAssignmentName() + ", assignment ID: " + assignment.getAssignmentNumber() + "\n";
        }
        return assigmentListToString;
    }


    // DONE
    public static String retrieveAssignmentName(int assignmentNumber) {
        for (int i = 0; i < LIST_OF_ASSIGNMENTS.size(); i++) {
            if (LIST_OF_ASSIGNMENTS.get(i).getAssignmentNumber() == assignmentNumber) {
                return LIST_OF_ASSIGNMENTS.get(i).getAssignmentName();
            }
        }
        return "Error: Assignment information could not be found.";
    }

    public static List<Assignment> getListOfAssignments() {
        return LIST_OF_ASSIGNMENTS;
    }

    public static void setListOfAssignments(List<Assignment> listOfAssignments) {
        LIST_OF_ASSIGNMENTS = listOfAssignments;
    }

    public static double getAssignmentMaxPoints() {
        return ASSIGNMENT_MAX_POINTS;
    }

    public static void setAssignmentMaxPoints(double assignmentMaxPoints) {
        ASSIGNMENT_MAX_POINTS = assignmentMaxPoints;
    }

    public static int getNumberOfAssignments() {
        return NUMBER_OF_ASSIGNMENTS;
    }

    public static void setNumberOfAssignments(int numberOfAssignments) {
        NUMBER_OF_ASSIGNMENTS = numberOfAssignments;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public int getAssignmentNumber() {
        return assignmentNumber;
    }

    public void setAssignmentNumber(int assignmentNumber) {
        this.assignmentNumber = assignmentNumber;
    }

    public int getSilNumber() {
        return silNumber;
    }

    public void setSilNumber(int silNumber) {
        this.silNumber = silNumber;
    }

    public Integer getAssignmentGrade() {
        return assignmentGrade;
    }

    public void setAssignmentGrade(Integer assignmentGrade) {
        this.assignmentGrade = assignmentGrade;
    }

    public Double getAssignmentAchievedPoints() {
        return assignmentAchievedPoints;
    }

    public void setAssignmentAchievedPoints(Double assignmentAchievedPoints) {
        this.assignmentAchievedPoints = assignmentAchievedPoints;
    }
}
