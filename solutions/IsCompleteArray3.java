package MumQuestions;

public class IsCompleteArray3 {
    public static void main(String[] args){
        int[] a = {};
        int result = isComplete(a);
        System.out.println(result);
    }
    static int isComplete(int[] a){
        int maxEven = 0; int allPositive = 1;
        for (int i = 0; i < a.length; i++){
            if(a[i] <= 0){
                allPositive = 0; break;
            }
            if(a[i] % 2 == 0 && a[i] > maxEven)
                maxEven = a[i];
        }
        if(allPositive == 1 && maxEven > 0){
            for (int j = 2; j < maxEven; j = j+2){
                if(inArray(a, j) == 0)
                    return 0;
            }
        }
        else
            return 0;
        return 1;
    }
    static int inArray(int[] a, int n){
        for (int i = 0; i < a.length; i++){
            if(a[i] == n)
                return 1;
        }
        return 0;
    }
}
