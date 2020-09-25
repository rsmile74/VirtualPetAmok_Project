public class RobotCat extends RobotPet {
    private String name;
    private String description;
    private int oil=30;
    private int happiness=30;


    public RobotCat(String name, String description, int oil, int happiness) {
        super(name, description,oil,happiness);
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
