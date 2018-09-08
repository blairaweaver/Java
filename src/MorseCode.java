import java.util.Dictionary;
import java.util.Hashtable;

public class MorseCode {
    public static int uniqueMorseRepresentations(String[] words) {
        int uniqueWords = 0;
        String[] temp = new String[words.length];
        for (int i = 0; i < temp.length; i++){
            temp[i] = "";
        }
        Dictionary letters = new Hashtable(){{
            put("a", ".-");
            put("b", "-...");
            put( "c","-.-.");
            put("d","-..");
            put("e",".");
            put("f","..-.");
            put("g","--.");
            put("h","....");
            put("i","..");
            put("j",".---");
            put("k","-.-");
            put("l",".-..");
            put("m","--");
            put("n","-.");
            put("o","---");
            put("p",".--.");
            put("q","--.-");
            put("r",".-.");
            put("s","...");
            put("t","-");
            put("u","..-");
            put("v","...-");
            put("w",".--");
            put("x","-..-");
            put("y","-.--");
            put("z","--..");
        }};
        for (int i = 0; i < words.length; i++){
            for (char c : words[i].toCharArray()){
                temp[i] = temp[i] + letters.get("" + c);
            }
        }

        for (int i = 0; i < temp.length; i++)
        {
            int j;
            for (j = 0; j < i; j++)
                if (temp[i].equals(temp[j]))
                    break;
            if (i == j)
                uniqueWords++;
        }
        return uniqueWords;
    }

    public static void main(String[] args){
        String[] temp = new String[]{"gin", "zen", "gig", "msg"};
        int sum = uniqueMorseRepresentations(temp);
        System.out.println(sum);
    }
}
