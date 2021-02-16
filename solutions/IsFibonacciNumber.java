package MumQuestions;

public class IsFibonacciNumber {
    public static void main(String[] args){
        int result = isFibonacciNumber(5);
        System.out.println(result);
    }
//    static int isFibonacciNumber(int n){
//        if(n < 1)
//            return 0;
//        int fibo1 = 1;
//        int fibo2  = 1;
//        int tempFibo;
//        while (fibo2 < n){
//            tempFibo = fibo2;
//            fibo2 += fibo1;
//            fibo1 = tempFibo;
//        }
//        return fibo2 == n ? 1 : 0;
//    }



    static int isFibonacciNumber(int n){
        if(n <= 0)
            return 0;
        int fibo1  = 1;
        int fibo2 = 1;
        while (fibo2 < n){
            fibo1 = fibo1 + fibo2;
            fibo2 = fibo1 - fibo2;
            fibo1 = fibo1 - fibo2;
            fibo2 = fibo1 + fibo2;
        }
        return fibo2 == n ? 1 : 0;
    }



















}
