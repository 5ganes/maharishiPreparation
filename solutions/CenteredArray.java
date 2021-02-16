package MumQuestions;

public class CenteredArray {
    public static void main(String[] args){
        int[] array = { 6 };
        int result = isCentered(array);
        System.out.println(result);
    }
    public static int isCentered(int[] array){
        if(array.length == 0 || array.length % 2 == 0 || array == null){
            return 0;
        }
        int centerPosition = array.length/2;
        for (int i = 0; i < array.length; i++){
            if( i != centerPosition && array[i] <= array[centerPosition] ){
                return 0;
            }
        }
        return 1;
    }
}
