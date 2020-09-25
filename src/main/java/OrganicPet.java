public class OrganicPet extends VirtualPet {
    private int thirst =50;
    private int hunger =50;
    private int waste =80;

    public OrganicPet(String name, String description, int happiness, int thirst, int hunger, int waste) {
        super(name, description, happiness);
        this.hunger = hunger;
        this.thirst = thirst;
        this.waste = waste;
    }


    public int getHunger()
    {
        return hunger;
    }

    public int getThirst()
    {
        return thirst;
    }

    public int getWaste() {
        return waste;


    }

    public void tick() {

        hunger++;
        thirst++;
        waste++;
    }
    public void waste(){
        waste -=4;
    }
}