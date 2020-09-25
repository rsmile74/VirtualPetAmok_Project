import java.sql.SQLOutput;
import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPetShelter pets = new VirtualPetShelter(30, 80, 80);
        OrganicDog Spike = new OrganicDog("Spike     ", "playful    ", 30, 50, 50, 80);
        OrganicCat Kitty = new OrganicCat("Kitty    ", "loves to cuddle    ", 30, 50, 50, 80);
        RobotDog RuffRuff = new RobotDog("RuffRuff    ", "needs oil often   ", 30, 40);
        RobotCat kitcat = new RobotCat("kitcat    ", "high maintenance    ", 30, 40);

        pets.add(Spike);
        pets.add(Kitty);
        pets.add(RuffRuff);
        pets.add(kitcat);
        System.out.println("Once again here are the stats of our pets, they seem pretty happy so far but we really need to make them happier");
        pets.showAllPets();


        System.out.println("Welcome Back to Rho's Pet Shelter. We have more pets that have joined our shelter there is Organic and Robotic");
        System.out.println("There are new options to pick from today pick what you would like to do 1-5 and 6 will be to quit the game");

        System.out.println("1. Feed the pets");
        System.out.println("2. Give the pets water");
        System.out.println("3. Clean the Litterbox");
        System.out.println("4. Clean the dog cage");
        System.out.println("5. oil the virtual pet");
        System.out.println("6. Take the dogs for a walk");
        System.out.println("7. Quit the game");
        String UserEntered = input.nextLine();


        if (UserEntered.equals("1")) {
            System.out.println("Which pet would you like to feed today you have your choice between Spike and Kitty");
            String name = input.nextLine();
            System.out.println(name + " is a great pet");
        } else if (UserEntered.equals("2")) {
            System.out.println("Which pet you want to give water to today Spike or Kitty they are both great pets.");
            String name = input.nextLine();
            System.out.println(name + " That's great this pet really needs water after eating");

        }
        if (UserEntered.equals("3")) {
            System.out.println("Are you ready to clean the litterbox lets's check the stats for the waste " + pets.getLitterBox());
            System.out.println("Yes or No");
            String newDecision = input.nextLine();
            if (newDecision.equalsIgnoreCase("Yes")) {
                pets.getLitterBox();
                System.out.println("Wow that litter box is a mess.");
                System.out.println("Thank you.\n");
            } else if (newDecision.equalsIgnoreCase("No")) {
                System.out.println("Really you are not going to clean the litter box..yuuk!!!");
                System.out.println("but it is getting really full...\n");
            }

        } else if (UserEntered.equals("4")) {
            System.out.println("Are you ready to clean dog's cage lets's check the stats for the waste " + pets.getCleanCage());
            System.out.println("Yes or No");
            String newDecision = input.nextLine();
            if (newDecision.equalsIgnoreCase("Yes")) {
                pets.getCleanCage();
                System.out.println("Wow that Cage is a mess.");
                System.out.println("Thank you.\n");
            } else if (newDecision.equalsIgnoreCase("No")) {
                System.out.println("Really you are not going to clean the cage..yuuk!!!");
                System.out.println("but it is really messy!!!!...\n");
            }

        } else if (UserEntered.equals("5")) {
            pets.oilRobotPet();
            System.out.println("Would you like to oil the pets today, we really need to keep them maintenance lets check the stats. " + pets.getOil());
            System.out.println("Yes or No");
            String newDecision = input.nextLine();
            if (newDecision.equalsIgnoreCase("Yes")) {
                pets.getOil();
                System.out.println("Thanks the virtual pets need oil to keep running.");
                System.out.println("Thank you.\n");
            } else if (newDecision.equalsIgnoreCase("No")) {
                System.out.println("Really you gonna break the robots!!");
                System.out.println("That could be an expensive job!!!!...\n");
            }
        } else if (UserEntered.equals("6")) {
            System.out.println("Thanks for walking the dogs today that is a big help.");
        } else if (UserEntered.equals("7")) {
            System.out.println("Thanks for playing!!!");


//
        }
    }
}







