package MumQuestions;

public class IsTwinPrime {
    public static void main(String[] args){
        // int[] a = {0,0,0} ;
        int result = isTwinPrime(2);
        System.out.println(result);
    }
    static int isTwinPrime(int n){
        if(n <= 1)
            return 0;
        int isTwinPrime = 0;
        if(isPrime(n)){
            if(isPrime(n-2) || isPrime(n+2))
                isTwinPrime = 1;
        }
        return isTwinPrime;
    }
    static boolean isPrime(int n){
        if(n <= 1)
            return false;
        for (int i = 2; i <= n / 2; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
