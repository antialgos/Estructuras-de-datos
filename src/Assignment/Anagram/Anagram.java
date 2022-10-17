package Assignment.Anagram;

import java.util.Arrays;

public class Anagram {
    
    char[] s1,s2;

    Anagram(String s1,String s2){
        this.s1 = sort(stringToArray(s1));
        this.s2 = sort(stringToArray(s2));
    }

    public char[] stringToArray(String s) {
        return s.replace(" ", "").toCharArray();
    }

    
    public char[] sort(char[] chArr) {
        int current = 0;
        int prevChar;
        char tmp;
        while (current < chArr.length) {
            prevChar = current+1;
            while (prevChar < chArr.length) {
                if (compareChar(chArr[current], chArr[prevChar]) < 0) {
                    tmp = chArr[current];
                    chArr[current] = chArr[prevChar];
                    chArr[prevChar] = tmp;
                }
                prevChar++;
            }
            current++;
        }
        return chArr;

    }

    public int compareChar(Character c1, Character c2) {
        return Character.compare(
            Character.toLowerCase(c1), 
            Character.toLowerCase(c2));
        
    }

    @Override
    public String toString() {
        return Arrays.equals(s1, s2)+ "\n" + Arrays.toString(s1) + "\n" + Arrays.toString(s2);
    }

    public static void main(String[] args) {
        Anagram a1 = new Anagram("indio", "onidi");
        System.out.println(a1);
    }
}
