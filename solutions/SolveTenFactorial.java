package MumQuestions;

public class SolveTenFactorial {
    public static void main(String[] args){
        int[] nums = solve10();
        for (int n : nums){
            System.out.println(n);
        }
    }
    public static int[] solve10(){
        int fact10 = factorial(10);
        int[] array = new int[2];
        for (int i = 0; i <= 10; i++){
            for (int j = 0; j <= 10; j++){
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
