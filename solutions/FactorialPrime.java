package MumQuestions;

public class FactorialPrime {
    public static void main(String[] args){
        int result = isFactorialPrime(121);
        System.out.println(result);
    }
    static int isFactorialPrime(int n){
        if(n <= 0)
            return 0;
        int isPrime =1; int isFactorialPrime = 0;
        for (int i = 2; i <= n/2; i++){
            if(n % i == 0){
                isPrime = 0; break;
            }
        }
        if(isPrime == 1){
            for (int j = 1; j < n; j++){
                if(factorial(j) + 1 == n){
                    isFactorialPrime = 1; break;
                }
            }
        }
        return isFactorialPrime;
    }
    static int factorial(int n){
        if(n == 1)
            return 1;
        else
            return n * factorial(n-1);
    }
}
