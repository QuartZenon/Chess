import java.util.Scanner;

public class Menu {

    String[] itemsMenu = {
            "Start new game",
            "Continue",
            "Exit",
    };

    public void starting(){

        Scanner in = new Scanner(System.in);
        Handler mind = new Handler();

        this.show();
        while(true){
            System.out.print(">>> ");
            if ((mind.input(in.next(), "menu"))&&(Integer.parseInt(mind.lastInput) >= 1)
                    && (Integer.parseInt(mind.lastInput) <= this.itemsMenu.length)) {
                break;
            }else{
                System.out.println("Try again!");
                System.out.print(">>> ");
            }
        }

        switch (mind.lastInput){
            case "1":
                this.startGame();
                break;
            case "2":
                this.continueGame();
                break;
            case "3":
                this.exit();
                break;
        }

    }

    public void show(){

        for (int i = 0; i < this.itemsMenu.length; i++) {
            System.out.println(i+1 + ". " + this.itemsMenu[i]);
        }

    }

    public void startGame(){
        Desk desk = new Desk();
        desk.newGame();
    }

    public void continueGame(){

    }

    public void exit(){
        System.out.println("Goodbye!");
        exit();
    }
}
