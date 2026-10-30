// File:    Stratego Move Class
// Devs:    Nathan W. Barros;
// Origin:  2026-10-30 14:41:21
// Edited:  2026-10-30 14:41:24

class Move {
                                                                                                                                                              
    public final int   ROW_COUNT      = 10;
    public final int   COLUMN_COUNT   = 10;
    public final int   CELL_COUNT     = 100;
    public final int[] INACTIVE_CELLS = [42, 43, 46, 47, 52, 53, 56, 57];

    public final enum CELL_TYPE {
        EMPTY(0),
        SPY(1),
        SCOUT(2),
        MINER(3),
        SERGENT(4),
        LIEUTENANT(5),
        CAPTAIN(6),
        MAJOR(7),
        COLONEL()
        BOMB(-1),

        private final int value;

        CELL_TYPE(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public static int[] playMove(int startCell, int endCell, int[] gameBoard) throws IllegalArgumentException {

        // Check arguments
        if (startCell == endCell) {
            throw IllegalArgumentException("WARNING> startCell cannot equal endCell!");
        } else if (startCell < 0 || startCell > CELL_COUNT) {
            return IllegalArgumentException("WARNING> startCell is less than 0 or greater than Move.CELL_COUNT!");
        } else if (endCell < 0 || endCell > CELL_COUNT) {
            return IllegalArgumentException("WARNING> endCell is less than 0 or greater than Move.CELL_COUNT!");
        }

        // get pieces on cell
        int piece1 = gameBoard[startCell];
        int piece2 = gameBoard[endCell];

        // Check cells
        if (piece1 == Pieces.type.EMPTY) {

        }

        // Check to see if start cell is empty

        return gameBoard;
    }



}

// EOF  
