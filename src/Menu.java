import java.util.Scanner;

public class Menu {

    String[] itemsMenu = {
            "Start game",
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
            }
        }

    }

    public void show(){

        for (int i = 0; i < this.itemsMenu.length; i++) {
            System.out.println(i+1 + ". " + this.itemsMenu[i]);
        }

    }
}
