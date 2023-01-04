import java.util.Scanner;
import java.util.InputMismatchException;
public class ConnectFour {
    private int[][] gameboard = new int[6][7];
    private Scanner scanner = new Scanner(System.in);
    private boolean gameIsRunning;
    private int scannerInput;
    private int LOWER_BOUND;
    private int UPPER_BOUND;

    public ConnectFour() {
        System.out.println("--Use the playConnectFour method to begin game--");
        System.out.println("-- 0represents an empty spot -- 1 represents player1's tiles -- 2 represents player2's tiles --");
        System.out.println("the game shall begin with player1's move --- type the number for the column you wish to place your tile");

        this.LOWER_BOUND = 1;
        this.UPPER_BOUND = 7;
    }

    public int[][] test() {
        return gameboard;
    }

    public void playConnectFour() {
        for (int i = 0; i < 7; i++) {
            gameboard[0][i] = 0;
            gameboard[1][i] = 0;
            gameboard[2][i] = 0;
            gameboard[3][i] = 0;
            gameboard[4][i] = 0;
            gameboard[5][i] = 0;
        }

        this.gameIsRunning = true;
        System.out.println("|" + gameboard[0][0] + "|" + gameboard[0][1] + "|" + gameboard[0][2] + "|" + gameboard[0][3] + "|" + gameboard[0][4] + "|" + gameboard[0][5] + "|" + gameboard[0][6] + "|");
        System.out.println("|" + gameboard[1][0] + "|" + gameboard[1][1] + "|" + gameboard[1][2] + "|" + gameboard[1][3] + "|" + gameboard[1][4] + "|" + gameboard[1][5] + "|" + gameboard[1][6] + "|");
        System.out.println("|" + gameboard[2][0] + "|" + gameboard[2][1] + "|" + gameboard[2][2] + "|" + gameboard[2][3] + "|" + gameboard[2][4] + "|" + gameboard[2][5] + "|" + gameboard[2][6] + "|");
        System.out.println("|" + gameboard[3][0] + "|" + gameboard[3][1] + "|" + gameboard[3][2] + "|" + gameboard[3][3] + "|" + gameboard[3][4] + "|" + gameboard[3][5] + "|" + gameboard[3][6] + "|");
        System.out.println("|" + gameboard[4][0] + "|" + gameboard[4][1] + "|" + gameboard[4][2] + "|" + gameboard[4][3] + "|" + gameboard[4][4] + "|" + gameboard[4][5] + "|" + gameboard[4][6] + "|");
        System.out.println("|" + gameboard[5][0] + "|" + gameboard[5][1] + "|" + gameboard[5][2] + "|" + gameboard[5][3] + "|" + gameboard[5][4] + "|" + gameboard[5][5] + "|" + gameboard[5][6] + "|");
        System.out.println(" ");
        System.out.println("-" + "1" + "-" + "2" + "-" + "3" + "-" + "4" + "-" + "5" + "-" + "6" + "-" + "7" + "-");

        while (gameIsRunning) {
            try {
                scannerInput = scanner.nextInt();
                if (scannerInput < LOWER_BOUND) {
                    System.out.println("please input a number between 1 - 7");
                }
                else if (scannerInput > UPPER_BOUND) {
                    System.out.println("please input a number between 1 - 7");
                } else {
                    System.out.println("|" + gameboard[0][0] + "|" + gameboard[0][1] + "|" + gameboard[0][2] + "|" + gameboard[0][3] + "|" + gameboard[0][4] + "|" + gameboard[0][5] + "|" + gameboard[0][6] + "|");
                    System.out.println("|" + gameboard[1][0] + "|" + gameboard[1][1] + "|" + gameboard[1][2] + "|" + gameboard[1][3] + "|" + gameboard[1][4] + "|" + gameboard[1][5] + "|" + gameboard[1][6] + "|");
                    System.out.println("|" + gameboard[2][0] + "|" + gameboard[2][1] + "|" + gameboard[2][2] + "|" + gameboard[2][3] + "|" + gameboard[2][4] + "|" + gameboard[2][5] + "|" + gameboard[2][6] + "|");
                    System.out.println("|" + gameboard[3][0] + "|" + gameboard[3][1] + "|" + gameboard[3][2] + "|" + gameboard[3][3] + "|" + gameboard[3][4] + "|" + gameboard[3][5] + "|" + gameboard[3][6] + "|");
                    System.out.println("|" + gameboard[4][0] + "|" + gameboard[4][1] + "|" + gameboard[4][2] + "|" + gameboard[4][3] + "|" + gameboard[4][4] + "|" + gameboard[4][5] + "|" + gameboard[4][6] + "|");
                    System.out.println("|" + gameboard[5][0] + "|" + gameboard[5][1] + "|" + gameboard[5][2] + "|" + gameboard[5][3] + "|" + gameboard[5][4] + "|" + gameboard[5][5] + "|" + gameboard[5][6] + "|");
                    System.out.println(" ");
                    System.out.println("-" + "1" + "-" + "2" + "-" + "3" + "-" + "4" + "-" + "5" + "-" + "6" + "-" + "7" + "-");
                }
            }
            catch (InputMismatchException error) {
                System.out.println("please input a number between 1 - 7");
                scanner.next();
            }
        }
    }
}