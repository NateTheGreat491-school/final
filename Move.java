// File:    Stratego Move Class
// Devs:    Nathan W. Barros;
// Origin:  2026-10-30 14:41:21
// Edited:  2026-10-30 14:41:24

class Move {
                                                                                                                                                              
    public static final int   ROW_COUNT      = 10;
    public static final int   COLUMN_COUNT   = 10;
    public static final int   CELL_COUNT     = 100;
    public static final int[] INACTIVE_CELLS = {42, 43, 46, 47, 52, 53, 56, 57};

    public record Update(int cell1, int cell2) {}
    public static enum CellType {
        EMPTY, SPY, SCOUT, MINER, SERGaNT, LIEUTENANT,
        CAPTAIN, MAJOR, COLONEL, GENERAL, MARSHAL, BOMB, FLAG
    }
    
    /*
    moveBtn.execute = tryMove();
    
    Move.Update playerMove = new Move.Update(this.startValue, this.endValue);
    update = Move.getMoveResult(playerMove);
    updateBoard(update);

    private void updateBoard(Move.Update update) {
        this.board[ this.startCell ] = update.cell1;
        this.board[ this.endCell   ] = update.cell2;
    }

    */

    /* Returns new values for start and end Values*/
    public static Update playMove(Update playerMove) throws IllegalArgumentException {

        // Check arguments
        
        CellType piece1 = playerMove.cell1;
        CellType piece2 = playerMove.cell2;



        // Check arguments
        if (playerMove.cell1 == playerMove.cell2) {
            throw new IllegalArgumentException("WARNING> startCell cannot equal endCell!");
        } else if (startCell < 0 || startCell > CELL_COUNT) {
            throw new IllegalArgumentException("WARNING> startCell is less than 0 or greater than Move.CELL_COUNT!");
        } else if (endCell < 0 || endCell > CELL_COUNT) {
            throw new IllegalArgumentException("WARNING> endCell is less than 0 or greater than Move.CELL_COUNT!");
        }

        // get pieces on cell
        CellType piece1 = gameBoard[startCell];
        CellType piece2 = gameBoard[endCell];

        // Since every move only involves 2 cells A,B
        // we can simply return the updated values for
        // A,B instead of passing the entire gameState
        // back and forth.

        // Check cells
        if (piece1 == CELL_TYPE.EMPTY.ordinal()) {
            return
        }

        // Check to see if start cell is empty

        return gameBoard;
    }



}

// EOF  
