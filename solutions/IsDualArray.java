package MumQuestions;

public class IsDualArray {
    public static void main(String[] args){
        int[] a = {1, 2, 3, 0};
        int result = isDual(a);
        System.out.println(result);
    }
    static int isDual(int[] a){
        if(a.length % 2 == 1  || a.length == 1)
            return 0;
        if(a.length >= 2){
            int conPairSum = a[0] + a[1];
            for (int i = 2; i < a.length-1; i = i+2){
                if(a[i] + a[i+1] != conPairSum)
                    return 0;
            }
        }
        return 1;
    }
}
