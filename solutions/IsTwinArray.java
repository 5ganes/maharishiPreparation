package MumQuestions;

public class IsTwinArray {
    public static void main(String[] args){
         int[] a = {13, 14, 15, 3, 5} ;
        int result = isTwin(a);
        System.out.println(result);
    }
    static int isTwin(int[] a){
        int isTwin = 1; int twinFound;
        for (int i = 0; i < a.length; i++){
            twinFound = 0;
            if( isPrime(a[i]) ){
                if( (isPrime(a[i]-2) && inArray(a, a[i]-2) == 1) ||
                        (isPrime(a[i]+2) && inArray(a, a[i]+2) == 1) ){
                    twinFound = 1;
                }
                if( (isPrime(a[i]-2) || isPrime(a[i]+2)) && twinFound == 0 ){
                    isTwin = 0; break;
                }
            }
        }
        return isTwin;
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
    static int inArray(int[] a, int n){
        for (int i = 0; i < a.length; i++){
            if(a[i] == n)
                return 1;
        }
        return 0;
    }
}
