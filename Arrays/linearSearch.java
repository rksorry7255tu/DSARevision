public class linearSearch {
  public static void main(String[] args) {
    int arr[] = { 10, 50, 30, 70, 80, 20, 90, 40 };
    int key = 3;
    int ans = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        ans = i;
      }
    }
    System.out.println(ans);
  }
}
