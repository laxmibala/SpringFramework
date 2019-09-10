package collegeProject;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "collegeProject")
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {
//Another way to create bean
    @Bean(name={"colBean","collegeBean"})
    public College collegeBean(){ //where collegeBean is bean id
        College college =new College();
        return college;
    }

}
