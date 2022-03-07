//Created by Frederick Liu, Justin Shen, Amish Fakun, Spring 2022 CSC 242
import java.util.Scanner;

public class Game {
    public Game() {

    }
    public void play(){
        System.out.println("Connect Four by Frederick Liu, Justin Shen, Amish Fakun [CSC 242 Spring 2022]");
        System.out.println("Choose Your Game: ");
        System.out.println("1. Tiny 3x3x3 Connect-Three");
        System.out.println("2. Wider 5x3x3 Connect-Three");
        System.out.println("3. Standard 7x6x4 Connect-Four");
        System.out.print("Your choice: ");
        Scanner scan = new Scanner(System.in);
        int userchoicegame = scan.nextInt();
        if (userchoicegame == 1){
            System.out.println("Choose Your Opponent: ");
            System.out.println("1. An agent that plays randomly");
            System.out.println("2. An agent that uses MINIMAX");
            System.out.println("3. An agent that uses MINIMAX with alpha-beta pruning");
            System.out.println("4. An agent that uses H-MINIMAX with a fixed depth cutoff");
            ThreeThreeThreeGame ThreeThreeThreeGame = new ThreeThreeThreeGame();
            int userchoiceopp = scan.nextInt();
            if (userchoiceopp == 1){
                System.out.println("Which side would you like to be?\n1. 'O' \n2. 'X'");
                int role = scan.nextInt();
                if (role == 1){
//                    int who = scan.nextInt();
                    System.out.println("Who would you like to play first?\n1. Human \n2. AI");
                    int who = scan.nextInt();
                    if (who == 1){
                        ThreeThreeThreeGame.print_board_with_instructions();
                        ThreeThreeThreeGame.PLAY_RANDOM_AI_HUMANSFIRST("O");
                    } else if (who == 2){
                        ThreeThreeThreeGame.print_board_with_instructions();
                        ThreeThreeThreeGame.PLAY_RANDOM_AI_AIFIRST("O");
                    } else{
                        System.out.println("Invalid Input");
                    }
                } else if (role == 2){
//                    int who = scan.nextInt();
                    System.out.println("Who would you like to play first?\n1. Human \n2. AI");
                    int who = scan.nextInt();
                    if (who == 1){
                        ThreeThreeThreeGame.print_board_with_instructions();
                        ThreeThreeThreeGame.PLAY_RANDOM_AI_HUMANSFIRST("X");
                    } else if (who == 2){
                        ThreeThreeThreeGame.print_board_with_instructions();
                        ThreeThreeThreeGame.PLAY_RANDOM_AI_AIFIRST("X");
                    } else{
                        System.out.println("Invalid Input");
                    }
                }else{
                    System.out.println("Invalid Input.");
                }
            } else if (userchoiceopp == 2){
                System.out.println("Which side would you like to be?\n1. 'O' \n2. 'X'");
                int role = scan.nextInt();
                if (role == 1){
//                    int who = scan.nextInt();
                    System.out.println("Who would you like to play first?\n1. Human \n2. AI");
                    int who = scan.nextInt();
                    if (who == 1){
                        ThreeThreeThreeGame.print_board_with_instructions();
                        ThreeThreeThreeGame.PLAY_MINIMAX_AI_HUMANFIRST("O");
                    } else if (who == 2){
                        ThreeThreeThreeGame.print_board_with_instructions();
                        ThreeThreeThreeGame.PLAY_MINIMAX_AI_AIFIRST("O");
                    } else{
                        System.out.println("Invalid Input");
                    }
                } else if (role == 2){
//                    int who = scan.nextInt();
                    System.out.println("Who would you like to play first?\n1. Human \n2. AI");
                    int who = scan.nextInt();
                    if (who == 1){
                        ThreeThreeThreeGame.print_board_with_instructions();
                        ThreeThreeThreeGame.PLAY_MINIMAX_AI_HUMANFIRST("X");
                    } else if (who == 2){
                        ThreeThreeThreeGame.print_board_with_instructions();
                        ThreeThreeThreeGame.PLAY_MINIMAX_AI_AIFIRST("X");
                    } else{
                        System.out.println("Invalid Input");
                    }
                } else{
                    System.out.println("Invalid Input.");
                }
            }else if (userchoiceopp == 3){
                System.out.println("Which side would you like to be?\n1. 'O' \n2. 'X'");
                int role = scan.nextInt();
                if (role == 1){
//                    int who = scan.nextInt();
                    System.out.println("Who would you like to play first?\n1. Human \n2. AI");
                    int who = scan.nextInt();
                    if (who == 1){
                        ThreeThreeThreeGame.print_board_with_instructions();
                        ThreeThreeThreeGame.PLAY_MINIMAX_ALPHABETA_AI_HUMANFIRST("O");
                    } else if (who == 2){
                        ThreeThreeThreeGame.print_board_with_instructions();
                        ThreeThreeThreeGame.PLAY_MINIMAX_ALPHABETA_AI_AIFIRST("O");
                    } else{
                        System.out.println("Invalid Input");
                    }
                } else if (role == 2){
//                    int who = scan.nextInt();
                    System.out.println("Who would you like to play first?\n1. Human \n2. AI");
                    int who = scan.nextInt();
                    if (who == 1){
                        ThreeThreeThreeGame.print_board_with_instructions();
                        ThreeThreeThreeGame.PLAY_MINIMAX_ALPHABETA_AI_HUMANFIRST("X");
                    } else if (who == 2){
                        ThreeThreeThreeGame.print_board_with_instructions();
                        ThreeThreeThreeGame.PLAY_MINIMAX_ALPHABETA_AI_AIFIRST("X");
                    } else{
                        System.out.println("Invalid Input");
                    }
                }else{
                    System.out.println("Invalid Input.");
                }
            }else if (userchoiceopp == 4){
                System.out.println("Which side would you like to be?\n1. 'O' \n2. 'X'");
                int role = scan.nextInt();
                if (role == 1){
                    System.out.println("Who would you like to play first?\n1. Human \n2. AI");
                    int who = scan.nextInt();
                    if (who == 1){
                        System.out.println("What Depth?");
                        int depth = scan.nextInt();
                        ThreeThreeThreeGame.print_board_with_instructions();
                        ThreeThreeThreeGame.PLAY_HMINIMAX_ALPHABETA_CUTOFF_AI_AIFIRST("O", depth);
                    } else if (who == 2){
                        System.out.println("What Depth?");
                        int depth = scan.nextInt();
                        ThreeThreeThreeGame.print_board_with_instructions();
                        ThreeThreeThreeGame.PLAY_HMINIMAX_ALPHABETA_CUTOFF_AI_HUMANFIRST("O",depth );
                    } else{
                        System.out.println("Invalid Input");
                    }
                } else if (role == 2){
//                    int who = scan.nextInt();
                    System.out.println("Who would you like to play first?\n1. Human \n2. AI");
                    int who = scan.nextInt();
                    if (who == 1){
                        System.out.println("What Depth?");
                        int depth = scan.nextInt();
                        ThreeThreeThreeGame.print_board_with_instructions();
                        ThreeThreeThreeGame.PLAY_HMINIMAX_ALPHABETA_CUTOFF_AI_AIFIRST("X", depth);
                    } else if (who == 2){
                        System.out.println("What Depth?");
                        int depth = scan.nextInt();
                        ThreeThreeThreeGame.print_board_with_instructions();
                        ThreeThreeThreeGame.PLAY_HMINIMAX_ALPHABETA_CUTOFF_AI_HUMANFIRST("X",depth );
                    } else{
                        System.out.println("Invalid Input");
                    }
                }else{
                    System.out.println("Invalid Input.");
                }
            }else{
                System.out.println("Invalid Input.");
            }

        } else if (userchoicegame == 2){
            System.out.println("Choose Your Opponent: ");
            System.out.println("1. An agent that plays randomly");
            System.out.println("2. An agent that uses MINIMAX");
            System.out.println("3. An agent that uses MINIMAX with alpha-beta pruning");
            System.out.println("4. An agent that uses H-MINIMAX with a fixed depth cutoff");
            FiveThreeThreeGame FiveThreeThreeGame = new FiveThreeThreeGame();
            int userchoiceopp = scan.nextInt();
            if (userchoiceopp == 1){
                System.out.println("Which side would you like to be?\n1. 'O' \n2. 'X'");
                int role = scan.nextInt();
                if (role == 1){
//                    int who = scan.nextInt();
                    System.out.println("Who would you like to play first?\n1. Human \n2. AI");
                    int who = scan.nextInt();
                    if (who == 1){
                        FiveThreeThreeGame.print_board_with_instructions();
                        FiveThreeThreeGame.PLAY_RANDOM_AI_HUMANSFIRST("O");
                    } else if (who == 2){
                        FiveThreeThreeGame.print_board_with_instructions();
                        FiveThreeThreeGame.PLAY_RANDOM_AI_AIFIRST("O");
                    } else{
                        System.out.println("Invalid Input");
                    }
                } else if (role == 2){

                    System.out.println("Who would you like to play first?\n1. Human \n2. AI");
                    int who = scan.nextInt();
                    if (who == 1){
                        FiveThreeThreeGame.print_board_with_instructions();
                        FiveThreeThreeGame.PLAY_RANDOM_AI_HUMANSFIRST("X");
                    } else if (who == 2){
                        FiveThreeThreeGame.print_board_with_instructions();
                        FiveThreeThreeGame.PLAY_RANDOM_AI_AIFIRST("X");
                    } else{
                        System.out.println("Invalid Input");
                    }
                }else{
                    System.out.println("Invalid Input.");
                }
            } else if (userchoiceopp == 2){
                System.out.println("Which side would you like to be?\n1. 'O' \n2. 'X'");
                int role = scan.nextInt();
                if (role == 1){

                    System.out.println("Who would you like to play first?\n1. Human \n2. AI");
                    int who = scan.nextInt();
                    if (who == 1){
                        FiveThreeThreeGame.print_board_with_instructions();
                        FiveThreeThreeGame.PLAY_MINIMAX_AI_HUMANFIRST("O");
                    } else if (who == 2){
                        FiveThreeThreeGame.print_board_with_instructions();
                        FiveThreeThreeGame.PLAY_MINIMAX_AI_AIFIRST("O");
                    } else{
                        System.out.println("Invalid Input");
                    }
                } else if (role == 2){

                    System.out.println("Who would you like to play first?\n1. Human \n2. AI");
                    int who = scan.nextInt();
                    if (who == 1){
                        FiveThreeThreeGame.print_board_with_instructions();
                        FiveThreeThreeGame.PLAY_MINIMAX_AI_HUMANFIRST("X");
                    } else if (who == 2){
                        FiveThreeThreeGame.print_board_with_instructions();
                        FiveThreeThreeGame.PLAY_MINIMAX_AI_AIFIRST("X");
                    } else{
                        System.out.println("Invalid Input");
                    }
                } else{
                    System.out.println("Invalid Input.");
                }
            }else if (userchoiceopp == 3){
                System.out.println("Which side would you like to be?\n1. 'O' \n2. 'X'");
                int role = scan.nextInt();
                if (role == 1){
                    System.out.println("Who would you like to play first?\n1. Human \n2. AI");
                    int who = scan.nextInt();
                    if (who == 1){
                        FiveThreeThreeGame.print_board_with_instructions();
                        FiveThreeThreeGame.PLAY_MINIMAX_ALPHABETA_AI_HUMANFIRST("O");
                    } else if (who == 2){
                        FiveThreeThreeGame.print_board_with_instructions();
                        FiveThreeThreeGame.PLAY_MINIMAX_ALPHABETA_AI_AIFIRST("O");
                    } else{
                        System.out.println("Invalid Input");
                    }
                } else if (role == 2){
//                    int who = scan.nextInt();
                    System.out.println("Who would you like to play first?\n1. Human \n2. AI");
                    int who = scan.nextInt();
                    if (who == 1){
                        FiveThreeThreeGame.print_board_with_instructions();
                        FiveThreeThreeGame.PLAY_MINIMAX_ALPHABETA_AI_HUMANFIRST("X");
                    } else if (who == 2){
                        FiveThreeThreeGame.print_board_with_instructions();
                        FiveThreeThreeGame.PLAY_MINIMAX_ALPHABETA_AI_AIFIRST("X");
                    } else{
                        System.out.println("Invalid Input");
                    }
                }else{
                    System.out.println("Invalid Input.");
                }
            }else if (userchoiceopp == 4){
                System.out.println("Which side would you like to be?\n1. 'O' \n2. 'X'");
                int role = scan.nextInt();
                if (role == 1){
//                    int who = scan.nextInt();
                    System.out.println("Who would you like to play first?\n1. Human \n2. AI");
                    int who = scan.nextInt();
                    if (who == 1){
                        System.out.println("What Depth?");
                        int depth = scan.nextInt();
                        FiveThreeThreeGame.print_board_with_instructions();
                        FiveThreeThreeGame.PLAY_HMINIMAX_ALPHABETA_CUTOFF_AI_AIFIRST("O", depth);
                    } else if (who == 2){
                        System.out.println("What Depth?");
                        int depth = scan.nextInt();
                        FiveThreeThreeGame.print_board_with_instructions();
                        FiveThreeThreeGame.PLAY_HMINIMAX_ALPHABETA_CUTOFF_AI_HUMANFIRST("O",depth );
                    } else{
                        System.out.println("Invalid Input");
                    }
                } else if (role == 2){
//                    int who = scan.nextInt();
                    System.out.println("Who would you like to play first?\n1. Human \n2. AI");
                    int who = scan.nextInt();
                    if (who == 1){
                        System.out.println("What Depth?");
                        int depth = scan.nextInt();
                        FiveThreeThreeGame.print_board_with_instructions();
                        FiveThreeThreeGame.PLAY_HMINIMAX_ALPHABETA_CUTOFF_AI_AIFIRST("X", depth);
                    } else if (who == 2){
                        System.out.println("What Depth?");
                        int depth = scan.nextInt();
                        FiveThreeThreeGame.print_board_with_instructions();
                        FiveThreeThreeGame.PLAY_HMINIMAX_ALPHABETA_CUTOFF_AI_HUMANFIRST("X",depth );
                    } else{
                        System.out.println("Invalid Input");
                    }
                }else{
                    System.out.println("Invalid Input.");
                }
            }else{
                System.out.println("Invalid Input.");
            }

        } else if (userchoicegame == 3){
            System.out.println("Choose Your Opponent: ");
            System.out.println("1. An agent that plays randomly");
            System.out.println("2. An agent that uses MINIMAX");
            System.out.println("3. An agent that uses MINIMAX with alpha-beta pruning");
            System.out.println("4. An agent that uses H-MINIMAX with a fixed depth cutoff");
            SixSevenFourGame SixSevenFourGame = new SixSevenFourGame();
            int userchoiceopp = scan.nextInt();
            if (userchoiceopp == 1){
                System.out.println("Which side would you like to be?\n1. 'O' \n2. 'X'");
                int role = scan.nextInt();
                if (role == 1){
                    System.out.println("Who would you like to play first?\n1. Human \n2. AI");
                    int who = scan.nextInt();
                    if (who == 1){
                        SixSevenFourGame.print_board_with_instructions();
                        SixSevenFourGame.PLAY_RANDOM_AI_HUMANSFIRST("O");
                    } else if (who == 2){
                        SixSevenFourGame.print_board_with_instructions();
                        SixSevenFourGame.PLAY_RANDOM_AI_AIFIRST("O");
                    } else{
                        System.out.println("Invalid Input");
                    }
                } else if (role == 2){
//                    int who = scan.nextInt();
                    System.out.println("Who would you like to play first?\n1. Human \n2. AI");
                    int who = scan.nextInt();
                    if (who == 1){
                        SixSevenFourGame.print_board_with_instructions();
                        SixSevenFourGame.PLAY_RANDOM_AI_HUMANSFIRST("X");
                    } else if (who == 2){
                        SixSevenFourGame.print_board_with_instructions();
                        SixSevenFourGame.PLAY_RANDOM_AI_AIFIRST("X");
                    } else{
                        System.out.println("Invalid Input");
                    }
                }else{
                    System.out.println("Invalid Input.");
                }
            } else if (userchoiceopp == 2){
                System.out.println("Which side would you like to be?\n1. 'O' \n2. 'X'");
                int role = scan.nextInt();
                if (role == 1){
//                    int who = scan.nextInt();
                    System.out.println("Who would you like to play first?\n1. Human \n2. AI");
                    int who = scan.nextInt();
                    if (who == 1){
                        SixSevenFourGame.print_board_with_instructions();
                        SixSevenFourGame.PLAY_MINIMAX_AI_HUMANFIRST("O");
                    } else if (who == 2){
                        SixSevenFourGame.print_board_with_instructions();
                        SixSevenFourGame.PLAY_MINIMAX_AI_AIFIRST("O");
                    } else{
                        System.out.println("Invalid Input");
                    }
                } else if (role == 2){
//                    int who = scan.nextInt();
                    System.out.println("Who would you like to play first?\n1. Human \n2. AI");
                    int who = scan.nextInt();
                    if (who == 1){
                        SixSevenFourGame.print_board_with_instructions();
                        SixSevenFourGame.PLAY_MINIMAX_AI_HUMANFIRST("X");
                    } else if (who == 2){
                        SixSevenFourGame.print_board_with_instructions();
                        SixSevenFourGame.PLAY_MINIMAX_AI_AIFIRST("X");
                    } else{
                        System.out.println("Invalid Input");
                    }
                } else{
                    System.out.println("Invalid Input.");
                }
            }else if (userchoiceopp == 3){
                System.out.println("Which side would you like to be?\n1. 'O' \n2. 'X'");
                int role = scan.nextInt();
                if (role == 1){
                    System.out.println("Who would you like to play first?\n1. Human \n2. AI");
                    int who = scan.nextInt();
                    if (who == 1){
                        SixSevenFourGame.print_board_with_instructions();
                        SixSevenFourGame.PLAY_MINIMAX_ALPHABETA_AI_HUMANFIRST("O");
                    } else if (who == 2){
                        SixSevenFourGame.print_board_with_instructions();
                        SixSevenFourGame.PLAY_MINIMAX_ALPHABETA_AI_AIFIRST("O");
                    } else{
                        System.out.println("Invalid Input");
                    }
                } else if (role == 2){
                    System.out.println("Who would you like to play first?\n1. Human \n2. AI");
                    int who = scan.nextInt();
                    if (who == 1){
                        SixSevenFourGame.print_board_with_instructions();
                        SixSevenFourGame.PLAY_MINIMAX_ALPHABETA_AI_HUMANFIRST("X");
                    } else if (who == 2){
                        SixSevenFourGame.print_board_with_instructions();
                        SixSevenFourGame.PLAY_MINIMAX_ALPHABETA_AI_AIFIRST("X");
                    } else{
                        System.out.println("Invalid Input");
                    }
                }else{
                    System.out.println("Invalid Input.");
                }
            }else if (userchoiceopp == 4){
                System.out.println("Which side would you like to be?\n1. 'O' \n2. 'X'");
                int role = scan.nextInt();
                if (role == 1){
                    System.out.println("Who would you like to play first?\n1. Human \n2. AI");
                    int who = scan.nextInt();
                    if (who == 1){
                        System.out.println("What Depth?");
                        int depth = scan.nextInt();
                        SixSevenFourGame.print_board_with_instructions();
                        SixSevenFourGame.PLAY_HMINIMAX_ALPHABETA_CUTOFF_AI_AIFIRST("O", depth);
                    } else if (who == 2){
                        System.out.println("What Depth?");
                        int depth = scan.nextInt();
                        SixSevenFourGame.print_board_with_instructions();
                        SixSevenFourGame.PLAY_HMINIMAX_ALPHABETA_CUTOFF_AI_HUMANFIRST("O",depth );
                    } else{
                        System.out.println("Invalid Input");
                    }
                } else if (role == 2){
                    System.out.println("Who would you like to play first?\n1. Human \n2. AI");
                    int who = scan.nextInt();
                    if (who == 1){
                        System.out.println("What Depth?");
                        int depth = scan.nextInt();
                        SixSevenFourGame.print_board_with_instructions();
                        SixSevenFourGame.PLAY_HMINIMAX_ALPHABETA_CUTOFF_AI_AIFIRST("X", depth);
                    } else if (who == 2){
                        System.out.println("What Depth?");
                        int depth = scan.nextInt();
                        SixSevenFourGame.print_board_with_instructions();
                        SixSevenFourGame.PLAY_HMINIMAX_ALPHABETA_CUTOFF_AI_HUMANFIRST("X",depth );
                    } else{
                        System.out.println("Invalid Input");
                    }
                }else{
                    System.out.println("Invalid Input.");
                }
            }else{
                System.out.println("Invalid Input.");
            }

        } else{
            System.out.println("Invalid Input.");
        }





        ThreeThreeThreeGame ThreeThreeThreeGame = new ThreeThreeThreeGame();
//        ThreeThreeThreeGame.print_board_with_instructions();

//    ThreeThreeThreeGame.PLAY_RANDOM_AI_HUMANSFIRST("X");
//    ThreeThreeThreeGame.PLAY_RANDOM_AI_AIFIRST("X");
//
//    ThreeThreeThreeGame.PLAY_MINIMAX_AI_HUMANFIRST("X");
//    ThreeThreeThreeGame.PLAY_MINIMAX_AI_AIFIRST("X");
//
//    ThreeThreeThreeGame.PLAY_MINIMAX_ALPHABETA_AI_HUMANFIRST("X");
//    ThreeThreeThreeGame.PLAY_MINIMAX_ALPHABETA_AI_AIFIRST("X");
//
//     ThreeThreeThreeGame.PLAY_HMINIMAX_ALPHABETA_CUTOFF_AI_HUMANFIRST("X", 12);
//     ThreeThreeThreeGame.PLAY_HMINIMAX_ALPHABETA_CUTOFF_AI_AIFIRST("X", 12);

        FiveThreeThreeGame FiveThreeThreeGame = new FiveThreeThreeGame();
//        FiveThreeThreeGame.print_board_with_instructions();

//          FiveThreeThreeGame.PLAY_RANDOM_AI_HUMANSFIRST("X");
//    FiveThreeThreeGame.PLAY_RANDOM_AI_AIFIRST("X");

//    FiveThreeThreeGame.PLAY_MINIMAX_AI_HUMANFIRST("X");
        //        FiveThreeThreeGame.PLAY_MINIMAX_AI_AIFIRST("X");

//        FiveThreeThreeGame.PLAY_MINIMAX_ALPHABETA_AI_HUMANFIRST("X");
//        FiveThreeThreeGame.PLAY_MINIMAX_ALPHABETA_AI_AIFIRST("X");
//
//        FiveThreeThreeGame.PLAY_HMINIMAX_ALPHABETA_CUTOFF_AI_HUMANFIRST("X", 3);
//        FiveThreeThreeGame.PLAY_HMINIMAX_ALPHABETA_CUTOFF_AI_AIFIRST("X",3);

        SixSevenFourGame SixSevenFourGame = new SixSevenFourGame();
//        SixSevenFourGame.print_board_with_instructions();

//        SixSevenFourGame.PLAY_RANDOM_AI_HUMANSFIRST("X");
//        SixSevenFourGame.PLAY_RANDOM_AI_AIFIRST("X");


//        SixSevenFourGame.PLAY_MINIMAX_AI_HUMANFIRST("X");
//        SixSevenFourGame.PLAY_MINIMAX_AI_AIFIRST("X");

//        SixSevenFourGame.PLAY_MINIMAX_ALPHABETA_AI_HUMANFIRST("X");
//        SixSevenFourGame.PLAY_MINIMAX_ALPHABETA_AI_AIFIRST("X");

//        SixSevenFourGame.PLAY_HMINIMAX_ALPHABETA_CUTOFF_AI_HUMANFIRST("X", 5);
//        SixSevenFourGame.PLAY_HMINIMAX_ALPHABETA_CUTOFF_AI_AIFIRST("X", 5);

    }

}
