package MumQuestions;

public class RepsEqual {
    public static void main(String[] args){
        int[] array = { 0, 3, 2, 0, 5, 3 };
        int n = 32053;
        int result = repsEqual(array, n);
        System.out.println(result);
    }
    public static int repsEqual(int[] array, int n){
        int arrayNumber = 0;
        int factor = 1;
        for (int i = array.length-1; i >= 0; i--){
            arrayNumber += array[i] * factor;
            factor *= 10;
        }
        if(arrayNumber == n)
            return 1;
        else
            return 0;
    }
}
