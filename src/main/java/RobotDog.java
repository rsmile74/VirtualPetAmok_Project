public class RobotDog extends RobotPet {
    private String name;
    private String description;
    private int oil;
    private int happiness;

    public RobotDog(String name, String description, int oil, int happiness) {
        super(name,description,oil, happiness);
        this.name = name;
        this.description = description;
        this.oil = oil;
        this.happiness = happiness;
    }




    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getOil() {
        return oil;
    }
    public void oil(){
        oil -=4;
    }
}
