import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrganicDogTest {


    OrganicDog underTest = new OrganicDog("Spike", "description", 20, 50, 50, 50);

    @Test
    public void shouldReturnDogHunger(){
        int result = underTest.getHunger();
        assertEquals(50,result);

    }

    @Test
    public void shouldReturnDogThirst(){
        int result = underTest.getThirst();
        assertEquals(50, result);
    }
    @Test
    public void shouldReturnDogWasteInCage(){
        int result = underTest.getWaste();
        assertEquals(50,result);
    }

    @Test
    public void shouldReturnDogHappiness(){
        int result = underTest.getHappiness();
        assertEquals(20,result);
    }
    @Test
    public void shouldWalkDog(){
        String result = underTest.getDogWalk();
        assertEquals(null,result);
    }
}
