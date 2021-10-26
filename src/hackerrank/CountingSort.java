package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class CountingSort {

    public static List<Integer> countingSort(List<Integer> arr){
        int size = arr.size();

        List<Integer> result = new ArrayList<Integer>();

        int[] frequency = new int[size];

        for(Integer each: arr){
            frequency[each] += 1;
        }
        for(int n: frequency){
            result.add(n);
        }
        return result;

    }

}
