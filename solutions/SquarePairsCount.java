package MumQuestions;

public class SquarePairsCount {
    public static void main(String[] args){
        int[] a = {11, 5, 4, 20};
        int result = countSquarePairs(a);
        System.out.println(result);
    }
    static int countSquarePairs(int[] a){
        int perfectSquareCount = 0;
        for (int i = 0; i < a.length; i++){
            if(a[i] > 0){
                for (int j = 0; j < a.length; j++){
                    if(a[j] > 0 && a[i] < a[j] && isPerfectSquare(a[i] + a[j]) == 1)
                        perfectSquareCount++;
                }
            }
        }
        return perfectSquareCount;
    }
    static int isPerfectSquare(int n){
        for (int i = 0; i <= n; i++){
            if( i * i == n)
                return 1;
            if(i * i > n)
                break;
        }
        return 0;
    }
}
