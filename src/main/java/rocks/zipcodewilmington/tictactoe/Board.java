package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character [][] state;
    public Board(Character[][] matrix) {
        state = matrix;
    }



    public Boolean isInFavorOfX() {
        boolean win = false;
        int rowCounter = 0;
        int colCounter = 0;
        int diagCounter = 0;
        int forDiagCounter = 0;

        //check row for win
        for (int row = 0; row < state.length; row++){

            for (int col = 0; col < state[row].length; col++){
                if(rowCounter == 3){
                    break;
                }

                if (state[row][col] == 'X') {
                    rowCounter++;

                }
                else {
                    rowCounter = 0;
                    break;
                }

            }
        }




        //check column for win
        for (int col = 0; col < state[0].length; col++) {
            for (int row = 0; row < state.length; row++) {
                if(colCounter == 3){
                    break;
                }
                if (state[row][col] == 'X') {
                    colCounter++;
                }
                else {
                    colCounter = 0;
                    break;
                }

            }
        }




        //check diag /
        for(int i = 0; i <state.length; i++){
            if (state[i][i] != 'X'){
                break;
            }
            else {diagCounter++;}
        }


        //check diag \
        for (int i = 0; i< state.length; i++){
            if (state[i][state.length-i-1]!= 'X'){
                break;
            }
            else {forDiagCounter++;}
        }



        if (rowCounter == 3 || colCounter == 3 || diagCounter == 3 || forDiagCounter == 3){
            win = true;
        }

        return win;
    }

    public Boolean isInFavorOfO() {
        boolean win = false;
        int rowCounter = 0;
        int colCounter = 0;
        int diagCounter = 0;
        int forDiagCounter = 0;

        //check row for win
        for (int row = 0; row < state[0].length; row++){
            for (int col = 0; col < state[0].length; col++){
                if(rowCounter == 3){
                    break;
                }

                if (state[row][col] == 'O') {
                    rowCounter++;

                }
                else {
                    rowCounter = 0;
                    break;
                }
            }
        }


        //check column for win
        for (int col = 0; col < state[0].length; col++) {
            for (int row = 0; row < state.length; row++) {
                if(colCounter == 3){
                    break;
                }
                if (state[row][col] == 'O') {
                    colCounter++;
                }
                else {
                    colCounter = 0;
                    break;
                }
            }
        }



        //check diag /
        for(int i = 0; i <state.length; i++){
            if (state[i][i] != 'O'){
                break;
            }
            else {diagCounter++;}
        }



        //check diag \
        for (int i = 0; i< state.length; i++){
            if (state[i][state.length-i-1]!= 'O'){
                break;
            }
            else {forDiagCounter++;}
        }



        if (rowCounter == 3 || colCounter == 3 || diagCounter==3 || forDiagCounter == 3){
            win = true;
        }

        return win;
    }

    public Boolean isTie() {
        boolean tie = false;
        if (!isInFavorOfO() && !isInFavorOfX()) {
            tie = true;
            }
        return tie;
    }

    public String getWinner() {
        String winner = "";
        if (isInFavorOfO()) {
            winner = "O";
        }
        else if (isInFavorOfX()) {
            winner = "X";
        }
        else {winner = "";}


        return winner;
    }

}
