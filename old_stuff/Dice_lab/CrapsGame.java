// Implements the game of Craps logic

public class CrapsGame
{
  private int point = 0;

  /**
   *  Calculates the result of the next dice roll in the Craps game.
   *  The parameter total is the sum of dots on two dice.
   *  point is set to the saved total, if the game continues,
   *  or 0, if the game has ended.
   *  Returns 1 if player won, -1 if player lost,
   *  0 if player continues rolling.
   */
  public int processRoll(int total) {
    int result = 0;
    switch(total){
      case 7:
        if(point == 0){
          result = 1;
        } else{
          result = -1;
        } break;
      case 11:
        if(point == 0){
          result = 1;
        } break;
      case 2: case 3: case 12:
        if(point == 0){
          result = -1;
        } break;
      case 4: case 5: case 6: case 8: case 9: case 10:
        if(point == 0) {
          point = total;
        } else if(total == point){
          result = 1;
        } break;
      default:
        result = -1; break;
    }
    if(result == 1 || result == -1){
      point = 0;
    }
    return result;
  }

  /**
   *  Returns the saved point
   */
  public int getPoint()
  {
    return point;
  }
}

