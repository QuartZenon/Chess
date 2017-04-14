public class Desk
{

    public byte size = 8;
    public Cell[][] cells = new Cell[8][8];

    public Desk(){

        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                this.cells[i][j].name = (char) 97 + "" + i;
            }
        }

    }

    public void newGame(){

    }

    public void show(){

    }

}
