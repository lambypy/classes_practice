import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Spaceship Rocinante = new Spaceship();
        System.out.println(Rocinante);
        Rocinante.setAllegance("Space Yugoslavia");
        Rocinante.setName("Rocinante");
        Rocinante.setArmaments(Armaments.HEAVILY_ARMED);
        Rocinante.setNumOfCrew(115);
        Rocinante.setHyperdriveActive(true);
        Rocinante.setOwner("Dan");

        System.out.println(Rocinante.getName() + " belongs to " + Rocinante.getAllegance() + ".");
        user_request();
    }


    public static void user_request(){
        /*Takes requests from the user on spaceship information*/

        System.out.println("Ask about details of the spaceship");
        Scanner userRequestScanner = new Scanner(System.in);
        String userRequest = userRequestScanner.nextLine();
        System.out.println(userRequest);

    }
}