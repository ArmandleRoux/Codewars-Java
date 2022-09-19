public class FindUnique {

  public static void main(String[] args) {
    System.out.println(findUnique(new double[]{1, 1, 1, 2, 1, 1}));
    System.out.println(findUnique(new double[]{0, 1, 0}));
  }

  // Find unique number in array of numbers.
  public static double findUnique(double[] arr) {
    for (int i = 1; i < arr.length - 1; i++) {
      if (arr[i - 1] == arr[i] && arr[i] == arr[i + 1]) {
        continue;
      } else if (arr[i - 1] != arr[i] && arr[i] != arr[i + 1]){
        return arr[i];
      } else if (arr[i - 1] == arr[i] && arr[i] != arr[i + 1]) {
        return arr[i + 1];
      } else if (arr[i - 1] != arr[i] && arr[i] == arr[i + 1]) {
        return arr[i - 1];
      }
    }
    return 0;
  }
}
