package MumQuestions;

public class SecondLargestInArray {
    public static void main(String[] args){
        int[] array = {};
        int result = secondLargest(array);
        System.out.println(result);
    }
    public static int secondLargest(int[] array){
        if(array.length == 0 ||  array.length == 1)
            return -1;
        else{
            int max = array[0];
            int secondMax = 0;
            for (int i = 1; i < array.length; i++){
                if(array[i] > max){
                    secondMax = max;
                    max = array[i];
                }
                else if(array[i] != max && array[i] > secondMax){
                    secondMax = array[i];
                }
            }
            return secondMax;
        }
    }
}
