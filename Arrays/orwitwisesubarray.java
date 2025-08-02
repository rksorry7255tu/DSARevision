import java.util.*;

public class orwitwisesubarray {
  public static void main(String[] args) {
    // int arr[] = { 1, 1, 2 };
    int arr[] = { 1, 2, 4 };
    int ans = -1;
    int ans1 = -1;
    HashSet<Integer> set = new HashSet<>();
    Arrays.sort(arr);
    int j = arr.length - 1;
    for (int i = 0; i < arr.length; i++) {
      set.add(arr[i]);
      if (ans == -1) {
        ans = arr[i];
      } else {
        ans = ans | arr[i];
      }
      if (ans1 == -1) {
        ans1 = arr[j];
      } else {
        ans1 = ans1 | arr[j];
      }
      j--;

      set.add(ans);
      set.add(ans1);
    }
    System.out.println(set);
  }
}
