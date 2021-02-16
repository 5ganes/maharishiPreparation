package MumQuestions;

import java.util.Arrays;

public class FilterArray {
    public static void main(String[] args){
        int[] a =  {9, -9};
        int[] result = filterArray(a, 4);
        System.out.println(Arrays.toString(result));
    }
    static int[] filterArray(int[] a, int n){
        int aSize = 0; int m = n; int binarySize = 0;
        while(n != 0){
            binarySize++;
            if(n % 2 == 1)
                aSize++;
            n /= 2;
        }
        int[] reqArray = new int[aSize];
        if(reqArray.length <= a.length && binarySize <= a.length){
            int i = 0; int c = 0;
            while (m != 0){
                if(m % 2 == 1)
                    reqArray[i++] = a[c];
                m /= 2;
                c++;
            }
        }
        else
            return new int[0];
        return reqArray;
    }
}
