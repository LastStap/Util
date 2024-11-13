package dumshenko.daniil;

import static dumshenko.daniil.Util.removeOccurrences;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 2};

        int numToRemove = 2;

        int[] result = removeOccurrences(array, numToRemove);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
