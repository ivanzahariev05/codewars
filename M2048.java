public class M2048 {

    static int[] merge(int[] line) {

        int[] result = new int[line.length];
        int index = 0;

        for (int number : line) {
            if (number != 0){
                result[index++] = number;
            }
        }
        for (int i = 0; i < result.length - 1; i++) {
            if (result[i] == result[i + 1]) {
                result[i] *= 2;
                result[i + 1] = 0;
            }
        }

        index = 0;
        int[] finalResult = new int[line.length];
        for (int number : result) {
            if (number != 0){
                finalResult[index++] = number;
            }
        }
        return finalResult;
    }
}