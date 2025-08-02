import java.util.ArrayList;
import java.util.HashSet;

public class orwitwise {
  public static void main(String[] args) {
    // int arr[] = { 1, 1, 2 };
    int arr[] = { 6, 12, 7 };
    HashSet<Integer> set = new HashSet<>();

    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        int ans = -1;
        for (int k = i; k <= j; k++) {
          if (ans == -1) {
            ans = arr[k];
          } else {
            ans = ans | arr[k];
          }
        }
        set.add(ans);
      }
      System.out.println();
    }
    System.out.println(set);
  }
}
