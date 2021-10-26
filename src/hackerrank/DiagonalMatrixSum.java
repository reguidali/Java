package hackerrank;

import java.util.List;

public class DiagonalMatrixSum {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int difference = 0;
        int size = arr.size();
        int col = 0;
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < size; i++){ //row 1 col 1 + row 2 col 2 + rol 3 col 3
            sum1 += arr.get(i).get(i);
        }
        for(int j = size -1; j >= 0; j--) { //row 3 col 1 + row 2 col 2 + rol 1 col 3
            sum2 += arr.get(j).get(col);
            col++;
        }

        difference = sum1 - sum2;
        if (difference < 0) {
            difference = difference * -1;
        }

        return difference;

    }
}
