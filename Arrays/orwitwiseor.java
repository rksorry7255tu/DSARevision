import java.util.HashSet;

public class orwitwiseor {
  public static void main(String[] args) {
    // int arr[] = { 1, 2, 4 };
    int arr[] = { 1, 1, 2 };
    HashSet<Integer> set = new HashSet<>();
    int ans = -1;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        if (ans == -1) {
          ans = arr[j];
        } else {
          ans = ans | arr[j];
        }
        set.add(ans);
      }
      ans = -1;
      System.out.println();
    }
    System.out.println(set);
  }
}
