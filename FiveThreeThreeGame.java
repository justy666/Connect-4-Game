
//By Frederick Liu, Justin Shen, Amish Fakun Spring 2022 CSC 242
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class FiveThreeThreeGame {

    public String[][] board = new String[3][5];
    Player human = new Player();
    Player AI = new Player();

    public FiveThreeThreeGame(){
        initializeboard();
    }

    public void initializeboard(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j<5; j++){
                //initialize the board to 0
                board[i][j] = "-";
            }
        }
    }

    public void print_board_with_instructions(){
        System.out.println("Coordinates with their corresponding number...");
        int count = 1;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j<5; j++){
                System.out.print("| " + count + " |");
                count+=1;
            }
            System.out.println();
        }
    }

    public void printboard(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j<5; j++){
                System.out.print("| " + board[i][j] + " |");
            }
            System.out.println();
        }
    }


    public boolean check_valid_moves(String[][] board, int move){
        //Invalid moves, if the move is not within the bound.
        if (move == 1 ||
                move == 2 ||
                move == 3 ||
                move == 4 ||
                move == 5 ||
                move == 6 ||
                move == 7 ||
                move == 8 ||
                move == 9 || move == 10 || move ==11 || move == 12 || move == 13 || move == 14 || move == 15) {

            //Invalid moves, if the space below the target move is empty, it is invalid.
            if (move == 1 && board[1][0].equals("-")) {
                return false;
            } else if (move == 6 && board[2][0].equals("-")) {
                return false;
            } else if (move == 2 && board[1][1].equals("-")) {
                return false;
            } else if (move == 7 && board[2][1].equals("-")) {
                return false;
            } else if (move == 3 && board[1][2].equals("-")) {
                return false;
            } else if (move == 8 && board[2][2].equals("-")) {
                return false;
            } else if (move == 4 && board[1][3].equals("-")) {
                return false;
            }else if (move == 9 && board[2][3].equals("-")) {
                return false;
            }else if (move == 5 && board[1][4].equals("-")) {
                return false;
            }else if (move == 10 && board[2][4].equals("-")) {
                return false;
            }
            //Invalid moves, if the space is already taken.
            else if (move == 1 && !board[0][0].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 2 && !board[0][1].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 3 && !board[0][2].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 4 && !board[0][3].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 5 && !board[0][4].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 6 && !board[1][0].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 7 && !board[1][1].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 8 && !board[1][2].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 9 && !board[1][3].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 10 && !board[1][4].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 11 && !board[2][0].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 12 && !board[2][1].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 13 && !board[2][2].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 14 && !board[2][3].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 15 && !board[2][4].equalsIgnoreCase("-")) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }


    public boolean board_is_full(String[][] board){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j<5; j++){
                if (board[i][j].equals("-")){
                    return false;
                }
            }
        }
        return true;
    }

//
//    //CHECK WHO IS THE WINNER
//    public boolean checkHorizontal(String String, String[][]board) {
//        for(int y = 0; y <= 4; y++) {
//            if((board[0][y].equals(String) && board[1][y].equals(String) && board[2][y].equals(String))){
//                return true;
//            }
//        }
//        return false;
//    }
//
//
//    public boolean checkVertical(String String, String[][]board) {
//        for(int x = 0; x <= 2; x++) {
//            if(board[x][0].equals(String) && board[x][1].equals(String) && board[x][2].equals(String)){
//                return true;
//            }
//            if(board[x][1].equals(String) && board[x][2].equals(String) && board[x][3].equals(String)){
//                return true;
//            }
//            if(board[x][2].equals(String) && board[x][3].equals(String) && board[x][4].equals(String)){
//                return true;
//            }
//        }
//        return false;
//    }

//
//    public boolean checkDiagonal(String String, String[][]board) {
//        if(board[0][0].equals(String) && board[1][1].equals(String) && board[2][2].equals(String)){
//            return true;
//        }
//        if(board[0][2].equals(String) && board[1][1].equals(String) && board[2][0].equals(String)){
//            return true;
//        }
//        if(board[0][1].equals(String) && board[1][2].equals(String) && board[2][3].equals(String)){
//            return true;
//        }
//        if(board[0][2].equals(String) && board[1][3].equals(String) && board[2][4].equals(String)){
//            return true;
//        }
//        if(board[0][3].equals(String) && board[1][2].equals(String) && board[2][1].equals(String)){
//            return true;
//        }
//        if(board[0][4].equals(String) && board[1][3].equals(String) && board[2][2].equals(String)){
//            return true;
//        }
//        return false;
//    }
//
//    public boolean check_winning(String String, String[][]board){
//        return checkHorizontal(String,board) || checkVertical(String,board) || checkDiagonal(String,board);
//    }

public boolean check_winning(String String, String[][]board){
        int col = 5;
        int row = 3;

        //horizontal
        for (int  i = 0; i< col - 2; i++){
            for (int j = 0; j < row; j++){
                if (board[j][i].equals(String) && board[j][i + 1].equals(String) && board[j][i + 2].equals(String)){
                    return true;
                }
            }
        }

    //vertical
    for (int  i = 0; i< col; i++){
        for (int j = 0; j < row - 2; j++){
            if (board[j][i].equals(String) && board[j + 1][i].equals(String) && board[j + 2][i].equals(String)){
                return true;
            }
        }
    }

    for (int  i = 0; i< col - 2; i++){
        for (int j = 0; j < row - 2; j++){
            if (board[j][i].equals(String) && board[j + 1][i+1].equals(String) && board[j + 2][i+2].equals(String)){
                return true;
            }
        }
    }

    for (int  i = 0; i< col - 2; i++){
        for (int j = 2; j < row; j++){
            if (board[j][i].equals(String) && board[j - 1][i+1].equals(String) && board[j - 2][i+2].equals(String)){
                return true;
            }
        }
    }
    return false;
}


    public boolean Human_setMove(String[][] board, int move, Player player){
//    System.out.println("##" + move);
        if (check_valid_moves(board, move)) {
//            System.out.println("(((()))))" + move);
            if (move == 1) {
                board[0][0] = player.getPlayerSymbol();
                return true;
            } else if (move == 2) {
                board[0][1] = player.getPlayerSymbol();
                return true;
            } else if (move == 3) {
                board[0][2] = player.getPlayerSymbol();
                return true;
            } else if (move == 4) {
                board[0][3] = player.getPlayerSymbol();
                return true;
            } else if (move == 5) {
                board[0][4] = player.getPlayerSymbol();
                return true;
            } else if (move == 6) {
                board[1][0] = player.getPlayerSymbol();
                return true;
            } else if (move == 7) {
                board[1][1] = player.getPlayerSymbol();
                return true;
            } else if (move == 8) {
                board[1][2] = player.getPlayerSymbol();
                return true;
            } else if (move == 9) {
                board[1][3] = player.getPlayerSymbol();
                return true;
            }else if (move == 10) {
                board[1][4] = player.getPlayerSymbol();
                return true;
            }else if (move == 11) {
                board[2][0] = player.getPlayerSymbol();
                return true;
            }else if (move == 12) {
                board[2][1] = player.getPlayerSymbol();
                return true;
            }else if (move == 13) {
                board[2][2] = player.getPlayerSymbol();
                return true;
            }else if (move == 14) {
                board[2][3] = player.getPlayerSymbol();
                return true;
            }else if (move == 15) {
                board[2][4] = player.getPlayerSymbol();
                return true;
            }
        }
        return false;
    }

    //Random implementation. AI pick an arbitrary number.
    public void AI_setMove_RANDOM(String[][] board, Player player){
        int min = 1;
        int max = 15;
        int move = (int)Math.floor(Math.random()*(max-min+1)+min);
//    System.out.println(move);
        while (!check_valid_moves(board, move)){
            move = (int)Math.floor(Math.random()*(max-min+1)+min);
        }
//    if (check_valid_moves(board, move)){
        if (move == 1) {
            board[0][0] = player.getPlayerSymbol();
        } else if (move == 2) {
            board[0][1] = player.getPlayerSymbol();
        } else if (move == 3) {
            board[0][2] = player.getPlayerSymbol();
        } else if (move == 4) {
            board[0][3] = player.getPlayerSymbol();
        } else if (move == 5) {
            board[0][4] = player.getPlayerSymbol();
        } else if (move == 6) {
            board[1][0] = player.getPlayerSymbol();
        } else if (move == 7) {
            board[1][1] = player.getPlayerSymbol();
        } else if (move == 8) {
            board[1][2] = player.getPlayerSymbol();
        } else if (move == 9) {
            board[1][3] = player.getPlayerSymbol();
        }else if (move == 10) {
            board[1][4] = player.getPlayerSymbol();
        }else if (move == 11) {
            board[2][0] = player.getPlayerSymbol();
        }else if (move == 12) {
            board[2][1] = player.getPlayerSymbol();
        }else if (move == 13) {
            board[2][2] = player.getPlayerSymbol();
        }else if (move == 14) {
            board[2][3] = player.getPlayerSymbol();
        }else if (move == 15) {
            board[2][4] = player.getPlayerSymbol();
        }
//    }
    }


    public void PLAY_RANDOM_AI_HUMANSFIRST(String humansymbol){
        initializeboard();

        human.setPlayerSymbol(humansymbol);
        if (humansymbol.equals("X")){
            AI.setPlayerSymbol("O");
        } else {
            AI.setPlayerSymbol("X");
        }
        System.out.println("Please enter a move number: ");
        Scanner scanner = new Scanner(System.in);

        while (!board_is_full(board)){
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                break;
            }
            int move = Integer.parseInt(scanner.nextLine());

            boolean humanvalue = Human_setMove(board,move,human);
//        System.out.println("Value: " + humanvalue);

            if (humanvalue == false){
                System.out.println("Invalid Move! Move again!");
            } else if (!board_is_full(board)) {
//            System.out.println("here");
                AI_setMove_RANDOM(board,AI);
//            System.out.println("here2");//never reaches here if it is tied

                System.out.println("*********************");
                printboard();
                System.out.println("*********************");

                if (check_winning(AI.getPlayerSymbol(),board)){
                    System.out.println("\nAI is the Winner!");
                    System.out.println("*********************");
                    printboard();
                    System.out.println("*********************");
                    break;
                } else if (check_winning(human.getPlayerSymbol(),board)){
                    System.out.println("\nYou are the Winner!");
                    System.out.println("*********************");
                    printboard();
                    System.out.println("*********************");
                    break;
                }
                //-----Check ties-----
                if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                    System.out.println("\nBoth tied!");
                    System.out.println("*********************");
                    printboard();
                    System.out.println("*********************");
                    break;
                }
//            System.out.println("Valid moves left: " + isvalidMovesLeft(board));
            }

            //once board is full, check who is the winner!
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                System.out.println("*********************");
                printboard();
                System.out.println("*********************");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                System.out.println("*********************");
                printboard();
                System.out.println("*********************");
                break;
            }
            //-----Check ties-----
            if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                System.out.println("\nBoth tied!");
                System.out.println("*********************");
                printboard();
                System.out.println("*********************");
                break;
            }
//        move = Integer.parseInt(scanner.nextLine());
//        System.out.println("Board Value: " + board_is_full(board));
        }
    }




    public void PLAY_RANDOM_AI_AIFIRST(String humansymbol){
        initializeboard();
        human.setPlayerSymbol(humansymbol);
        if (humansymbol.equals("X")){
            AI.setPlayerSymbol("O");
        } else {
            AI.setPlayerSymbol("X");
        }

        System.out.println("AI Plays first...");

        boolean humanvalue = true;
        while (!board_is_full(board)){
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                break;
            }

            if (humanvalue == true){
                AI_setMove_RANDOM(board,AI);
                System.out.println("*********************");
                printboard();
                System.out.println("*********************");
            }

            if (!board_is_full(board)) {
                System.out.println("Please enter a move number: ");
                Scanner scanner = new Scanner(System.in);
                int move = Integer.parseInt(scanner.nextLine());
                humanvalue = Human_setMove(board,move,human);
                if (humanvalue == false){
                    System.out.println("Invalid Move! Move again!");
                }

                if (check_winning(AI.getPlayerSymbol(),board)){
                    System.out.println("\nAI is the Winner!");
                    System.out.println("*********************");
                    printboard();
                    System.out.println("*********************");
                    break;
                } else if (check_winning(human.getPlayerSymbol(),board)){
                    System.out.println("\nYou are the Winner!");
                    System.out.println("*********************");
                    printboard();
                    System.out.println("*********************");
                    break;
                }
                //-----Check ties-----
                if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                    System.out.println("\nBoth tied!");
                    System.out.println("*********************");
                    printboard();
                    System.out.println("*********************");
                    break;
                }
            }
            //once board is full, check who is the winner!
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                System.out.println("*********************");
                printboard();
                System.out.println("*********************");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                System.out.println("*********************");
                printboard();
                System.out.println("*********************");
                break;
            }
            //-----Check ties-----
            if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                System.out.println("\nBoth tied!");
                System.out.println("*********************");
                printboard();
                System.out.println("*********************");
                break;
            }
//        move = Integer.parseInt(scanner.nextLine());
//        System.out.println("Board Value: " + board_is_full(board));
        }
    }

    //*****************************************************
    //Minimax implementation.
    //*****************************************************

    //test to see how many and if there are valid moves left on the board
    public boolean isValidMovesLeft(String[][] board){
        int move;
//        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {

                if (i == 0 && j == 0 && board[i][j].equals("-")) {
                    move = 1;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                } else if (i == 0 && j == 1&& board[i][j].equals("-")) {
                    move = 2;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                } else if (i == 0 && j == 2&& board[i][j].equals("-")) {
                    move = 3;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                } else if (i == 0 && j == 3&& board[i][j].equals("-")) {
                    move = 4;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                } else if (i == 0 && j == 4&& board[i][j].equals("-")) {
                    move = 5;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                } else if (i == 1 && j == 0 && board[i][j].equals("-")) {
                    move = 6;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                } else if (i == 1 && j == 1&& board[i][j].equals("-")) {
                    move = 7;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                } else if (i == 1 && j == 2&& board[i][j].equals("-")) {
                    move = 8;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                } else if (i == 1 && j == 3&& board[i][j].equals("-")) {
                    move = 9;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 1 && j == 4&& board[i][j].equals("-")) {
                    move = 10;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 2 && j == 0&& board[i][j].equals("-")) {
                    move = 11;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 2 && j == 1&& board[i][j].equals("-")) {
                    move = 12;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 2 && j == 2&& board[i][j].equals("-")) {
                    move = 13;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 2 && j == 3&& board[i][j].equals("-")) {
                    move = 14;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 2 && j == 4&& board[i][j].equals("-")) {
                    move = 15;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }
            }
        }
//    System.out.println("Valid moves count: " + count);
        return false;
    }

    //check whether the game has ended -> in other words, if the tree reaches its terminal node.
    public boolean is_Terminal(String[][] board){
//        System.out.println("here is terminal, game ended?");
//        System.out.println("human: " + check_winning(human.getPlayerSymbol(),board));
        return check_winning(human.getPlayerSymbol(),board) || check_winning(AI.getPlayerSymbol(),board) || board_is_full(board);
    }


    public int utility_function(String[][] board, String symbol){
        int score = 0;
        int col =  5;
        int row = 3;

        String[] column = new String[col];
        String[] myrow = new String[row];
        String[] set = new String[3];

        String[]center = new String[3];
        for (int i = 0; i<3; i++){
            center[i] = board[i][2];
        }
        score += countNumberOfSymbolOnARow(center, symbol) * 3;

        //horizonal
        for ( int r = 0; r < row; r++) {
            for ( int c = 0; c < col; c++) {
                column[c] = board[r][c];
            }
            for ( int c = 0; c < col - 2; c++) {
                for (int i = 0; i < 3; i++) {
                    set[i] = column[c + i];
                }
                // get the score
                score += getScore(set, symbol);
            }
        }

        // vertical
        for ( int c = 0; c < col; c++) {
            for ( int r = 0; r < row; r++) {
                myrow[r] = board[r][c];
            }
            for ( int r = 0; r < row - 2; r++) {
                for (int i = 0; i < 3; i++) {
                    set[i] = myrow[r + i];
                }
                score += getScore(set, symbol);
            }
        }
        // diagonals
        for ( int r = 0; r < row - 2; r++) {
            for ( int c = 0; c < col; c++) {
                column[c] = board[r][c];
            }
            for ( int c = 0; c < col - 2; c++) {
                for (int i = 0; i < 3; i++) {
                    set[i] = board[r + i][c + i];
                }
                score += getScore(set, symbol);
            }
        }
        for ( int r = 0; r < row - 2; r++) {
            for ( int c = 0; c < col; c++) {
                column[c] = board[r][c];
            }
            for ( int c = 0; c < col - 2; c++) {
                for (int i = 0; i < 3; i++) {
                    set[i] = board[r + 2 - i][c + i];
                }
                score += getScore(set, symbol);
            }
        }
        return score;
    }


    int count3 = 0;
long start3 = 0;
    long end3= 0;
    public int minimax(String[][]board, int depth, boolean isMax){
        count3++;
        if (depth == 0 || is_Terminal(board)){
            if (is_Terminal(board)){
                if (check_winning(AI.getPlayerSymbol(), board)){
                    return 9999999;
                } else if (check_winning(human.getPlayerSymbol(), board)){
                    return -9999999;
                } else{
                    return 0;
                }
            } else {
//                return evaluateContent(board);
                return utility_function(board, AI.getPlayerSymbol()); //get the value from evaluation function
            }
        }
        if (isMax) {//max
            int value = -9999999;
            int new_best;
            int col_num = -1;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    // Check it is a valid move
                    if (check_valid_moves(board, colrowtomovenumber(i,j))) {
                        // Make the move
                        board[i][j] = AI.getPlayerSymbol();

                        new_best = minimax(board, depth - 1,false);
//                        System.out.println(new_best);
                        if (new_best > value){
                            value = new_best;
                            col_num = j;
                        }
                        board[i][j] ="-";
                    }
                }
            }
//            System.out.println("max Best col_num: "+ col_num);
//            System.out.println("max best value "+ value);
            return value;
        } else {//min
            int value = 9999999;
            int new_best;
            int col_num = -1;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    // Check if it is a valid move
                    if (check_valid_moves(board, colrowtomovenumber(i,j))) {
                        board[i][j] = human.getPlayerSymbol();
                        new_best = minimax(board, depth - 1, true);
                        if (new_best < value){
                            value = new_best;
                            col_num = j;
                        }
//                        System.out.println("Depth: " + depth);
                        board[i][j] = "-";

                    }
                }
            }
//            System.out.println("best move: " + best);
//            System.out.println("min Best col_num: "+ col_num);
//            System.out.println("min best value "+ value);
            return value;
        }
    }


    public int findBestMove_MiniMax(String[][] board){
        int current_bestValue = Integer.MIN_VALUE;
        int row = -1;
        int col = -1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                //see if the move is a valid move.
                if (check_valid_moves(board, colrowtomovenumber(i,j))) {
                    board[i][j] = AI.getPlayerSymbol();
                    int oldValue = minimax(board, 3, false);
                    board[i][j] = "-";
                    if (oldValue > current_bestValue) {
                        row = i;
                        col = j;
                        current_bestValue = oldValue;
                    }
                }
            }
        }
        System.out.println("Visited: " + count3 + " States ||" + " Best Move: (" + row + ", " + col + ") || Value: " + current_bestValue);

        if (row == 0 && col == 0) {
            return 1;
        } else if (row == 0 && col == 1) {
            return 2;
        } else if (row== 0 && col == 2) {
            return 3;
        } else if (row == 0 && col == 3) {
            return 4;
        } else if (row == 0 && col == 4) {
            return 5;
        } else if (row == 1 && col == 0) {
            return 6;
        } else if (row == 1 && col == 1) {
            return 7;
        } else if (row == 1 && col == 2) {
            return 8;
        } else if (row == 1 && col == 3) {
            return 9;
        }else if (row == 1 && col == 4) {
            return 10;
        }else if (row == 2 && col == 0) {
            return 11;
        }else if (row == 2 && col == 1) {
            return 12;
        }else if (row== 2 && col == 2) {
            return 13;
        }else if (row == 2 && col == 3) {
            return 14;
        }else if (row == 2 && col == 4) {
            return 15;
        }

        return 0;
    }

    public int colrowtomovenumber(int i, int j){

        if (i == 0 && j == 0) {
            return 1;
        } else if (i == 0 && j == 1) {
            return 2;
        } else if (i == 0 && j == 2) {
            return 3;
        } else if (i == 0 && j == 3) {
            return 4;
        } else if (i == 0 && j == 4) {
            return 5;
        } else if (i == 1 && j == 0) {
            return 6;
        } else if (i == 1 && j == 1) {
            return 7;
        } else if (i == 1 && j == 2) {
            return 8;
        } else if (i == 1 && j == 3) {
            return 9;
        }else if (i == 1 && j == 4) {
            return 10;
        }else if (i == 2 && j == 0) {
            return 11;
        }else if (i == 2 && j == 1) {
            return 12;
        }else if (i == 2 && j == 2) {
            return 13;
        }else if (i == 2 && j == 3) {
            return 14;
        }else if (i == 2 && j == 4) {
            return 15;
        }
        return 0;
    }



    public void minmaxConvert(int move, Player player, String [][]board){
        if (move == 1) {
            board[0][0] = player.getPlayerSymbol();
        } else if (move == 2) {
            board[0][1] = player.getPlayerSymbol();
        } else if (move == 3) {
            board[0][2] = player.getPlayerSymbol();
        } else if (move == 4) {
            board[0][3] = player.getPlayerSymbol();
        } else if (move == 5) {
            board[0][4] = player.getPlayerSymbol();
        } else if (move == 6) {
            board[1][0] = player.getPlayerSymbol();
        } else if (move == 7) {
            board[1][1] = player.getPlayerSymbol();
        } else if (move == 8) {
            board[1][2] = player.getPlayerSymbol();
        } else if (move == 9) {
            board[1][3] = player.getPlayerSymbol();
        }else if (move == 10) {
            board[1][4] = player.getPlayerSymbol();
        } else if (move == 11) {
            board[2][0] = player.getPlayerSymbol();
        }else if (move == 12) {
            board[2][1] = player.getPlayerSymbol();
        }else if (move == 13) {
            board[2][2] = player.getPlayerSymbol();
        }else if (move == 14) {
            board[2][3] = player.getPlayerSymbol();
        }else if (move == 15) {
            board[2][4] = player.getPlayerSymbol();
        }
    }


    public void PLAY_MINIMAX_AI_HUMANFIRST(String humansymbol){
        initializeboard();
        human.setPlayerSymbol(humansymbol);
        if (humansymbol.equals("X")){
            AI.setPlayerSymbol("O");
        } else {
            AI.setPlayerSymbol("X");
        }
        System.out.println("Please enter a move number: ");
        Scanner scanner = new Scanner(System.in);

        while (!board_is_full(board)){
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                break;
            }
            int move = Integer.parseInt(scanner.nextLine());
            boolean humanvalue = Human_setMove(board, move,human);
//        System.out.println("Value: " + humanvalue);

            if (humanvalue == false){
                System.out.println("Invalid Move! Move again!");
            } else if (!board_is_full(board)) {
//            System.out.println("here");
//                AI_setMove_RANDOM(board,AI);
//                System.out.println(findBestMove(board));

                start3 = System.nanoTime();
                minmaxConvert(findBestMove_MiniMax(board), AI, board);
                end3 = System.nanoTime();
                System.out.println("Used Time (in Nanoseconds): " + (end3-start3));
//            System.out.println("here2");//never reaches here if it is tied

                System.out.println("*********************");
                printboard();
                System.out.println("*********************");
//            System.out.println("Valid moves left: " + isvalidMovesLeft(board));
            }

            //once board is full, check who is the winner!
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                System.out.println("*********************");
                printboard();
                System.out.println("*********************");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                System.out.println("*********************");
                printboard();
                System.out.println("*********************");
                break;
            }
            //-----Check ties-----
            if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                System.out.println("\nBoth tied!");
                System.out.println("*********************");
                printboard();
                System.out.println("*********************");
                break;
            }
//        move = Integer.parseInt(scanner.nextLine());
//        System.out.println("Board Value: " + board_is_full(board));
        }
    }



    public void PLAY_MINIMAX_AI_AIFIRST(String humansymbol){
        initializeboard();
        human.setPlayerSymbol(humansymbol);
        if (humansymbol.equals("X")){
            AI.setPlayerSymbol("O");
        } else {
            AI.setPlayerSymbol("X");
        }

        System.out.println("AI Plays first...");
        boolean firstmove = true;
        boolean humanvalue = true;
        while (!board_is_full(board)){
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                break;
            }
            if (firstmove == true){
                AI_setMove_RANDOM(board,AI);
                System.out.println("*********************");
                printboard();
                System.out.println("*********************");
                firstmove = false;

                if (check_winning(AI.getPlayerSymbol(),board)){
                    System.out.println("\nAI is the Winner!");
                    System.out.println("*********************");
                    printboard();
                    System.out.println("*********************");
                    break;
                } else if (check_winning(human.getPlayerSymbol(),board)){
                    System.out.println("\nYou are the Winner!");
                    System.out.println("*********************");
                    printboard();
                    System.out.println("*********************");
                    break;
                }
                //-----Check ties-----
                if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                    System.out.println("\nBoth tied!");
                    System.out.println("*********************");
                    printboard();
                    System.out.println("*********************");
                    break;
                }
            } else {
                if (humanvalue == true) {


                    start3 = System.nanoTime();
                    minmaxConvert(findBestMove_MiniMax(board), AI, board);
                    end3 = System.nanoTime();
                    System.out.println("Used Time (in Nanoseconds): " + (end3-start3));

                    System.out.println("*********************");
                    printboard();
                    System.out.println("*********************");

                    if (check_winning(AI.getPlayerSymbol(),board)){
                        System.out.println("\nAI is the Winner!");
                        System.out.println("*********************");
                        printboard();
                        System.out.println("*********************");
                        break;
                    } else if (check_winning(human.getPlayerSymbol(),board)){
                        System.out.println("\nYou are the Winner!");
                        System.out.println("*********************");
                        printboard();
                        System.out.println("*********************");
                        break;
                    }
                    //-----Check ties-----
                    if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                        System.out.println("\nBoth tied!");
                        System.out.println("*********************");
                        printboard();
                        System.out.println("*********************");
                        break;
                    }
                }

            }

            if (!board_is_full(board)) {
                System.out.println("Please enter a move number: ");
                Scanner scanner = new Scanner(System.in);

                int move = Integer.parseInt(scanner.nextLine());
                humanvalue = Human_setMove(board,move,human);
                if (humanvalue == false){
                    System.out.println("Invalid Move! Move again!");
                }
            }

            //once board is full, check who is the winner!
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                System.out.println("*********************");
                printboard();
                System.out.println("*********************");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                System.out.println("*********************");
                printboard();
                System.out.println("*********************");
                break;
            }
            //-----Check ties-----
            if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                System.out.println("\nBoth tied!");
                System.out.println("*********************");
                printboard();
                System.out.println("*********************");
                break;
            }
//        move = Integer.parseInt(scanner.nextLine());
//        System.out.println("Board Value: " + board_is_full(board));
        }
    }


    //*****************************************************
    //Minimax with alpha beta prunning implementation.
    //*****************************************************

int count2 = 0;
    long start2 = 0;
    long end2 = 0;
    public int minimax_alpha_beta(String[][]board, int depth, boolean isMax, int alpha, int beta){
        count2++;
        if (depth == 0 || is_Terminal(board)){
            if (is_Terminal(board)){
                if (check_winning(AI.getPlayerSymbol(), board)){
                    return 9999999;
                } else if (check_winning(human.getPlayerSymbol(), board)){
                    return -9999999;
                } else{
                    return 0;
                }
            } else {
//                return evaluateContent(board);
                return utility_function(board, AI.getPlayerSymbol()); //get the value from evaluation function
            }
        }
        if (isMax) {//max
            int value = -9999999;
            int new_best;
            int col_num = -1;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    // Check it is a valid move
                    if (check_valid_moves(board, colrowtomovenumber(i,j))) {
                        // Make the move
                        board[i][j] = AI.getPlayerSymbol();

                        new_best = minimax_alpha_beta(board, depth - 1,false, alpha, beta);
//                        System.out.println(new_best);
                        if (new_best > value){
                            value = new_best;
                            col_num = j;
                        }
                        board[i][j] ="-";
                        alpha = Math.max(alpha, value);
//                        System.out.println("alpha:  " + alpha + " beta: " + beta);
                        if (alpha >= beta) {
//                            return value;
                            return value;
                        }
                    }
                }
            }
//            System.out.println("max Best col_num: "+ col_num);
//            System.out.println("max best value "+ value);
            return value;
        } else {//min
            int value = 9999999;
            int new_best;
            int col_num = -1;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    // Check if it is a valid move
                    if (check_valid_moves(board, colrowtomovenumber(i,j))) {
                        board[i][j] = human.getPlayerSymbol();
                        new_best = minimax_alpha_beta(board, depth - 1, true, alpha, beta);
                        if (new_best < value){
                            value = new_best;
                            col_num = j;
                        }
//                        System.out.println("Depth: " + depth);
                        board[i][j] = "-";
                        beta = Math.min(beta, value);
                        if (beta <= alpha) {
//                            break;
                            return value;
                        }
                    }
                }
            }
//            System.out.println("best move: " + best);
//            System.out.println("min Best col_num: "+ col_num);
//            System.out.println("min best value "+ value);
            return value;
        }
    }


    public int findBestMove_MiniMax_AlphaBeta(String[][] board){
        int current_bestValue = Integer.MIN_VALUE;
        int row = -1;
        int col = -1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                //see if the move is a valid move.
                if (check_valid_moves(board, colrowtomovenumber(i,j))) {
                    board[i][j] = AI.getPlayerSymbol();
                    int oldValue = minimax_alpha_beta(board, 3, false,Integer.MIN_VALUE, Integer.MAX_VALUE);
                    board[i][j] = "-";
                    if (oldValue > current_bestValue) {
                        row = i;
                        col = j;
                        current_bestValue = oldValue;
                    }
                }
            }
        }
        System.out.println("Visited: " + count2 + " States ||" + " Best Move: (" + row + ", " + col + ") || Value: " + current_bestValue);

        if (row == 0 && col == 0) {
            return 1;
        } else if (row == 0 && col == 1) {
            return 2;
        } else if (row== 0 && col == 2) {
            return 3;
        } else if (row == 0 && col == 3) {
            return 4;
        } else if (row == 0 && col == 4) {
            return 5;
        } else if (row == 1 && col == 0) {
            return 6;
        } else if (row == 1 && col == 1) {
            return 7;
        } else if (row == 1 && col == 2) {
            return 8;
        } else if (row == 1 && col == 3) {
            return 9;
        }else if (row == 1 && col == 4) {
            return 10;
        }else if (row == 2 && col == 0) {
            return 11;
        }else if (row == 2 && col == 1) {
            return 12;
        }else if (row== 2 && col == 2) {
            return 13;
        }else if (row == 2 && col == 3) {
            return 14;
        }else if (row == 2 && col == 4) {
            return 15;
        }
        return 0;
    }


    public void PLAY_MINIMAX_ALPHABETA_AI_HUMANFIRST(String humansymbol){
        initializeboard();
        human.setPlayerSymbol(humansymbol);
        if (humansymbol.equals("X")){
            AI.setPlayerSymbol("O");
        } else {
            AI.setPlayerSymbol("X");
        }
        System.out.println("Please enter a move number: ");
        Scanner scanner = new Scanner(System.in);

        while (!board_is_full(board)){
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                break;
            }
            int move = Integer.parseInt(scanner.nextLine());
            boolean humanvalue = Human_setMove(board,move,human);
//        System.out.println("Value: " + humanvalue);

            if (humanvalue == false){
                System.out.println("Invalid Move! Move again!");
            } else if (!board_is_full(board)) {
                if (check_winning(AI.getPlayerSymbol(),board)){
                    System.out.println("\nAI is the Winner!");
                    System.out.println("*********************");
                    printboard();
                    System.out.println("*********************");
                    break;
                } else if (check_winning(human.getPlayerSymbol(),board)){
                    System.out.println("\nYou are the Winner!");
                    System.out.println("*********************");
                    printboard();
                    System.out.println("*********************");
                    break;
                }
//            System.out.println("here");
//                AI_setMove_RANDOM(board,AI);
//                System.out.println(findBestMove(board));
                start2 = System.nanoTime();
                minmaxConvert(findBestMove_MiniMax_AlphaBeta(board),AI, board);
                end2 = System.nanoTime();
                System.out.println("Used Time (in Nanoseconds): " + (end2-start2));
//            System.out.println("here2");//never reaches here if it is tied

                System.out.println("*********************");
                printboard();
                System.out.println("*********************");

//            System.out.println("Valid moves left: " + isvalidMovesLeft(board));
            }

            //once board is full, check who is the winner!
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                System.out.println("*********************");
                printboard();
                System.out.println("*********************");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                System.out.println("*********************");
                printboard();
                System.out.println("*********************");
                break;
            }
            //-----Check ties-----
            if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                System.out.println("\nBoth tied!");
                System.out.println("*********************");
                printboard();
                System.out.println("*********************");
                break;
            }
//        move = Integer.parseInt(scanner.nextLine());
//        System.out.println("Board Value: " + board_is_full(board));
        }
    }


    public void PLAY_MINIMAX_ALPHABETA_AI_AIFIRST(String humansymbol){
        initializeboard();
        human.setPlayerSymbol(humansymbol);
        if (humansymbol.equals("X")){
            AI.setPlayerSymbol("O");
        } else {
            AI.setPlayerSymbol("X");
        }

        System.out.println("AI Plays first...");
        boolean firstmove = true;//so that the first move will not always be at the same spot.
        boolean humanvalue = true;
        while (!board_is_full(board)){
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                break;
            }

            if (firstmove == true){
                AI_setMove_RANDOM(board,AI);
                System.out.println("*********************");
                printboard();
                System.out.println("*********************");
                firstmove = false;
            } else {
                if (humanvalue == true){
                    start2 = System.nanoTime();
                    minmaxConvert(findBestMove_MiniMax_AlphaBeta(board),AI, board);
                    end2 = System.nanoTime();
                    System.out.println("Used Time (in Nanoseconds): " + (end2-start2));


                    System.out.println("*********************");
                    printboard();
                    System.out.println("*********************");


                    if (check_winning(AI.getPlayerSymbol(),board)){
                        System.out.println("\nAI is the Winner!");
                        System.out.println("*********************");
                        printboard();
                        System.out.println("*********************");
                        break;
                    } else if (check_winning(human.getPlayerSymbol(),board)){
                        System.out.println("\nYou are the Winner!");
                        System.out.println("*********************");
                        printboard();
                        System.out.println("*********************");
                        break;
                    }
                    //-----Check ties-----
                    if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                        System.out.println("\nBoth tied!");
                        System.out.println("*********************");
                        printboard();
                        System.out.println("*********************");
                        break;
                    }
                }
            }

            if (!board_is_full(board)) {
                System.out.println("Please enter a move number: ");
                Scanner scanner = new Scanner(System.in);

                int move = Integer.parseInt(scanner.nextLine());
                humanvalue = Human_setMove(board,move,human);
                if (humanvalue == false){
                    System.out.println("Invalid Move! Move again!");
                }

                if (check_winning(AI.getPlayerSymbol(),board)){
                    System.out.println("\nAI is the Winner!");
                    System.out.println("*********************");
                    printboard();
                    System.out.println("*********************");
                    break;
                } else if (check_winning(human.getPlayerSymbol(),board)){
                    System.out.println("\nYou are the Winner!");
                    System.out.println("*********************");
                    printboard();
                    System.out.println("*********************");
                    break;
                }
                //-----Check ties-----
                if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                    System.out.println("\nBoth tied!");
                    System.out.println("*********************");
                    printboard();
                    System.out.println("*********************");
                    break;
                }
            }

            //once board is full, check who is the winner!
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                System.out.println("*********************");
                printboard();
                System.out.println("*********************");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                System.out.println("*********************");
                printboard();
                System.out.println("*********************");
                break;
            }
            //-----Check ties-----
            if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                System.out.println("\nBoth tied!");
                System.out.println("*********************");
                printboard();
                System.out.println("*********************");
                break;
            }
//        move = Integer.parseInt(scanner.nextLine());
//        System.out.println("Board Value: " + board_is_full(board));
        }
    }



    //*****************************************************
    //H-Minimax with with a fixed depth cutoff implementation
    //*****************************************************

    public int countNumberOfSymbolOnARow(String[] row, String symbol){
        int count = 0;
        for (int i = 0; i< row.length; i++){
            if (row[i].equals(symbol)){
                count++;
            }
        }
//        System.out.println("symbol: " + symbol + " count: " + count);
        return count;
    }

    public int evaluation_function(String[][] board, String symbol){
        int score = 0;
        int col =  5;
        int row = 3;

        String[] rs = new String[col];
        String[] cs = new String[row];
        String[] set = new String[3];

        String[]center = new String[3];
        for (int i = 0; i<3; i++){
            center[i] = board[i][2];
        }
        score += countNumberOfSymbolOnARow(center, symbol) * 3;

        for ( int r = 0; r < row; r++) {
            for ( int c = 0; c < col; c++) {
                rs[c] = board[r][c]; // this is a distinct row alone
            }
            for ( int c = 0; c < col - 2; c++) {
                for (int i = 0; i < 3; i++) {
                    set[i] = rs[c + i]; // for each possible "set" of 4 spots from that row
                }
                score += getScore(set, symbol); // find score
            }
        }

        // vertical
        for ( int c = 0; c < col; c++) {
            for ( int r = 0; r < row; r++) {
                cs[r] = board[r][c];
            }
            for ( int r = 0; r < row - 2; r++) {
                for (int i = 0; i < 3; i++) {
                    set[i] = cs[r + i];
                }
                score += getScore(set, symbol);
            }
        }
        // diagonals
        for ( int r = 0; r < row - 2; r++) {
            for ( int c = 0; c < col; c++) {
                rs[c] = board[r][c];
            }
            for ( int c = 0; c < col - 2; c++) {
                for (int i = 0; i < 3; i++) {
                    set[i] = board[r + i][c + i];
                }
                score += getScore(set, symbol);
            }
        }
        for ( int r = 0; r < row - 2; r++) {
            for ( int c = 0; c < col; c++) {
                rs[c] = board[r][c];
            }
            for ( int c = 0; c < col - 2; c++) {
                for (int i = 0; i < 3; i++) {
                    set[i] = board[r + 2 - i][c + i];
                }
                score += getScore(set, symbol);
            }
        }
        return score;
    }

    public int getScore(String[] window, String piece){
        int score = 0;
        String opp_piece = human.getPlayerSymbol();
        if (piece.equals(human.getPlayerSymbol())){
            opp_piece = AI.getPlayerSymbol();
        }
        if (countNumberOfSymbolOnARow(window, piece) == 3){
            score += 100;
        }
        else if (countNumberOfSymbolOnARow(window, piece) == 2 &&
                countNumberOfSymbolOnARow(window, "-") == 1){
            score += 5;

        } else if (countNumberOfSymbolOnARow(window, piece) == 1 &&
                countNumberOfSymbolOnARow(window, "-") == 1){
            score += 2;
        }

        if (countNumberOfSymbolOnARow(window, opp_piece) == 2 &&
                countNumberOfSymbolOnARow(window, "-") == 1){
            score -= 4;
        }

//        if (countNumberOfSymbolOnARow(window, opp_piece) == 1 &&
//                countNumberOfSymbolOnARow(window, "-") == 1){
//            score -= 1;
//        }

        return score;
    }

    int count = 0;
    long start1 = 0;
    long end1 = 0;
    public int Hminimax_alpha_beta_cutoff(String[][]board, int depth, boolean isMax, int alpha, int beta){

        count++;
        if (depth == 0 || is_Terminal(board)){
//            System.out.println("Depth here: " +  depth);
            if (is_Terminal(board)){
                if (check_winning(AI.getPlayerSymbol(), board)){
//                    System.out.println("aiiiii....");
                    return 9999999;
                } else if (check_winning(human.getPlayerSymbol(), board)){
//                    System.out.println("humannnnnn....");
                    return -9999999;
                } else{
                    return 0;
                }
            } else {
//                return evaluateContent(board);
                return evaluation_function(board, AI.getPlayerSymbol()); //get the value from evaluation function
            }
        }
        if (isMax) {//max
            int value = -9999999;
            int new_best;
            int col_num = -1;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    // Check it is a valid move
                    if (check_valid_moves(board, colrowtomovenumber(i,j))) {
                        // Make the move
                        board[i][j] = AI.getPlayerSymbol();
                        new_best = Hminimax_alpha_beta_cutoff(board, depth - 1,false, alpha, beta);
//                        System.out.println(new_best);
                        if (new_best > value){
                            value = new_best;
                            col_num = j;
                        }
                        board[i][j] ="-";
                        alpha = Math.max(alpha, value);
//                        System.out.println("alpha:  " + alpha + " beta: " + beta);
                        if (alpha >= beta) {
//                            return value;
                            return value;
                        }
                    }
                }
            }
//            System.out.println("max Best col_num: "+ col_num);
//            System.out.println("max best value "+ value);
            return value;
        } else {//min
            int value = 9999999;
            int new_best;
            int col_num = -1;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    // Check if it is a valid move
                    if (check_valid_moves(board, colrowtomovenumber(i,j))) {
                        board[i][j] = human.getPlayerSymbol();
                        new_best = Hminimax_alpha_beta_cutoff(board, depth - 1, true, alpha, beta);
                        if (new_best < value){
                            value = new_best;
                            col_num = j;
                        }
//                        System.out.println("Depth: " + depth);
                        board[i][j] = "-";
                        beta = Math.min(beta, value);
                        if (beta <= alpha) {
//                            break;
                            return value;
                        }
                    }
                }
            }
//            System.out.println("best move: " + best);
//            System.out.println("min Best col_num: "+ col_num);
//            System.out.println("min best value "+ value);
            return value;
        }
    }


    public int findBestMove_HMiniMax_AlphaBeta_Cutoff(String[][] board, int DEFAULT_DEPTH){
        int current_bestValue = Integer.MIN_VALUE;
        int row = -1;
        int col = -1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                //see if the move is a valid move.
                if (check_valid_moves(board, colrowtomovenumber(i,j))) {
                    board[i][j] = AI.getPlayerSymbol();

                    int oldValue = Hminimax_alpha_beta_cutoff(board, DEFAULT_DEPTH, false,Integer.MIN_VALUE, Integer.MAX_VALUE);
//                    System.out.println("valid i: " + i + " valid j: " + j + " oldValue: " + oldValue);
                    board[i][j] = "-";
                    if (oldValue > current_bestValue) {
                        row = i;
                        col = j;
                        current_bestValue = oldValue;
//                        System.out.println("GREATER valid i: " + i + " valid j: " + j + " current_bestValue: " + current_bestValue);
                    }
                }
            }
        }

        System.out.println("Visited: " + count + " States ||" + " Best Move: (" + row + ", " + col + ") || Value: " + current_bestValue);
//        System.out.println("Used Time (in Nanoseconds): " + (end1-start1));
//        System.out.println("**FINAL valid i: " + row + " valid j: " + col + " FINAL current_bestValue: " + current_bestValue);
        if (row == 0 && col == 0) {
            return 1;
        } else if (row == 0 && col == 1) {
            return 2;
        } else if (row== 0 && col == 2) {
            return 3;
        } else if (row == 0 && col == 3) {
            return 4;
        } else if (row == 0 && col == 4) {
            return 5;
        } else if (row == 1 && col == 0) {
            return 6;
        } else if (row == 1 && col == 1) {
            return 7;
        } else if (row == 1 && col == 2) {
            return 8;
        } else if (row == 1 && col == 3) {
            return 9;
        }else if (row == 1 && col == 4) {
            return 10;
        }else if (row == 2 && col == 0) {
            return 11;
        }else if (row == 2 && col == 1) {
            return 12;
        }else if (row== 2 && col == 2) {
            return 13;
        }else if (row == 2 && col == 3) {
            return 14;
        }else if (row == 2 && col == 4) {
            return 15;
        }
        return 0;
    }

    public void PLAY_HMINIMAX_ALPHABETA_CUTOFF_AI_HUMANFIRST(String humansymbol, int DEFAULT_DEPTH){
        initializeboard();
        human.setPlayerSymbol(humansymbol);
        if (humansymbol.equals("X")){
            AI.setPlayerSymbol("O");
        } else {
            AI.setPlayerSymbol("X");
        }
        System.out.println("Please enter a move number: ");
        Scanner scanner = new Scanner(System.in);

        while (!board_is_full(board)){
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                break;
            }
            int move = Integer.parseInt(scanner.nextLine());
            boolean humanvalue = Human_setMove(board,move,human);
//        System.out.println("Value: " + humanvalue);

            if (humanvalue == false){
                System.out.println("Invalid Move! Move again!");
            } else if (!board_is_full(board)) {
//            System.out.println("here");
                if (check_winning(AI.getPlayerSymbol(),board)){
                    System.out.println("\nAI is the Winner!");
                    System.out.println("*********************");
                    printboard();
                    System.out.println("*********************");
                    break;
                } else if (check_winning(human.getPlayerSymbol(),board)){
                    System.out.println("\nYou are the Winner!");
                    System.out.println("*********************");
                    printboard();
                    System.out.println("*********************");
                    break;
                }
//                AI_setMove_RANDOM(board,AI);
//                System.out.println(findBestMove(board));
                start1 = System.nanoTime();
                minmaxConvert(findBestMove_HMiniMax_AlphaBeta_Cutoff(board, DEFAULT_DEPTH),AI, board);
                end1 = System.nanoTime();
                System.out.println("Used Time (in Nanoseconds): " + (end1-start1));
//            System.out.println("here2");//never reaches here if it is tied

                System.out.println("*********************");
                printboard();
                System.out.println("*********************");

//            System.out.println("Valid moves left: " + isvalidMovesLeft(board));
            }

            //once board is full, check who is the winner!
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                System.out.println("*********************");
                printboard();
                System.out.println("*********************");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                System.out.println("*********************");
                printboard();
                System.out.println("*********************");
                break;
            }
            //-----Check ties-----
            if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                System.out.println("\nBoth tied!");
                System.out.println("*********************");
                printboard();
                System.out.println("*********************");
                break;
            }
//        move = Integer.parseInt(scanner.nextLine());
//        System.out.println("Board Value: " + board_is_full(board));
        }
    }

    public void PLAY_HMINIMAX_ALPHABETA_CUTOFF_AI_AIFIRST(String humansymbol, int DEFAULT_DEPTH){
        initializeboard();
        human.setPlayerSymbol(humansymbol);
        if (humansymbol.equals("X")){
            AI.setPlayerSymbol("O");
        } else {
            AI.setPlayerSymbol("X");
        }

        System.out.println("AI Plays first...");
        boolean firstmove = true;//so that the first move will not always be at the same spot.
        boolean humanvalue = true;
        while (!board_is_full(board)){
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                break;
            }

            if (firstmove == true){
                AI_setMove_RANDOM(board,AI);
                System.out.println("*********************");
                printboard();
                System.out.println("*********************");
                firstmove = false;
            } else {
                if (humanvalue == true){
                    start1 = System.nanoTime();
                    minmaxConvert(findBestMove_HMiniMax_AlphaBeta_Cutoff(board, DEFAULT_DEPTH),AI, board);
                    end1 = System.nanoTime();
                    System.out.println("Used Time (in Nanoseconds): " + (end1-start1));

                    System.out.println("*********************");
                    printboard();
                    System.out.println("*********************");
                    if (check_winning(AI.getPlayerSymbol(),board)){
                        System.out.println("\nAI is the Winner!");
                        System.out.println("*********************");
                        printboard();
                        System.out.println("*********************");
                        break;
                    } else if (check_winning(human.getPlayerSymbol(),board)){
                        System.out.println("\nYou are the Winner!");
                        System.out.println("*********************");
                        printboard();
                        System.out.println("*********************");
                        break;
                    }
                    //-----Check ties-----
                    if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                        System.out.println("\nBoth tied!");
                        System.out.println("*********************");
                        printboard();
                        System.out.println("*********************");
                        break;
                    }
                }
            }
            if (!board_is_full(board)) {
                System.out.println("Please enter a move number: ");
                Scanner scanner = new Scanner(System.in);

                int move = scanner.nextInt();

                humanvalue = Human_setMove(board,move,human);
                if (humanvalue == false){
                    System.out.println("Invalid Move! Move again!");
                }

                if (check_winning(AI.getPlayerSymbol(),board)){
                    System.out.println("\nAI is the Winner!");
                    System.out.println("*********************");
                    printboard();
                    System.out.println("*********************");
                    break;
                } else if (check_winning(human.getPlayerSymbol(),board)){
                    System.out.println("\nYou are the Winner!");
                    System.out.println("*********************");
                    printboard();
                    System.out.println("*********************");
                    break;
                }
                //-----Check ties-----
                if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                    System.out.println("\nBoth tied!");
                    System.out.println("*********************");
                    printboard();
                    System.out.println("*********************");
                    break;
                }
            }
            //once board is full, check who is the winner!
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                System.out.println("*********************");
                printboard();
                System.out.println("*********************");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                System.out.println("*********************");
                printboard();
                System.out.println("*********************");
                break;
            }
            //-----Check ties-----
            if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                System.out.println("\nBoth tied!");
                System.out.println("*********************");
                printboard();
                System.out.println("*********************");
                break;
            }
//        move = Integer.parseInt(scanner.nextLine());
//        System.out.println("Board Value: " + board_is_full(board));
        }
    }





}

