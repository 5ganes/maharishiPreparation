package MumQuestions;

public class IsVanillaArray {
    public static void main(String[] args){
        int[] a = {9, 99, 999, -9999};
        int result = isVanilla(a);
        System.out.println(result);
    }
    static int isVanilla(int[] a){
        int isVanilla = 1;
        if(a.length == 0)
            return 1;
        int digit = a[0] % 10;
        for (int i = 0; i < a.length; i++){
            if(a[i] < 0)
                a[i] = -1 * a[i];
            while (a[i] != 0){
                if(digit != a[i] % 10){
                    isVanilla = 0;
                    break;
                }
                a[i] /= 10;
            }
            if(isVanilla == 0)
                break;
        }
        return isVanilla;
    }
}