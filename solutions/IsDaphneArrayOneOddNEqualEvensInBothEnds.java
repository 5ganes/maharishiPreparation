package MumQuestions;

public class IsDaphneArrayOneOddNEqualEvensInBothEnds {
    public static void main(String[] args){
        int[] a = {2, 6, 8, 7, 10, -4, 6};
        int result = isDaphne(a);
        System.out.println(result);
    }
    static int isDaphne(int[] a){
        int leftEvensCount = 0; int rightEvensCount = 0;
        int i, j;
        for (i = 0, j = a.length-1; i < a.length; i++, j--){
            if(a[i] % 2 == 0)
                leftEvensCount++;
            if(a[j] % 2 == 0)
                rightEvensCount++;
            if(Math.abs(a[i]) % 2 == 1 || Math.abs(a[j]) % 2 == 1)
                break;
        }
        if(leftEvensCount == rightEvensCount){
            for (int k = i; k <= j; k++){
                if(a[k] % 2 == 1){
                    return 1;
                }
            }
        }
        return 0;
    }
}
