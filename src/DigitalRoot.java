public class DigitalRoot {

  public static void main(String[] args) {
    System.out.println(getDigitalRoott(25));
    System.out.println(getDigitalRoott(1234));
    System.out.println(getDigitalRoott(2536));
    System.out.println(getDigitalRoott(235698));
  }

  public static int getDigitalRoot(int n) {
    while (Integer.toString(n).length() >= 2) {
      char [] numbers = Integer.toString(n).toCharArray();
      n = 0;

      for(int i = 0; i < numbers.length; i++) {
        n += Integer.parseInt(Character.toString(numbers[i]));
      }
    }
    return n;
  }


  public static int getDigitalRoott(int n) {
    return (n != 0 && n%9 == 0) ? 9 : n % 9;
  }

}
