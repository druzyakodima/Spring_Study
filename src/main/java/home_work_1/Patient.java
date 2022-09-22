package home_work_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Patient {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(home_work_1.AppConfig.class);
        IRegistry registry = context.getBean("registry", IRegistry.class);
        registry.signUpOnReception();
    }
}
