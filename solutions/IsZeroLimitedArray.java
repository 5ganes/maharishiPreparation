package MumQuestions;

public class IsZeroLimitedArray {
    public static void main(String[] args){
        int[] a = {};
        int result = isZeroLimited(a);
        System.out.println(result);
    }
    static int isZeroLimited(int[] a){
        int n = 0;
        for (int i = 0; i < a.length; i++){
            if(i == 3 * n + 1 && a[i] != 0)
                return 0;
            if(i != 3 * n  + 1 && a[i] == 0)
                return 0;
            if(i == 3 * n + 1)
                n++;
        }
        return 1;
    }
}
