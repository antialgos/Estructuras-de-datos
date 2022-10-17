package Assignment.DuplicateChars;

import java.util.Arrays;

public class CheckAlgorithm {

    String text;
    char[] arr;
    
    public CheckAlgorithm(String text) {
        this.text = text;
        this.arr = transformToArray();
        hasDuplicateChars();
    }

    public int compare(Character c1, Character c2) {
        return Character.compare(
            Character.toLowerCase(c1),
            Character.toLowerCase(c2));
    }

    public char[] transformToArray() {
        char[] ch = new char[text.length()];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = text.charAt(i);
        }
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));
        return ch;
    }

    /**
     * Time complexity of this algorithm is O(n)
     * @return
     */
    public Boolean hasDuplicateChars() {
        char current;
        int j;
        for (int i = 0; i < arr.length; i++) {
            current = arr[i];
            j = i-1;
            while (j >= 0 && (compare(arr[j], current) == 0)) {
                System.out.printf("TRUE, repeated char %s at index %d and %d \n",current,j,i );
                return true;
            }
            j++;
        } 
        System.out.println("FALSE, this string doesnt repeat any char");
        return false;
    }

    public static void main(String[] args) {
        new CheckAlgorithm("anAconda");
        new CheckAlgorithm("great");
        new CheckAlgorithm("Felipe");

    }
}
