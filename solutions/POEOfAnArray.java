package MumQuestions;

public class POEOfAnArray {
    public static void main(String[] args){
        int[] array = {};
        int result = pointOfEquilibrium(array);
        System.out.println(result);
    }
    public static int pointOfEquilibrium(int[] array){
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if(j < i)
                    sumLeft += array[j];
                else if(j > i)
                    sumRight += array[j];
            }
            if(sumLeft == sumRight)
                return i;
            else{
                sumLeft = 0;
                sumRight = 0;
            }
        }
        return -1;
    }
}
