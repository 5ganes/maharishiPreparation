package MumQuestions;

public class IsMartianArray {
    public static void main(String[] args){
        int[] a = {1, 2, 1, 2, 1, 2, 1, 2, 1};
        int result = isMartianArray(a);
        System.out.println(result);
    }
    static int isMartianArray(int[] a){
        int oneCount = 0; int twoCount = 0;
        for (int i = 0; i < a.length; i++){
            if(i+1 < a.length && a[i] == a[i+1])
                return 0;
            if(a[i] == 1)
                oneCount++;
            if(a[i] == 2)
                twoCount++;
        }
        return oneCount > twoCount ? 1 : 0;
    }
}
