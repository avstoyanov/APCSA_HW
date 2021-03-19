import java.util.Scanner;
public class TicTacToe {
    private static char[][] board;
    private static Scanner scan = new Scanner(System.in);
    private static int turn = 0;
    private static char[] players = {'X', 'O'};
    private static char winner = 'n';

    public static void init_matrix(){
        board = new char[][] {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        winner = 'n';
        turn = 0;
    }

    public static void disp_matrix(){
        System.out.println(" "+board[0][0]+" | "+board[0][1]+" | "+board[0][2]+" ");
        System.out.println("---|---|---");
        System.out.println(" "+board[1][0]+" | "+board[1][1]+" | "+board[1][2]+" ");
        System.out.println("---|---|---");
        System.out.println(" "+board[2][0]+" | "+board[2][1]+" | "+board[2][2]+" ");
    }

    public static void get_playerX_move(){
        System.out.println("Enter player X's turn as a number from 1-9, top left to bottom right");
        int move = scan.nextInt();
        move--;
        scan.nextLine();
        if(board[move/3][move%3] == players[0] || board[move/3][move%3] == players[1]){
            System.out.println("invalid move");
        } else{
            board[move/3][move%3] = players[0];
            turn++;
        }
    }

    public static void get_playerO_move(){
        System.out.println("Enter player O's turn as a number from 1-9, top left to bottom right");
        int move = scan.nextInt();
        move--;
        scan.nextLine();
        if(board[move/3][move%3] == players[0] || board[move/3][move%3] == players[1]){
            System.out.println("invalid move");
        } else{
            board[move/3][move%3] = players[1];
            turn++;
        }
    }

    public static char check(){
        if((board[1][1] == 'X'||board[1][1] == 'O')){
            if(board[0][0] == board[1][1] && board[1][1] == board[2][2]){
                return turn % 2 == 1 ? 'X' : 'O';
            } else if(board[0][2] == board[1][1] && board[1][1] == board[2][0]){
                return turn % 2 == 1 ? 'X' : 'O';
            }
        } else {
            for (int i = 0; i < 3; i++) {
                if ((board[i][i] == 'X' || board[i][i] == 'O')){
                    if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                        return turn % 2 == 1 ? 'X' : 'O';
                    } else if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                        return turn % 2 == 1 ? 'X' : 'O';
                    }
                }
            }
        }
        return 'n';
    }


    public static void play(){
        init_matrix();
        disp_matrix();
        while(winner == 'n'){
            if (turn % 2 == 0) {
                get_playerX_move();
            } else {
                get_playerO_move();
            }
            winner = check();
            disp_matrix();
        }
        if(winner == 'X'){
            System.out.println("Player X wins!");
        } else{
            System.out.println("Player O wins!");
        }
    }


    public static void main(String[] args) {
        TicTacToe.play();
    }
}
