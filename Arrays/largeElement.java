import java.util.*;

public class largeElement {
  public static void main(String[] args) {
    int arr[] = { 10, 20, 4 };
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }

    // int max = Arrays.stream(arr).max().getAsInt();
    System.out.println(max);
  }
}
