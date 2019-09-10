package collegeProject;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {
    public void TeacherInfo() {
        System.out.println("Math Teacher");
    }
}
