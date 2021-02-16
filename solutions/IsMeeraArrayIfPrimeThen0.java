package MumQuestions;

public class IsMeeraArrayIfPrimeThen0 {
    public static void main(String[] args){
         int[] a = {8, 7, 0};
        int result = isMeera(a);
        System.out.println(result);
    }
    static int isMeera(int[] a){
        int hasPrime = 0; int hasZero = 0;
        for (int i = 0; i < a.length; i++){
            if(isPrime(a[i]) == 1 && hasPrime == 0)
                hasPrime = 1;
            if(a[i] == 0 && hasZero == 0)
                hasZero = 1;
            if(hasPrime  == 1 && hasZero == 1){
                break;
            }
        }
        return hasPrime == hasZero ? 1 : 0;
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
}
