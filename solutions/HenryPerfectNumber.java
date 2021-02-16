package MumQuestions;

public class HenryPerfectNumber {
    public static void main(String[] args){
        int result = henry(1, 3);
        System.out.println(result);
    }
    public static int henry(int i, int j){
        int factors;
        int factorPosition = 0;
        int ijPSSum = 0;
        for (int n = 1; n <= Integer.MAX_VALUE; n++){
            factors = 0;
            for (int k = 1; k < n; k++){
                if(n % k == 0){
                    factors += k;
                }
            }
            if(factors == n) {
                factorPosition++;
                if(factorPosition == i)
                    ijPSSum += n;
                if(factorPosition == j){
                    ijPSSum += n;
                    break;
                }
            }
        }
        return ijPSSum;
    }
}
