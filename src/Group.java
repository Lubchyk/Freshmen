import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by mlv on 15.06.2017.
 */
public class Group {
    private String name;
    private Map<Student, Boolean> group = new HashMap<>();

    public Group(String name) {
        this.name = name;
    }
    public void AddNewStudent(Student student){
        group.put(student, student.getMotivation());
    }
    public Map getGroup() {
        return group;
    }

    public Student getStudent(String name) {
        Student student = null;
        for (Map.Entry<Student, Boolean> pair : group.entrySet()) {
            if (pair.getKey().getName().equals(name)) student = pair.getKey();
        }
        return student;
    }

    public void choiceGroupLeader() {
        String name = "";
        int maxPoint = 0;
        Iterator<Map.Entry<Student, Boolean>> iterator = group.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Student, Boolean> pair = iterator.next();
            int count = (int) (pair.getKey().getAge() + pair.getKey().getIq() + Math.random() * 100);
            if ( count > maxPoint) {
                name = pair.getKey().getName();
                maxPoint = count;
            }
        }
        getStudent(name).setGroupLider();
        System.out.println("Group leader chosen it is " + name);
    }


}
