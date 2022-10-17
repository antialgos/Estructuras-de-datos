package SelectionSort;
import java.util.Arrays;

public class SelectionSort {
    public void sort(int[] data) {
        int minIndex,tmp;
        for (int i = 0; i < data.length - 1; i++) {
            minIndex = i;
            System.out.println((i+1)+" Step: " + Arrays.toString(data));
            for (int j = i+1; j < data.length; j++) {
                if (data[j] < data[minIndex]) {
                System.out.println("-  " + Arrays.toString(data));
                    minIndex = j;
                }
                tmp = data[minIndex];
                data[minIndex] = data[i];
                data[i] = tmp;
            }
        }
        System.out.println("Sorted Array: "+Arrays.toString(data));
    }
}
