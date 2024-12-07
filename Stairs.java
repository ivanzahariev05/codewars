package algorithms;


public class Stairs{
    public static String draw(int n){
        char letter = 'I';
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                sb.append(" ");
            }
            sb.append(letter);
            if (i != n - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}