package MumQuestions;

public class NextPorcupineNmber {
    public static void main(String[] args){
        int n = 13;
        int result = findPurcupineNumber(n);
        System.out.println(result);
    }
    public static int findPurcupineNumber(int n){
        int nBack;
        while (true){
            n++;
            nBack = n;
            if(isPrime(n) && n % 10 == 9){
                if(hasNextPrimeLastDigit9(nBack)){
                    return nBack;
                }
            }
        }
    }
    public static boolean hasNextPrimeLastDigit9(int m){
        while (true){
            m++;
            if(isPrime(m)){
                if(m % 10 == 9)
                    return true;
                else
                    return false;
            }
        }
    }
    public static boolean isPrime(int a){
        int isComposite = 0;
        for (int i = 2; i < (int)(a/2); i++){
            if(a % i == 0){
                isComposite = 1;
                break;
            }
        }
        if(isComposite == 0)
            return true;
        else
            return false;
    }
}