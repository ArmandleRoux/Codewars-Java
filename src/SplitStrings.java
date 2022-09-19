import java.util.Arrays;

public class SplitStrings {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(splitStrings("abcdef")));
    System.out.println(Arrays.toString(splitStrings("HelloWorld")));
  }

  /* Function that splits a string in character pairs of two
   * and returns an Array of the pairs. */
  public static String[] splitStrings(String word){
    if (word.length()%2 > 0){
      word += "_";
    }
    String[] stringPairs = new String[word.length()/2];
    for(int i = 0; i < word.length(); i = i+2){
      stringPairs[i/2] = word.substring(i, i+2);
    }
    return stringPairs;
  }
}
