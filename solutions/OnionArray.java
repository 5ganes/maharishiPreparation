package MumQuestions;

public class OnionArray {
    public static void main(String[] args){
        int[] a  = {-2, 5, 0, 5, 12} ;
        int result = isOnionArray(a);
        System.out.println(result);
    }
    static int isOnionArray(int[] a){
        if(a.length == 0 || a.length == 1)
            return 1;
        int isOnionArray = 1;
        for (int j = 0, k = a.length-1; j < a.length/2; j++, k--){
            if(a[j] + a[k] > 10){
                isOnionArray = 0;
                break;
            }
        }
        int result = isOnionArray == 1 ? 1 : 0;
        return result;
    }
}
