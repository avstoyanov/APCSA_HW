public class Checkerboard {
    public void fillCheckerboard(char[][] board){
        int count = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){

                board[i][j] = count%2 == 0 ? 'X' : 'O';
                count++;
            }
            if(board[i].length%2 == 0){
                count--;
            }
        }
    }

    public static void main(String[] args) {
        char[][] board = new char[4][7];
        Checkerboard checkerboard = new Checkerboard();
        checkerboard.fillCheckerboard(board);
        for(char[] i: board){
            for(char j: i){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
