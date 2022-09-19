public class WordOrder {

  public static void main(String[] args) {
    System.out.println(wordOrder(""));
    System.out.println(wordOrder("is2 Thi1s T4est 3a"));
    System.out.println(wordOrder("4of Fo1r pe6ople g3ood th5e the2"));
  }

  // Sort the words in a given string where each word in the
  // string contains the number of its index
  public static String wordOrder(String words){
    String[] wordArr = words.split(" ");
    String orderedWords = "";
    for(int x = 0; x<9; x++){
      for(int i = 0; i < wordArr.length; i++){
        if (wordArr[i].contains(String.valueOf(x+1))){
          orderedWords += wordArr[i] + " ";
        }
      }
    }
    return orderedWords.strip();
  }
}
