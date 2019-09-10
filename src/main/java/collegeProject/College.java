package collegeProject;

import collegeProject.Principal;
import collegeProject.Students;
import collegeProject.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class College {
    @Value("${college.name}")
    private String collegeName;

    @Qualifier("mathTeacher")
    @Autowired
    Teacher teacher;

    @Autowired
    Principal principal;

    @Autowired
    Students students;


    public void test() {
        System.out.println("College Name is: "+collegeName);
        principal.principalInfo();
        teacher.TeacherInfo();
        students.StudentInfo();
    }
}
