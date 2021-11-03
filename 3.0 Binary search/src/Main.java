import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;


public class Main {
    public static void main(String[] args) {

        double ArrayOne [] = generateArray(1000);
        Arrays.sort(ArrayOne);

        System.out.println(ItemSearch(ArrayOne, 122));
        System.out.println(binaryResearch(ArrayOne, 122));


    }

    public static int ItemSearch(double[] array, double key) {
        for (int j = 0; j < array.length; j++) {
            if (array[j] == key) {
                return j;
            }
        }
        return -1;
    }

    public static int binaryResearch(double[] sortedArray, double key) {
        return binarySearch(sortedArray, key, 0, sortedArray.length);
    }

    private static int binarySearch(double[] sortedArray, double key, int low, int high) {
        int middle = (low + high) / 2;
        if (low > high) {return -1;}

        if (key == sortedArray[middle]) {
            return middle;
        }
        else if (key < sortedArray[middle]) {
            return binarySearch(sortedArray, key, low, middle - 1);
        }
        else {return binarySearch(sortedArray, key, middle + 1, high);}
    }
    private static double[] generateArray(int length) {
        double[] ArrayOne = new double[length];
        for (int i = 0; i < ArrayOne.length; i++) {
            ArrayOne[i] = ThreadLocalRandom.current().nextInt(999);
        }
        return ArrayOne;
    }
}


