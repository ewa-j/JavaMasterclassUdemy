package methods;

import java.util.List;

public class TeenNumberChecker {

  public static boolean hasTeen(int x, int y, int z) {

    return List.of(13, 14, 15, 16, 17, 18, 19).contains(x)
        || List.of(13, 14, 15, 16, 17, 18, 19).contains(y)
        || List.of(13, 14, 15, 16, 17, 18, 19).contains(z);
  }

  public static boolean isTeen(int a) {
    return List.of(13, 14, 15, 16, 17, 18, 19).contains(a);
  }
}
