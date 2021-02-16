package MumQuestions;

public class OddEvenSumsInArray {
    public static void main(String[] args){
        int[] array = { 7, 6, 5, 6, 2 };
        int result = oddEvenSum(array);
        System.out.println(result);
    }
    public static int oddEvenSum(int[] array){
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] % 2 == 1)
                oddSum += array[i];
            else
                evenSum += array[i];
        }
        return oddSum - evenSum;
    }
}
