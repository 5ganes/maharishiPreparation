package MumQuestions;

public class DigitSum {
    public static void main(String[] args){
        int result = isDigitSum(0,6);
        System.out.println(result);
    }
    static int isDigitSum(int n, int m){
        if(n < 0 || m < 0)
            return -1;
        int digitSum = 0;
        while (n != 0){
            digitSum += n % 10;
            n /= 10;
        }
        return digitSum < m ? 1 : 0;
    }
}
