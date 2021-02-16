package MumQuestions;

public class LargestPrimeFactor {
    public static void main(String[] args){
        int result = largestPrimeFactor(4);
        System.out.println(result);
    }
    static int largestPrimeFactor(int n){
        if(n <= 1)
            return 0;
        int largestPrimeFactor = 0; int isPrime;
        for (int i = 2; i <= n/2; i++){
            isPrime = 1;
            if(n % i == 0){
                for (int j = 2; j <= i/2; j++){
                    if(i % j == 0){
                        isPrime = 0; break;
                    }
                }
                if(isPrime == 1){
                    largestPrimeFactor = i;
                }
            }
        }
        return largestPrimeFactor;
    }
}
