import java.util.HashMap;

public class longestSubArray {
  public static void main(String[] args) {
    int nums[] = { 10, 5, 2, 7, 1, 9 };
    int k = 15;
    // int nums[] = { -3, 2, 1 };
    // int k = 6;
    HashMap<Integer, Integer> map = new HashMap<>();
    int sum = 0;
    int max = 0;
    map.put(0, -1);
    for (int i = 0; i < nums.length; i++) {
      sum = sum + nums[i];
      int diff = sum - k;
      if (map.containsKey(diff)) {
        max = Math.max(max, i - map.get(diff));
      }
      if (!map.containsKey(sum)) {
        map.put(sum, i);
      }
    }
    System.out.println(max);

    // int max = 0;
    // for (int i = 0; i < nums.length; i++) {
    // int sum = 0;
    // for (int j = i; j < nums.length; j++) {
    // sum = sum + nums[j];
    // if (sum == k) {
    // max = Math.max(max, j - i + 1);
    // }
    // }
    // }
    // System.out.println(max);
  }
}
