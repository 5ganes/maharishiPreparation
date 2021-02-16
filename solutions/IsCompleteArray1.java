package MumQuestions;

public class IsCompleteArray1 {
    public static void main(String[] args){
        int[] a = {};
        int result = isComplete(a);
        System.out.println(result);
    }
    static int isComplete(int[] a){
        int min = Integer.MAX_VALUE; int max = Integer.MIN_VALUE; int hasEven = 0; int isComplete = 1;
        for (int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0 && hasEven == 0)
                hasEven = 1;
            if(a[i] % 2 == 0){
                if(a[i] < min) min = a[i];
                if(a[i] > max) max = a[i];
            }
        }
        if(hasEven == 1 && min != max){
            for (int j = min + 1; j < max; j++){
                if(arrayContains(a, j) == 0){
                    isComplete = 0; break;
                }
            }
        }
        else
            isComplete = 0;
        return isComplete;
    }
    static int arrayContains(int[] a, int n){
        for (int i = 0; i < a.length; i++){
            if(n == a[i])
                return 1;
        }
        return 0;
    }
}
