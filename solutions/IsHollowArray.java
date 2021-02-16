package MumQuestions;

public class IsHollowArray {
    public static void main(String[] args){
        int[] a = {1,2,0,0,0,3,4,5} ;
        int result = isHollowArray(a);
        System.out.println(result);
    }
    static int isHollowArray(int[] a){
        if(a.length == 0 || a.length == 1 || a.length == 2)
            return 0;
        int pNZCount = 0; int fNZCount = 0; int isHollow = 1;
        for (int i = 0, j = a.length-1; i < a.length; i++, j--){
            if(a[i] != 0) pNZCount++;
            if(a[j] != 0) fNZCount++;
            if(a[i]  == 0)
                break;
        }
        if(pNZCount == fNZCount && a.length - 2 * pNZCount >= 3){
            for (int k = pNZCount; k < a.length - pNZCount; k++){
                if(a[k] != 0){
                    isHollow = 0; break;
                }
            }
        }
        else
            isHollow = 0;
        return isHollow;
    }
}
