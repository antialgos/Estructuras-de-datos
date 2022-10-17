package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Substring {

    int start,end;
    String s;
    char[] sArr;
    
    Substring(int start, int end, String s){
        this.start = start;
        this.end = end;
        this.s = s;
        this.sArr = strinToArray();
    }
    
    public char[] strinToArray(){
        return s.replace(" ","").toCharArray();
    } 
    
    public String removeIndex() {
        char[] newArr = new char[end-start];
        int count=0;
        StringBuilder sb = new StringBuilder();
        for (int i = start ;i < end; i++) {
             newArr[count] = sArr[i];
             sb.append(sArr[i]);
             count++;
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        Substring sol = new Substring(start, end, S);
        System.out.println(sol.removeIndex());
    }
}
