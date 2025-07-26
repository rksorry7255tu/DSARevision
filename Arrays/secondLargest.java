public class secondLargest {
  public static void main(String[] args) {
    // int arr[] = { 12, 35, 1, 10, 34, 1 };
    // int arr[] = { 10, 5, 10 };
    int arr[] = { 10, 10, 10 };
    // -1
    int secLargest = Integer.MIN_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        secLargest = max;
        max = arr[i];
      }
      if (arr[i] > secLargest && arr[i] < max) {
        secLargest = arr[i];
      }
    }
    if (max == secLargest || secLargest == Integer.MIN_VALUE) {
      secLargest = -1;
    }
    System.out.println(secLargest);
  }
}
