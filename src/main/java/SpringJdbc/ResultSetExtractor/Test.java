package SpringJdbc.ResultSetExtractor;

import java.util.List;
import SpringJdbc.Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("JdbcContext.xml");
        EmployeeDao dao=(EmployeeDao)ctx.getBean("r_edao");
        List<Employee> list=dao.getAllEmployees();

        for(Employee e:list)
            System.out.println(e);

    }

}
