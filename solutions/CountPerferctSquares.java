package MumQuestions;

public class CountPerferctSquares {
    public static void main(String[] args){
        int[] array = { 4, 7, 10, 1, -6, 8 };
        int result = countPerfectSquares(array);
        System.out.println(result);
    }
    public static int countPerfectSquares(int[] array){
        int perfectSquareCount = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if(isPerfectSquare(array[i], array[j])){
                    perfectSquareCount++;
                }
            }
        }
        return perfectSquareCount;
    }
    public static boolean isPerfectSquare(int a, int b){
        if(a < b && a > 0 && b > 0){
            if(Math.round(Math.sqrt((double)(a+b))) == Math.sqrt((double)(a+b)))
                return true;
        }
        return false;
    }
}
