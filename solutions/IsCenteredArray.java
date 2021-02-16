package MumTestExam;

public class IsCenteredArray {
    public static void main(String[] args){
        int[] array = {10};
        int result = isCentered(array);
        System.out.println(result);
    }
    public static int isCentered(int[] array){
        if(array.length % 2 == 0)
            return 0;
        else{
            int centerIndex = array.length / 2;
            for (int i = 0; i < array.length; i++){
                if(array[i] <= array[centerIndex] && i != centerIndex)
                    return 0;
            }
        }
        return 1;
    }
}
