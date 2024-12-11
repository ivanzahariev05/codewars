package algorithms;

public class Kata2 {
    public static boolean interlockable(long a, long b) {
        String aa = convertDecimalToBinary(a);
        String bb = convertDecimalToBinary(b);

        for (int i = aa.length() - 1; i > 0; i--) {
            if (aa.toCharArray()[i] == '1' && bb.toCharArray()[i] == '1') {
                return false;
            }
        }

        return true;
    }
    public static String convertDecimalToBinary(long a){
        String s = "";
        while(a > 0){
            s = ((a % 2 == 0) ? "0" : "1");
            a /= 2;
        }
        return s;
    }
}