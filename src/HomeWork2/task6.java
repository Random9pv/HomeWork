package HomeWork2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class task6 {
    public static void main(String[] args) {//Задача №3
        int[] array1 = {1, 2, 5, 7, 10};
        int[] array2 = {2, 3, 2, 17, 15};
        int[] array3 = new int[array1.length];
        int rez;
        int i, j;
        int[] array4 = IntStream.concat(IntStream.of(array1), IntStream.of(array2)).toArray();
        for (i = 0; i < array1.length; i++) {
            for (j = 0; j < array2.length; j++) {
                rez = array1[i] * array2[j];
                array3[i] = rez;
            }
        }
        int[] array6 = IntStream.concat(IntStream.of(array4), IntStream.of(array3)).toArray();
        System.out.println(Arrays.toString(array6));
    }
}

