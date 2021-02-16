package MumQuestions;

public class LargestDifferenceOfEvens {
    public static void main(String[] args){
        int[] a  = {1, 2, 1, 2, 1, 4, 1, 6, 4} ;
        int result = largestDifferenceOfEvens(a);
        System.out.println(result);
    }
    static int largestDifferenceOfEvens(int[] a){
        int largestDiff = -Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                for (int  j = 0; j < a.length; j++){
                    if(i != j && a[j] % 2 == 0 && a[i] - a[j] > largestDiff)
                        largestDiff = a[i] - a[j];
                }
            }
        }
        return largestDiff == - Integer.MAX_VALUE ? -1 : largestDiff;
    }
}
