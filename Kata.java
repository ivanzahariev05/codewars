package algorithms;

public class Kata {
    public static String sumStrings(String a, String b) {
        if (a.isEmpty()){
             a = "0";
        }
        if (b.isEmpty()){
             b = "0";
        }
        int aa = Integer.parseInt(a);
        int bb = Integer.parseInt(b);
        int sum = aa + bb;
        return Integer.toString(sum);
    }
}