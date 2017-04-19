public class Cell {

    public String name;
    public Object figure = new NoneFigure();
    public boolean occupied = false;

    public char figure(){
        if (this.figure != null) {
            return this.figure.symbol;
        } else
            return ' ';
    }


}
