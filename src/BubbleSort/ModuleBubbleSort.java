package BubbleSort;

import java.util.Arrays;

public class ModuleBubbleSort {
    public void sort(int[] data) {

        for (int i = 0; i < data.length-1; i++) {
            System.out.println((i+1)+" Step: " + Arrays.toString(data));
            findIndexOfMaxElement(i, data);
        }
        System.out.println("Sorted Array: "+Arrays.toString(data));

    }

    private void swapItems(int index, int[] data) {
        int tmp = data[index+1];
        data[index+1] = data[index];
        data[index] = tmp;
    }

    private void findIndexOfMaxElement(int startIndex, int[] data) {
        for (int j = 0; j < data.length-startIndex-1; j++) {
            if (data[j] > data[j+1]) {
                swapItems(j, data);
            }
            System.out.println("-  " + Arrays.toString(data));
        }
    }
}
