import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class rearrangingFruits {
  public static void main(String[] args) {
    int b1[] = { 4, 2, 2, 2, };
    HashMap<Integer, Integer> map1 = new HashMap<>();
    HashMap<Integer, Integer> map2 = new HashMap<>();

    int b2[] = { 1, 4, 1, 2 };
    Arrays.sort(b1);
    Arrays.sort(b2);

    for (int i = 0; i < b1.length; i++) {
      map1.put(b1[i], map1.getOrDefault(b1[i], 0) + 1);
    }
    for (int i = 0; i < b2.length; i++) {
      map2.put(b2[i], map2.getOrDefault(b2[i], 0) + 1);
    }
    for (int i = 0; i < b2.length; i++) {
      if (map2.get(b2[i]) == map1.get(b1[i])) {
        map1.remove(b2[i]);
        map2.remove(b1[i]);
      }
    }

    int count = 0;
    System.out.println(map2.keySet());
    for (int value : map2.keySet()) {
      if (!map1.containsKey(value)) {

        map1.put(value, map2.getOrDefault(value, 0));
        while (map2.get(value) != map1.get(value)) {
          map1.put(value, map1.get(value) + 1);
          map2.put(value, map2.get(value) - 1);
        }
      } else if (map1.containsKey(value)) {
        System.out.println(value);
        while (map2.get(value) != map1.get(value)) {
          map1.put(value, map1.get(value) - 1);
          map2.put(value, map2.get(value) + 1);
        }
      }
    }
    for (int value : map1.keySet()) {
      if (!map2.containsKey(value)) {

        map2.put(value, map1.getOrDefault(value, 0));
        while (map2.get(value) != map1.get(value)) {
          map2.put(value, map2.get(value) + 1);
          map1.put(value, map1.get(value) - 1);
        }
      } else if (map2.containsKey(value)) {
        System.out.println(value);
        while (map1.get(value) != map2.get(value)) {
          map2.put(value, map2.get(value) - 1);
          map1.put(value, map1.get(value) + 1);
        }
      }
    }

    System.out.println(map1);
    System.out.println(map2);
  }
}
