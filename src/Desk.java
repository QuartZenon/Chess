public class Desk
{

    public byte size = 8;
    public Cell[][] cells = new Cell[this.size][this.size];

    public Desk(){
        String str;
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                this.cells[i][j].name.concat((char) 97 + Integer.toString(i));
            }
        }

    }

    public void newGame(){
        this.show();
    }

    public void show(){
        System.out.println("#################################");
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                for (int k = 0; k < this.cells[i][j].size; k++) {
                    for (int l = 0; l < this.cells[i][j].size; l++) {
                        System.out.print(this.cells[i][j].content);
                    }
                }
            }
        }
        System.out.println("#################################");
    }

}
