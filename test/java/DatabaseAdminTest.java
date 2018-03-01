import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Joe Bloggs", "NI123456H", 16000);
    }

    @Test
    public void canGetName(){
        assertEquals("Joe Bloggs", databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("NI123456H", databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(16000, databaseAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1000);
        assertEquals(17000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(160, databaseAdmin.payBonus());
    }
}
