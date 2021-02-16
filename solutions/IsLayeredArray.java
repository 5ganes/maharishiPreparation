package MumQuestions;

public class IsLayeredArray {
    public static void main(String[] args){
        int[] a = {2, 2, 2, 3, 3, 1, 1};
        int result = isLayered(a);
        System.out.println(result);
    }
    static int isLayered(int[] a){
        if(a.length == 0 || a.length == 1)
            return 0;
        int twoCount = 0; int element = a[0]; int isLayered = 1;
        for (int i = 0; i < a.length; i++){
            if(i+1 < a.length && a[i] > a[i+1]){
                isLayered = 0; break;
            }
            if(a[i] == element)
                twoCount++;
            else{
                if(twoCount < 2){
                    isLayered = 0; break;
                }
                else {
                    twoCount = 0; element = a[i];
                }
            }
        }
        return isLayered;
    }
}
