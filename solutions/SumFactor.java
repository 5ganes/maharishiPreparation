package MumQuestions;

public class SumFactor {
    public static void main(String[] args){
        int[] array = { };
        int result = sumFactor(array);
        System.out.println(result);
    }
    public static int sumFactor(int[] array){
        int sumFactor = 0;
        int sumFactorCount = 0;
        for (int i = 0; i < array.length; i++){
            sumFactor += array[i];
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] == sumFactor)
                sumFactorCount++;
        }
        return sumFactorCount;
    }
}
