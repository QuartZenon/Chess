public class Cell {

    public byte size = 3;
    public char[][] content = new char[this.size][this.size];
    public String name;

    public Cell(){
        boolean occupied = false;
        Figure subject;

        for (int i = 0; i < this.content.length; i++) {
            for (int j = 0; j < this.content.length; j++) {
                this.content[i][j] = ' ';
            }
        }

        this.content[1][1] = 'i';

    }

}
