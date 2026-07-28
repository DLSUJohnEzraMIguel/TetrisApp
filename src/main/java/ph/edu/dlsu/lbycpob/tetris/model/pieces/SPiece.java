package ph.edu.dlsu.lbycpob.tetris.model.pieces;

public class SPiece extends TetrominoBase {

    public SPiece() {
        super(
                new int[][][] {
                        { {0, 1, 1}, {1, 1, 0}, {0, 0, 0} },
                        { {0, 1, 0}, {0, 1, 1}, {0, 0, 1} },
                        { {0, 0, 0}, {0, 1, 1}, {1, 1, 0} },
                        { {1, 0, 0}, {1, 1, 0}, {0, 1, 0} }
                },
                TetrominoColor.GREEN
        );
    }

    public SPiece(int[][][] shapes, TetrominoColor color) {
        super(shapes, color);
    }
}