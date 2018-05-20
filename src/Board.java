import java.awt.*;

public class Board {
    Tile[][] b = new Tile[8][8];// 0th row and column empty

    void initializeColors() {
        int num = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    b[i][j] = new Tile(num++, Color.black);
                } else {
                    b[i][j] = new Tile(num++, Color.white);
                }
            }
        }
    }

    static void initializePieces() {

    }

}
