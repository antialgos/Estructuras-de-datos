import java.util.Arrays;

import BubbleSort.BubbleSort;
import BubbleSort.ModuleBubbleSort;
import InsertSort.InsertSort;
import InsertSort.ModuleInsertSort;
import SelectionSort.ModuleSelectionSort;
import SelectionSort.SelectionSort;
import Test.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        int[] data = {8,5,3,3,3,2,2,1,1,2,10,-1,7,6,4,2};
        System.out.println("The Array that we will sort: " + Arrays.toString(data));

        int[] clone = data.clone();
        System.out.println("CLONE: "+Arrays.toString(clone));
        Arrays.sort(clone);
        int reader = 1;
        for (int i = 1; i < clone.length; i++) {
            if (clone[i] != clone[i-1]) {
                clone[reader] = clone[i];
                reader++;
            }
        }
        int[] res = new int[reader+1];
        for (int i = 0; i < res.length; i++) {
            res[i] = clone[i];
            
        }

        System.out.println("CLONE: "+Arrays.toString(clone));
        System.out.println("RES: "+Arrays.toString(res));
		// new BubbleSort().sort(data);
		// new ModuleBubbleSort().sort(data);
		// new SelectionSort().sort(data);
		// new ModuleSelectionSort().sort(data);
        // new InsertSort().sort(data);
        // new ModuleInsertSort().sort(data);
    }
}
