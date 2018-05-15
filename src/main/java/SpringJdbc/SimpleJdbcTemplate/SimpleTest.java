package SpringJdbc.SimpleJdbcTemplate;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import SpringJdbc.Employee;

public class SimpleTest {
    public static void main(String[] args) {

        Resource r=new ClassPathResource("JdbcContext.xml");
        BeanFactory factory=new XmlBeanFactory(r);

        EmpDao dao=(EmpDao)factory.getBean("s_edao");
        int status=dao.update(new Employee(23,"Tarun",35000));
        System.out.println(status);
    }
}
