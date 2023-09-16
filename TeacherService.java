import java.util.ArrayList;
import java.util.List;
public class TeacherService {
    private List<Teacher> teachers;
    public TeacherService(){
        this.teachers = new ArrayList<>();
    }
    public void addTeacher(Teacher teacher){
        //добавление учителя в список
        teachers.add(teacher);
    }
    public void editTeacher(int index, Teacher teacher){
        //изменение информации о конкретном учителе
        teachers.set(index, teacher);
    }
    public List<Teacher> getAllTeachers(){
        //возвращает список всех учителей
        return teachers;
    }

}
