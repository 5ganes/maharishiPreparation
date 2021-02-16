package MumQuestions;

public class DigitIncreasing {
    public static void main(String[] args){
        int result = isDigitIncreasing(7404);
        System.out.println(result);
    }
    static int isDigitIncreasing(int n){
        if(n <= 0)
            return 0;
        int sum; int f; int tempSum;
        for (int i = 1; i <= 9; i++){
            sum = 0; tempSum = 0; f = 0;
            while (sum < n){
                tempSum += i * (int)Math.pow(10, f++);
                // System.out.println(tempSum);
                sum += tempSum;
            }
            if(sum == n){
                return 1;
            }
        }
        return 0;
    }
}