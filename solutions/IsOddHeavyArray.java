package MumQuestions;

public class IsOddHeavyArray {
    public static void main(String[] args){
        int[] a = {-2, -4, -6,-8, -11};
        int result = isOddHeavy(a);
        System.out.println(result);
    }
    static int isOddHeavy(int[] a){
        int isOddHeavy = 1; int hasOdd = 0;
        if(a.length == 0)
            return 0;
        for (int i = 0; i < a.length; i++){
            if(a[i] % 2  == 1){
                hasOdd = 1;
                for (int j = 0; j < a.length; j++){
                    if(a[j] % 2 == 0 && i != j && a[i] <= a[j]){
                        isOddHeavy = 0; break;
                    }
                }
            }
        }
        if(hasOdd == 0){
            isOddHeavy = 0;
        }
        return isOddHeavy;
    }
}
