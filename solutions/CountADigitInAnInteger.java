package MumQuestions;

public class CountADigitInAnInteger {
    public static void main(String[] args){
        int result = countDigit(203, 0);
        System.out.println(result);
    }
    static int countDigit(int n, int digit){
        if(n < 0 || digit < 0)
            return -1;
        int countDigit = 0;
        while (n != 0){
            if(n % 10 == digit)
                countDigit++;
            n /= 10;
        }
        return countDigit;
    }
}
