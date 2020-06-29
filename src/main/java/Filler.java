public class Filler {

    public static void fillDatabase() {
        Student.createNewStudent("Max", "Power");
        Student.createNewStudent("Maria", "McKensie");
        Student.createNewStudent("Martha", "Stewart");
        Student.createNewStudent("Karen", "Henderson");

        /*
        Student.createNewStudent("Kevin", "McAffee");
        Student.createNewStudent("Miles", "O'Brien");
        Student.createNewStudent("Manebad", "Shuss-T'faatet");
        Student.createNewStudent("Fred", "Powell");
        Student.createNewStudent("Meggan", "McKensie");
        Student.createNewStudent("Martin", "Shepard");
        Student.createNewStudent("Andy", "Henderson");
        Student.createNewStudent("Kenneth", "Epson");
        Student.createNewStudent("Sum Ting", "Wong");
        Student.createNewStudent("Marcia", "O'Kelly");
        Student.createNewStudent("Andrea", "Miles");
        Student.createNewStudent("Desmond", "Frank");

         */


        Lecture.createNewLecture("When is it ok to shake a baby?");
        Lecture.createNewLecture("Can I fry that?");
        Lecture.createNewLecture("Advanced breath holding");
        Lecture.createNewLecture("Nicolas Cage, Good or Bad?");
        Lecture.createNewLecture("Grifting 101");
        Lecture.createNewLecture("Physical education education");
        Lecture.createNewLecture("History of Ice Cream");
        Lecture.createNewLecture("Intro to Senselessness");
        Lecture.createNewLecture("Studiology");


        StudentInLecture.enrollStudentInLecture(1, 1);
        StudentInLecture.enrollStudentInLecture(1, 3);
        StudentInLecture.enrollStudentInLecture(1, 8);
        StudentInLecture.enrollStudentInLecture(2, 2);
        StudentInLecture.enrollStudentInLecture(2, 4);
        StudentInLecture.enrollStudentInLecture(2, 5);
        StudentInLecture.enrollStudentInLecture(3, 9);
        StudentInLecture.enrollStudentInLecture(3, 8);
        StudentInLecture.enrollStudentInLecture(4, 6);
        StudentInLecture.enrollStudentInLecture(4, 4);
        StudentInLecture.enrollStudentInLecture(4, 5);

        /*
        StudentInLecture.enrollStudentInLecture(5,7);
        StudentInLecture.enrollStudentInLecture(5,3);
        StudentInLecture.enrollStudentInLecture(5,5);
        StudentInLecture.enrollStudentInLecture(5,8);
        StudentInLecture.enrollStudentInLecture(6,4);
        StudentInLecture.enrollStudentInLecture(6,6);
        StudentInLecture.enrollStudentInLecture(6,9);
        StudentInLecture.enrollStudentInLecture(7,2);
        StudentInLecture.enrollStudentInLecture(7,5);
        StudentInLecture.enrollStudentInLecture(7,7);
        StudentInLecture.enrollStudentInLecture(8,3);
        StudentInLecture.enrollStudentInLecture(8,5);
        StudentInLecture.enrollStudentInLecture(8,8);
        StudentInLecture.enrollStudentInLecture(9,1);
        StudentInLecture.enrollStudentInLecture(9,3);
        StudentInLecture.enrollStudentInLecture(9,4);
        StudentInLecture.enrollStudentInLecture(10,2);
        StudentInLecture.enrollStudentInLecture(10,7);
        StudentInLecture.enrollStudentInLecture(11,6);
        StudentInLecture.enrollStudentInLecture(11,9);
        StudentInLecture.enrollStudentInLecture(12,5);
        StudentInLecture.enrollStudentInLecture(13,2);
        StudentInLecture.enrollStudentInLecture(14,7);
        StudentInLecture.enrollStudentInLecture(14,4);
        StudentInLecture.enrollStudentInLecture(15,3);
        StudentInLecture.enrollStudentInLecture(15,6);
        StudentInLecture.enrollStudentInLecture(16,5);
        StudentInLecture.enrollStudentInLecture(16,9);
        */

        Assignment.createNewAssignment("Baby-Shaking End-Term", 1);
        Assignment.createNewAssignment("Breathing End-Term", 2);
        Assignment.createNewAssignment("Senseless End-Term", 3);

        Assignment.createNewAssignment("Frying End-Term", 4);
        Assignment.createNewAssignment("Cage: Bad End-Term", 5);
        Assignment.createNewAssignment("Grifting End-Term", 6);

        Assignment.createNewAssignment("Studyology End-Term", 7);
        Assignment.createNewAssignment("Senseless End-Term", 8);

        Assignment.createNewAssignment("PEE End-Term", 9);
        Assignment.createNewAssignment("Cage: Bad End-Term", 10);

        Assignment.createNewAssignment("Grifting End-Term", 11);



        /*
        Assignment.createNewAssignment("Baby-Shaking Mid-Term",1);
        Assignment.createNewAssignment("Baby-Shaking Mid-Term",25);

        Assignment.createNewAssignment("Baby-Shaking End-Term",1);
        Assignment.createNewAssignment("Baby-Shaking End-Term",25);

        Assignment.createNewAssignment("Baby-Shaking Quiz",1);
        Assignment.createNewAssignment("Baby-Shaking Quiz",25);

        Assignment.createNewAssignment("Frying Mid-Term",4);
        Assignment.createNewAssignment("Frying Mid-Term",19);
        Assignment.createNewAssignment("Frying Mid-Term",28);
        Assignment.createNewAssignment("Frying Mid-Term",33);
        Assignment.createNewAssignment("Frying Compensation Assignment",33);

        Assignment.createNewAssignment("Frying End-Term",4);
        Assignment.createNewAssignment("Frying End-Term",19);
        Assignment.createNewAssignment("Frying End-Term",28);
        Assignment.createNewAssignment("Frying End-Term",33);

        Assignment.createNewAssignment("Breathing Final Exam",2);
        Assignment.createNewAssignment("Breathing Final Exam",13);
        Assignment.createNewAssignment("Breathing Final Exam",22);
        Assignment.createNewAssignment("Breathing Final Exam",26);
        Assignment.createNewAssignment("Breathing Final Exam",36);

        Assignment.createNewAssignment("Nicolas Cago Final Exam", 5);
        Assignment.createNewAssignment("Nicolas Cago Final Exam", 10);
        Assignment.createNewAssignment("Nicolas Cago Research Project", 10);
        Assignment.createNewAssignment("Nicolas Cago Final Exam", 16);
        Assignment.createNewAssignment("Nicolas Cago Compensation Assignment", 27);
        Assignment.createNewAssignment("Nicolas Cago Final Exam", 27);
        Assignment.createNewAssignment("Nicolas Cago Final Exam", 35);

        Assignment.createNewAssignment("Grifting Term Paper",6);
        Assignment.createNewAssignment("Grifting Term Paper", 11);
        Assignment.createNewAssignment("Grifting Term Paper", 14);
        Assignment.createNewAssignment("Grifting Term Paper", 20);
        Assignment.createNewAssignment("Grifting Term Paper", 23);
        Assignment.createNewAssignment("Grifting Term Paper", 32);
        Assignment.createNewAssignment("Grifting Term Paper", 38);

        Assignment.createNewAssignment("PPE Final Presentation", 9);
        Assignment.createNewAssignment("PPE Final Presentation", 17);
        Assignment.createNewAssignment("PPE Final Presentation", 30);
        Assignment.createNewAssignment("PPE Optional Assignment", 37);
        Assignment.createNewAssignment("PPE Final Presentation", 37);

        Assignment.createNewAssignment("Ice Cream Mid-Term Presentation", 12);
        Assignment.createNewAssignment("Ice Cream Quiz", 12);
        Assignment.createNewAssignment("Ice Cream Final Exam", 12);

        Assignment.createNewAssignment("Ice Cream Mid-Term Presentation", 21);
        Assignment.createNewAssignment("Ice Cream Quiz", 21);
        Assignment.createNewAssignment("Ice Cream Final Exam", 21);

        Assignment.createNewAssignment("Ice Cream Mid-Term Presentation", 29);
        Assignment.createNewAssignment("Ice Cream Quiz", 29);
        Assignment.createNewAssignment("Ice Cream Taste Test", 29);
        Assignment.createNewAssignment("Ice Cream Final Exam", 29);

        Assignment.createNewAssignment("Ice Cream Mid-Term Presentation", 34);
        Assignment.createNewAssignment("Ice Cream Voluntary Assignment", 34);
        Assignment.createNewAssignment("Ice Cream Quiz", 34);
        Assignment.createNewAssignment("Ice Cream Final Exam", 34);

        Assignment.createNewAssignment("Senseless Final Thinking Piece", 3);
        Assignment.createNewAssignment("Senseless Final Thinking Piece", 8);
        Assignment.createNewAssignment("Senseless Final Thinking Piece", 15);
        Assignment.createNewAssignment("Senseless Final Thinking Piece", 24);

        Assignment.createNewAssignment("Studiology Mid-Term #1", 7);
        Assignment.createNewAssignment("Studiology Mid-Term #2", 7);
        Assignment.createNewAssignment("Studiology Final Paper", 7);

        Assignment.createNewAssignment("Studiology Mid-Term #1", 18);
        Assignment.createNewAssignment("Studiology Compensation Assignment", 18);
        Assignment.createNewAssignment("Studiology Final Paper", 18);

        Assignment.createNewAssignment("Studiology Mid-Term #2", 31);
        Assignment.createNewAssignment("Studiology Final Paper", 31);

        Assignment.createNewAssignment("Studiology Mid-Term #1", 39);
        Assignment.createNewAssignment("Studiology Mid-Term #2", 39);
        Assignment.createNewAssignment("Studiology Final Paper", 39);

         */


    }
}
