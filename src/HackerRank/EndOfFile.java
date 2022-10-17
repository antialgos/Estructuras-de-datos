package HackerRank;

import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 1;
        
        while (in.hasNext()) {
                System.out.printf("%d %s \n",count,in.nextLine());
                count++;
        }
    }

}
