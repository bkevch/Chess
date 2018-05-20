import java.awt.Color;

public class Tile {

    final int num;
    Piece piece;
    Color color;
    public Tile(int num, Color c) {
        this.num = num;
        this.color = c;
    }

    public void clearPiece() {
        this.piece = null;
    }

    public String getCoord() {
        return null;
    }
}
