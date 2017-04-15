public class Figure {
    public Object set(String name, String color) {
        switch (name.toLowerCase()){
            case "pawn":
                return new Pawn(color);
            case "Rook":
                return new Rook(color);
            case "Knight":
                return new Knight(color);
            case "Bishop":
                return new Bishop(color);
            case "King":
                return new King(color);
            case "Queen":
                return new Queen(color);
        }
        return new NoneFigure();

    }
}
