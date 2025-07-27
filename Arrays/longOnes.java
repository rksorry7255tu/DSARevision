public class longOnes {
  public static void main(String[] args) {
    int nums[] = { 1, 1, 0, 1, 1, 1 };
    int count = 0;
    int max = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 1) {
        count = 0;
      } else {
        count++;
        max = Math.max(max, count);
      }
    }
    System.out.println(max);
  }
}