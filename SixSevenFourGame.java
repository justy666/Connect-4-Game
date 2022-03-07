
import java.util.Arrays;
import java.util.Scanner;
//By Frederick Liu, Justin Shen, Amish Fakun Spring 2022 CSC 242

public class SixSevenFourGame {

    public String[][] board = new String[6][7];
    Player human = new Player();
    Player AI = new Player();

    public SixSevenFourGame(){
        initializeboard();
    }

    public void initializeboard(){
        for (int i = 0; i < 6; i++){
            for (int j = 0; j<7; j++){
                //initialize the board to 0
                board[i][j] = "-";
            }
        }
    }


    public void print_board_with_instructions(){
        System.out.println("Coordinates with their corresponding number...");
        int count = 1;
        for (int i = 0; i < 6; i++){
            for (int j = 0; j<7; j++){
                System.out.print("| " + count + " |");
                count+=1;
            }
            System.out.println();
        }
    }

    public void printboard(){
        for (int i = 0; i < 6; i++){
            for (int j = 0; j<7; j++){
                System.out.print("| " + board[i][j] + " |");
                count++;
            }
            System.out.println();
        }
    }


    public boolean check_valid_moves(String[][] board, int move) {
        // Invalid moves, if the move is not within the bound.
        if (move == 1 || move == 2 || move == 3 || move == 4 || move == 5 || move == 6 || move == 7 || move == 8
                || move == 9 || move == 10 || move == 11 || move == 12 || move == 13 || move == 14 || move == 15
                || move == 16 || move == 17 || move == 18 || move == 19 || move == 20 || move == 21 || move == 22
                || move == 23 || move == 24 || move == 25 || move == 26 || move == 27 || move == 28 || move == 29
                || move == 30 || move == 31 || move == 32 || move == 33 || move == 34 || move == 35 || move == 36
                || move == 37 || move == 38 || move == 39 || move == 40 || move == 41 || move == 42) {
            // Invalid moves, if the space below the target move is empty, it is invalid.
            if (move == 1 && board[1][0].equals("-")) {
                return false;
            } else if (move == 8 && board[2][0].equals("-")) {
                return false;
            } else if (move == 15 && board[3][0].equals("-")) {
                return false;
            } else if (move == 22 && board[4][0].equals("-")) {
                return false;
            } else if (move == 29 && board[5][0].equals("-")) {
                return false;
            } else if (move == 2 && board[1][1].equals("-")) {
                return false;
            } else if (move == 9 && board[2][1].equals("-")) {
                return false;
            } else if (move == 16 && board[3][1].equals("-")) {
                return false;
            } else if (move == 23 && board[4][1].equals("-")) {
                return false;
            } else if (move == 30 && board[5][1].equals("-")) {
                return false;
            } else if (move == 3 && board[1][2].equals("-")) {
                return false;
            } else if (move == 10 && board[2][2].equals("-")) {
                return false;
            } else if (move == 17 && board[3][2].equals("-")) {
                return false;
            } else if (move == 24 && board[4][2].equals("-")) {
                return false;
            } else if (move == 31 && board[5][2].equals("-")) {
                return false;
            } else if (move == 4 && board[1][3].equals("-")) {
                return false;
            } else if (move == 11 && board[2][3].equals("-")) {
                return false;
            } else if (move == 18 && board[3][3].equals("-")) {
                return false;
            } else if (move == 25 && board[4][3].equals("-")) {
                return false;
            } else if (move == 32 && board[5][3].equals("-")) {
                return false;
            } else if (move == 5 && board[1][4].equals("-")) {
                return false;
            } else if (move == 12 && board[2][4].equals("-")) {
                return false;
            } else if (move == 19 && board[3][4].equals("-")) {
                return false;
            } else if (move == 26 && board[4][4].equals("-")) {
                return false;
            } else if (move == 33 && board[5][4].equals("-")) {
                return false;
            } else if (move == 6 && board[1][5].equals("-")) {
                return false;
            } else if (move == 13 && board[2][5].equals("-")) {
                return false;
            } else if (move == 20 && board[3][5].equals("-")) {
                return false;
            } else if (move == 27 && board[4][5].equals("-")) {
                return false;
            } else if (move == 34 && board[5][5].equals("-")) {
                return false;
            } else if (move == 7 && board[1][6].equals("-")) {
                return false;
            } else if (move == 14 && board[2][6].equals("-")) {
                return false;
            } else if (move == 21 && board[3][6].equals("-")) {
                return false;
            } else if (move == 28 && board[4][6].equals("-")) {
                return false;
            } else if (move == 35 && board[5][6].equals("-")) {
                return false;
            }
            // Invalid moves, if the space is already taken.
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
            } else if (move == 6 && !board[0][5].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 7 && !board[0][6].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 8 && !board[1][0].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 9 && !board[1][1].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 10 && !board[1][2].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 11 && !board[1][3].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 12 && !board[1][4].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 13 && !board[1][5].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 14 && !board[1][6].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 15 && !board[2][0].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 16 && !board[2][1].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 17 && !board[2][2].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 18 && !board[2][3].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 19 && !board[2][4].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 20 && !board[2][5].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 21 && !board[2][6].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 22 && !board[3][0].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 23 && !board[3][1].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 24 && !board[3][2].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 25 && !board[3][3].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 26 && !board[3][4].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 27 && !board[3][5].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 28 && !board[3][6].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 29 && !board[4][0].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 30 && !board[4][1].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 31 && !board[4][2].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 32 && !board[4][3].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 33 && !board[4][4].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 34 && !board[4][5].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 35 && !board[4][6].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 36 && !board[5][0].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 37 && !board[5][1].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 38 && !board[5][2].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 39 && !board[5][3].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 40 && !board[5][4].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 41 && !board[5][5].equalsIgnoreCase("-")) {
                return false;
            } else if (move == 42 && !board[5][6].equalsIgnoreCase("-")) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    //CHECK WHETHER THE BOARD IS FULL.
    public boolean board_is_full(String[][] board){
        for (int i = 0; i < 6; i++){
            for (int j = 0; j<7; j++){
                if (board[i][j].equals("-")){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean check_winning(String String, String[][]board) {
        //check horizontal
        for (int i = 0; i<4; i++){
            for (int j = 0; j < 6; j++){
                if (board[j][i].equals(String) &&
                board[j][i+1].equals(String)&&
                board[j][i+2].equals(String)&&
                        board[j][i+3].equals(String)){
                    return true;
                }
            }
        }
        //check vertical
        for (int i = 0; i<7; i++){
            for (int j = 0; j < 3; j++){
                if (board[j][i].equals(String) &&
                        board[j+1][i].equals(String)&&
                        board[j+2][i].equals(String)&&
                        board[j+3][i].equals(String)){
                    return true;
                }
            }
        }

        for (int i = 0; i<4; i++){
            for (int j = 0; j < 3; j++){
                if (board[j][i].equals(String) &&
                        board[j+1][i+1].equals(String)&&
                        board[j+2][i+2].equals(String)&&
                        board[j+3][i+3].equals(String)){
                    return true;
                }
            }
        }


        for (int i = 0; i<4; i++){
            for (int j = 3; j < 6; j++){
                if (board[j][i].equals(String) &&
                        board[j-1][i+1].equals(String)&&
                        board[j-2][i+2].equals(String)&&
                        board[j-3][i+3].equals(String)){
                    return true;
                }
            }
        }

//        for(int y = 0; y<5 ; y++){
//            for (int x = 0 ; x<(6-3) ; x++){
//                if (board[x][y].equals(String)   &&
//                        board[x+1][y].equals(String) &&
//                        board[x+2][y].equals(String) &&
//                        board[x+3][y].equals(String)){
//                    return true;
//                }
//            }
//        }
//        //check vertical
//        for(int y = 0 ; y<(6-3) ; y++){
//            for (int x = 0 ; x<6 ; x++){
//                if (board[x][y].equals(String)   &&
//                        board[x][y+1].equals(String) &&
//                        board[x][y+2].equals(String) &&
//                        board[x][y+3].equals(String)){
//                    return true;
//                }
//            }
//        }
//
//        //check downward diagonal
//        if(board[2][0].equals(String) && board[3][1].equals(String) && board[4][2].equals(String) && board[5][3].equals(String)){
//            return true;
//        }
//        if(board[1][0].equals(String) && board[2][1].equals(String) && board[3][2].equals(String) && board[4][3].equals(String)){
//            return true;
//        }
//        if(board[2][1].equals(String) && board[3][2].equals(String) && board[4][3].equals(String) && board[5][4].equals(String)){
//            return true;
//        }
//        if(board[0][0].equals(String) && board[1][1].equals(String) && board[2][2].equals(String) && board[3][3].equals(String)){
//            return true;
//        }
//        if(board[1][1].equals(String) && board[2][2].equals(String) && board[3][3].equals(String) && board[4][4].equals(String)){
//            return true;
//        }
//        if(board[5][5].equals(String) && board[2][2].equals(String) && board[3][3].equals(String) && board[4][4].equals(String)){
//            return true;
//        }
//        if(board[0][1].equals(String) && board[1][2].equals(String) && board[2][3].equals(String) && board[3][4].equals(String)){
//            return true;
//        }
//        if(board[4][5].equals(String) && board[1][2].equals(String) && board[2][3].equals(String) && board[3][4].equals(String)){
//            return true;
//        }
//        if(board[4][5].equals(String) && board[5][6].equals(String) && board[2][3].equals(String) && board[3][4].equals(String)){
//            return true;
//        }
//        if(board[0][2].equals(String) && board[1][3].equals(String) && board[2][4].equals(String) && board[3][5].equals(String)){
//            return true;
//        }
//        if(board[4][6].equals(String) && board[1][3].equals(String) && board[2][4].equals(String) && board[3][5].equals(String)){
//            return true;
//        }
//        if(board[0][3].equals(String) && board[1][4].equals(String) && board[2][5].equals(String) && board[3][6].equals(String)){
//            return true;
//        }
//
//        //check upward diagonal
//        if(board[3][0].equals(String) && board[2][1].equals(String) && board[1][2].equals(String) && board[0][3].equals(String)){
//            return true;
//        }
//        if(board[4][0].equals(String) && board[3][1].equals(String) && board[2][2].equals(String) && board[1][3].equals(String)){
//            return true;
//        }
//        if(board[0][4].equals(String) && board[3][1].equals(String) && board[2][2].equals(String) && board[1][3].equals(String)){
//            return true;
//        }
//        if(board[5][0].equals(String) && board[4][1].equals(String) && board[3][2].equals(String) && board[2][3].equals(String)){
//            return true;
//        }
//        if(board[1][4].equals(String) && board[4][1].equals(String) && board[3][2].equals(String) && board[2][3].equals(String)){
//            return true;
//        }
//        if(board[1][4].equals(String) && board[0][5].equals(String) && board[3][2].equals(String) && board[2][3].equals(String)){
//            return true;
//        }
//        if(board[5][1].equals(String) && board[4][2].equals(String) && board[3][3].equals(String) && board[2][4].equals(String)){
//            return true;
//        }
//        if(board[1][5].equals(String) && board[4][2].equals(String) && board[3][3].equals(String) && board[2][4].equals(String)){
//            return true;
//        }
//        if(board[1][5].equals(String) && board[0][6].equals(String) && board[3][3].equals(String) && board[2][4].equals(String)){
//            return true;
//        }
//        if(board[5][2].equals(String) && board[4][3].equals(String) && board[3][4].equals(String) && board[2][5].equals(String)){
//            return true;
//        }
//        if(board[1][6].equals(String) && board[4][3].equals(String) && board[3][4].equals(String) && board[2][5].equals(String)){
//            return true;
//        }
//        if(board[5][3].equals(String) && board[4][4].equals(String) && board[3][5].equals(String) && board[2][6].equals(String)){
//            return true;
//        }

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
                board[0][5] = player.getPlayerSymbol();
                return true;
            } else if (move == 7) {
                board[0][6] = player.getPlayerSymbol();
                return true;
            } else if (move == 8) {
                board[1][0] = player.getPlayerSymbol();
                return true;
            } else if (move == 9) {
                board[1][1] = player.getPlayerSymbol();
                return true;
            }else if (move == 10) {
                board[1][2] = player.getPlayerSymbol();
                return true;
            }else if (move == 11) {
                board[1][3] = player.getPlayerSymbol();
                return true;
            }else if (move == 12) {
                board[1][4] = player.getPlayerSymbol();
                return true;
            }else if (move == 13) {
                board[1][5] = player.getPlayerSymbol();
                return true;
            }else if (move == 14) {
                board[1][6] = player.getPlayerSymbol();
                return true;
            }else if (move == 15) {
                board[2][0] = player.getPlayerSymbol();
                return true;
            }else if (move == 16) {
                board[2][1] = player.getPlayerSymbol();
                return true;
            }else if (move == 17) {
                board[2][2] = player.getPlayerSymbol();
                return true;
            }else if (move == 18) {
                board[2][3] = player.getPlayerSymbol();
                return true;
            }else if (move == 19) {
                board[2][4] = player.getPlayerSymbol();
                return true;
            }else if (move == 20) {
                board[2][5] = player.getPlayerSymbol();
                return true;
            }else if (move == 21) {
                board[2][6] = player.getPlayerSymbol();
                return true;
            }else if (move == 22) {
                board[3][0] = player.getPlayerSymbol();
                return true;
            }else if (move == 23) {
                board[3][1] = player.getPlayerSymbol();
                return true;
            }else if (move == 24) {
                board[3][2] = player.getPlayerSymbol();
                return true;
            }else if (move == 25) {
                board[3][3] = player.getPlayerSymbol();
                return true;
            }else if (move == 26) {
                board[3][4] = player.getPlayerSymbol();
                return true;
            }else if (move == 27) {
                board[3][5] = player.getPlayerSymbol();
                return true;
            }else if (move == 28) {
                board[3][6] = player.getPlayerSymbol();
                return true;
            }else if (move == 29) {
                board[4][0] = player.getPlayerSymbol();
                return true;
            }else if (move == 30) {
                board[4][1] = player.getPlayerSymbol();
                return true;
            }else if (move == 31) {
                board[4][2] = player.getPlayerSymbol();
                return true;
            }else if (move == 32) {
                board[4][3] = player.getPlayerSymbol();
                return true;
            }else if (move == 33) {
                board[4][4] = player.getPlayerSymbol();
                return true;
            }else if (move == 34) {
                board[4][5] = player.getPlayerSymbol();
                return true;
            }else if (move == 35) {
                board[4][6] = player.getPlayerSymbol();
                return true;
            }else if (move == 36) {
                board[5][0] = player.getPlayerSymbol();
                return true;
            }else if (move == 37) {
                board[5][1] = player.getPlayerSymbol();
                return true;
            }else if (move == 38) {
                board[5][2] = player.getPlayerSymbol();
                return true;
            }else if (move == 39) {
                board[5][3] = player.getPlayerSymbol();
                return true;
            }else if (move == 40) {
                board[5][4] = player.getPlayerSymbol();
                return true;
            }else if (move == 41) {
                board[5][5] = player.getPlayerSymbol();
                return true;
            }else if (move == 42) {
                board[5][6] = player.getPlayerSymbol();
                return true;
            }
        }
        return false;
    }

    public void AI_setMove_RANDOM(String[][] board, Player player){
        int min = 1;
        int max = 42;
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
            board[0][5] = player.getPlayerSymbol();

        } else if (move == 7) {
            board[0][6] = player.getPlayerSymbol();

        } else if (move == 8) {
            board[1][0] = player.getPlayerSymbol();

        } else if (move == 9) {
            board[1][1] = player.getPlayerSymbol();

        }else if (move == 10) {
            board[1][2] = player.getPlayerSymbol();

        }else if (move == 11) {
            board[1][3] = player.getPlayerSymbol();

        }else if (move == 12) {
            board[1][4] = player.getPlayerSymbol();

        }else if (move == 13) {
            board[1][5] = player.getPlayerSymbol();

        }else if (move == 14) {
            board[1][6] = player.getPlayerSymbol();

        }else if (move == 15) {
            board[2][0] = player.getPlayerSymbol();

        }else if (move == 16) {
            board[2][1] = player.getPlayerSymbol();

        }else if (move == 17) {
            board[2][2] = player.getPlayerSymbol();

        }else if (move == 18) {
            board[2][3] = player.getPlayerSymbol();

        }else if (move == 19) {
            board[2][4] = player.getPlayerSymbol();

        }else if (move == 20) {
            board[2][5] = player.getPlayerSymbol();

        }else if (move == 21) {
            board[2][6] = player.getPlayerSymbol();

        }else if (move == 22) {
            board[3][0] = player.getPlayerSymbol();

        }else if (move == 23) {
            board[3][1] = player.getPlayerSymbol();

        }else if (move == 24) {
            board[3][2] = player.getPlayerSymbol();

        }else if (move == 25) {
            board[3][3] = player.getPlayerSymbol();

        }else if (move == 26) {
            board[3][4] = player.getPlayerSymbol();

        }else if (move == 27) {
            board[3][5] = player.getPlayerSymbol();

        }else if (move == 28) {
            board[3][6] = player.getPlayerSymbol();

        }else if (move == 29) {
            board[4][0] = player.getPlayerSymbol();

        }else if (move == 30) {
            board[4][1] = player.getPlayerSymbol();

        }else if (move == 31) {
            board[4][2] = player.getPlayerSymbol();

        }else if (move == 32) {
            board[4][3] = player.getPlayerSymbol();

        }else if (move == 33) {
            board[4][4] = player.getPlayerSymbol();

        }else if (move == 34) {
            board[4][5] = player.getPlayerSymbol();

        }else if (move == 35) {
            board[4][6] = player.getPlayerSymbol();

        }else if (move == 36) {
            board[5][0] = player.getPlayerSymbol();

        }else if (move == 37) {
            board[5][1] = player.getPlayerSymbol();

        }else if (move == 38) {
            board[5][2] = player.getPlayerSymbol();

        }else if (move == 39) {
            board[5][3] = player.getPlayerSymbol();

        }else if (move == 40) {
            board[5][4] = player.getPlayerSymbol();

        }else if (move == 41) {
            board[5][5] = player.getPlayerSymbol();

        }else if (move == 42) {
            board[5][6] = player.getPlayerSymbol();

        }
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

                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");

                if (check_winning(AI.getPlayerSymbol(),board)){
                    System.out.println("\nAI is the Winner!");
                    System.out.println("***************************************");
                    printboard();
                    System.out.println("***************************************");
                    break;
                } else if (check_winning(human.getPlayerSymbol(),board)){
                    System.out.println("\nYou are the Winner!");
                    System.out.println("***************************************");
                    printboard();
                    System.out.println("***************************************");
                    break;
                }
                //-----Check ties-----
                if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                    System.out.println("\nBoth tied!");
                    System.out.println("***************************************");
                    printboard();
                    System.out.println("***************************************");
                    break;
                }
//            System.out.println("Valid moves left: " + isvalidMovesLeft(board));
            }

            //once board is full, check who is the winner!
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");
                break;
            }
            //-----Check ties-----
            if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                System.out.println("\nBoth tied!");
                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");
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
                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");
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
                    System.out.println("***************************************");
                    printboard();
                    System.out.println("***************************************");
                    break;
                } else if (check_winning(human.getPlayerSymbol(),board)){
                    System.out.println("\nYou are the Winner!");
                    System.out.println("***************************************");
                    printboard();
                    System.out.println("***************************************");
                    break;
                }
                //-----Check ties-----
                if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                    System.out.println("\nBoth tied!");
                    System.out.println("***************************************");
                    printboard();
                    System.out.println("***************************************");
                    break;
                }
            }
            //once board is full, check who is the winner!
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");
                break;
            }
            //-----Check ties-----
            if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                System.out.println("\nBoth tied!");
                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");
                break;
            }
//        move = Integer.parseInt(scanner.nextLine());
//        System.out.println("Board Value: " + board_is_full(board));
        }
    }

    //***********************************************************************************************************************************************************************************************************
    //Minimax implementation.
    //***********************************************************************************************************************************************************************************************************

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
                } else if (i == 0 && j == 5 && board[i][j].equals("-")) {
                    move = 6;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                } else if (i == 0 && j == 6&& board[i][j].equals("-")) {
                    move = 7;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                } else if (i == 1 && j == 0&& board[i][j].equals("-")) {
                    move = 8;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                } else if (i == 1 && j == 1&& board[i][j].equals("-")) {
                    move = 9;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 1 && j == 2&& board[i][j].equals("-")) {
                    move = 10;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 1 && j == 3&& board[i][j].equals("-")) {
                    move = 11;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 1 && j == 4&& board[i][j].equals("-")) {
                    move = 12;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 1 && j == 5&& board[i][j].equals("-")) {
                    move = 13;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 1 && j == 6&& board[i][j].equals("-")) {
                    move = 14;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 2 && j == 0&& board[i][j].equals("-")) {
                    move = 15;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 2 && j == 1&& board[i][j].equals("-")) {
                    move = 16;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 2 && j == 2&& board[i][j].equals("-")) {
                    move = 17;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 2 && j == 3&& board[i][j].equals("-")) {
                    move = 18;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 2 && j == 4&& board[i][j].equals("-")) {
                    move = 19;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 2 && j == 5 && board[i][j].equals("-")) {
                    move = 20;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 2 && j == 6&& board[i][j].equals("-")) {
                    move = 21;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 3 && j == 0&& board[i][j].equals("-")) {
                    move = 22;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 3 && j == 1&& board[i][j].equals("-")) {
                    move = 23;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 3 && j == 2&& board[i][j].equals("-")) {
                    move = 24;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 3 && j == 3&& board[i][j].equals("-")) {
                    move = 25;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 3 && j == 4&& board[i][j].equals("-")) {
                    move = 26;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 3 && j == 5&& board[i][j].equals("-")) {
                    move = 27;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 3 && j == 6&& board[i][j].equals("-")) {
                    move = 28;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 4 && j == 0&& board[i][j].equals("-")) {
                    move = 29;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 4 && j == 1&& board[i][j].equals("-")) {
                    move = 30;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 4 && j == 2&& board[i][j].equals("-")) {
                    move = 31;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 4 && j == 3&& board[i][j].equals("-")) {
                    move = 32;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 4 && j == 4&& board[i][j].equals("-")) {
                    move = 33;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 4 && j == 5&& board[i][j].equals("-")) {
                    move = 34;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 4 && j == 6&& board[i][j].equals("-")) {
                    move = 35;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 5 && j == 0&& board[i][j].equals("-")) {
                    move = 36;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 5 && j == 1&& board[i][j].equals("-")) {
                    move = 37;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 5 && j == 2&& board[i][j].equals("-")) {
                    move = 38;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 5 && j == 3&& board[i][j].equals("-")) {
                    move = 39;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 5 && j == 4&& board[i][j].equals("-")) {
                    move = 40;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 5 && j == 5&& board[i][j].equals("-")) {
                    move = 41;
                    if (check_valid_moves(board, move)){
//                    ++count;
                        return true;
                    }
                }else if (i == 5 && j == 6&& board[i][j].equals("-")) {
                    move = 42;
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

    public boolean is_Terminal(String[][] board){
        return check_winning(human.getPlayerSymbol(),board) || check_winning(AI.getPlayerSymbol(),board) || board_is_full(board);
    }

    public int utility_function(String[][] board, String symbol){
//        System.out.println("here");
        int score = 0;
        String[] col = new String[7];
        String[] row = new String[6];
        String[] set = new String[4];

        String[]center = new String[6];
        for (int i = 0; i<6; i++){
            center[i] = board[i][4];
        }
        score += countNumberOfSymbolOnARow(center, symbol) * 3;

        for ( int r = 0; r < 6; r++) {
            for ( int c = 0; c < 7; c++) {
                col[c] = board[r][c]; // this is a distinct row alone
            }
            for ( int c = 0; c < 7 - 3; c++) {
                for (int i = 0; i < 4; i++) {
                    set[i] = col[c + i]; // for each possible "set" of 4 spots from that row
                }
                score += getScore_Utility(set, symbol); // find score
            }
        }

        // vertical
        for ( int c = 0; c < 7; c++) {
            for ( int r = 0; r < 6; r++) {
                row[r] = board[r][c];
            }
            for ( int r = 0; r < 6 - 3; r++) {
                for (int i = 0; i < 4; i++) {
                    set[i] = row[r + i];
                }
                score += getScore_Utility(set, symbol);
            }
        }
        // diagonals
        for ( int r = 0; r < 6 - 3; r++) {
            for ( int c = 0; c < 7; c++) {
                col[c] = board[r][c];
            }
            for ( int c = 0; c < 7 - 3; c++) {
                for (int i = 0; i < 4; i++) {
                    set[i] = board[r + i][c + i];
                }
                score += getScore_Utility(set, symbol);
            }
        }
        for ( int r = 0; r < 6 - 3; r++) {
            for ( int c = 0; c < 7; c++) {
                col[c] = board[r][c];
            }
            for ( int c = 0; c < 7 - 3; c++) {
                for (int i = 0; i < 4; i++) {
                    set[i] = board[r + 3 - i][c + i];
                }
                score += getScore_Utility(set, symbol);
            }
        }
        return score;
    }


    public int getScore_Utility(String[] window, String piece){
        int score = 0;
        String opp_piece = human.getPlayerSymbol();
        if (piece.equals(human.getPlayerSymbol())){
            opp_piece = AI.getPlayerSymbol();
        }
        if (countNumberOfSymbolOnARow(window, piece) == 4){
            score += 100;
        }
        else if (countNumberOfSymbolOnARow(window, piece) == 3 &&
                countNumberOfSymbolOnARow(window, "-") == 1){
            score += 5;

        }else if (countNumberOfSymbolOnARow(window, piece) == 2 &&
                countNumberOfSymbolOnARow(window, "-") == 2){
            score += 2;
        }

        if (countNumberOfSymbolOnARow(window, opp_piece) == 3 &&
                countNumberOfSymbolOnARow(window, "-") == 1){
            score -= 4;
        }

        return score;
    }

int count3 = 0;
    long start = 0;
    long end = 0;
    public int minimax(String[][]board, int depth, boolean isMax){
        count3 ++;
//        int score = evaluation_function(board, AI.getPlayerSymbol());
//        System.out.println();
//        System.out.println(score);
//        System.out.println("count: " + count + " depth: " + depth + " score: " + score);
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
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 7; j++) {
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
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 7; j++) {
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
        int Current_bestVal = Integer.MIN_VALUE;

        int row = -1;
        int col = -1;
        int i;
        int j;

        int oldValue;
        for ( i = 0; i < 6; i++) {
            for ( j = 0; j < 7; j++) {
                //see if the move is a valid move.
                if (check_valid_moves(board, colrowtomovenumber(i,j))) {
                    board[i][j] = AI.getPlayerSymbol();

                    oldValue = minimax(board, 5, false);

//                    oldValue = -oldValue;//look at this...
//                    System.out.println("valid i: " + i + " valid j: " + j + " oldValue: " + oldValue);
                    board[i][j] = "-";
//                    System.out.println(oldValue);
                    if (oldValue > Current_bestVal) {
//                        System.out.println("it is greater.");
                        row = i;
                        col = j;
                        Current_bestVal = oldValue;
//                        System.out.println("GREATER valid i: " + i + " valid j: " + j + " Current_bestVal: " + Current_bestVal);
//                        System.out.println("the greater value: " + Current_bestVal);
                    }
                }

            }

        }
        System.out.println("Visited: " + count3 + " States ||" + " Best Move: (" + row + ", " + col + ") || Value: " + Current_bestVal);
//        System.out.println("**FINAL valid i: " + bestMove.row + " valid j: " + bestMove.col + " FINAL Current_bestVal: " + Current_bestVal);
        if (row == 0 && col == 0 ) {
            return 1;

        } else if (row == 0 && col == 1) {
            return 2;

        } else if (row == 0 && col == 2) {
            return 3;

        } else if (row == 0 && col == 3) {
            return 4;

        } else if (row == 0 && col == 4) {
            return 5;

        } else if (row == 0 && col == 5 ) {
            return 6;

        } else if (row == 0 && col == 6) {
            return 7;

        } else if (row == 1 && col == 0) {
            return 8;

        } else if (row == 1 && col == 1) {
            return 9;

        }else if (row == 1 && col == 2) {
            return 10;

        }else if (row == 1 && col == 3) {
            return 11;

        }else if (row == 1 && col == 4) {
            return 12;

        }else if (row == 1 && col == 5) {
            return 13;

        }else if (row == 1 && col == 6) {
            return 14;

        }else if (row == 2 && col == 0) {
            return 15;

        }else if (row == 2 && col == 1) {
            return 16;

        }else if (row == 2 && col == 2) {
            return 17;

        }else if (row == 2 && col == 3) {
            return 18;

        }else if (row == 2 && col == 4) {
            return 19;

        }else if (row == 2 && col == 5) {
            return 20;

        }else if (row == 2 && col == 6) {
            return 21;

        }else if (row == 3 && col == 0) {
            return 22;

        }else if (row == 3 && col == 1) {
            return 23;

        }else if (row == 3 && col == 2) {
            return 24;

        }else if (row == 3 && col == 3) {
            return 25;

        }else if (row == 3 && col == 4) {
            return 26;

        }else if (row == 3 && col == 5) {
            return 27;

        }else if (row == 3 && col == 6) {
            return 28;

        }else if (row == 4 && col == 0) {
            return 29;

        }else if (row == 4 && col == 1) {
            return 30;

        }else if (row == 4 && col == 2) {
            return 31;

        }else if (row == 4 && col == 3) {
            return 32;

        }else if (row == 4 && col == 4) {
            return 33;

        }else if (row == 4 && col == 5) {
            return 34;

        }else if (row == 4 && col == 6) {
            return 35;

        }else if (row == 5 && col == 0) {
            return 36;

        }else if (row == 5 && col == 1) {
            return 37;

        }else if (row == 5 && col == 2) {
            return 38;

        }else if (row == 5 && col == 3) {
            return 39;

        }else if (row == 5 && col == 4) {
            return 40;

        }else if (row == 5 && col == 5) {
            return 41;

        }else if (row == 5 && col == 6) {
            return 42;
        }
        return 0;

    }


    public int colrowtomovenumber(int i, int j){

        if (i == 0 && j == 0 ) {
            return 1;

        } else if (i == 0 && j == 1) {
            return 2;

        } else if (i == 0 && j == 2) {
            return 3;

        } else if (i == 0 && j == 3) {
            return 4;

        } else if (i == 0 && j == 4) {
            return 5;

        } else if (i == 0 && j == 5 ) {
            return 6;

        } else if (i == 0 && j == 6) {
            return 7;

        } else if (i == 1 && j == 0) {
            return 8;

        } else if (i == 1 && j == 1) {
            return 9;

        }else if (i == 1 && j == 2) {
            return 10;

        }else if (i == 1 && j == 3) {
            return 11;

        }else if (i == 1 && j == 4) {
            return 12;

        }else if (i == 1 && j == 5) {
            return 13;

        }else if (i == 1 && j == 6) {
            return 14;

        }else if (i == 2 && j == 0) {
            return 15;

        }else if (i == 2 && j == 1) {
            return 16;

        }else if (i == 2 && j == 2) {
            return 17;

        }else if (i == 2 && j == 3) {
            return 18;

        }else if (i == 2 && j == 4) {
            return 19;

        }else if (i == 2 && j == 5) {
            return 20;

        }else if (i == 2 && j == 6) {
            return 21;

        }else if (i == 3 && j == 0) {
            return 22;

        }else if (i == 3 && j == 1) {
            return 23;

        }else if (i == 3 && j == 2) {
            return 24;

        }else if (i == 3 && j == 3) {
            return 25;

        }else if (i == 3 && j == 4) {
            return 26;

        }else if (i == 3 && j == 5) {
            return 27;

        }else if (i == 3 && j == 6) {
            return 28;

        }else if (i == 4 && j == 0) {
            return 29;

        }else if (i == 4 && j == 1) {
            return 30;

        }else if (i == 4 && j == 2) {
            return 31;

        }else if (i == 4 && j == 3) {
            return 32;

        }else if (i == 4 && j == 4) {
            return 33;

        }else if (i == 4 && j == 5) {
            return 34;

        }else if (i == 4 && j == 6) {
            return 35;

        }else if (i == 5 && j == 0) {
            return 36;

        }else if (i == 5 && j == 1) {
            return 37;

        }else if (i == 5 && j == 2) {
            return 38;

        }else if (i == 5 && j == 3) {
            return 39;

        }else if (i == 5 && j == 4) {
            return 40;

        }else if (i == 5 && j == 5) {
            return 41;

        }else if (i == 5 && j == 6) {
            return 42;
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
            board[0][5] = player.getPlayerSymbol();

        } else if (move == 7) {
            board[0][6] = player.getPlayerSymbol();

        } else if (move == 8) {
            board[1][0] = player.getPlayerSymbol();

        } else if (move == 9) {
            board[1][1] = player.getPlayerSymbol();

        }else if (move == 10) {
            board[1][2] = player.getPlayerSymbol();

        }else if (move == 11) {
            board[1][3] = player.getPlayerSymbol();

        }else if (move == 12) {
            board[1][4] = player.getPlayerSymbol();

        }else if (move == 13) {
            board[1][5] = player.getPlayerSymbol();

        }else if (move == 14) {
            board[1][6] = player.getPlayerSymbol();

        }else if (move == 15) {
            board[2][0] = player.getPlayerSymbol();

        }else if (move == 16) {
            board[2][1] = player.getPlayerSymbol();

        }else if (move == 17) {
            board[2][2] = player.getPlayerSymbol();

        }else if (move == 18) {
            board[2][3] = player.getPlayerSymbol();

        }else if (move == 19) {
            board[2][4] = player.getPlayerSymbol();

        }else if (move == 20) {
            board[2][5] = player.getPlayerSymbol();

        }else if (move == 21) {
            board[2][6] = player.getPlayerSymbol();

        }else if (move == 22) {
            board[3][0] = player.getPlayerSymbol();

        }else if (move == 23) {
            board[3][1] = player.getPlayerSymbol();

        }else if (move == 24) {
            board[3][2] = player.getPlayerSymbol();

        }else if (move == 25) {
            board[3][3] = player.getPlayerSymbol();

        }else if (move == 26) {
            board[3][4] = player.getPlayerSymbol();

        }else if (move == 27) {
            board[3][5] = player.getPlayerSymbol();

        }else if (move == 28) {
            board[3][6] = player.getPlayerSymbol();

        }else if (move == 29) {
            board[4][0] = player.getPlayerSymbol();

        }else if (move == 30) {
            board[4][1] = player.getPlayerSymbol();

        }else if (move == 31) {
            board[4][2] = player.getPlayerSymbol();

        }else if (move == 32) {
            board[4][3] = player.getPlayerSymbol();

        }else if (move == 33) {
            board[4][4] = player.getPlayerSymbol();

        }else if (move == 34) {
            board[4][5] = player.getPlayerSymbol();

        }else if (move == 35) {
            board[4][6] = player.getPlayerSymbol();

        }else if (move == 36) {
            board[5][0] = player.getPlayerSymbol();

        }else if (move == 37) {
            board[5][1] = player.getPlayerSymbol();

        }else if (move == 38) {
            board[5][2] = player.getPlayerSymbol();

        }else if (move == 39) {
            board[5][3] = player.getPlayerSymbol();

        }else if (move == 40) {
            board[5][4] = player.getPlayerSymbol();

        }else if (move == 41) {
            board[5][5] = player.getPlayerSymbol();

        }else if (move == 42) {
            board[5][6] = player.getPlayerSymbol();
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
                if (check_winning(AI.getPlayerSymbol(),board)){
                    System.out.println("\nAI is the Winner!");
                    System.out.println("***************************************");
                    printboard();
                    System.out.println("***************************************");
                    break;
                } else if (check_winning(human.getPlayerSymbol(),board)){
                    System.out.println("\nYou are the Winner!");
                    System.out.println("***************************************");
                    printboard();
                    System.out.println("***************************************");
                    break;
                }
//            System.out.println("here");
//                AI_setMove_RANDOM(board,AI);
//                System.out.println(findBestMove(board));
                start = System.nanoTime();
                minmaxConvert(findBestMove_MiniMax(board),AI, board);
                end = System.nanoTime();
                System.out.println("Used Time (in Nanoseconds): " + (end-start));
//            System.out.println("here2");//never reaches here if it is tied

                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");
//            System.out.println("Valid moves left: " + isvalidMovesLeft(board));
            }

            //once board is full, check who is the winner!
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");
                break;
            }
            //-----Check ties-----
            if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                System.out.println("\nBoth tied!");
                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");
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
                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");
                firstmove = false;

                if (check_winning(AI.getPlayerSymbol(),board)){
                    System.out.println("\nAI is the Winner!");
                    System.out.println("***************************************");
                    printboard();
                    System.out.println("***************************************");
                    break;
                } else if (check_winning(human.getPlayerSymbol(),board)){
                    System.out.println("\nYou are the Winner!");
                    System.out.println("***************************************");
                    printboard();
                    System.out.println("***************************************");
                    break;
                }
                //-----Check ties-----
                if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                    System.out.println("\nBoth tied!");
                    System.out.println("***************************************");
                    printboard();
                    System.out.println("***************************************");
                    break;
                }
            } else {
                if (humanvalue == true) {
                    start = System.nanoTime();
                    minmaxConvert(findBestMove_MiniMax(board), AI, board);
                    end = System.nanoTime();
                    System.out.println("Used Time (in Nanoseconds): " + (end-start));

                    System.out.println("***************************************");
                    printboard();
                    System.out.println("***************************************");

                    if (check_winning(AI.getPlayerSymbol(),board)){
                        System.out.println("\nAI is the Winner!");
                        System.out.println("***************************************");
                        printboard();
                        System.out.println("***************************************");
                        break;
                    } else if (check_winning(human.getPlayerSymbol(),board)){
                        System.out.println("\nYou are the Winner!");
                        System.out.println("***************************************");
                        printboard();
                        System.out.println("***************************************");
                        break;
                    }
                    //-----Check ties-----
                    if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                        System.out.println("\nBoth tied!");
                        System.out.println("***************************************");
                        printboard();
                        System.out.println("***************************************");
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
                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");
                break;
            }
            //-----Check ties-----
            if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                System.out.println("\nBoth tied!");
                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");
                break;
            }
//        move = Integer.parseInt(scanner.nextLine());
//        System.out.println("Board Value: " + board_is_full(board));
        }
    }

    //***********************************************************************************************************************************************************************************************************
    //Minimax with alpha beta prunning implementation.
    //***********************************************************************************************************************************************************************************************************
    int count2 = 0;
    long start1 = 0;
    long end1 = 0;
    public int minimax_alpha_beta(String[][]board, int depth, boolean isMax, int alpha, int beta){
        count2 ++;
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
                return evaluation_function(board, AI.getPlayerSymbol()); //get the value from evaluation function
            }
        }
        if (isMax) {//max
            int value = -9999999;
            int new_best;
            int col_num = -1;
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 7; j++) {
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
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 7; j++) {
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
        int Current_bestVal = -1000;
        int row = -1;
        int col = -1;
        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 7; j++)
            {
                //see if the move is a valid move.
                if (check_valid_moves(board, colrowtomovenumber(i,j))) {
                    board[i][j] = AI.getPlayerSymbol();
                    int oldValue = minimax_alpha_beta(board, 5, false,Integer.MIN_VALUE, Integer.MAX_VALUE);
                    board[i][j] = "-";
                    if (oldValue > Current_bestVal) {
                        row = i;
                        col = j;
                        Current_bestVal = oldValue;
                    }
                }
            }
        }
        System.out.println("Visited: " + count2 + " States ||" + " Best Move: (" + row + ", " + col + ") || Value: " + Current_bestVal);
        if (row == 0 && col == 0 ) {
            return 1;

        } else if (row == 0 && col == 1) {
            return 2;

        } else if (row == 0 && col == 2) {
            return 3;

        } else if (row == 0 && col == 3) {
            return 4;

        } else if (row == 0 && col == 4) {
            return 5;

        } else if (row == 0 && col == 5 ) {
            return 6;

        } else if (row == 0 && col == 6) {
            return 7;

        } else if (row == 1 && col == 0) {
            return 8;

        } else if (row == 1 && col == 1) {
            return 9;

        }else if (row == 1 && col == 2) {
            return 10;

        }else if (row == 1 && col == 3) {
            return 11;

        }else if (row == 1 && col == 4) {
            return 12;

        }else if (row == 1 && col == 5) {
            return 13;

        }else if (row == 1 && col == 6) {
            return 14;

        }else if (row == 2 && col == 0) {
            return 15;

        }else if (row == 2 && col == 1) {
            return 16;

        }else if (row == 2 && col == 2) {
            return 17;

        }else if (row == 2 && col == 3) {
            return 18;

        }else if (row == 2 && col == 4) {
            return 19;

        }else if (row == 2 && col == 5) {
            return 20;

        }else if (row == 2 && col == 6) {
            return 21;

        }else if (row == 3 && col == 0) {
            return 22;

        }else if (row == 3 && col == 1) {
            return 23;

        }else if (row == 3 && col == 2) {
            return 24;

        }else if (row == 3 && col == 3) {
            return 25;

        }else if (row == 3 && col == 4) {
            return 26;

        }else if (row == 3 && col == 5) {
            return 27;

        }else if (row == 3 && col == 6) {
            return 28;

        }else if (row == 4 && col == 0) {
            return 29;

        }else if (row == 4 && col == 1) {
            return 30;

        }else if (row == 4 && col == 2) {
            return 31;

        }else if (row == 4 && col == 3) {
            return 32;

        }else if (row == 4 && col == 4) {
            return 33;

        }else if (row == 4 && col == 5) {
            return 34;

        }else if (row == 4 && col == 6) {
            return 35;

        }else if (row == 5 && col == 0) {
            return 36;

        }else if (row == 5 && col == 1) {
            return 37;

        }else if (row == 5 && col == 2) {
            return 38;

        }else if (row == 5 && col == 3) {
            return 39;

        }else if (row == 5 && col == 4) {
            return 40;

        }else if (row == 5 && col == 5) {
            return 41;

        }else if (row == 5 && col == 6) {
            return 42;
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
                    System.out.println("***************************************");
                    printboard();
                    System.out.println("***************************************");
                    break;
                } else if (check_winning(human.getPlayerSymbol(),board)){
                    System.out.println("\nYou are the Winner!");
                    System.out.println("***************************************");
                    printboard();
                    System.out.println("***************************************");
                    break;
                }
//            System.out.println("here");
//                AI_setMove_RANDOM(board,AI);
//                System.out.println(findBestMove(board));
                start1 = System.nanoTime();
                minmaxConvert(findBestMove_MiniMax_AlphaBeta(board),AI, board);
                end1 = System.nanoTime();
                System.out.println("Used Time (in Nanoseconds): " + (end1-start1));
//            System.out.println("here2");//never reaches here if it is tied

                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");

//            System.out.println("Valid moves left: " + isvalidMovesLeft(board));
            }

            //once board is full, check who is the winner!
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");
                break;
            }
            //-----Check ties-----
            if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                System.out.println("\nBoth tied!");
                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");
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
                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");
                firstmove = false;
            } else {
                if (humanvalue == true){
                    start1 = System.nanoTime();
                    minmaxConvert(findBestMove_MiniMax_AlphaBeta(board),AI, board);
                    end1 = System.nanoTime();
                    System.out.println("Used Time (in Nanoseconds): " + (end1-start1));

                    System.out.println("***************************************");
                    printboard();
                    System.out.println("***************************************");


                    if (check_winning(AI.getPlayerSymbol(),board)){
                        System.out.println("\nAI is the Winner!");
                        System.out.println("***************************************");
                        printboard();
                        System.out.println("***************************************");
                        break;
                    } else if (check_winning(human.getPlayerSymbol(),board)){
                        System.out.println("\nYou are the Winner!");
                        System.out.println("***************************************");
                        printboard();
                        System.out.println("***************************************");
                        break;
                    }
                    //-----Check ties-----
                    if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                        System.out.println("\nBoth tied!");
                        System.out.println("***************************************");
                        printboard();
                        System.out.println("***************************************");
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
                    System.out.println("***************************************");
                    printboard();
                    System.out.println("***************************************");
                    break;
                } else if (check_winning(human.getPlayerSymbol(),board)){
                    System.out.println("\nYou are the Winner!");
                    System.out.println("***************************************");
                    printboard();
                    System.out.println("***************************************");
                    break;
                }
                //-----Check ties-----
                if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                    System.out.println("\nBoth tied!");
                    System.out.println("***************************************");
                    printboard();
                    System.out.println("***************************************");
                    break;
                }
            }

            //once board is full, check who is the winner!
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");
                break;
            }
            //-----Check ties-----
            if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                System.out.println("\nBoth tied!");
                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");
                break;
            }

//        move = Integer.parseInt(scanner.nextLine());
//        System.out.println("Board Value: " + board_is_full(board));
        }
    }


    //***********************************************************************************************************************************************************************************************************
    //H-Minimax with with a fixed depth cutoff implementation
    //***********************************************************************************************************************************************************************************************************

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


    
//    public int evaluation_function(String[][] window, String piece){
//        int score = 0;
//        String opp_piece = AI.getPlayerSymbol();
//        if (piece.equals(AI.getPlayerSymbol())){
//            opp_piece = human.getPlayerSymbol();
//        }
//
//        //vertical
//        for (int i = 0; i < 6; i++){
//            //two
//            if (window[0][i].equals(opp_piece) && window[0][i].equals(window[1][i])){
//                score -= 605;
//            }
//            if (window[1][i].equals(opp_piece) && window[1][i].equals(window[2][i])){
//                score -= 605;
//            }
//            if (window[2][i].equals(opp_piece) && window[2][i].equals(window[3][i])){
//                score -= 605;
//            }
//            if (window[3][i].equals(opp_piece) && window[3][i].equals(window[4][i])){
//                score -= 605;
//            }
//            if (window[4][i].equals(opp_piece) && window[4][i].equals(window[5][i])){
//                score -= 605;
//            }
//            ///three
//            if (window[0][i].equals(opp_piece) && window[0][i].equals(window[1][i]) && window[1][i].equals(window[2][i])){
//                score -= 6050;
//            }
//            if (window[1][i].equals(opp_piece) && window[1][i].equals(window[2][i]) && window[2][i].equals(window[3][i])){
//                score -= 6050;
//            }
//
//            if (window[2][i].equals(opp_piece) && window[2][i].equals(window[3][i]) && window[3][i].equals(window[4][i])){
//                score -= 6050;
//            }
//            if (window[3][i].equals(opp_piece) && window[3][i].equals(window[4][i]) && window[4][i].equals(window[5][i])){
//                score -= 6050;
//            }
//            //piece
//            if (window[0][i].equals(piece) && window[0][i].equals(window[1][i])){
//                score += 600;
//            }
//            if (window[1][i].equals(piece) && window[1][i].equals(window[2][i])){
//                score += 600;
//            }
//            if (window[2][i].equals(piece) && window[2][i].equals(window[3][i])){
//                score += 600;
//            }
//            if (window[3][i].equals(piece) && window[3][i].equals(window[4][i])){
//                score += 600;
//            }
//            if (window[4][i].equals(piece) && window[4][i].equals(window[5][i])){
//                score += 600;
//            }
//            ///three
//            if (window[0][i].equals(piece) && window[0][i].equals(window[1][i]) && window[1][i].equals(window[2][i])){
//                score += 6000;
//            }
//            if (window[1][i].equals(piece) && window[1][i].equals(window[2][i]) && window[2][i].equals(window[3][i])){
//                score += 6000;
//            }
//            if (window[2][i].equals(piece) && window[2][i].equals(window[3][i]) && window[3][i].equals(window[4][i])){
//                score += 6000;
//            }
//            if (window[3][i].equals(piece) && window[3][i].equals(window[4][i]) && window[4][i].equals(window[5][i])){
//                score += 6000;
//            }
//        }
//
//        //horizontal
//        for (int i = 0; i < 6; i++){
//            //two
//            if (window[i][0].equals(opp_piece) && window[i][0].equals(window[i][1])){
//                score -= 605;
//            }
//            if (window[i][1].equals(opp_piece) && window[i][1].equals(window[i][2])){
//                score -= 605;
//            }if (window[i][2].equals(opp_piece) && window[i][2].equals(window[i][3])){
//                score -= 605;
//            }if (window[i][3].equals(opp_piece) && window[i][3].equals(window[i][4])){
//                score -= 605;
//            }if (window[i][4].equals(opp_piece) && window[i][4].equals(window[i][5])){
//                score -= 605;
//            }if (window[i][5].equals(opp_piece) && window[i][5].equals(window[i][6])){
//                score -= 605;
//            }
//            ///three
//            if (window[i][0].equals(opp_piece) && window[i][0].equals(window[i][1]) && window[i][1].equals(window[i][2])){
//                score -= 6050;
//            }
//            if (window[i][1].equals(opp_piece) && window[i][1].equals(window[i][2]) && window[i][2].equals(window[i][3])){
//                score -= 6050;
//            }
//            if (window[i][2].equals(opp_piece) && window[i][2].equals(window[i][3]) && window[i][3].equals(window[i][4])){
//                score -= 6050;
//            }
//            if (window[i][3].equals(opp_piece) && window[i][3].equals(window[i][4]) && window[i][4].equals(window[i][5])){
//                score -= 6050;
//            }
//            if (window[i][4].equals(opp_piece) && window[i][4].equals(window[i][5]) && window[i][5].equals(window[i][6])){
//                score -= 6050;
//            }
//
//            //xx_x or x_xx
//            if (window[i][0].equals(opp_piece) && window[i][0].equals(window[i][1]) && window[i][1].equals(window[i][3])){
//                score -= 6050;
//            }
//            if (window[i][0].equals(opp_piece) && window[i][0].equals(window[i][2]) && window[i][2].equals(window[i][3])){
//                score -= 6050;
//            }
//            if (window[i][1].equals(opp_piece) && window[i][1].equals(window[i][2]) && window[i][2].equals(window[i][4])){
//                score -= 6050;
//            }
//            if (window[i][1].equals(opp_piece) && window[i][1].equals(window[i][3]) && window[i][3].equals(window[i][4])){
//                score -= 6050;
//            }
//            if (window[i][2].equals(opp_piece) && window[i][2].equals(window[i][3]) && window[i][3].equals(window[i][5])){
//                score -= 6050;
//            }
//            if (window[i][2].equals(opp_piece) && window[i][2].equals(window[i][4]) && window[i][4].equals(window[i][5])){
//                score -= 6050;
//            }
//            if (window[i][3].equals(opp_piece) && window[i][3].equals(window[i][4]) && window[i][4].equals(window[i][6])) {
//                score -= 6050;
//            }
//            if (window[i][3].equals(opp_piece) && window[i][3].equals(window[i][5]) && window[i][5].equals(window[i][6])){
//                score -= 6050;
//            }
//
//            //piece
//            //two
//            if (window[i][0].equals(piece) && window[i][0].equals(window[i][1])){
//                score += 600;
//            }
//            if (window[i][1].equals(piece) && window[i][1].equals(window[i][2])){
//                score += 600;
//            }if (window[i][2].equals(piece) && window[i][2].equals(window[i][3])){
//                score += 600;
//            }if (window[i][3].equals(piece) && window[i][3].equals(window[i][4])){
//                score += 600;
//            }if (window[i][4].equals(piece) && window[i][4].equals(window[i][5])){
//                score += 600;
//            }if (window[i][5].equals(piece) && window[i][5].equals(window[i][6])){
//                score += 600;
//            }
//            ///three
//            if (window[i][0].equals(piece) && window[i][0].equals(window[i][1]) && window[i][1].equals(window[i][2])){
//                score += 6000;
//            }
//            if (window[i][1].equals(piece) && window[i][1].equals(window[i][2]) && window[i][2].equals(window[i][3])){
//                score += 6000;
//            }
//            if (window[i][2].equals(piece) && window[i][2].equals(window[i][3]) && window[i][3].equals(window[i][4])){
//                score += 6000;
//            }
//            if (window[i][3].equals(piece) && window[i][3].equals(window[i][4]) && window[i][4].equals(window[i][5])){
//                score += 6000;
//            }
//            if (window[i][4].equals(piece) && window[i][4].equals(window[i][5]) && window[i][5].equals(window[i][6])){
//                score += 6000;
//            }
//
//            //xx_x or x_xx
//            if (window[i][0].equals(piece) && window[i][0].equals(window[i][1]) && window[i][1].equals(window[i][3])){
//                score += 6000;
//            }
//            if (window[i][0].equals(piece) && window[i][0].equals(window[i][2]) && window[i][2].equals(window[i][3])){
//                score += 6000;
//            }
//            if (window[i][1].equals(piece) && window[i][1].equals(window[i][2]) && window[i][2].equals(window[i][4])){
//                score += 6000;
//            }
//            if (window[i][1].equals(piece) && window[i][1].equals(window[i][3]) && window[i][3].equals(window[i][4])){
//                score += 6000;
//            }
//            if (window[i][2].equals(piece) && window[i][2].equals(window[i][3]) && window[i][3].equals(window[i][5])){
//                score += 6000;
//            }
//            if (window[i][2].equals(piece) && window[i][2].equals(window[i][4]) && window[i][4].equals(window[i][5])){
//                score += 6000;
//            }
//            if (window[i][3].equals(piece) && window[i][3].equals(window[i][4]) && window[i][4].equals(window[i][6])){
//                score += 6000;
//            }
//            if (window[i][3].equals(piece) && window[i][3].equals(window[i][5]) && window[i][5].equals(window[i][6])){
//                score += 6000;
//            }
//
//
//        }
//
//
//
//        return score;
//    }
//

    public int evaluation_function(String[][] board, String symbol){
//        System.out.println("here");
        int score = 0;
        String[] col = new String[7];
        String[] row = new String[6];
        String[] set = new String[4];

        String[]center = new String[6];
        for (int i = 0; i<6; i++){
            center[i] = board[i][4];
        }
        score += countNumberOfSymbolOnARow(center, symbol) * 3;

        for ( int r = 0; r < 6; r++) {
            for ( int c = 0; c < 7; c++) {
                col[c] = board[r][c]; 
            }
            for ( int c = 0; c < 7 - 3; c++) {
                for (int i = 0; i < 4; i++) {
                    set[i] = col[c + i]; 
                }
                score += getScore(set, symbol);
            }
        }

        // vertical
        for ( int c = 0; c < 7; c++) {
            for ( int r = 0; r < 6; r++) {
                row[r] = board[r][c];
            }
            for ( int r = 0; r < 6 - 3; r++) {
                for (int i = 0; i < 4; i++) {
                    set[i] = row[r + i];
                }
                score += getScore(set, symbol);
            }
        }
        // diagonals
        for ( int r = 0; r < 6 - 3; r++) {
            for ( int c = 0; c < 7; c++) {
                col[c] = board[r][c];
            }
            for ( int c = 0; c < 7 - 3; c++) {
                for (int i = 0; i < 4; i++) {
                    set[i] = board[r + i][c + i];
                }
                score += getScore(set, symbol);
            }
        }
        for ( int r = 0; r < 6 - 3; r++) {
            for ( int c = 0; c < 7; c++) {
                col[c] = board[r][c];
            }
            for ( int c = 0; c < 7 - 3; c++) {
                for (int i = 0; i < 4; i++) {
                    set[i] = board[r + 3 - i][c + i];
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
        if (countNumberOfSymbolOnARow(window, piece) == 4){
            score += 100;
        }
        else if (countNumberOfSymbolOnARow(window, piece) == 3 &&
                countNumberOfSymbolOnARow(window, "-") == 1){
            score += 5;

        }else if (countNumberOfSymbolOnARow(window, piece) == 2 &&
                countNumberOfSymbolOnARow(window, "-") == 2){
            score += 2;
        }

        if (countNumberOfSymbolOnARow(window, opp_piece) == 3 &&
                countNumberOfSymbolOnARow(window, "-") == 1){
            score -= 4;
        }

        return score;
    }

    long start3 = 0;
    long end3 = 0;
    int count = 0;
    public int Hminimax_alpha_beta_cutoff(String[][]board, int depth, boolean isMax, int alpha, int beta){
//        int score = evaluation_function(board, AI.getPlayerSymbol());
//        System.out.println();
//        System.out.println(score);
//        System.out.println("count: " + count + " depth: " + depth + " score: " + score);
        count++;
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
                return evaluation_function(board, AI.getPlayerSymbol()); //get the value from evaluation function
            }
        }
        if (isMax) {//max
            int value = -9999999;
            int new_best;
            int col_num = -1;
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 7; j++) {
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
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 7; j++) {
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

    static class Move{
        int row, col;
    }

    public Move findBestMove_HMiniMax_AlphaBeta_Cutoff(String[][] board, int DEFAULT_DEPTH){
        int Current_bestVal = Integer.MIN_VALUE;
        Move bestMove = new Move();
        bestMove.row = -1;
        bestMove.col = -1;
        int i;
        int j;

        int oldValue;
        for ( i = 0; i < 6; i++) {
            for ( j = 0; j < 7; j++) {
                //see if the move is a valid move.
                if (check_valid_moves(board, colrowtomovenumber(i,j))) {
                    board[i][j] = AI.getPlayerSymbol();

                    oldValue = Hminimax_alpha_beta_cutoff(board, DEFAULT_DEPTH, false, Integer.MIN_VALUE, Integer.MAX_VALUE);

//                    oldValue = -oldValue;//look at this...

//                    System.out.println("valid i: " + i + " valid j: " + j + " oldValue: " + oldValue);
                    board[i][j] = "-";
//                    System.out.println(oldValue);
                    if (oldValue > Current_bestVal) {
//                        System.out.println("it is greater.");
                        bestMove.row = i;
                        bestMove.col = j;
                        Current_bestVal = oldValue;
//                        System.out.println("GREATER valid i: " + i + " valid j: " + j + " Current_bestVal: " + Current_bestVal);
//                        System.out.println("the greater value: " + Current_bestVal);
                    }
                }
            }

        }
//        System.out.println("**FINAL valid i: " + bestMove.row + " valid j: " + bestMove.col + " FINAL Current_bestVal: " + Current_bestVal);
        System.out.println("Visited: " + count + " States ||" + " Best Move: (" + bestMove.row + ", " + bestMove.col + ") || Value: " + Current_bestVal);
    return bestMove;
    }

    public int translateMoveCoordtoMove(int col, int row){
        if (col == 0 && row == 0 ) {
            return 1;
        } else if (row == 0 && col == 1) {
            return 2;
        } else if (row == 0 && col == 2) {
            return 3;
        } else if (row == 0 && col == 3) {
            return 4;
        } else if (row == 0 && col == 4) {
            return 5;
        } else if (row == 0 && col == 5 ) {
            return 6;
        } else if (row == 0 && col == 6) {
            return 7;
        } else if (row == 1 && col == 0) {
            return 8;
        } else if (row == 1 && col == 1) {
            return 9;
        }else if (row == 1 && col == 2) {
            return 10;
        }else if (row == 1 && col == 3) {
            return 11;
        }else if (row == 1 && col == 4) {
            return 12;
        }else if (row == 1 && col == 5) {
            return 13;
        }else if (row == 1 && col == 6) {
            return 14;
        }else if (row == 2 && col == 0) {
            return 15;
        }else if (row == 2 && col == 1) {
            return 16;
        }else if (row == 2 && col == 2) {
            return 17;
        }else if (row == 2 && col == 3) {
            return 18;
        }else if (row == 2 && col == 4) {
            return 19;
        }else if (row == 2 && col == 5) {
            return 20;
        }else if (row == 2 && col == 6) {
            return 21;
        }else if (row == 3 && col == 0) {
            return 22;
        }else if (row == 3 && col == 1) {
            return 23;
        }else if (row == 3 && col == 2) {
            return 24;
        }else if (row == 3 && col == 3) {
            return 25;
        }else if (row == 3 && col == 4) {
            return 26;
        }else if (row == 3 && col == 5) {
            return 27;
        }else if (row == 3 && col == 6) {
            return 28;
        }else if (row == 4 && col == 0) {
            return 29;
        }else if (row == 4 && col == 1) {
            return 30;
        }else if (row == 4 && col == 2) {
            return 31;
        }else if (row == 4 && col == 3) {
            return 32;
        }else if (row == 4 && col == 4) {
            return 33;
        }else if (row == 4 && col == 5) {
            return 34;
        }else if (row == 4 && col == 6) {
            return 35;
        }else if (row == 5 && col == 0) {
            return 36;
        }else if (row == 5 && col == 1) {
            return 37;
        }else if (row == 5 && col == 2) {
            return 38;
        }else if (row == 5 && col == 3) {
            return 39;
        }else if (row == 5 && col == 4) {
            return 40;
        }else if (row == 5 && col == 5) {
            return 41;
        }else if (row == 5 && col == 6) {
            return 42;
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
                if (check_winning(AI.getPlayerSymbol(),board)){
                    System.out.println("\nAI is the Winner!");
                    System.out.println("***************************************");
                    printboard();
                    System.out.println("***************************************");
                    break;
                } else if (check_winning(human.getPlayerSymbol(),board)){
                    System.out.println("\nYou are the Winner!");
                    System.out.println("***************************************");
                    printboard();
                    System.out.println("***************************************");
                    break;
                }
//            System.out.println("here");
//                AI_setMove_RANDOM(board,AI);
//                System.out.println(findBestMove(board));
                start3 = System.nanoTime();
                Move mymove = new Move();
                mymove =findBestMove_HMiniMax_AlphaBeta_Cutoff(board, DEFAULT_DEPTH);
                minmaxConvert(translateMoveCoordtoMove(mymove.col, mymove.row),AI, board);
//            System.out.println("here2");//never reaches here if it is tied
                end3 = System.nanoTime();
                System.out.println("Used Time (in Nanoseconds): " + (end3-start3));

                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");

//            System.out.println("Valid moves left: " + isvalidMovesLeft(board));
            }

            //once board is full, check who is the winner!
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");
                break;
            }
            //-----Check ties-----
            if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                System.out.println("\nBoth tied!");
                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");
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
                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");
                firstmove = false;
            } else {
                if (humanvalue == true){
                    start3 = System.nanoTime();
                    Move mymove = new Move();
                    mymove =findBestMove_HMiniMax_AlphaBeta_Cutoff(board, DEFAULT_DEPTH);
                    minmaxConvert(translateMoveCoordtoMove(mymove.col, mymove.row),AI, board);
                    end3 = System.nanoTime();
                    System.out.println("Used Time (in Nanoseconds): " + (end3-start3));

                    System.out.println("***************************************");
                    printboard();
                    System.out.println("***************************************");
                    if (check_winning(AI.getPlayerSymbol(),board)){
                        System.out.println("\nAI is the Winner!");
                        System.out.println("***************************************");
                        printboard();
                        System.out.println("***************************************");
                        break;
                    } else if (check_winning(human.getPlayerSymbol(),board)){
                        System.out.println("\nYou are the Winner!");
                        System.out.println("***************************************");
                        printboard();
                        System.out.println("***************************************");
                        break;
                    }
                    //-----Check ties-----
                    if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                        System.out.println("\nBoth tied!");
                        System.out.println("***************************************");
                        printboard();
                        System.out.println("***************************************");
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
                    System.out.println("***************************************");
                    printboard();
                    System.out.println("***************************************");
                    break;
                } else if (check_winning(human.getPlayerSymbol(),board)){
                    System.out.println("\nYou are the Winner!");
                    System.out.println("***************************************");
                    printboard();
                    System.out.println("***************************************");
                    break;
                }
                //-----Check ties-----
                if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                    System.out.println("\nBoth tied!");
                    System.out.println("***************************************");
                    printboard();
                    System.out.println("***************************************");
                    break;
                }
            }
            //once board is full, check who is the winner!
            if (check_winning(AI.getPlayerSymbol(),board)){
                System.out.println("\nAI is the Winner!");
                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");
                break;
            } else if (check_winning(human.getPlayerSymbol(),board)){
                System.out.println("\nYou are the Winner!");
                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");
                break;
            }
            //-----Check ties-----
            if (!check_winning(human.getPlayerSymbol(),board) && !check_winning(AI.getPlayerSymbol(),board) && board_is_full(board)) {
                System.out.println("\nBoth tied!");
                System.out.println("***************************************");
                printboard();
                System.out.println("***************************************");
                break;
            }
//        move = Integer.parseInt(scanner.nextLine());
//        System.out.println("Board Value: " + board_is_full(board));
        }
    }

}
