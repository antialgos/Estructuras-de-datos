package HackerRank;

import java.util.Arrays;

public class ExesAndOs {

    public static boolean getXO (String str) {
    
        int countX = 0;
        int countO = 0;
        char[] chArray = str.toLowerCase().toCharArray();
         for (int i = 0; i < chArray.length; i++) {
           if (Character.valueOf(chArray[i]).equals('o')) countO++;
           if (Character.valueOf(chArray[i]).equals('x')) countX++;
         }
          
        if ( countX == countO) return true;
        return false;
            
      }
    public static void main(String[] args) {

            
    }
}
