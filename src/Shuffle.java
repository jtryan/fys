

import java.security.SecureRandom;
import java.util.Arrays;

/**
 * Created by john on 5/30/2016.
 */

public class Shuffle {

    public static void main(String[]args){
        Integer[] testArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] shuffled = shuffleint(testArray);
        System.out.println(Arrays.toString(shuffled));
    }

    public static Integer[] shuffleint(Integer[] arr) {
        int i = arr.length;
        int j = 0;
        int temp = 0;
        SecureRandom random = new SecureRandom();

        while (--i > 0) {
            j = random.nextInt(i + 1);
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}