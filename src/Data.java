import java.util.HashMap;
import java.util.Map;

/**
 * Created by mlv on 15.06.2017.
 */
public class Data {
    private static int count = 1;

    private Map<String, Boolean> studentsName = new HashMap<>();

    public Data() {
        studentsName.put("Vasya", true);
        studentsName.put("Kolya", true);
        studentsName.put("Dima", true);
        studentsName.put("Galya", false);
        studentsName.put("Olya", false);
        studentsName.put("Ivan", true);
        studentsName.put("Nona", false);
        studentsName.put("Tanya", false);
        studentsName.put("Yura", true);
        studentsName.put("Taya", false);
        studentsName.put("Sasha", true);
        studentsName.put("Vika", false);
        studentsName.put("Tolya", true);
        studentsName.put("Inna", false);
        studentsName.put("Yaroslava", false);
        studentsName.put("Katya", false);
        studentsName.put("Bogdan", true);
        studentsName.put("Viktor", true);
        studentsName.put("Slava", true);
        studentsName.put("Taras", true);
        studentsName.put("Kostya", true);
        studentsName.put("Yana", false);
        studentsName.put("Yaroslav", true);
        studentsName.put("Ilona", false);
        studentsName.put("Anya", false);
        studentsName.put("Anton", true);
        studentsName.put("Yulya", false);
        studentsName.put("Sofiya", false);
        studentsName.put("Tamara", false);
    }  

    public String getNextStudentName() {
      String name = "";
      int tempCount = 0;
        for (Map.Entry<String, Boolean> pair : studentsName.entrySet()) {
            name  =  pair.getKey();
            if (tempCount == count ) {
                count++;
                break;
            }
            tempCount++;
        }
        return name;
    }

    public String getStudentSex(String name) {
        if (studentsName.get(name)) return Sex.MAN;
        else return Sex.WOMAN;
    }
}
