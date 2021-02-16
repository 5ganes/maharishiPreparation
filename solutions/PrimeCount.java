package MumQuestions;

public class PrimeCount {
    public static void main(String[] args){
        int primeCount = primeCount(10, 30);
        System.out.println(primeCount);
    }
    public static int primeCount(int start, int end){
        int primeCount = 0;
        for (int i = start; i <= end; i++){
            if(isPrime(i) == 1)
                primeCount++;
        }
        return primeCount;
    }
    static int isPrime(int n){
        if(n <= 1)
            return 0;
        for (int i = 2; i <= n/2; i++){
            if(n % i == 0)
                return 0;
        }
        return 1;
    }
    //    public static int primeCount1(int start, int end){
    //        int primeCount = 0;
    //        int isPrime;
    //        for (int n = start; n <= end; n++){
    //            if(n > 1) {
    //                isPrime = 1;
    //                for (int i = 2; i <= n/2; i++) {
    //                    if (n % i == 0) {
    //                        isPrime = 0; break;
    //                    }
    //                }
    //                if (isPrime == 1)
    //                    primeCount++;
    //            }
    //        }
    //        return primeCount;
    //    }
}
