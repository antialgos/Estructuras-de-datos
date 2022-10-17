package InsertSort;

import java.util.Arrays;

public class InsertSort {
    public void sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int current = data[i];
            int j = i-1;
            while (j >= 0 && data[j] > current) {
                data[j+1] = data[j];
                j --;
                System.out.printf(Arrays.toString(data) + " Moving data from index %d to %d temporal value = %s \n",i,j+1,current);
            }
            data[j+1] = current;
            System.out.println((i+1)+" Step: " + Arrays.toString(data));
        }
        System.out.println("Sorted Array: "+Arrays.toString(data));
    }
}
