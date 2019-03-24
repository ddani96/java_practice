import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        int[][] table;
        int currentPlayer = 1;
        int result;
        int[] move;
        table = tableInit();
        Scanner sc = new Scanner(System.in);
        do {
            drawTable(table);
            move = getValidMove(sc, table, currentPlayer);
            makeMove(table, move, currentPlayer);
            result = checkWinner(table);
            currentPlayer = nextPlayer(currentPlayer);
        } while (result == 0);
        drawTable(table);
        displayWinner(result);
    }

    public static int[][] tableInit() {
        return new int[3][3];
    }

    public static void drawTable(int[][] table) {
        System.out.println("+-+-+-+");
        System.out.println("|" + table[0][0] + "|" + table[0][1] + "|" + table[0][2] + "|");
        System.out.println("+-+-+-+");
        System.out.println("|" + table[1][0] + "|" + table[1][1] + "|" + table[1][2] + "|");
        System.out.println("+-+-+-+");
        System.out.println("|" + table[2][0] + "|" + table[2][1] + "|" + table[2][2] + "|");
        System.out.println("+-+-+-+");
    }

    public static int[] getValidMove(Scanner sc, int[][] table, int currentPlayer) {
        System.out.println("A(z) " + currentPlayer + "-es játékos következik.");
        int[] move = new int[2];
        do {
            do {
                System.out.println("Melyik sor?");
                move[0] = sc.nextInt();
                System.out.println("Melyik oszlop?");
                move[1] = sc.nextInt();
                if ((move[0] < 0 || move[0] > 2) || (move[1] < 0 || move[1] > 2) || table[move[0]][move[1]] != 0) {
                    System.out.println("Hibás mezőszám!");
                }
            } while ((move[1] > 2 || move[1] < 0) || move[0] > 2 || move[0] < 0);
        } while( table[move[0]][move[1]] != 0);

        return move;
    }

    public static void makeMove(int[][] table, int[] move, int currentPlayer) {
        table[move[0]][move[1]] = currentPlayer;
    }

    public static int checkWinner(int[][] table) {
        int result=0;
        boolean empty = true;
        int player,row,column,i,j;
        for(player = 1; player <3 ; player++){
            for(row = 0; row <3; row ++){
                if(table[row][0]== player && table[row][1] == player && table[row][2] == player){
                    result = player;
                }
            }
            for(column = 0; column <3; column++ ){
                if(table[0][column] == player && table[1][column] == player && table[2][column] == player){
                    result = player;
                }
            }
            if((table[0][0] == player && table[1][1] == player && table[2][2] == player) ||
                table[0][2] == player && table[1][1] == player && table[2][0] == player){
                result = player;
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if(table[i][j] == 0){
                    empty = false;
                }
            }
        }
        if(empty == true && result == 0){
            result = 3;
        }
        return result;
    }

    public static int nextPlayer(int currentPlayer) {
        if (currentPlayer == 1) return 2;
        else return 1;
    }

    public static void displayWinner(int result) {
        if(result == 1){
            System.out.println("Az 1-es játékos győzött.");
        } else if(result == 2){
            System.out.println("A 2-es játékos győzött.");
        } else if(result == 3){
            System.out.println("Döntetlen!");
        }
    }
}
