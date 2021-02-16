package MumQuestions;

public class IsBunkerArray {
    public static void main(String[] args){
        int[] a = {3, 7};
        int result = isBunker(a);
        System.out.println(result);
    }
    static int isBunker(int[] a){
        int isBunker = 0;
        for (int i = 0; i < a.length-1; i++){
            if(a[i] % 2 == 1 && isPrime(a[i+1]) == 1){
                System.out.println(a[i]);
                isBunker = 1;
                break;
            }
        }
        return isBunker;
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
