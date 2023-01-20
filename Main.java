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

    private static int[] getRandomArray(int length) {
        int[] tempMass = new int[length];
        Random random = new Random();
        for(int i =0;i<tempMass.length;i++){
            tempMass[i] = random.nextInt(30);
        }
    }
}

