package Amazon;

public class Encode {

    String input,output;

    public Encode(String input) {
        this.input = input;
        this.output = encode();
    }

    public String encode() {
        if(input == null || input.length() == 0)
            return " ";
        StringBuilder sb = new StringBuilder();
        char[] inputChars = input.toCharArray();
        char prevChar = 0;
        int counter = 0;
        //iterate over input
        for (char c : inputChars) {
            if(c == prevChar){
                counter++;
            }else{
                if(prevChar != 0){
                    sb.append(counter).append(prevChar);
                }
                counter = 1;
                prevChar = c;
            }
        }  
        sb.append(counter).append(prevChar); 
        return sb.toString();
    }

    @Override
    public String toString() {
        return output;
    }
    
    public static void main(String[] args) {
       Encode enc =  new Encode("aabbbccccd");
       Encode enc1 =  new Encode("aaaaaaaaaa");
       Encode enc2 =  new Encode("abcde");
       Encode enc3 =  new Encode("abcdea");
       System.out.println(enc);
       System.out.println(enc1);
       System.out.println(enc2);
       System.out.println(enc3);
    }
}
