package MumQuestions;

public class IsEvenOddIndexBalancedArray {
    public static void main(String[] args){
        int[] a = {};
        int result = isBalanced(a);
        System.out.println(result);
    }
    static int isBalanced(int[] a){
        int isBalanced = 1;
        for (int i = 0; i < a.length; i++){
            if(a[i] < 0 || (i%2 == 0 && a[i]%2 == 1) || (i%2 == 1 && a[i]%2 == 0)){
                isBalanced = 0; break;
            }
        }
        return isBalanced;
    }
}
