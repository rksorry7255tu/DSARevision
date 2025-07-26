import java.util.HashMap;
import java.util.HashSet;

public class anagram {
  public static void main(String[] args) {
    String password[][] = { { "ravi", "ravikk" }, { "ravi", "ravikkm" } };

    for (int i = 0; i < password.length; i++) {
      HashSet<Character> set = new HashSet<>();
      HashMap<Character, Integer> map = new HashMap<>();
      for (int j = 0; j < password[0].length; j++) {
        if (j == 0) {
          for (int k = 0; k < password[i][j].length(); k++) {
            set.add(password[i][j].charAt(k));
          }
        } else if (j == 1) {
          for (int k = 0; k < password[i][j].length(); k++) {
            if (!set.contains(password[i][j].charAt(k))) {
              if (!map.containsKey(password[i][j].charAt(k))) {
                map.put(password[i][j].charAt(k), 1);
              } else {
                map.put(password[i][j].charAt(k), map.get(password[i][j].charAt(k)) + 1);
              }
            }
            if (map.size() > 1) {
              System.out.println("false");
              break;
            }
          }
          if (map.size() <= 1) {
            System.out.println("true");
          }
        }
      }
    }
  }
}
