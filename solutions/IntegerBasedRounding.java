package MumQuestions;

import java.util.Arrays;

public class IntegerBasedRounding {
    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 5} ;
        int[] result = doIntegerBasedRounding(a, 100);
        System.out.println(Arrays.toString(result));
    }
    static int[] doIntegerBasedRounding(int[] a, int n){
        if(n <= 0)
            return a;
        for (int i = 0; i < a.length; i++){
            if(a[i] >= 0){
                for (int j = 0; j < Integer.MAX_VALUE; j++){
                    if(a[i] >= n*j && a[i] <= n*(j+1)){
                        if(a[i] - n*j < n*(j+1) - a[i])
                            a[i] = n*j;
                        else
                            a[i] = n*(j+1);
                        break;
                    }
                }
            }
        }
        return a;
    }
}
