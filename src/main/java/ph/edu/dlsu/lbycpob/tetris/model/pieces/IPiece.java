package ph.edu.dlsu.lbycpob.tetris.model.pieces;

public class IPiece extends TetrominoBase {

    public IPiece() {
        super(
                new int[][][] {
                        { // Rotation 0
                                {0, 0, 0, 0},
                                {1, 1, 1, 1},
                                {0, 0, 0, 0},
                                {0, 0, 0, 0}
                        },
                        { // Rotation 1
                                {0, 0, 1, 0},
                                {0, 0, 1, 0},
                                {0, 0, 1, 0},
                                {0, 0, 1, 0}
                        },
                        { // Rotation 2
                                {0, 0, 0, 0},
                                {0, 0, 0, 0},
                                {1, 1, 1, 1},
                                {0, 0, 0, 0}
                        },
                        { // Rotation 3
                                {0, 1, 0, 0},
                                {0, 1, 0, 0},
                                {0, 1, 0, 0},
                                {0, 1, 0, 0}
                        }
                },
                TetrominoColor.CYAN
        );
    }


    public IPiece(int[][][] shapes, TetrominoColor color) {
        super(shapes, color);
    }
}