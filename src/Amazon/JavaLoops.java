package Amazon;

import java.util.Scanner;

public class JavaLoops {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t=in.nextInt();

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int res = a;
            for (int j = 0; j < n; j++) {
                res += Math.pow(2, j)*b;
                sb.append(res).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        in.close();
    }
}
