package ph.edu.dlsu.lbycpob.tetris.model.pieces;


public abstract class TetrominoBase {

    // INSTANCE VARIABLES (Properties of each piece)


    protected int x, y;


    protected int currentRotation = 0;


    protected final int[][][] shapes;


    protected final TetrominoColor color;

    // === CONSTRUCTOR ===


    public TetrominoBase(int[][][] shapes, TetrominoColor color) {
        this.shapes = shapes;
        this.color = color;
        this.x = 0;
        this.y = 0;
    }

    // Getters (Allow other classes to read our private data)
    public int getX() { return x; }
    public int getY() { return y; }
    public TetrominoColor getColor() { return color; }
    public int getCurrentRotation() { return currentRotation; }


    public int[][] getCurrentShape() {
        return shapes[currentRotation];
    }

    // Movement methods (Allow the piece to be moved around)

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public void moveLeft() { x--; }


    public void moveRight() { x++; }


    public void moveDown() { y++; }

    // === ROTATION METHODS ===


    public void rotate() {
        currentRotation = (currentRotation + 1) % shapes.length;
    }


    public void rotateBack() {
        currentRotation = (currentRotation - 1 + shapes.length) % shapes.length;
    }
}

