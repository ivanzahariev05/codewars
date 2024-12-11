package algorithms;
public class NumberFun {
    public static long findNextSquare(long sq) {

        double sqrt = Math.sqrt(sq);
        if (sqrt != (int) sqrt) {
            return -1;
        }

        return (long)  Math.pow((int)sqrt + 1, 2);
    }
}