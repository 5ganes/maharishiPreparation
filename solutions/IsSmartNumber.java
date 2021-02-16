package MumQuestions;

public class IsSmartNumber {
    public static void main(String[] args){
        int result = isSmart(21);
        System.out.println(result);
    }
    static int isSmart(int n){
        if( n <= 0 ) return 0;
        int sum = 1;
        for (int i = 0; i <= n && sum <= n; i++){
            System.out.println(sum+i);
            sum += i;
            if(sum == n)
                return 1;
        }
        return 0;
    }
}
