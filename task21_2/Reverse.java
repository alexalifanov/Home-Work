package task21_2;

public class Reverse {
    public static void main(String[] args) {
        int []array = new int[10];
        int i;
        for (i = 0; i < 10; ++i) {
            array[i] = i+1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        reverse(array);
    }
    public static void reverse (int[] array){
        for (int i = 0; i < array.length / 2; i++) {
            int z = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = z;
        }
        for (int i: array) {
            System.out.print(i + " ");
        }

    }
}
