package MumQuestions;

public class IsBalancedArray {
    public static void main(String[] args){
        int[] a = {1, 0, -1};
        int result = isBalanced(a);
        System.out.println(result);
    }
    static int isBalanced(int[] a){
        int isBalanced = 1;
        int doesNegationExist;
        for (int i = 0; i < a.length; i++){
            doesNegationExist = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == -a[j]) {
                    doesNegationExist = 1;
                    break;

                }
            }
            if(doesNegationExist == 0){
                isBalanced = 0; break;
            }
        }
        return isBalanced;
    }
}
