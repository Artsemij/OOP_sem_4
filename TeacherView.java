import java.util.List;
public class TeacherView {
    private TeacherService teacherService;
    public TeacherView(TeacherService teacherService){
        this.teacherService = teacherService;
    }
    public void displayTeachers(){
        List<Teacher> teachers = teacherService.getAllTeachers();
        for(Teacher teacher: teachers){
            System.out.println(teacher.getName() + "-" + teacher.getAge());
        }
    }

    
}
