import java.util.Arrays;

public class TwoToOne {
  public static String longest(String s1, String s2) {
    String[] s3 = (s1 + s2).split("");
    Arrays.sort(s3);
    String s4 = new String();
    for (int i = 0; i < s3.length; i++) {
      if (!s4.contains(s3[i]))
        s4 += s3[i];
    }
    return s4;
  }
}
