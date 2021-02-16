package MumQuestions;

public class ArrayHasNoZeros {
    public static void main(String[] args){
        int[] a = {3, 6, 2, 0};
        int result = arrayHasNoZeros(a);
        System.out.println(result);
    }
    static int arrayHasNoZeros(int[] a){
        int hasNoZero = 1;
        for (int i =0; i < a.length; i++){
            if(a[i] == 0){
                hasNoZero = 0;
                break;
            }
        }
        return hasNoZero;
    }
}
