package DependencyInjection.AutoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        A a_name=context.getBean("a_name",A.class);
        a_name.display();

        A a_type=context.getBean("a_type",A.class);
        a_type.display();
    }
}
