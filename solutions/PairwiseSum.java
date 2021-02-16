package MumQuestions;

import java.util.Arrays;

public class PairwiseSum {
    public static void main(String[] args){
        int[] a = {2, 1};
        int[] result = pairwiseSum(a);
        System.out.println(Arrays.toString(result));
    }
    static int[] pairwiseSum(int[] a){
        if(a.length == 0 || a.length % 2 == 1)
            return new int[0];
        int[] resultArray = new int[a.length / 2];
        for (int i = 0, j = 0; j < resultArray.length; i = i+2, j++){
            resultArray[j] = a[i] + a[i+1];
        }
        return resultArray;
    }
}
