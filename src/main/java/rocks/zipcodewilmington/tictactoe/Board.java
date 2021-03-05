package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] board;
    private FindWinner w = new FindWinner();

    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public Boolean isInFavorOfX() {
        if (w.determineWinner(board) == 'X') {
            return true;
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        if (w.determineWinner(board) == 'O') {
            return true;
        }
        return false;
    }

    public Boolean isTie() {
        if (w.determineWinner(board) == 'T') {
            return true;
        }
        return false;
    }

    public String getWinner() {
        if (w.determineWinner(board) == 'O') {
            return "O";
        } else if (w.determineWinner(board) == 'X') {
            return "X";
        } else return "";
    }

}
