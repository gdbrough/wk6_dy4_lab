import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Joe Bloggs", "NI123456H", 16000, "Training");
    }

    @Test
    public void canGetName(){
        assertEquals("Joe Bloggs", manager.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("NI123456H", manager.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(16000, manager.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1000);
        assertEquals(17000, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(160, manager.payBonus());
    }

    @Test
    public void getDeptName(){
        assertEquals("Training", manager.getDeptName());
    }

}
