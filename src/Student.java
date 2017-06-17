/**
 * Created by mlv on 15.06.2017.
 */
public class Student extends Human implements Sex{
    private String sex;
    private boolean motivation;
    private boolean groupLider;

    public Student(String name) {
        this.name = name;
        this.age = generateAge();
        this.sex = generateSex();
        this.iq = generateIQ();
        this.motivation = generateMotivation();
    }

    public Student(String name, String sex) {
        this.name = name;
        this.age = generateAge();
        this.sex = sex;
        this.iq = generateIQ();
        this.motivation = generateMotivation();
    }

    public Student(String name, String sex, int age, int iq ) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.iq = iq;
        this.motivation = generateMotivation();
    }

    private int generateAge(){
        return (int) (Math.random() * 18 + 18);
    }
    private String generateSex(){
        return  0.5 > Math.random() ? MAN : WOMAN;
    }
    private int generateIQ(){
        return (int) (Math.random() * 50 + 80);
    }
    private boolean generateMotivation() {
        return 1 > (Math.random() * 9 + 0) ? false : true;
    }
    public void setGroupLider() {
        this.groupLider = true;
    }
    public boolean getMotivation() {
        return motivation;
    }
    public int getAge() {
        return age;
    }
    public int getIq() {
        return iq;
    }
    public String getName() {
        return name;
    }
    public String getSex() {
        return sex;
    }
    public boolean isGroupLider() {
        return groupLider;
    }
}
