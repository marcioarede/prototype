import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class EmployeesTest {

    @Test
    void test() throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();
        Employees empsNew = (Employees) emps.clone();
        Employees empsNew1 = (Employees) emps.clone();
        List<String> list = empsNew.getEmpList();
        list.add("Henrique Miranda");
        assertEquals(list, empsNew1.getEmpList());
    }


}