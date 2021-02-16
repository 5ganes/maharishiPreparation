package MumQuestions;

import java.util.Arrays;

public class CommonElementsinTwoArrays {
    public static void main(String[] args){
        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 3, 6, 8, 2, 7 };
        int[] rArray = commonArray(array1, array2);
        System.out.println(Arrays.toString(rArray));
    }
    public static int[] commonArray(int[] array1, int[] array2){
        if(array1 == null || array2 == null || array1.length == 0 || array2.length == 0 )
            return new int[0];
        int min = array1.length < array2.length ? array1
                .length : array2.length;
        int[] commonArray = new int[min];
        int k = 0;
        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j])
                    commonArray[k++] = array1[i];
            }
        }
        return commonArray;
    }
}
