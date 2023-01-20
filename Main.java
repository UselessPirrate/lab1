import java.util.*;

public class Main  {
    public static void main (String[] args) {
        int[] firstArray = getRandomArray(12);
        int[] secondArray = getRandomArray(12);
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == firstArray[j]) {
                     int number = firstArray[i];
                     set.add(number);
                }

            }
        }

    }
}

