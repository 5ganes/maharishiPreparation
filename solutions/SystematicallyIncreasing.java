package MumQuestions;

public class SystematicallyIncreasing {
    public static void main(String[] args){
        int[] a  = {1, 2, 3, 1, 2, 1};
        int result = isSystematicallyIncreasing(a);
        System.out.println(result);
    }
    static int isSystematicallyIncreasing(int[] a){
        if(a.length == 0 || a[0] != 1)
            return 0;
        int isSysInc = 1; int j = 1; int k = 2;
        for (int i = 1; i < a.length; i++){
            if(a[i] != j){
                isSysInc = 0; break;
            }
            if(j++ == k){
                j = 1; k++;
            }
        }
        return isSysInc;
    }
}
