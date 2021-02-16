package MumQuestions;

public class IsPairedNArray {
    public static void main(String[] args){
        int[] a = {};
        int result = isPairedN(a, 0);
        System.out.println(result);
    }
    static int isPairedN(int[] a, int n){
        if(2 * a.length - 3 >= n){
            for (int i = 0; i < a.length-1; i++){
                for (int j = i+1; j < a.length; j++){
                    if(i + j == n && a[i] + a[j] == n)
                        return 1;
                }
            }
        }
        return 0;
    }
}
