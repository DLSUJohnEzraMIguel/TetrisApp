package ph.edu.dlsu.lbycpob.tetris.model.pieces;

public class SinglePiece extends TetrominoBase {

    public SinglePiece() {
        super(
                new int[][][]{
                        // State 0 (Only 1 rotation needed for a 1x1 block)
                        {
                                {1}
                        }
                },
                TetrominoColor.PINK // Choose any color available in TetrominoColor
        );
    }

    public SinglePiece(int[][][] shapes, TetrominoColor color) {
        super(shapes, color);
    }
}