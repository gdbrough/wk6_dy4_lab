import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before(){
        employee = new Employee("Joe Bloggs", "NI123456H", 16000);
    }
//
//    @Test
//    public void canGetName(){
//        assertEquals("Joe Bloggs", employee.getName());
//    }
//
//    @Test
//    public void canGetNINumber(){
//        assertEquals("NI123456H", employee.getNiNumber());
//    }
//
//    @Test
//    public void canGetSalary(){
//        assertEquals(16000, employee.getSalary());
//    }
//
//    @Test
//    public void canRaiseSalary(){
//        employee.raiseSalary(1000);
//        assertEquals(17000, employee.getSalary(), 0.01);
//    }
//
//    @Test
//    public void canPayBonus(){
//        assertEquals(160, employee.payBonus());
//    }

}
