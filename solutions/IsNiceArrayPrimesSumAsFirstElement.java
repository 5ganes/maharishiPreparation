package MumQuestions;

public class IsNiceArrayPrimesSumAsFirstElement {
    public static void main(String[] args){
        int[] a =  {12, 5, -5, 5, 2};
        int result = isNice(a);
        System.out.println(result);
    }
    static int isNice(int[] a){
        int primeSum = 0;
        for (int i = 0; i < a.length; i++){
            if(isPrime(a[i]) == 1)
                primeSum += a[i];
        }
        System.out.println(primeSum);
        return primeSum == a[0] ? 1 : 0;
    }
    static int isPrime(int n){
        if(n <= 1)
            return 0;
        for (int i = 2; i <= n / 2; i++){
            if(n % i == 0)
                return 0;
        }
        return 1;
    }
}
