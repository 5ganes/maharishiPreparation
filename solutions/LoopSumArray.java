package MumQuestions;

public class LoopSumArray {
    public static void main(String[] args){
        int[] a = {3};
        int result = loopSum(a, 10);
        System.out.println(result);
    }
    static int loopSum(int[] a, int n){
        int sum = 0; int j = 0;
        for (int i = 0; i < n; i++){
            sum += a[j++];
            if(j == a.length)
                j = 0;
        }
        return sum;
    }
}
