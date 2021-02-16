package MumQuestions;

public class FactorTwoCountOfANumber {
    public static void main(String[] args){
        int result = factorTwoCount(1000);
        System.out.println(result);
    }
    static int factorTwoCount(int n){
        if(n <= 0)
            return 0;
        int count = 0;
        while (n % 2 == 0){
            count++;
            n /= 2;
        }
        return count;
    }
}
