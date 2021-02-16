package MumQuestions;

import java.util.Arrays;

public class EncodeNumber {
    public static void main(String[] args){
        int[] result = encodeNumber(14);
        System.out.println(Arrays.toString(result));
    }
    static int[] encodeNumber(int n){
        if(n <= 1)
            return new int[0];
        int isPrime; int arrSize = 0;
        for (int i = 2; i <= n/2; n++){
            isPrime = 1;
            for (int j = 2; j <= i/2; j++){
                if(i % j == 0){
                    isPrime = 0; break;
                }
            }
            if (isPrime == 1) {
                while (n / i > 0){
                    arrSize++;
                    n /= i;
                }
            }
            if(n == 1){
                break;
            }
        }
        int[] a = new int[1];
        a[0] = arrSize;
        return a;
    }
}
