### TODO & NOTES

## Notes
1. The Stratego class initalizes the game.
2. The game state is an array of 100 integers -2 to 10.
3. The Gui recieves the game state as input.
4. The Gui records the users move as 2 integers (firstCell: piece, secondCell: location)
5. The Gui returns the move to the Stratego class.
6. The Stratego sends the move and gamestate to Move class.
7. Move returns T/F and updates the gamestate acoordingly
8. If True: checkForWin()
9. Gui renders the gamestate

## GUI CLASS

__Example__:
```
class Gui {
    
    public int[] renderBoard(int[] gameState) {}
    public int[] selectConfig() {}                  // when the user goes to select a configuration
    public int[] playMove(int[] move) {}

    // renderBoard runs the game board
    // playMove calls the [Move] class to perform the move

}
```

## MOVE CLASS

## STRATEGO CLASS

## PLAYER CLASS
1. Handles player piece configurations (saving and loading from a file)
2. Handles player stats (wins, losses, draws, games played, win rate %)
3. Handles user logon info (username, password, etc)

```

class Player {
    
    public int[] getConfig(String name) {}
    public int[] getRandomConfig() {}

}

```

## Pieces
*  0 | EMPTY
*  1 | Spy
*  2 | Scout
*  3 | Miner
*  4 | Sergent
*  5 | Lieutenant
*  6 | Captain
*  7 | Major
*  8 | Colonel
*  9 | General
* 10 | Marshall
* 11 | Bomb
* 12 | Flag

## To-do list

