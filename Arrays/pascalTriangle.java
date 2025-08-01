public class pascalTriangle {
  public static void main(String[] args) {
    int row = 5;
    int ans = 1;
    for (int j = 1; j <= row; j++) {
      for (int k = 1; k <= j; k++) {

        for (int i = 0; i < k - 1; i++) {
          ans = ans * (j - 1 - i);
          ans = ans / (i + 1);
        }
        System.out.print(ans + " ");
        ans = 1;
      }
      System.out.println();
    }
  }
}
