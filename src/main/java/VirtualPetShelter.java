import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    private int oil = 30;
    private int cage = 80;
    private int litterbox = 80;

    public VirtualPetShelter(int oil, int cage, int litterbox) {
        this.oil = oil;
        this.cage = cage;
        this.litterbox = litterbox;
    }

    public int getOil() {
        return oil;
    }

    public int getCleanCage() {
        return cage;
    }

    public int getLitterBox() {
        return litterbox;
    }

    public void tick() {

        oil--;
        cage++;
        litterbox++;
    }

    Map<String, VirtualPet> pets = new HashMap<>();

    public void add(VirtualPet newPetToAdd) {
        pets.put(newPetToAdd.getPetName(), newPetToAdd);


    }

    public VirtualPet findPet(String name) {
        return pets.get(name);
    }

    public Collection<VirtualPet> getAllPets() {
        return pets.values();
    }

    public void showAllPets() {
        for (VirtualPet pet : pets.values()) {
            System.out.println(pet.getPetName() + pet.getDescription()  + pet.getHappiness());

            }


        }




    public void oilRobotPet (){
        for (VirtualPet pet : pets.values()){
            pet.oil();
        }
    }
}










