import java.util.Scanner;

public class Tornasz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char table[] = {'x', 'x', 'x', 'x', ' ', 'o', 'o', 'o', 'o'};
        int steps[] = new int[2];
        int result;
        int count =0;

        do{
            System.out.println("Lépésszám: " + count);
            drawTable(table);
            steps = getValidMove(sc, table, count);
            makeMove(table,steps);
            result = getResult(table);
            count++;
        }while(result == 0);
        drawTable(table);
        System.out.println("Gratulálok, vége a játéknak!");




    }

    public static void drawTable(char[] table) {
        System.out.println("------------------");
        System.out.println("|" + table[0] + "|" + table[1] + "|" + table[2] + "|" + table[3] + "|" + table[4]
                + "|" + table[5] + "|" + table[6] + "|" + table[7] + "|" + table[8] + "|");
        System.out.println("------------------");
    }

    public static int[] getValidMove(Scanner sc, char[] table,int count) {
        int step = 0;

        int[] steps = new int[2];
        int empty = emptySearch(table);
        do {

                System.out.println("Melyik mezővel lépsz? (0-8)");
                steps[0] = sc.nextInt();
                if(steps[0] == -1){
                    System.exit(0);
                }else{
                    System.out.println("Melyik mezőre lépsz? (0-8)");
                    steps[1] = sc.nextInt();
                    if(steps[1] == -1){
                        System.exit(0);
                    } else {
                        if ((steps[0] < 0 || steps[0] > 9) || (steps[1] < 0 || steps[1] > 9 || (steps[0] == empty))) {
                            System.out.println("Érvénytelen lépés!");
                        }else {
                            boolean felt =twoRange(table, steps[0], steps[1]);
                            if(felt){
                            } else{
                                System.out.println("Érvénytelen lépés!");
                            }
                            if(steps[0]>steps[1] && steps[0]-steps[1] <= 2 && table[steps[0]] != table[steps[0]-1]){
                                step = 1;
                            } else if (steps[1]>steps[0] && steps[1]-steps[0] <= 2 && table[steps[0]] != table[steps[0]+1]){
                                step = 1;
                            } else {

                            }
                        }
                    }

                }

            } while ((steps[0] < 0 || steps[0] > 9 || steps[1] < 0 || steps[1] > 9 || steps[0] == table[empty]) ||
                step !=1 || table[steps[0]] == table[steps[1]]);
        return steps;
    }

    public static int getResult(char table[]){
        int result = 0;
        if(table[0] == 'O' && table[1] == 'O' && table[2] == 'O' && table[3] == 'O' && table[4] == ' ' && table[5] == 'X'
                && table[6] == 'X' && table[7] == 'X' && table[8] == 'X'){
            return result = 1;
        } else{
            return result;
        }
    }


    public static int emptySearch(char table[]) {
        int i, empty = 3;
        char a = 'X', b = 'O';
        for (i = 0; i < table.length; i++) {
            if (table[i] != a && table[i] != b) {
                empty = i;
            }
        }
        return empty;
    }
    public static void makeMove(char table[],int steps[]){
        char a;
        a = table[steps[0]];
        table[steps[0]] = table[steps[1]];
        table[steps[1]] = a;
    }

    public static boolean twoRange(char table[], int a, int b) {
        if(a>b && (table[a] != table[a-1] && a-b<=2)){
            return true;
        }else if(a<b && (table[a] != table[a+1] && b-a<=2)){
            return true;
        } else{
            return false;
        }
    }












        /*if (a - b == 2) {
            if (table[a - 1] == table[a] || table[a - 1] == table[b] || table[a - 1] == ' ') {
                return false;
            } else {
                return true;
            }
        } else if (a - b == -2) {
            if (table[a + 1] == table[a] || table[a + 1] == table[b] || table[a + 1] == ' ') {
                return false;
            } else {
                return true;
            }
        } else if (a - b > 2 || a - b >= -2) {
            return false;
        } else {
            return true;
        }*/
    }

