package MumQuestions;

public class IsBunkerArray1 {
    public static void main(String[] args){
         int[] a = {};
        int result = isMeera(a);
        System.out.println(result);
    }
    static int isMeera(int[] a){
        int hasPrime = 0; int hasOne = 0;
        for (int i = 0;  i < a.length; i++){
            if(isPrime(a[i]) == 1 && hasPrime == 0)
                hasPrime++;
            if(a[i] == 1 && hasOne == 0)
                hasOne++;
            if(hasPrime == 1 && hasOne == 1)
                break;
        }
        return hasPrime == hasOne ? 1 : 0;
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
