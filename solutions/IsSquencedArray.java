package MumQuestions;

public class IsSquencedArray {
    public static void main(String[] args){
        int[] a = {5, 4, 3, 2, 1};
        int result = isSequencedArray(a, 1, 5);
        System.out.println(result);
    }
    static int isSequencedArray(int[] a, int m, int n){
        int isAsc = 1; int exc = 0; int diffElCount = 0;
        if(a.length == 0)
            return 0;
        for (int i = 0; i < a.length-1; i++){
            for (int j = i+1; j < a.length; j++){
                if(a[i] > a[j]){
                    isAsc = 0; break;
                }
            }
            if(isAsc == 0){
                break;
            }
            if(a[i] < m || a[i] > n){
                exc = 1; break;
            }
            if(a[i] != a[i+1]){
                diffElCount++;
            }
        }
        // System.out.println(diffElCount);
        if(isAsc == 1 && exc == 0 && diffElCount+1 == n-m+1){
            return 1;
        }
        return 0;
    }
}
