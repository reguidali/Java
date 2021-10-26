package hackerrank;

import java.util.Arrays;

public class myBinarySearch {

    public static void binarySearch() {

        int[] array = {1, 4, 7, 9, 3, 2, 19, 17, 45, 70, 32, 44, 5};
        int size = array.length;
        Arrays.sort(array); // O(log n)

        int target = 19;

        int head = 0;
        int tale = size - 1;

        while (head <= tale) { //O(log n)
            int middle = (head + tale) / 2;
            if(target == array[middle]){
                System.out.println("Target " + target + " is in" + middle + "position of the array.");
                return;
            } else if(target > array[middle]) {
                head = middle + 1;
            } else {
                tale = middle - 1;
            }
        } System.out.println("Target " + target + "is not in the array.");


    }

}
