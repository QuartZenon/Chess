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

        Figure figure = new Figure();

        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                this.cells[i][j].content = new NoneFigure();
                if(i == 1)
                    this.cells[i][j].content = figure.set("pawn", "black");
                else if(i == 6)
                    this.cells[i][j].content = figure.set("pawn", "white");
            }
        }

        this.cells[0][0].content = figure.set("rook", "black");
        this.cells[0][1].content = figure.set("Knight", "black");
        this.cells[0][2].content = figure.set("Bishop", "black");
        this.cells[0][3].content = figure.set("King", "black");
        this.cells[0][4].content = figure.set("Queen", "black");
        this.cells[0][5].content = figure.set("Bishop", "black");
        this.cells[0][6].content = figure.set("Knight", "black");
        this.cells[0][7].content = figure.set("Rook", "black");
        this.cells[7][0].content = figure.set("Rook", "white");
        this.cells[7][1].content = figure.set("Knight", "white");
        this.cells[7][2].content = figure.set("Bishop", "white");
        this.cells[7][3].content = figure.set("Queen", "white");
        this.cells[7][4].content = figure.set("King", "white");
        this.cells[7][5].content = figure.set("Bishop", "white");
        this.cells[7][6].content = figure.set("Knight", "white");
        this.cells[7][7].content = figure.set("Rook", "white");
        this.show();
    }

    public void show(){
        System.out.println("#################################");
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                System.out.print(this.cells[i][j].content.symbol);
            }
            System.out.println();
        }
        System.out.println("#################################");
    }

}
