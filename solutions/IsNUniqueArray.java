package MumQuestions;

public class IsNUniqueArray {
    public static void main(String[] args){
        int[] a = {1};
        int result = isNUnique(a, 4);
        System.out.println(result);
    }
    static int isNUnique(int[] a, int n){
        int nUniqueCount = 0;
        for (int i = 0; i < a.length; i++){
            for (int j = i+1; j < a.length; j++){
                if(a[i] + a[j] == n)
                    nUniqueCount++;
                if(nUniqueCount > 1)
                    return 0;
            }
        }
        if(nUniqueCount == 0)
            return 0;
        else
            return 1;
    }
}
