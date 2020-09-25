import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrganicCatTest {

    OrganicCat underTest = new OrganicCat("Kitty", "description", 20, 50, 50, 80); //this is global


    @Test
    public void shouldReturnCatHunger() {
        int result = underTest.getHunger();
        assertEquals(50, result);

    }

    @Test
    public void shouldReturnCatThirst() {
        int result = underTest.getThirst();
        assertEquals(50, result);
    }

    @Test
    public void shouldReturnCatWasteLitterBox(){
        int result = underTest.getWaste();
        assertEquals(80,result);

    }
    @Test
    public void shouldReturnCatHappiness(){
        int result = underTest.getHappiness();
        assertEquals(20, result);

    }






}
