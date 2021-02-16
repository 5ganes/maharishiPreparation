package MumQuestions;

import java.util.Arrays;

public class FillArray {
    public static void main(String[] args){
        int[] a = {2, 6, 9, 0, -3};
        int[] result = fill(a, 2, 4);
        System.out.println(Arrays.toString(result));
    }
    static int[] fill(int[] a, int k, int n){
        if(k <= 0 || n <= 0)
            return new int[0]; // return null;
        int[] arr2 = new int[n]; int j = 0;
        for (int i = 0; i < n; i++){
            arr2[i] = a[j++];
            if(j == k)
                j = 0;
        }
        return arr2;
    }
}
