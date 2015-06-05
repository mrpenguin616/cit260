package veiw;

import java.util.Scanner;

/**
 * Created by mrpenguin616 on 6/4/15.
 */
public class MainMenuView {
    private final String MENU = "This is the menu";

    public MainMenuView() {
    }

    public void displayMainMenu(){
        char input = ' ';
        do {
            System.out.println(MENU);
            String fullInput = this.getInput();
            input = fullInput.charAt(0);
        }while(input != 'E' || input != 'e');
    }

    private String getInput() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return input.trim();
    }
}
