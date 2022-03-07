
//By Frederick Liu, Justin Shen, Amish Fakun Spring 2022 CSC 242
import java.util.*;

public class ThreeThreeThreeGame {

    public String[][] board = new String[3][3];
    Player human = new Player();
    Player AI = new Player();

    public ThreeThreeThreeGame(){
        initializeboard();
    }

    public void initializeboard(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j<3; j++){
                //initialize the board to 0
                board[i][j] = "-";
            }
        }
    }

    public void print_board_with_instructions(){
        int count = 1;
        System.out.println("Coordinates with their corresponding number...");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j<3; j++){
                System.out.print("| " + count + " |");
                count+=1;
            }
            System.out.println();
        }
    }

    public void printboard(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j<3; j++){
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
                move == 9) {
            //Invalid moves, if the space below the target move is empty, it is invalid.
            if (move == 1 && board[1][0].equals("-")) {
                return false;
            } else if (move == 4 && board[2][0].equals("-")) {
                return false;
            } else if (move == 2 && board[1][1].equals("-")) {
                return false;
            } else if (move == 5 && board[2][1].equals("-")) {
                return false;
            } else if (move == 3 && board[1][2].equals("-")) {
                return false;
            } else if (move == 6 && board[2][2].equals("-")) {
                return false;
            }
            //Invalid moves, if the space is already taken.
            else if (move == 1 && !board[0][0].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 2 && !board[0][1].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 3 && !board[0][2].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 4 && !board[1][0].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 5 && !board[1][1].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 6 && !board[1][2].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 7 && !board[2][0].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 8 && !board[2][1].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 9 && !board[2][2].equalsIgnoreCase("-")) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }


    //CHECK WHO IS THE WINNER
    public boolean checkHorizontal(String String, String[][]board) {
        for(int y = 0; y <= 2; y++) {
            if(board[0][y].equals(String) && board[1][y].equals(String) && board[2][y].equals(String))
                return true;
        }
        return false;
    }

    public boolean checkVertical(String String, String[][]board) {
        for(int x = 0; x <= 2; x++) {
            if(board[x][0].equals(String) && board[x][1].equals(String) && board[x][2].equals(String))
                return true;
        }
        return false;
    }

    public boolean checkDiagonal(String String, String[][]board) {
        if(board[0][0].equals(String) && board[1][1].equals(String) && board[2][2].equals(String)){
            return true;
        }
        if(board[0][2].equals(String) && board[1][1].equals(String) && board[2][0].equals(String)){
            return true;
        }
        return false;
    }

    public boolean check_winning(String String, String[][]board){
        return checkHorizontal(String,board) || checkVertical(String,board) || checkDiagonal(String,board);
    }


//public Player flip_turn(Player player){
//        if (player == human){
//            return AI;
//        } else {
//            return human;
//        }
//}

    //CHECK WHETHER THE BOARD IS FULL.
    public boolean board_is_full(String[][] board){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j<3; j++){
                if (board[i][j].equals("-")){
                    return false;
                }
            }
        }
        return true;
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
                board[1][0] = player.getPlayerSymbol();
                return true;
            } else if (move == 5) {
                board[1][1] = player.getPlayerSymbol();
                return true;
            } else if (move == 6) {
                board[1][2] = player.getPlayerSymbol();
                return true;
            } else if (move == 7) {
                board[2][0] = player.getPlayerSymbol();
                return true;
            } else if (move == 8) {
                board[2][1] = player.getPlayerSymbol();
                return true;
            } else if (move == 9) {
                board[2][2] = player.getPlayerSymbol();
                return true;
            }
        }
        return false;
    }

    //*****************************************************
    //Random Implementation
    //*****************************************************

    //Random implementation. AI pick an arbitrary number.
    public void AI_setMove_RANDOM(String[][] board, Player player){
        int min = 1;
        int max = 9;
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
            board[1][0] = player.getPlayerSymbol();
        } else if (move == 5) {
            board[1][1] = player.getPlayerSymbol();
        } else if (move == 6) {
            board[1][2] = player.getPlayerSymbol();
        } else if (move == 7) {
            board[2][0] = player.getPlayerSymbol();
        } else if (move == 8) {
            board[2][1] = player.getPlayerSymbol();
        } else if (move == 9) {
            board[2][2] = player.getPlayerSymbol();
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

                System.out.println("*********");
                printboard();
                System.out.println("*********");

                if (check_winning(AI.getPlayerSymbol(),board)){
                    System.out.println("\nAI is the Winner!");
                    System.out.println("*********");
                    printboard();
                    System.out.println("*********");
                    break;
                } else if (check_winning(human.getPlayerSymbol(),board)){
                    System.out.println("\nYou are the Winner!");
                    System.out.println("*********");
                    printboard();
                    System.out.println("*********");
                    break;
                }
                //-----Check ties-----
                if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                    System.out.println("\nBoth tied!");
                    System.out.println("*********");
                    printboard();
                    System.out.println("*********");
                    break;
                }
//            System.out.println("Valid moves left: " + isvalidMovesLeft(board));
            }

            //once board is full, check who is the winner!
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                System.out.println("*********");
                printboard();
                System.out.println("*********");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                System.out.println("*********");
                printboard();
                System.out.println("*********");
                break;
            }
            //-----Check ties-----
            if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                System.out.println("\nBoth tied!");
                System.out.println("*********");
                printboard();
                System.out.println("*********");
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
                System.out.println("*********");
                printboard();
                System.out.println("*********");
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
                    System.out.println("*********");
                    printboard();
                    System.out.println("*********");
                    break;
                } else if (check_winning(human.getPlayerSymbol(),board)){
                    System.out.println("\nYou are the Winner!");
                    System.out.println("*********");
                    printboard();
                    System.out.println("*********");
                    break;
                }
                //-----Check ties-----
                if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                    System.out.println("\nBoth tied!");
                    System.out.println("*********");
                    printboard();
                    System.out.println("*********");
                    break;
                }
            }
            //once board is full, check who is the winner!
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                System.out.println("*********");
                printboard();
                System.out.println("*********");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                System.out.println("*********");
                printboard();
                System.out.println("*********");
                break;
            }
            //-----Check ties-----
            if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                System.out.println("\nBoth tied!");
                System.out.println("*********");
                printboard();
                System.out.println("*********");
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
            for (int j = 0; j < 3; j++) {
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
                } else if (i == 1 && j == 0&& board[i][j].equals("-")) {
                    move = 4;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                } else if (i == 1 && j == 1&& board[i][j].equals("-")) {
                    move = 5;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                } else if (i == 1 && j == 2 && board[i][j].equals("-")) {
                    move = 6;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                } else if (i == 2 && j == 0&& board[i][j].equals("-")) {
                    move = 7;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                } else if (i == 2 && j == 1&& board[i][j].equals("-")) {
                    move = 8;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                } else if (i == 2 && j == 2&& board[i][j].equals("-")) {
                    move = 9;
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

    public ArrayList<Integer> get_ArrayList_of_ValidMoves(String[][] board){
        int move;
        ArrayList<Integer> moves_array = new ArrayList<>();
//        int count = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0 && j == 0 && board[i][j].equals("-")) {
                    move = 1;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        moves_array.add(move);
//
                    }
                } else if (i == 0 && j == 1&& board[i][j].equals("-")) {
                    move = 2;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        moves_array.add(move);
                    }
                } else if (i == 0 && j == 2&& board[i][j].equals("-")) {
                    move = 3;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        moves_array.add(move);
                    }
                } else if (i == 1 && j == 0&& board[i][j].equals("-")) {
                    move = 4;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        moves_array.add(move);
                    }
                } else if (i == 1 && j == 1&& board[i][j].equals("-")) {
                    move = 5;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        moves_array.add(move);
                    }
                } else if (i == 1 && j == 2&& board[i][j].equals("-")) {
                    move = 6;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        moves_array.add(move);
                    }
                } else if (i == 2 && j == 0&& board[i][j].equals("-")) {
                    move = 7;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        moves_array.add(move);
                    }
                } else if (i == 2 && j == 1&& board[i][j].equals("-")) {
                    move = 8;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        moves_array.add(move);
                    }
                } else if (i == 2 && j == 2&& board[i][j].equals("-")) {
                    move = 9;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        moves_array.add(move);
                    }
                }
            }
        }
//    System.out.println("Valid moves count: " + count);
        return moves_array;
    }

    //check whether the game has ended -> in other words, if the tree reaches its terminal node.
    public boolean is_Terminal(String[][] board){
        return check_winning(human.getPlayerSymbol(),board) || check_winning(AI.getPlayerSymbol(),board) || board_is_full(board);
    }

    public int utility_function(String[][] board){
        for (int row = 0; row < 3; row++) {
            if (board[row][0].equals(board[row][1]) && board[row][1].equals(board[row][2])) {
                //if it is terminal, then return a value. Book 5.2 and 5.3 -> is-Terminal(s)
                if (board[row][0].equals(AI.getPlayerSymbol()))
                    return +10;
                else if (board[row][0].equals(human.getPlayerSymbol()))
                    return -10;
            }
        }

        for (int col = 0; col < 3; col++) {
            if (board[0][col].equals(board[1][col]) && board[1][col].equals(board[2][col])) {
                if (board[0][col].equals(AI.getPlayerSymbol())){
                    return +10;
                } else if (board[0][col].equals(human.getPlayerSymbol())) {
                    return -10;
                }
            }
        }

        if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
            if (board[0][0].equals(AI.getPlayerSymbol()))
                return +10;
            else if (board[0][0].equals(human.getPlayerSymbol()))
                return -10;
        }

        if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
            if (board[0][2].equals(AI.getPlayerSymbol()))
                return +10;
            else if (board[0][2].equals(human.getPlayerSymbol()))
                return -10;
        }
        return 0;
    }



    public int minimax(String[][]board, int depth, boolean isMax){
        int score = utility_function(board);
        if (score == 10){
            return score;
        }
        if (score == -10) {
            return score;
        }
        if (!isValidMovesLeft(board)) {
            return 0;
        }
        if (isMax) {
            int best = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    // Check it is a valid move
                    if (check_valid_moves(board, colrowtomovenumber(i,j))) {
                        // Make the move
                        board[i][j] = AI.getPlayerSymbol();
                        best = Math.max(best, minimax(board, depth - 1, false));
                        board[i][j] ="-";
                    }
                }
            }
            return best;
        } else {
            int best = Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    // Check if it is a valid move
                    if ( check_valid_moves(board, colrowtomovenumber(i,j))) {
                        board[i][j] = human.getPlayerSymbol();
                        best = Math.min(best, minimax(board, depth - 1, true));
                        board[i][j] = "-";
                    }
                }
            }
            return best;
        }
    }

    public int findBestMove_MiniMax(String[][] board){
        int current_bestVal = Integer.MIN_VALUE;
        int row = -1;
        int col = -1;
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                //see if the move is a valid move.
                if (check_valid_moves(board, colrowtomovenumber(i,j))) {
                    board[i][j] = AI.getPlayerSymbol();
                    //default depth to 5.
                    int oldValue = minimax(board, 5, false);
                    board[i][j] = "-";
                    if (oldValue > current_bestVal) {
                        row = i;
                        col = j;
                        current_bestVal = oldValue;
                    }
                }
            }
        }
        if (row == 0 && col == 0) {
            return 1;
        } else if (row == 0 && col == 1) {
            return 2;
        } else if (row == 0 && col == 2) {
            return 3;
        } else if (row == 1 && col== 0) {
            return 4;
        } else if (row == 1 && col == 1) {
            return 5;
        } else if (row == 1 && col == 2) {
            return 6;
        } else if (row == 2 && col== 0) {
            return 7;
        } else if (row == 2 && col == 1) {
            return 8;
        } else if (row == 2 &&col== 2) {
            return 9;
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
        } else if (i == 1 && j == 0) {
            return 4;
        } else if (i == 1 && j == 1) {
            return 5;
        } else if (i == 1 && j == 2) {
            return 6;
        } else if (i == 2 && j == 0) {
            return 7;
        } else if (i == 2 && j == 1) {
            return 8;
        } else if (i == 2 && j == 2) {
            return 9;
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
            board[1][0] = player.getPlayerSymbol();
        } else if (move == 5) {
            board[1][1] = player.getPlayerSymbol();
        } else if (move == 6) {
            board[1][2] = player.getPlayerSymbol();
        } else if (move == 7) {
            board[2][0] = player.getPlayerSymbol();
        } else if (move == 8) {
            board[2][1] = player.getPlayerSymbol();
        } else if (move == 9) {
            board[2][2] = player.getPlayerSymbol();
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
            boolean humanvalue = Human_setMove(board,move,human);
//        System.out.println("Value: " + humanvalue);

            if (humanvalue == false){
                System.out.println("Invalid Move! Move again!");
            } else if (!board_is_full(board)) {
//            System.out.println("here");
//                AI_setMove_RANDOM(board,AI);
//                System.out.println(findBestMove(board));
                minmaxConvert(findBestMove_MiniMax(board),AI, board);
//            System.out.println("here2");//never reaches here if it is tied

                System.out.println("*********");
                printboard();
                System.out.println("*********");
//            System.out.println("Valid moves left: " + isvalidMovesLeft(board));
            }

            //once board is full, check who is the winner!
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                System.out.println("*********");
                printboard();
                System.out.println("*********");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                System.out.println("*********");
                printboard();
                System.out.println("*********");
                break;
            }
            //-----Check ties-----
            if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                System.out.println("\nBoth tied!");
                System.out.println("*********");
                printboard();
                System.out.println("*********");
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
                System.out.println("*********");
                printboard();
                System.out.println("*********");
                firstmove = false;

                if (check_winning(AI.getPlayerSymbol(),board)){
                    System.out.println("\nAI is the Winner!");
                    System.out.println("*********");
                    printboard();
                    System.out.println("*********");
                    break;
                } else if (check_winning(human.getPlayerSymbol(),board)){
                    System.out.println("\nYou are the Winner!");
                    System.out.println("*********");
                    printboard();
                    System.out.println("*********");
                    break;
                }
                //-----Check ties-----
                if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                    System.out.println("\nBoth tied!");
                    System.out.println("*********");
                    printboard();
                    System.out.println("*********");
                    break;
                }
            } else {
                if (humanvalue == true) {
                    minmaxConvert(findBestMove_MiniMax(board), AI, board);
                    System.out.println("*********");
                    printboard();
                    System.out.println("*********");

                    if (check_winning(AI.getPlayerSymbol(),board)){
                        System.out.println("\nAI is the Winner!");
                        System.out.println("*********");
                        printboard();
                        System.out.println("*********");
                        break;
                    } else if (check_winning(human.getPlayerSymbol(),board)){
                        System.out.println("\nYou are the Winner!");
                        System.out.println("*********");
                        printboard();
                        System.out.println("*********");
                        break;
                    }
                    //-----Check ties-----
                    if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                        System.out.println("\nBoth tied!");
                        System.out.println("*********");
                        printboard();
                        System.out.println("*********");
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
                System.out.println("*********");
                printboard();
                System.out.println("*********");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                System.out.println("*********");
                printboard();
                System.out.println("*********");
                break;
            }
            //-----Check ties-----
            if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                System.out.println("\nBoth tied!");
                System.out.println("*********");
                printboard();
                System.out.println("*********");
                break;
            }
//        move = Integer.parseInt(scanner.nextLine());
//        System.out.println("Board Value: " + board_is_full(board));
        }
    }

    //*****************************************************
    //Minimax with alpha beta prunning implementation.
    //*****************************************************

    public int minimax_alpha_beta(String[][]board, int depth, boolean isMax, int alpha, int beta){
        int score = utility_function(board);
        if (score == 10){
            return score;
        }
        if (score == -10) {
            return score;
        }
        if (!isValidMovesLeft(board)) {
            return 0;
        }
        if (isMax) {
            int best = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    // Check it is a valid move
                    if (check_valid_moves(board, colrowtomovenumber(i,j))) {
                        // Make the move
                        board[i][j] = AI.getPlayerSymbol();
                        best = Math.max(best, minimax_alpha_beta(board, depth + 1, false, alpha, beta));
                        board[i][j] ="-";

                        alpha = Math.max(alpha, best);
                        if (alpha >= beta) {
                            return best;
                        }
                    }
                }
            }

            return best;
        } else {
            int best = Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    // Check if it is a valid move
                    if (check_valid_moves(board, colrowtomovenumber(i,j))) {
                        board[i][j] = human.getPlayerSymbol();
                        best = Math.min(best, minimax_alpha_beta(board, depth + 1, true,alpha, beta));
//                        System.out.println("Depth: " + depth);
                        board[i][j] = "-";
                        beta = Math.min(beta, best);
                        if (beta <= alpha) {
                            return best;
                        }
                    }
                }
            }
//            System.out.println("Depth: " + depth);
            return best;
        }
    }


    public int findBestMove_MiniMax_AlphaBeta(String[][] board){
        int current_bestVal = -1000;
        int row = -1;
        int col = -1;
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                //see if the move is a valid move.
                if (check_valid_moves(board, colrowtomovenumber(i,j))) {
                    board[i][j] = AI.getPlayerSymbol();
                    int oldValue = minimax_alpha_beta(board, 0, false,Integer.MIN_VALUE, Integer.MAX_VALUE);
                    board[i][j] = "-";
                    if (oldValue > current_bestVal) {
                        row = i;
                        col = j;
                        current_bestVal = oldValue;
                    }
                }
            }
        }
        if (row == 0 && col == 0) {
            return 1;
        } else if (row == 0 && col == 1) {
            return 2;
        } else if (row == 0 && col == 2) {
            return 3;
        } else if (row == 1 && col== 0) {
            return 4;
        } else if (row == 1 && col == 1) {
            return 5;
        } else if (row == 1 && col == 2) {
            return 6;
        } else if (row == 2 && col== 0) {
            return 7;
        } else if (row == 2 && col == 1) {
            return 8;
        } else if (row == 2 &&col== 2) {
            return 9;
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
//            System.out.println("here");
//                AI_setMove_RANDOM(board,AI);
//                System.out.println(findBestMove(board));
                minmaxConvert(findBestMove_MiniMax_AlphaBeta(board),AI, board);
//            System.out.println("here2");//never reaches here if it is tied

                System.out.println("*********");
                printboard();
                System.out.println("*********");

//            System.out.println("Valid moves left: " + isvalidMovesLeft(board));
            }

            //once board is full, check who is the winner!
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                System.out.println("*********");
                printboard();
                System.out.println("*********");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                System.out.println("*********");
                printboard();
                System.out.println("*********");
                break;
            }
            //-----Check ties-----
            if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                System.out.println("\nBoth tied!");
                System.out.println("*********");
                printboard();
                System.out.println("*********");
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
                System.out.println("*********");
                printboard();
                System.out.println("*********");
                firstmove = false;
            } else {
                if (humanvalue == true){
                    minmaxConvert(findBestMove_MiniMax_AlphaBeta(board),AI, board);
                    System.out.println("*********");
                    printboard();
                    System.out.println("*********");


                    if (check_winning(AI.getPlayerSymbol(),board)){
                        System.out.println("\nAI is the Winner!");
                        System.out.println("*********");
                        printboard();
                        System.out.println("*********");
                        break;
                    } else if (check_winning(human.getPlayerSymbol(),board)){
                        System.out.println("\nYou are the Winner!");
                        System.out.println("*********");
                        printboard();
                        System.out.println("*********");
                        break;
                    }
                    //-----Check ties-----
                    if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                        System.out.println("\nBoth tied!");
                        System.out.println("*********");
                        printboard();
                        System.out.println("*********");
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
                    System.out.println("*********");
                    printboard();
                    System.out.println("*********");
                    break;
                } else if (check_winning(human.getPlayerSymbol(),board)){
                    System.out.println("\nYou are the Winner!");
                    System.out.println("*********");
                    printboard();
                    System.out.println("*********");
                    break;
                }
                //-----Check ties-----
                if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                    System.out.println("\nBoth tied!");
                    System.out.println("*********");
                    printboard();
                    System.out.println("*********");
                    break;
                }
            }

            //once board is full, check who is the winner!
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                System.out.println("*********");
                printboard();
                System.out.println("*********");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                System.out.println("*********");
                printboard();
                System.out.println("*********");
                break;
            }
            //-----Check ties-----
            if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                System.out.println("\nBoth tied!");
                System.out.println("*********");
                printboard();
                System.out.println("*********");
                break;
            }
//        move = Integer.parseInt(scanner.nextLine());
//        System.out.println("Board Value: " + board_is_full(board));
        }
    }

    //*****************************************************
    //H-Minimax with with a fixed depth cutoff implementation
    //*****************************************************


    public int evaluation_function(String[][] board, int depth){
        for (int row = 0; row < 3; row++) {
            if (board[row][0].equals(board[row][1]) && board[row][1].equals(board[row][2])) {
                //if it is terminal, then return a value. Book 5.2 and 5.3 -> is-Terminal(s)
                if (board[row][0].equals(AI.getPlayerSymbol()))
                    return 10;
                else if (board[row][0].equals(human.getPlayerSymbol()))
                    return -10;
            }
        }

        for (int col = 0; col < 3; col++) {
            if (board[0][col].equals(board[1][col]) && board[1][col].equals(board[2][col])) {
                if (board[0][col].equals(AI.getPlayerSymbol())){
                    return +10;
                } else if (board[0][col].equals(human.getPlayerSymbol())) {
                    return -10;
                }
            }
        }

        if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
            if (board[0][0].equals(AI.getPlayerSymbol()))
                return +10;
            else if (board[0][0].equals(human.getPlayerSymbol()))
                return -10;
        }

        if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
            if (board[0][2].equals(AI.getPlayerSymbol()))
                return +10;
            else if (board[0][2].equals(human.getPlayerSymbol()))
                return -10;
        }
        return 0;
    }


    public int Hminimax_alpha_beta_cutoff(String[][]board, int depth, boolean isMax, int alpha, int beta){
        int score = evaluation_function(board, depth);
        if (score == 10){
            return score;
        }
        if (score == -10) {
            return score;
        }
        if (!isValidMovesLeft(board)) {
            return 0;
        }
        if (isMax) {
            int best = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    // Check it is a valid move
                    if (check_valid_moves(board, colrowtomovenumber(i,j))) {
                        // Make the move
                        board[i][j] = AI.getPlayerSymbol();
                        best = Math.max(best, Hminimax_alpha_beta_cutoff(board, depth - 1, false, alpha, beta));
                        board[i][j] ="-";

                        alpha = Math.max(alpha, best);
                        if (alpha >= beta) {
                            return best;
                        }
                    }
                }
            }

            return best;
        } else {
            int best = Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    // Check if it is a valid move
                    if (check_valid_moves(board, colrowtomovenumber(i,j))) {
                        board[i][j] = human.getPlayerSymbol();
                        best = Math.min(best, Hminimax_alpha_beta_cutoff(board, depth - 1, true,alpha, beta));
//                        System.out.println("Depth: " + depth);
                        board[i][j] = "-";
                        beta = Math.min(beta, best);
                        if (beta <= alpha) {
                            return best;
                        }
                    }
                }
            }
//            System.out.println("Depth: " + depth);
            return best;
        }
    }


    public int findBestMove_HMiniMax_AlphaBeta_Cutoff(String[][] board, int DEFAULT_DEPTH){
        int current_bestVal = -1000;
        int row = -1;
        int col = -1;
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                //see if the move is a valid move.
                if (check_valid_moves(board, colrowtomovenumber(i,j))) {
                    board[i][j] = AI.getPlayerSymbol();
                    int oldValue = Hminimax_alpha_beta_cutoff(board, DEFAULT_DEPTH, false,Integer.MIN_VALUE, Integer.MAX_VALUE);
                    board[i][j] = "-";
                    if (oldValue > current_bestVal) {
                        row = i;
                        col = j;
                        current_bestVal = oldValue;
                    }
                }
            }
        }
        if (row == 0 && col == 0) {
            return 1;
        } else if (row == 0 && col == 1) {
            return 2;
        } else if (row == 0 && col == 2) {
            return 3;
        } else if (row == 1 && col== 0) {
            return 4;
        } else if (row == 1 && col == 1) {
            return 5;
        } else if (row == 1 && col == 2) {
            return 6;
        } else if (row == 2 && col== 0) {
            return 7;
        } else if (row == 2 && col == 1) {
            return 8;
        } else if (row == 2 &&col== 2) {
            return 9;
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
//                AI_setMove_RANDOM(board,AI);
//                System.out.println(findBestMove(board));

                minmaxConvert(findBestMove_HMiniMax_AlphaBeta_Cutoff(board, DEFAULT_DEPTH),AI, board);
//            System.out.println("here2");//never reaches here if it is tied

                System.out.println("*********");
                printboard();
                System.out.println("*********");

//            System.out.println("Valid moves left: " + isvalidMovesLeft(board));
            }

            //once board is full, check who is the winner!
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                System.out.println("*********");
                printboard();
                System.out.println("*********");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                System.out.println("*********");
                printboard();
                System.out.println("*********");
                break;
            }
            //-----Check ties-----
            if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                System.out.println("\nBoth tied!");
                System.out.println("*********");
                printboard();
                System.out.println("*********");
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
                System.out.println("*********");
                printboard();
                System.out.println("*********");
                firstmove = false;
            } else {
                if (humanvalue == true){
                    minmaxConvert(findBestMove_HMiniMax_AlphaBeta_Cutoff(board, DEFAULT_DEPTH),AI, board);
                    System.out.println("*********");
                    printboard();
                    System.out.println("*********");
                    if (check_winning(AI.getPlayerSymbol(),board)){
                        System.out.println("\nAI is the Winner!");
                        System.out.println("*********");
                        printboard();
                        System.out.println("*********");
                        break;
                    } else if (check_winning(human.getPlayerSymbol(),board)){
                        System.out.println("\nYou are the Winner!");
                        System.out.println("*********");
                        printboard();
                        System.out.println("*********");
                        break;
                    }
                    //-----Check ties-----
                    if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                        System.out.println("\nBoth tied!");
                        System.out.println("*********");
                        printboard();
                        System.out.println("*********");
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
                    System.out.println("*********");
                    printboard();
                    System.out.println("*********");
                    break;
                } else if (check_winning(human.getPlayerSymbol(),board)){
                    System.out.println("\nYou are the Winner!");
                    System.out.println("*********");
                    printboard();
                    System.out.println("*********");
                    break;
                }
                //-----Check ties-----
                if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                    System.out.println("\nBoth tied!");
                    System.out.println("*********");
                    printboard();
                    System.out.println("*********");
                    break;
                }
            }
            //once board is full, check who is the winner!
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                System.out.println("*********");
                printboard();
                System.out.println("*********");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                System.out.println("*********");
                printboard();
                System.out.println("*********");
                break;
            }
            //-----Check ties-----
            if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                System.out.println("\nBoth tied!");
                System.out.println("*********");
                printboard();
                System.out.println("*********");
                break;
            }
//        move = Integer.parseInt(scanner.nextLine());
//        System.out.println("Board Value: " + board_is_full(board));
        }
    }



}
