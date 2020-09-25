public class OrganicDog extends OrganicPet implements Walk {
    private String dogwalk;


    public OrganicDog(String name, String description, int happiness, int thirst, int hunger, int waste) {
        super(name, description, happiness, thirst, hunger, waste);

    }

    public String getDogWalk() {
        return dogwalk;
    }

    @Override
    public void dogWalk() {
        
    }
}
