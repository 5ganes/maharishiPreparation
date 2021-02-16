package MumQuestions;

public class IsMagicArray {
    public static void main(String[] args){
        int[] a = {};
        int result = isMagicArray(a);
        System.out.println(result);
    }
    static int isMagicArray(int[] a){
        if(a.length == 0)
            return 0;
        int primeSum = 0;
        for (int i = 0; i < a.length; i++){
            if(isPrime(a[i]) == 1)
                primeSum += a[i];
        }
        return primeSum == a[0] ? 1 : 0;
    }
    static int isPrime(int n){
        if(n <= 1) return 0;
        for (int i = 2; i <= n/2; i++){
            if(n % i == 0)
                return 0;
        }
        return 1;
    }
}