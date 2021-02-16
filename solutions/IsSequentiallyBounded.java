package MumQuestions;

public class IsSequentiallyBounded {
    public static void main(String[] args){
        int[] a = {5, 5, 5, 5, 7};
        int result = isSequentiallyBounded(a);
        System.out.println(result);
    }
    static int isSequentiallyBounded(int[] a){
        int isSorted = 1; int count; int isSeqBound = 1;
        for (int i = 0; i < a.length; i++){
            for (int  j = i+1; j < a.length; j++){
                if(a[i] > a[j]){
                    isSorted = 0;
                    break;
                }
            }
            if(isSorted == 0)
                break;
        }
        if(isSorted == 1){
            for (int i = 0; i < a.length; i++){
                count = 0;
                for (int j = 0; j < a.length; j++){
                    if(a[i] == a[j]){
                        count++;
                    }
                }
                if(count >= a[i]){
                    isSeqBound = 0;
                    break;
                }
            }
        }
        else{
            isSeqBound = 0;
        }
        return isSeqBound;
    }
}
