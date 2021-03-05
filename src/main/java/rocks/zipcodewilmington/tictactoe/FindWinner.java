package rocks.zipcodewilmington.tictactoe;

public class FindWinner {

    public char determineWinner(Character[][] board) {
        if (this.checkRows(board) == 'X'
                || this.checkColumns(board) == 'X'
                || this.checkLeftDiagonal(board) == 'X'
                || this.checkRightDiagonal(board) == 'X') {
            return 'X';
        } else if (this.checkRows(board) == 'O'
                || this.checkColumns(board) == 'O'
                || this.checkLeftDiagonal(board) == 'O'
                || this.checkRightDiagonal(board) == 'O') {
            return 'O';
        } else {
            return 'T';
        }
    }

    public char checkRows(Character[][] board) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return board[i][0];
            }
        }
            return 'T';
    }

    public char checkColumns(Character[][] board) {
        for (int i = 0; i < 3; i++) {
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return board[0][i];
            }
        }
        return 'T';
    }

    public char checkLeftDiagonal(Character[][] board) {
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[0][0];
        }

        return 'T';
    }

    public char checkRightDiagonal(Character[][] board) {
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return board[0][2];
        }

        return 'T';
    }

}