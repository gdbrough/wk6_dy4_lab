import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Joe Bloggs", "NI123456H", 16000);
    }

    @Test
    public void canGetName(){
        assertEquals("Joe Bloggs", developer.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("NI123456H", developer.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(16000, developer.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1000);
        assertEquals(17000, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(160, developer.payBonus());
    }
}
