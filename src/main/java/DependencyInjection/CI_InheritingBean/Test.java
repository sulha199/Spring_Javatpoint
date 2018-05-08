package DependencyInjection.CI_InheritingBean;

import DependencyInjection.CI_DependentObject.Employee;
import DependencyInjection.CI_DependentObject.Address;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
    public static void main(String[] args) {
        Resource r=new ClassPathResource("applicationContext.xml");
        BeanFactory factory=new XmlBeanFactory(r);

        Employee e1=(Employee)factory.getBean("ei");
        e1.show();

    }
}
