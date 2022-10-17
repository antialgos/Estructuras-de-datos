package HackerRank;
// Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
// Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
// Example 1:
// Input: arr = [1,0,2,3,0,4,5,0]
// Output: [1,0,0,2,3,0,0,4]
// Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
// Example 2:
// Input: arr = [1,2,3]
// Output: [1,2,3]
// Explanation: After calling your function, the input array is modified to: [1,2,3]
// Constraints:
// 1 <= arr.length <= 104
// 0 <= arr[i] <= 9
public class duplicateZeros {

    public void duplicateZer(int[] arr) {
        int pd = 0, length = arr.length-1;
        
        for (int i = 0; i <= length - pd; i++) {
            if (arr[i] == 0) {
                if (i == length - pd) {
                    arr[length] = 0;
                    length -= 1;
                    break;
                }
                pd++;
            }
        }
        
        int last = length - pd;
        
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + pd] = 0;
                pd--;
                arr[i+pd] = 0;
            } else {
                arr[i+pd] = arr[i];
            }
        }

    }
    public static void main(String[] args) {
        
    }
}
