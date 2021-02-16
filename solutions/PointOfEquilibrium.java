package MumTestExam;

public class PointOfEquilibrium {
    public static void main(String[] args){
        int[] array = {0};
        int result = f(array);
        System.out.println(result);
    }
    static int f(int[] array){
        int poe = -1;
        int leftSum;
        int rightSum;
        for (int i = 0; i < array.length; i++){
            leftSum = 0;
            rightSum = 0;
            for (int j = 0;  j < i; j++)
                leftSum += array[j];
            for (int k = i+1; k < array.length; k++)
                rightSum += array[k];
            if(leftSum == rightSum)
                return i;
        }
        return poe;
    }
}
