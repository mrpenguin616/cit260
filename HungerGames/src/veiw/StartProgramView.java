package veiw;

import model.Owner;

import java.util.Scanner;

/**
 * Created by mrpenguin616 on 6/4/15.
 */
public class StartProgramView {
    public StartProgramView(){

    }

    public void startProgram(){
        this.displayBanner();
    }

    public void displayBanner(){
        System.out.println("########################");
        System.out.println("####  Hunger Games #####");
        System.out.println("########################");
    }

    public String getPlayerName(){
        Boolean valid = false;
        String name = null;
        Scanner scan = new Scanner(System.in);
        while (!valid){
            // prompt for name
            System.out.println("Enter your desired name: ");

            // grab name
            name = scan.nextLine();
            name = name.trim();

            // validity checks
            if(name.length() < 2){
                System.out.println(" error - Name must be longer than 1 character");
                // restart the loop
                continue;
            }
            // exit the loop
            break;
        }
        return name;
    }


    public void displayWelcomeMessage(Owner owner) {
        System.out.printf("Welcome to the Hunger Games %s%n", owner.getName());
    }
}
