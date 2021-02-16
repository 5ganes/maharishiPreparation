package MumQuestions;

import java.util.Arrays;

public class TestClass {
    public static void main(String[] args){
        int[] nums = solve10();
        System.out.println(Arrays.toString(nums));
    }
    public static int[] solve10(){
        int fact10 = factorial(10);
        int[] array = new int[2];
        for (int i = 0; i <= 1000; i++){
            for (int j = 0; j <= 1000; j++){
                if(factorial(i) + factorial(j) == fact10){
                    array[0] = i;
                    array[1] = j;
                    return array;
                }
            }
        }
        return array;
    }
    public static int factorial(int n){
        if(n == 1 || n == 0)
            return 1;
        else
            return n * factorial(n-1);
    }
}
