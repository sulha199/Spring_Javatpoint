package SpringJdbc.PreparedStatement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import SpringJdbc.Employee;

public class Test {

    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("JdbcContext.xml");

        EmployeeDao dao=(EmployeeDao)ctx.getBean("p_edao");
        dao.saveEmployeeByPreparedStatement(new Employee(108,"Amit",35000));
    }
}
