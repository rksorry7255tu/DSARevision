import java.util.*;

public class orwitwisesubarray {
  public static void main(String[] args) {
    int arr[] = { 1, 1, 2 };
    int ans = -1;
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      set.add(arr[i]);
      if (ans == -1) {
        ans = arr[i];
      } else {
        ans = ans | arr[i];
      }
      set.add(ans);
    }
    System.out.println(set);
  }
}
