package MumQuestions;

public class CenteredArray15 {
    public static void main(String[] args){
        int[] array = {1, 1, 15 -1,-1};
        int result = isCentered15(array);
        System.out.println(result);
    }
    public static int isCentered15(int[] array){
        int tempSum;
        for (int i = 0; i < (int)Math.ceil((double)array.length / 2); i++){
            tempSum = 0;
            for (int j = i; j < array.length - i; j++){
                tempSum += array[j];
            }
            if(tempSum == 15)
                return 1;
        }
        return 0;
    }
}
