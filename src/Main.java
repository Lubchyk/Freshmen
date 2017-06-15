/**
 * Created by mlv on 15.06.2017.
 */
public class Main {

    public static void main(String[] args) {
        Data data = new Data();
        Group group = new Group("G15");
        Professor professor;

        for (int i = 0; i < Math.random() * 15 + 10; i++) {
            String studentName = data.getNextStudentName();
            group.AddNewStudent(new Student(studentName, data.getStudentSex(studentName)));
        }
        group.choiceGroupLeader();
        professor = new Professor ("Pavlo", "History", group);
        professor.call_over();
    }
}
