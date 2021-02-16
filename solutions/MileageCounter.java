package MumQuestions;

import java.util.Arrays;

public class MileageCounter {
    public static void main(String[] args){
        int[] a = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        updateMileageCounter(a, 1);
        System.out.println(Arrays.toString(a));
    }
    static void updateMileageCounter(int[] a, int miles){
        int carry = 0; int sum;
        for (int i = 0; i < a.length; i++){
            sum = a[i] + miles % 10 + carry;
            if(sum < 10){
                a[i] = sum; carry = 0;
            }
            else{
                a[i] = sum % 10; carry  = 1;
            }
            miles /= 10;
            if(miles == 0 && carry == 0)
                break;
        }
    }
}
