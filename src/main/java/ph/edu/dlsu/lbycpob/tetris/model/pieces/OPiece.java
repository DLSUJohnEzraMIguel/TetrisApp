package ph.edu.dlsu.lbycpob.tetris.model.pieces;

public class OPiece extends TetrominoBase {

    public OPiece() {
        super(
                new int[][][] {
                        { {1, 1}, {1, 1} }
                },
                TetrominoColor.YELLOW
        );
    }

    public OPiece(int[][][] shapes, TetrominoColor color) {
        super(shapes, color);
    }
}