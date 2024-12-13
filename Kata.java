import java.util.Arrays;

public class Kata {
    public static String longestWord(String wordString) {

      return Arrays.stream(wordString.split(" "))
              .reduce((s, s2) -> s.length() > s2.length() ? s : s2)
              .get();

    }
}