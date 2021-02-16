package MumQuestions;

public class StantonMeasureOfAnArray {
    public static void main(String[] args){
        int[] array = { 3, 1, 1 };
        int result = stantonMeasure(array);
        System.out.println(result);
    }
    public static int stantonMeasure(int[] array){
        int oneCount = 0;
        int oneCountCount = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] == 1)
                oneCount++;
        }
        for (int i = 0; i < array.length; i++){
            if(array[i] == oneCount)
                oneCountCount++;
        }
        return oneCountCount;
    }
}
