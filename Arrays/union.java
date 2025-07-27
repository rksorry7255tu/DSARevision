import java.util.*;

public class union {
  public static void main(String[] args) {
    int nums1[] = { 1, 2, 3, 4, 5 };
    int nums2[] = { 1, 2, 7 };

    HashSet<Integer> set = new HashSet<>();

    for (int i = 0; i < nums1.length; i++) {
      set.add(nums1[i]);
    }
    for (int i = 0; i < nums2.length; i++) {
      set.add(nums2[i]);
    }
    int ans[] = new int[set.size()];
    int i = 0;
    for (int x : set) {
      ans[i++] = x;
    }
    Arrays.sort(ans);
    for (int j = 0; j < ans.length; j++) {
      System.out.println(ans[j]);
    }

  }
}
