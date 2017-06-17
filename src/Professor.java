import java.util.Iterator;
import java.util.Map;

/**
 * Created by mlv on 15.06.2017.
 */
public class Professor extends Human{
    private String sex;
    private String subject;
    private Group group;

   public Professor(String name, String sex, int age, int iq, String subject, Group group) {
       this.name = name;
       this.sex = sex;
       this.age = age;
       this.iq = iq;
       this.subject = subject;
       this.group = group;
   }
   /**перераховуємо усіх студентів у групі і визначаємо відсутніх*/
   public void call_over() {
       int countOfMissing = 0;
       Iterator<Map.Entry<Student, Boolean>> iterator = group.getGroup().entrySet().iterator();
       while (iterator.hasNext()) {
           Map.Entry<Student, Boolean> pair = iterator.next();
           if (!pair.getValue()) {
               System.out.println(pair.getKey().getName() + " did not come to class");
               countOfMissing++;
           }
       }
       if (countOfMissing == 0) System.out.println("All students come to class");
       else System.out.println("Come to class " + (group.getGroup().size() - countOfMissing) + " students from " + group.getGroup().size());
   }
}
