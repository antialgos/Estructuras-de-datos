package HackerRank;

public class minFlipsMonoIncr {
    public static int minFlipsMonoInc(String s) {
        int one = 0, flip = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                one++;
            } else {
                flip++;
            }
            flip = Math.min(one,flip);
        }
        
        return flip;
    }

    public static void main(String[] args) {
        System.out.println(minFlipsMonoInc("00110"));
    }
}
