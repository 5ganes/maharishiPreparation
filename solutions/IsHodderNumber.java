package MumQuestions;

public class IsHodderNumber {
    public static void main(String[] args){
        int result = isHodderNumber(127);
        System.out.println(result);
    }
    static int isHodderNumber(int n){
        if(n <= 0)
            return 0;
        int isPrime = 1; int isHodder = 0; int powerValue;
        for (int i = 2; i <= n/2; i++){
            if(n % i == 0){
                isPrime = 0; break;
            }
        }
        if(isPrime == 1){
            for (int i = 1; i < n; i++){
                powerValue = 1;
                for (int j = 1; j <= i; j++)
                    powerValue *= 2;
                if(powerValue - 1 == n){
                    isHodder = 1; break;
                }
            }
        }
        return isHodder;
    }
}
