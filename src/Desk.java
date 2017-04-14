public class Desk
{

    public byte size = 8;
    public Cell[][] cells = new Cell[this.size][this.size];

    public Desk(){

        String str;
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                cells[i][j] = new Cell();
                this.cells[i][j].name = (char) (97+i) + Integer.toString(j+1);
            }
        }

    }

    public void newGame(){

        Pawn pawn;
        Rook rook;
        King king;
        Queen queen;
        Knight knight;

        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                if(i == 1)
                    this.cells[i][j].subject = new Pawn("black");
                else if(i == 6)
                    this.cells[i][j].subject = new Pawn("white");
                else this.cells[i][j].subject = new NoneFigure();
            }
        }
        this.cells[0][0].subject = new Rook("black");
        this.cells[0][1].subject = new Knight("black");
        this.cells[0][2].subject = new Bishop("black");
        this.cells[0][3].subject = new King("black");
        this.cells[0][4].subject = new Queen("black");
        this.cells[0][5].subject = new Bishop("black");
        this.cells[0][6].subject = new Knight("black");
        this.cells[0][7].subject = new Rook("black");
        this.cells[7][0].subject = new Rook("white");
        this.cells[7][1].subject = new Knight("white");
        this.cells[7][2].subject = new Bishop("white");
        this.cells[7][3].subject = new Queen("white");
        this.cells[7][4].subject = new King("white");
        this.cells[7][5].subject = new Bishop("white");
        this.cells[7][6].subject = new Knight("white");
        this.cells[7][7].subject = new Rook("white");
        this.show();
    }

    public void show(){
        System.out.println("#################################");
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                System.out.print(this.cells[i][j].subject.symbol);
            }
            System.out.println();
        }
        System.out.println("#################################");
    }

}
