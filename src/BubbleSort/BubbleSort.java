package BubbleSort;
import java.util.Arrays;

public class BubbleSort {
    public void sort(int[] data) {

        int tmp;
        for (int i = 0; i < data.length-1; i++) {
            System.out.println((i+1)+" Step: " + Arrays.toString(data));
            for (int j = 0; j < data.length-1-i; j++) {
                if (data[j] > data[j+1]) {
                    tmp = data[j+1];
                    data[j+1] = data[j];
                    data[j] = tmp;
                }
                System.out.println("-  " + Arrays.toString(data));
            }
        }
        System.out.println("Sorted Array: "+Arrays.toString(data));
    }
}

