import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Joe Bloggs", "NI123456H", 16000, "Training", 200000.0);
    }

    @Test
    public void canGetName(){
        assertEquals("Joe Bloggs", director.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("NI123456H", director.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(16000, director.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1000);
        assertEquals(17000, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(160, director.payBonus());
    }

    @Test
    public void getDeptName(){
        assertEquals("Training", director.getDeptName());
    }

    @Test
    public void getBudget(){
        assertEquals(200000.0, director.getBudget(), 0.01);
    }

}
