public class RobotPet extends VirtualPet{
    private String name;
    private String description;
    private int oil;
    private int happiness;

    public RobotPet(String name, String description, int oil, int happiness) {
        super(name, description, happiness);
        this.name = name;
        this.description = description;
        this.oil = oil;
        this.happiness = happiness;
    }

    public void tick() {
        happiness--;
        oil++;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getOil() {
        return oil;
    }


    public void happy() {
        happiness += 5;
    }
    public void oil(){
        oil -=4;
    }
}
