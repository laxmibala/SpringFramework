package collegeProject;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {

    public void TeacherInfo() {
        System.out.println("Science Teacher");
    }
}
