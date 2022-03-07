/*
Justin Shen | Frederick Shitong Liu | Amish Fakun
jshen37@u.rochester.edu | sliu85@u.rochester.edu | afakun@u.rochester.edu 
UR ID: 31819329
CSC 242 Project 1
*/

********* A BRIEF INTRODUCTION ********
In this project, we implemented three separate Connect-4 games. In all implementation, we used minimax algorithm and some heuristic functions to build the A.I. of the game. We used 2-D array for all the games. For all games, we assigned a value for each box (coordinate) in the 2-d array. For example, for 3x3x3 game, we have the boxes labeled from 1 - 9, for 5x3x3, we labeled the box from 1 - 15, for 6x7x4, we labeled the box from 1 - 42. We implemented functions such as check_valid_moves(String[][] board, int move) to check whether the move by the user is a valid move (essentially if the box below the user's move is empty, it is an invalid move and any box that is already been filled should not accept another move), check_winning(String String, String[][]board) to check who is the winner of the game, function Human_setMove(String[][] board, int move, Player player) to set the move for humans, AI_setMove_RANDOM(String[][] board, Player player) to set move for AI based on random drawing (not based on minimax), is_Terminal(String[][] board) to check whether we reached the end-terminal (which is the end of the game: either X win, O win, or tied), minimax(String[][]board, int depth, boolean isMax) as the minimax algorithm [its variants such as minimax-ab-pruning with/without depth-cut off can be seen in our java file), utility_function(String[][] board) as the function that returns a value of each move (for 3x3x3 it is either +10 or -10, for 5x3x3 and 6x7x4 it is +100, +5, +2, -4, etc.) the numbers are essentially arbitrary - this is used for the minimax algorithm. Function findBestMove_MiniMax(String[][] board) will return the best move based on minimax algorithm. Minimax will return the value of the best move and this function actually makes the move. We also implemented two occasions where either the human moves first or the AI moves first, here are two example functions that does the job: PLAY_MINIMAX_AI_AIFIRST(String humansymbol) [suppose AI moves first] and PLAY_MINIMAX_AI_HUMANFIRST(String humansymbol) [suppose human moves first]. For resources, we did refer to wikipedia and https://www.geeksforgeeks.org/minimax-algorithm-in-game-theory-set-1-introduction/ for minimax algorithm implementation. We have also referred to the AIMA book 5.2 and 5.3 while implementing the utility_function and evaluation_function with heuristic values. 

*********** COMPILING ***********

To compile and run our program:

1. Open your terminal, change your file directory to /Project4

2. After you change your directory, please copy and paste or type the following:

javac Main.java

3. After you typed in the line(s) above, please copy and paste or type the following:

java Main

