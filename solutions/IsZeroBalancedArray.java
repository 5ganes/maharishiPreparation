package MumQuestions;

public class IsZeroBalancedArray {
    public static void main(String[] args){
        int[] a = {0, 0, 0, 0, 0, 0};
        int result = isZeroBalancd(a);
        System.out.println(result);
    }
    static int isZeroBalancd(int[] a){
        if(a.length == 0)
            return 0;
        int sum = 0; int isZeroBalanced = 1; int oppositeFound;
        for (int i = 0; i < a.length; i++){
            oppositeFound = 0;
            for (int  j = 0; j < a.length; j++){
                if(a[i] == 0 || a[i] == -a[j]){
                    oppositeFound = 1; break;
                }
            }
            if(oppositeFound == 0){
                isZeroBalanced = 0; break;
            }
            sum += a[i];
        }
        return isZeroBalanced == 1 && sum == 0 ? 1 : 0;
    }
}
