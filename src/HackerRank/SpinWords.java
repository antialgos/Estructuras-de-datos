package HackerRank;
import java.util.Arrays;
import java.lang.StringBuffer;

public class SpinWords {

  String sentence,output;
  
  SpinWords(String sentence) {
    this.sentence = sentence;
    this.output = reversedWords();
  }

  public String reversedWords() {
 
    String[] arrS = sentence.split(" ");
     // We iterate over String array 
    for(int i = 0; i < arrS.length; i++) {
      //we check the length of the word
      if(arrS[i].length() >= 5) {
        arrS[i] = new StringBuilder(arrS[i]).reverse().toString();
      } 
    }
        
    return String.join(" ", arrS);
  }


  public static void main(String[] args) {
    
    SpinWords test = new SpinWords("Welcome to my rainbow");
    System.out.println(test.output);
  }
}