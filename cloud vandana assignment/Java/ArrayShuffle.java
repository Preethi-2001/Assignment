import java.util.Arrays;
import java.util.Random;

public class ArrayShuffle {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        arrayShuffling(array);
        System.out.println(Arrays.toString(array));
    }

    public static void arrayShuffling(int[] array) {
        int n = array.length;
        Random r = new Random();

        for (int i = n - 1; i > 0; i--) {
            int j = r.nextInt(i + 1); 
            
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
