package SpringJdbc.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import SpringJdbc.Employee;

public class EmployeeDao extends SpringJdbc.EmployeeDao {
    public List<Employee> getAllEmployees(){
        return jdbcTemplate.query("select * from employee",new ResultSetExtractor<List<Employee>>(){
            @Override
            public List<Employee> extractData(ResultSet rs) throws SQLException,
                    DataAccessException {

                List<Employee> list=new ArrayList<Employee>();
                while(rs.next()){
                    Employee e=new Employee();
                    e.setId(rs.getInt(1));
                    e.setName(rs.getString(2));
                    e.setSalary(rs.getInt(3));
                    list.add(e);
                }
                return list;
            }
        });
    }
}
