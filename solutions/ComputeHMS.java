package MumQuestions;

import java.util.Arrays;

public class ComputeHMS {
    public static void main(String[] args){
        int[] result = computeHMS(33);
        System.out.println(Arrays.toString(result));
    }
    static int[] computeHMS(int seconds){
        int hmsArraySize = 0;
        int factor = 3600;
        while (factor != 0){
            factor /= 60;
            hmsArraySize++;
        }
        int[] hms = new int[hmsArraySize];
        factor = 3600;
        for (int i = 0; i < hms.length; i++){
            hms[i] = seconds / factor;
            seconds %= factor;
            factor /= 60;
        }
        return hms;
    }
}
