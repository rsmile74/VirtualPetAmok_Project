import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RobotCatTest {

    RobotCat underTest = new RobotCat("kitcat", "description", 30, 20); //global

    @Test
    public void shouldReturnRobotCatName() {
        String result = underTest.getName();
        assertEquals("kitcat", result);
    }
    @Test
    public void shouldReturnRobotCatDescription(){
        String result = underTest.getDescription();
        assertEquals("description",result);

    }
    @Test
    public void shouldReturnRobotCatHappiness(){
        int result = underTest.getHappiness();
        assertEquals(20,result);
    }
    @Test
    public void shouldReturnOil(){
        int result = underTest.getOil();
        assertEquals(30,result);

    }
}



