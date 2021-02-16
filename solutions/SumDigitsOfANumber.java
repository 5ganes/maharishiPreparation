package MumQuestions;

public class SumDigitsOfANumber {
    public static void main(String[] args){
        int result = sumDigits(6543);
        System.out.println(result);
    }
    static int sumDigits(int n){
        int sum = 0;
        if(n < 0) n = -n;
        while ( n != 0 ){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
