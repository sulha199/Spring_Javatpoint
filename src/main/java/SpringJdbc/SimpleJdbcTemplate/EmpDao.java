package SpringJdbc.SimpleJdbcTemplate;

//import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import SpringJdbc.Employee;


public class EmpDao {
    JdbcTemplate template;

    public EmpDao(JdbcTemplate template) {
        this.template = template;
    }
    public int update (Employee e){
        String query="update employee set name=? where id=?";
        return template.update(query,e.getName(),e.getId());

//String query="update employee set name=?,salary=? where id=?";
//return template.update(query,e.getName(),e.getSalary(),e.getId());
    }

}

