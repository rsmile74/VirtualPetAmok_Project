import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RobotPetTest {
    RobotPet underTest = new RobotPet("robotpet","description",50, 20);

    @Test
    public void shouldReturnRobotPetName(){
        String result = underTest.getName();
        assertEquals("robotpet", result);

    }
    @Test
    public void shouldReturnRobotPetDescription(){
        String result = underTest.getDescription();
        assertEquals("description",result);
    }

    @Test
    public void shouldReturnRobotHappiness(){
        int result = underTest.getHappiness();
        assertEquals(20, result);
    }

    @Test
    public void shouldReturnPetOil(){
        int result = underTest.getOil();
        assertEquals(50, result);

    }


}
