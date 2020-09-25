public class VirtualPet {
    private String name;
    private String description;
    private int happiness = 20;


    public VirtualPet(String name, String description, int happiness) {
        this.name = name;
        this.description = description;
        this.happiness = happiness;

    }


    public void tick() {

        happiness--;


    }


    public String getPetName() {
        return name;

    }

    public String getDescription() {
        return description;
    }


    public int getHappiness() {
        return happiness;

    }


    public void happy() {
        happiness -= 5;
    }


    public String getShelterPet() {
        return name;
    }


    public void oil() {


    }


}

