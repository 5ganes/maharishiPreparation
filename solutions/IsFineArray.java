package MumQuestions;

public class IsFineArray {
    public static void main(String[] args){
        int[] a = {};
        int result = isFineArray(a);
        System.out.println(result);
    }
    static int isFineArray(int[] a){
        int isFineArray = 1; int twinFound;
        for (int i = 0; i < a.length; i++){
            twinFound = 0;
            if(isPrime(a[i])){
                if(isPrime(a[i]-2) && arrayContains(a,a[i]-2) || isPrime(a[i]+2) && arrayContains(a,a[i]+2)){
                    twinFound = 1; break;
                }
                if (twinFound == 0){
                    isFineArray = 0; break;
                }
            }
        }
        return isFineArray;
    }
    static boolean isPrime(int n){
        for (int i = 2; i <= n / 2; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
    static boolean arrayContains(int[] a, int n){
        for (int i = 0; i < a.length; i++){
            if(a[i] == n)
                return true;
        }
        return false;
    }
}
