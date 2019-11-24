package task21_1;

public class ArrayMove {
    public static void main(String[] args) {
        int i, j;
        int [][] array = new int[2][10];
        for (i = 0; i < 2; ++i){
            for (j = 0; j < 10; ++j){
                array[i][j] = j+1;
                System.out.print(array[i] [j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        toLeft(array);
        printArray(array);
    }
    public static void toLeft(int[][] arraY) {
        int i, j, a;
        for (i = 0; i < arraY.length; ++i) {
            for (j = 1; j < arraY[i].length; ++j) {
                a = arraY[i][j];
                arraY[i][j] = arraY[i][j - 1];
                arraY[i][j - 1] = a;
            }
            arraY[0][9] = 0;
        }
        arraY[1][9] = 0;
    }
    public static void printArray(int[][] arraY){
        int i, j;
        for (i = 0; i <arraY.length ; ++i) {
            for (j = 0; j <arraY[i].length ; ++j) {
                System.out.print(arraY[i][j] + " ");
            }
            System.out.println();
        }
    }
}

