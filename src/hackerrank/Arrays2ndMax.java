package hackerrank;

import java.util.Arrays;
import java.util.Collections;

public class Arrays2ndMax {

    //poderia criar 2 métodos separados 1 pra juntar outro pro sort

    public static int secondBigNumber(int array[], int array2[]){
        int SecondMax = 0;
        int size = array.length + array2.length;

        int[] arrayMerge = new int[size];

        for(int i = 0; i < array.length; i++){ //O(n)
            arrayMerge[i] = array[i];
        }

        for(int j = 0; j < array2.length; j++){ //O(n)
            arrayMerge[array.length+j] = array2[j];
        }

       // Arrays.sort(arrayMerge); //O(nˆ2)

        System.out.println(Arrays.toString(arrayMerge));

        SecondMax = arrayMerge[size-2];
        return SecondMax;
    }

}
