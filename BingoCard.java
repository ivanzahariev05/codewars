import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class BingoCard
{
    public static String[] getCard() {
        LinkedHashMap<Integer, String>  cardMap = new LinkedHashMap<>();
        Random rand = new Random();

    addNumbers(cardMap, rand, 1, 15, 5, "B");
    addNumbers(cardMap, rand, 16, 30, 5, "I");
    addNumbers(cardMap, rand, 31, 45, 4, "N");
    addNumbers(cardMap, rand, 46, 60, 5, "G");
    addNumbers(cardMap, rand, 61, 75, 5, "O");

    return cardMap
            .entrySet()
            .stream()
            .map(e -> String.format("%s%d", e.getValue(), e.getKey()))
            .toArray(String[]::new);
    }
    private static void addNumbers(Map<Integer, String> cardMap, Random random, int min, int max, int count, String label){

        while(count > 0){
            int randomNumber = random.nextInt(max - min + 1) + min;
            if (!cardMap.containsKey(randomNumber)){
                cardMap.put(randomNumber, label);
                count--;
            }
            
        }
    }
}
