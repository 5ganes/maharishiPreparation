package MumQuestions;

public class StackedNumber {
    public static void main(String[] args){
        int result = isStacked(0);
        System.out.println(result);
    }
    static int isStacked(int n){
        int isStacked = 0;
        int sum = 0;
        if(n < 1){
            return 0;
        }
        for (int i = 1; i <= n; i++){
            sum += i;
            if(sum == n){
                isStacked = 1;
                break;
            }
        }
        return isStacked;
    }
}
