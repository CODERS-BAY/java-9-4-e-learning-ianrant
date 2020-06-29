public class Main {

    public static void main(String[] args) {

        Filler.fillDatabase();
        System.out.println("- - - - - - - - - - - -");

        System.out.println(Student.printEntireStudentBody());
        System.out.println(Lecture.printEntireLectureCatalog());
        System.out.println(StudentInLecture.printEntireEnrollmentCatalog());
        System.out.println(Assignment.printEntireAssigmentList());

        System.out.println("- - - - - - - - - - - -");


        System.out.println(Assignment.enterAssignmentPoints(1, 140));
        System.out.println(Assignment.calculateAssignmentGrade(1));

        System.out.println(Assignment.enterAssignmentPoints(2, 120));
        System.out.println(Assignment.calculateAssignmentGrade(2));

        System.out.println(Assignment.enterAssignmentPoints(3, 145));
        System.out.println(Assignment.calculateAssignmentGrade(3));

        System.out.println(Assignment.enterAssignmentPoints(4, 100));
        System.out.println(Assignment.calculateAssignmentGrade(4));

        System.out.println(Assignment.enterAssignmentPoints(5, 110));
        System.out.println(Assignment.calculateAssignmentGrade(5));

        System.out.println(Assignment.enterAssignmentPoints(6, 95));
        System.out.println(Assignment.calculateAssignmentGrade(6));

        System.out.println(Assignment.enterAssignmentPoints(7, 155));
        System.out.println(Assignment.calculateAssignmentGrade(7));

        System.out.println(Assignment.enterAssignmentPoints(8, 83));
        System.out.println(Assignment.calculateAssignmentGrade(8));

        System.out.println(Assignment.enterAssignmentPoints(9, 63));
        System.out.println(Assignment.calculateAssignmentGrade(9));

        System.out.println(Assignment.enterAssignmentPoints(10, 142));
        System.out.println(Assignment.calculateAssignmentGrade(10));

        System.out.println(Assignment.enterAssignmentPoints(11, 122));
        System.out.println(Assignment.calculateAssignmentGrade(11));


        Grade.calculateFinalGrade(1);
        Grade.calculateFinalGrade(2);
        Grade.calculateFinalGrade(3);
        Grade.calculateFinalGrade(4);
        Grade.calculateFinalGrade(5);
        Grade.calculateFinalGrade(6);
        Grade.calculateFinalGrade(7);
        Grade.calculateFinalGrade(8);
        Grade.calculateFinalGrade(9);
        Grade.calculateFinalGrade(10);
        Grade.calculateFinalGrade(11);

        System.out.println(Grade.printTranscript(1));
        System.out.println(Grade.printTranscript(2));
        System.out.println(Grade.printTranscript(3));
        System.out.println(Grade.printTranscript(4));
        System.out.println();
        System.out.println(Grade.getListOfGrades().size());





        /*

        System.out.println(Assignment.enterAssignmentPoints(16,101));
        System.out.println(Assignment.calculateAssignmentGrade(16));

        Assignment.createNewAssignment("Breathing Final Exam",2);

        Assignment.createNewAssignment("Senseless Final Thinking Piece", 3);

        Assignment.createNewAssignment("Frying Mid-Term",4);
        Assignment.createNewAssignment("Frying End-Term",4);

        Assignment.createNewAssignment("Nicolas Cago Final Exam", 5);

        Assignment.createNewAssignment("Grifting Term Paper",6);

        Assignment.createNewAssignment("Studiology Mid-Term #1", 7);
        Assignment.createNewAssignment("Studiology Mid-Term #2", 7);
        Assignment.createNewAssignment("Studiology Final Paper", 7);

        Assignment.createNewAssignment("Senseless Final Thinking Piece", 8);

        */

        /*
        System.out.println("------------------------------- ALLOT ASSIGNMENTS --------------------------------------");
        System.out.println(StudentInLecture.enrollStudentInLecture(1,1));
        Assignment.createNewAssignment("Ladders Mid-Term",1);
        System.out.println(Assignment.printEntireAssigmentList());
        System.out.println("Assignment #1 is graded: " + Assignment.isGraded(1));


        System.out.println(Assignment.concludeAssignment(1,90));

        System.out.println(Assignment.gradeAssignment(1,2));
        System.out.println(Assignment.gradeAssignment(1,2));
        System.out.println();
        System.out.println(Grade.createFinalGrade(1));


        System.out.println(StudentInLecture.enrollStudentInLecture(1,1));
        System.out.println(StudentInLecture.enrollStudentInLecture(1,2));
        System.out.println(StudentInLecture.enrollStudentInLecture(1,4));

        /*
        System.out.println(StudentInLecture.enrollStudentInLecture(1,6));
        System.out.println(StudentInLecture.enrollStudentInLecture(1,11));
        System.out.println();
        System.out.println(StudentInLecture.enrollStudentInLecture(3,3));
        System.out.println(StudentInLecture.enrollStudentInLecture(3,2));
        System.out.println(StudentInLecture.enrollStudentInLecture(3,5));
        System.out.println(StudentInLecture.enrollStudentInLecture(3,7));
        System.out.println(StudentInLecture.enrollStudentInLecture(3,9));
        System.out.println();
        System.out.println(StudentInLecture.enrollStudentInLecture(2,1));
        System.out.println(StudentInLecture.enrollStudentInLecture(2,2));
        System.out.println(StudentInLecture.enrollStudentInLecture(2,4));
        System.out.println(StudentInLecture.enrollStudentInLecture(2,6));
        System.out.println(StudentInLecture.enrollStudentInLecture(2,11));

         */


        System.out.println("-----------------------------------------------------------------------------");
    }


}
