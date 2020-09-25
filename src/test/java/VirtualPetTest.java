import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VirtualPetTest {
    VirtualPet underTest = new VirtualPet("spike", "description", 20);

    @Test
    public void shouldBeNameofPetAndDescription() {

        String result = underTest.getPetName();
        assertEquals("spike", result);
    }

    @Test
    public void shouldReturnPetDescription() {

        String result = underTest.getDescription();
        assertEquals("description", result);
    }


    @Test
    public void shouldReturnHappiness() {

        int result = underTest.getHappiness();
        assertEquals(20, result);


    }


}

