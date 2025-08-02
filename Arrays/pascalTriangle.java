public class pascalTriangle {
  public static void main(String[] args) {
    int row = 5;
    int ans = 1;
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= i; j++) {
        for (int k = 0; k < i - j; k++) {
          ans = ans * (i - k - 1);
          ans = ans / (k + 1);
        }
        System.out.print(ans);
        ans = 1;
      }
      System.out.println();
    }
  }
}
