package MumQuestions;

public class IsConsecutiveFactored {
    public static void main(String[] args){
        // int[] a = {0,0,0} ;
        int result = isConsecutiveFactored(42);
        System.out.println(result);
    }
    static int isConsecutiveFactored(int n){
        int isConFactored = 0;
        for (int i = 2; i < n; i++){
            if(n % i == 0 && n % (i+1) == 0){
                isConFactored = 1;
                break;
            }
        }
        return isConFactored;
    }
}
