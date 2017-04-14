public class Cell {

    public String name = new String();
    public byte size = 3;
    public char[][] content = new char[this.size][this.size];

    public Cell(){
        this.name = "";
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
