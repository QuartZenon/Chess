public class Desk
{

    public byte size = 8;
    public Cell[][] cells = new Cell[this.size][this.size];

    public Desk(){

        String str;
        for (int i = 1; i < this.size-1; i++) {
            for (int j = 0; j < this.size; j++) {
                switch (i) {
                    case 1:
                        this.cells[i][j].figure = new Pawn("black");
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        this.cells[i][j].figure = new NoneFigure();
                        break;
                    case 6:
                        this.cells[i][j].figure = new Pawn("white");
                        break;
                }
                this.cells[i][j].name = (char) (97+i) + Integer.toString(j+1);
            }
        }

        this.cells[0][0].figure = new Rook("black");
        this.cells[0][1].figure = new Knight("black");
        this.cells[0][2].figure = new Bishop("black");
        this.cells[0][3].figure = new King("black");
        this.cells[0][4].figure = new Queen("black");
        this.cells[0][5].figure = new Bishop("black");
        this.cells[0][6].figure = new Knight("black");
        this.cells[0][7].figure = new Rook("black");
        this.cells[7][0].figure = new Rook("white");
        this.cells[7][1].figure = new Knight("white");
        this.cells[7][2].figure = new Bishop("white");
        this.cells[7][3].figure = new Queen("white");
        this.cells[7][4].figure = new King("white");
        this.cells[7][5].figure = new Bishop("white");
        this.cells[7][6].figure = new Knight("white");
        this.cells[7][7].figure = new Rook("white");

    }

    public void newGame(){
        this.show();
    }

    public void show(){
        System.out.println("#################################");
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                System.out.print(this.cells[i][j].figure());
            }
            System.out.println();
        }
        System.out.println("#################################");
    }

}
