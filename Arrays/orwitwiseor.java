import java.util.HashSet;

public class orwitwiseor {
  public static void main(String[] args) {
    // int arr[] = { 1, 2, 4 };
    // int arr[] = { 1, 1, 2 };
    int arr[] = { 6, 12, 7 };
    int ans = -1;
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        if (ans == -1) {
          ans = arr[j];
        }
        set.add(ans);
      }
      ans = -1;
    }
    System.out.println(set);
  }
}
