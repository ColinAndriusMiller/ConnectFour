import java.util.Scanner;
import java.util.InputMismatchException;
public class ConnectFour {
    private String[][] gameboard = new String[6][7];
    private Scanner scanner = new Scanner(System.in);
    private boolean gameIsRunning;
    private boolean placeTile;
    private int scannerInput;
    private int LOWER_BOUND;
    private int UPPER_BOUND;
    private boolean forLoop;
    public ConnectFour() {
        System.out.println("--Use the playConnectFour method to begin game--");
        System.out.println("-- 0 represents an empty spot -- 1 represents player1's tiles -- 2 represents player2's tiles --");
        System.out.println("the game shall begin with player1's move --- type the number for the column you wish to place your tile");

        this.LOWER_BOUND = 1;
        this.UPPER_BOUND = 7;
    }

    public String[][] test() {
        return gameboard;
    }

    public void playConnectFour() {
        for (int i = 0; i < 7; i++) {
            gameboard[0][i] = " ";
            gameboard[1][i] = " ";
            gameboard[2][i] = " ";
            gameboard[3][i] = " ";
            gameboard[4][i] = " ";
            gameboard[5][i] = " ";
        }

        this.gameIsRunning = true;

        while (gameIsRunning) {
            try {

                scannerInput = scanner.nextInt();
                if (scannerInput < LOWER_BOUND) {
                    System.out.println("please input a number between 1 - 7");
                }
                else if (scannerInput > UPPER_BOUND) {
                    System.out.println("please input a number between 1 - 7");
                } else {
                    this.placeTile = true;
                    this.forLoop = true;

                    for (int i = 0; i <= 6; i++) {
                        while (placeTile == true) {
                            if (i == 6) {
                                System.out.println("-- row is full, player1's turn has been skipped --");                                
                            } else if (forLoop = true) {
                                if (gameboard[i][scannerInput - 1] == " ") {
                                    gameboard[i][scannerInput - 1] = "X";
                                    this.forLoop = false;
                                    this.placeTile = false;

                                }
                            }
                        }
                    }

                }
            } catch (InputMismatchException error) {
                System.out.println("please input a number between 1 - 7");
                scanner.next();
            } 
            for (int a = 5; a >= 0; a--) {
                System.out.println("| " + gameboard[a][0] + " | " + gameboard[a][1] + " | " + gameboard[a][2] + " | " + gameboard[a][3] + " | " + gameboard[a][4] + " | " + gameboard[a][5] + " | " + gameboard[a][6] + " |");
            }
            System.out.println("- 1 - 2 - 3 - 4 - 5 - 6 - 7 -");
            try {

                scannerInput = scanner.nextInt();
                if (scannerInput < LOWER_BOUND) {
                    System.out.println("please input a number between 1 - 7");
                }
                else if (scannerInput > UPPER_BOUND) {
                    System.out.println("please input a number between 1 - 7");
                } else {
                    this.placeTile = true;
                    this.forLoop = true;

                    for (int i = 0; i <= 6; i++) {
                        while (placeTile == true) {
                            if (i == 6) {
                                System.out.println("-- row is full, player2's turn has been skipped --");                                
                            } else if (forLoop = true) {
                                if (gameboard[i][scannerInput - 1] == " ") {
                                    gameboard[i][scannerInput - 1] = "O";
                                    this.forLoop = false;
                                    this.placeTile = false;
                                }
                            }
                        }
                    }

                }
            } catch (InputMismatchException error) {
                System.out.println("please input a number between 1 - 7");
                scanner.next();
            }
            for (int s = 5; s >= 0; s--) {
                System.out.println("| " + gameboard[s][0] + " | " + gameboard[s][1] + " | " + gameboard[s][2] + " | " + gameboard[s][3] + " | " + gameboard[s][4] + " | " + gameboard[s][5] + " | " + gameboard[s][6] + " |");
            }
            System.out.println("- 1 - 2 - 3 - 4 - 5 - 6 - 7 -");
        }
    }
}
