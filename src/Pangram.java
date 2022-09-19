
public class Pangram {

  public static boolean isPangram(String sentence) {
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    sentence = sentence.toLowerCase();
    for(char letter : alphabet) {
      if(!sentence.contains(Character.toString(letter))){
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isPangram("The quick brown fox jumps over the lazy dog"));
  }
}
