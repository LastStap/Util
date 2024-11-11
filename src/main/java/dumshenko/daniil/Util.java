package dumshenko.daniil;

import java.util.ArrayList;
import java.util.List;

public class Util {

    public static int[] removeOccurrences(int[] arr, int numToRemove) {

        List<Integer> resultList = new ArrayList<>();

        for (int num : arr) {
            if (num != numToRemove) {

                resultList.add(num);
            }
        }
        int[] resultArray = new int[resultList.size()];

        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        return resultArray;
    }
}
