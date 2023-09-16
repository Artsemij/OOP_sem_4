//класс TeacherComparator, позволяющий сравнивать двух учителей по возрасту.
import java.util.Comparator;
public class TeacherComparator implements Comparator<Teacher> {
    public int compare(Teacher teacher1, Teacher teacher2){
        return teacher1.getAge() - teacher2.getAge();
    }
}
