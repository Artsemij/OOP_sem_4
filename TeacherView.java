import java.util.List;
public class TeacherView {
    private TeacherService teacherService;
    public TeacherView(TeacherService teacherService){
        this.teacherService = teacherService;
    }
    //метод, кот выводит информацию о кадом учителе из списка
    public void displayTeachers(){
        List<Teacher> teachers = teacherService.getAllTeachers();
        for(Teacher teacher: teachers){
            System.out.println(teacher.getName() + "-" + teacher.getAge());
        }
    }

    
}
