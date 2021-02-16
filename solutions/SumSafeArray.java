package MumQuestions;

public class SumSafeArray {
    public static void main(String[] args){
        int[] a = { };
        int result = isSumSafe(a);
        System.out.println(result);
    }
    static int isSumSafe(int[] a){
        int sumOfElements = 0;
        int isSumSafe = 1;
        if(a.length == 0){
            return 0;
        }
        for (int i = 0; i < a.length; i++){
            sumOfElements += a[i];
        }
        for (int j = 0; j < a.length; j++){
            if(sumOfElements == a[j]){
                isSumSafe = 0;
                break;
            }
        }
        return isSumSafe;
    }
}
