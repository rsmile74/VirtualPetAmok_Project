import org.junit.Test;



import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class VirtualPetShelterTest {
  VirtualPetShelter underTest;
    VirtualPet pet1 = new OrganicDog("Spike","playful",30, 20,50 ,20);
    VirtualPet pet2 = new RobotCat("kitcat", "description", 30, 20 );




    @Test
    public void shouldOilAllRobotPets(){
        VirtualPetShelter underTest = new VirtualPetShelter(50 , 50 , 50);
        int result = underTest.getOil();
        assertEquals(50, result);
    }
    @Test
    public void shouldCleanDogCages(){
        VirtualPetShelter underTest = new VirtualPetShelter(50 , 50 , 50);
        int result = underTest.getCleanCage();
        assertEquals(50,result);
    }

    @Test
    public void shouldCleanLitterBox(){
        VirtualPetShelter underTest = new VirtualPetShelter(50 , 50 , 50);
        int result = underTest.getLitterBox();
        assertEquals(50,result);
    }

    @Test
    public void shouldBeAbleToAddAllPets(){
        VirtualPetShelter underTest = new VirtualPetShelter(50 , 50 , 50);
        underTest.add(pet1);
        VirtualPet retrievePet = underTest.findPet("Spike");
        assertEquals(retrievePet, pet1);
    }
    @Test
    public void shouldBeAbleToAddTwoPets(){
        VirtualPetShelter underTest = new VirtualPetShelter(50 , 50 , 50);
        underTest.add(pet1);
        underTest.add(pet2);
        Collection<VirtualPet> allPets = underTest.getAllPets();
        assertEquals(2,allPets.size());


    }


}
