import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RobotDogTest {

    RobotDog underTest = new RobotDog("RuffRuff", "description", 30, 20);

    @Test
    public void shouldReturnRobotDogName() {
        String result = underTest.getName();
        assertEquals("RuffRuff", result);


    }
    @Test
    public void shouldReturnRobotDogDescription(){
        String result = underTest.getDescription();
        assertEquals("description", result);
    }
    @Test
    public void shouldReturnRobotDogHappiness(){
        int result = underTest.getHappiness();
        assertEquals(20, result);
    }

    @Test
    public void shouldReturnDogOil(){
        int result = underTest.getOil();
        assertEquals(30,result);
    }

}
