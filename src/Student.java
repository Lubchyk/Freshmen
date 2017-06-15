/**
 * Created by mlv on 15.06.2017.
 */
public class Student implements Sex{
    private String name;
    private int age;
    private String sex;
    private int motivation;
    private int iq;

    public Student(String name, int age, Sex sex, int iq ) {
        this.name = name;
        this.age = age;
        this.sex = sex.MEN;
        this.iq = iq;

    }

}
