public class ValidatePin {

  public static void main(String[] args) {
    System.out.println(validatePin("1234"));
    System.out.println(validatePin("12345"));
    System.out.println(validatePin("a234"));
  }


  public static boolean validatePin(String pin) {
    try{
      Integer.parseInt(pin);
      if (pin.length() == 4 || pin.length() == 6){
        return true;
      }
      return false;
    } catch(NumberFormatException e){
      return false;
    }
  }
}
