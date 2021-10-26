package hackerrank;

import java.util.Arrays;

public class Arrays2ndMax {

    public static int secondBigNumber(int array[], int array2[]){
        int SecondMax = 0;
        int size = array.length + array2.length;

       // int[] Concate = ArrayUtils.addAll(array, array2);

        int[] arrayMerge = new int[size];

        for(int i = 0; i < array.length; i++){
            arrayMerge[i] = array[i];
        }

        for(int j = 0; j < array2.length; j++){
            arrayMerge[array.length+j] = array2[j];
        }

        Arrays.sort(arrayMerge);





        System.out.println(Arrays.toString(arrayMerge));

        SecondMax = arrayMerge[size-2];
        return SecondMax;
    }

}
