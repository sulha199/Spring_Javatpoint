package SpringJdbc.RowMapper;

import SpringJdbc.Employee;
import SpringJdbc.ResultSetExtractor.EmployeeDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("JdbcContext.xml");
        EmployeeDao dao=(EmployeeDao)ctx.getBean("r_edao");
        List<Employee> list=dao.getAllEmployees();

        for(Employee e:list)
            System.out.println(e);

    }

}
