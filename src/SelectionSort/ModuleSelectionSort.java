package SelectionSort;
import java.util.Arrays;

public class ModuleSelectionSort {
    public void sort(int[] data) {

        for (int i = 0; i < data.length-1; i++) {
            int minIndex = findIndexOfMinElement(i, data);
            System.out.println("-  " + Arrays.toString(data));
            swapItems(i, minIndex, data);
        }
        System.out.println("Sorted Array: "+Arrays.toString(data));

    }

    private void swapItems(int index1, int index2, int[] data) {
        int tmp = data[index1];
        data[index1] = data[index2];
        data[index2] = tmp;
    }

    private int findIndexOfMinElement(int startIndex, int[] data) {
        int minIndex = startIndex;
        for (int j = minIndex+1; j < data.length; j++) {
            if (data[j] < data[minIndex]) {
                minIndex = j;
            }
        }
        return minIndex;
    }
}
