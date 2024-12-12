import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carboat {

    public static String howmuch(int m, int n) {

        List<Map<String, Integer>> results = new ArrayList<Map<String, Integer>>();

        int start = Math.min(m, n);
        int end = Math.max(m, n);

        for (int i = start; i <= end; i++) {

            if ((i - 1) % 9 == 0 && (i - 2) % 7 == 0){
                int c = (i - 1) / 9;
                int b = (i - 2) / 7;

                Map<String, Integer> result = new HashMap<String, Integer>();
                result.put("C", c);
                result.put("B", b);
                result.put("M", i);
                results.add(result);
            }
        }
    return formatResult(results);
    }
    public static String formatResult(List<Map<String, Integer>> results){
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < results.size(); i++) {
            Map<String, Integer> result = results.get(i);

            // Format each entry in the desired "M: 37 B: 5 C: 4" style
            sb.append("[M: ").append(result.get("M"))
                    .append(" B: ").append(result.get("B"))
                    .append(" C: ").append(result.get("C"))
                    .append("]");
            
        }

        sb.append("]"); // End the overall list
        return sb.toString();
    }
}