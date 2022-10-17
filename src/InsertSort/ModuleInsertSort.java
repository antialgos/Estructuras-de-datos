package InsertSort;

import java.util.Arrays;

public class ModuleInsertSort {
    public void sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int current = data[i];
            int prevIndex = i-1;
            moveValueFromIndex(prevIndex,data,current);
            System.out.println((i+1)+" Step: " + Arrays.toString(data));
        }
        System.out.println("Sorted Array: "+Arrays.toString(data));
    }

    private void moveValueFromIndex(int prevIndex, int[] data, int current) {
        while (prevIndex >= 0 && data[prevIndex] > current) {
            data[prevIndex+1] = data[prevIndex];
            prevIndex--;
            System.out.printf(Arrays.toString(data) + " Moving data from index %d to %d temporal value = %s \n",prevIndex+2,prevIndex+1,current);
        }
        data[prevIndex+1] = current;
    }
}
