package MumQuestions;

public class IsPrimeProductNumber {
    public static void main(String[] args){
        int result = isPrimeProduct(22);
        System.out.println(result);
    }
    static int isPrimeProduct(int n){
        for (int i = 2; i <= n/2; i++){
            if(isPrime(i) == 1){
                for (int j = i+1; j <= n/2; j++){
                    if(isPrime(j) == 1 && i * j == n)
                        return 1;
                }
            }
        }
        return 0;
    }
    static int isPrime(int n){
        for (int i = 2; i <= n / 2; i++){
            if(n % i == 0)
                return 0;
        }
        return 1;
    }
}
