package SpringHibernate;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class InsertTest {
    public static void main(String[] args) {

        Resource r=new ClassPathResource("hibernateContext.xml");
        BeanFactory factory=new XmlBeanFactory(r);

        EmployeeDao dao=(EmployeeDao)factory.getBean("d");

        Employee e=new Employee();
        e.setId(114);
        e.setName("varun");
        e.setSalary(50000);

        System.out.println(e.getId());

        dao.saveEmployee(e);

    }
}
