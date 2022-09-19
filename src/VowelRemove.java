public class VowelRemove {

  public static void main(String[] args) {
    System.out.println(removeVowels("This website is for losers LOL!"));
  }

  // Replace all vowels in a given string and replace them with an empty character.
  public static String removeVowels(String sentence){
    return sentence.replaceAll("[aeuioAEOIU]", "");
  }
}
