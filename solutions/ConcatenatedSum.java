package MumQuestions;

public class ConcatenatedSum {
    public static void main(String[] args){
        int result = checkConcatenatedSum(9, 1);
        System.out.println(result);
    }
    static int checkConcatenatedSum(int n, int catlen){
        int m = n; int wholeConcatSum = 0; int digitConcatSum; int d;
        while (m != 0){
            d = m % 10; digitConcatSum = 0;
            for (int i = catlen-1; i>= 0; i--){
                digitConcatSum += d * Math.pow(10, i);
            }
            wholeConcatSum += digitConcatSum;
            m /= 10;
        }
        if(wholeConcatSum == n){
            return 1;
        }
        return 0;
    }
}
