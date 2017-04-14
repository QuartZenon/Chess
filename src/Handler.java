public class Handler {

    public String lastInput;

    public boolean input(String str, String location){

        this.lastInput = str.toLowerCase();

        if((str.toLowerCase().equals("help")) || (str.equals("?"))) {

            this.help();
            return false;

        }

        if(location=="menu") {

            Menu menu = new Menu();

            try {

                if ((menu.itemsMenu.length >= Integer.parseInt(str))
                        && (Integer.parseInt(str) >= 1)) {
                    return true;
                } else {
                    return false;
                }

            } catch (NumberFormatException e) {

                return false;

            }

        }

        return false;
    }

    public void help(){

        System.out.println("Escape - input \"quit\"");
        System.out.println("Menu - input \"menu\"");
        System.out.println("Save game - input \"save\"");

    }
}
