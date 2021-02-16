package MumQuestions;

public class PrimeHappy {
    public static void main(String[] args){
        int result = isPrimeHappy(5);
        System.out.println(result);
    }
    static int isPrimeHappy(int n){
        if(n <= 1)
            return 0;
        int primeSum = 0; int isPrime;
        for (int i = 2; i < n; i++){
            isPrime = 1;
            for (int j = 2; j <= i/2; j++){
                if(i % j == 0){
                    isPrime = 0;
                    break;
                }
            }
            if(isPrime == 1)
                primeSum += i;
        }
        return primeSum > 0 && primeSum % n == 0 ? 1 : 0;
    }
}
