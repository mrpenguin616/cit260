package veiw;

import java.util.Scanner;

/**
 * Created by mrpenguin616 on 6/19/15.
 */
public abstract class View implements ViewInterface{

    private String promptMessage;

    public View(String promptMessage){
        this.promptMessage = promptMessage;
    }


    public void display(){
        boolean done = false;
        String input = "";
        do {
            System.out.printf(this.promptMessage);
            input = this.getInput().trim();
            done = this.doAction(input);
        }while(!done);
    }

    public String getInput() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return input.trim();
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }
}
