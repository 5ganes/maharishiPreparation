package MumQuestions;

public class NUpCountOfArray {
    public static void main(String[] args){
        int[] array = { 2, 3, 1, -6, 8, -3 -1, 2 };
        int nUpCount = nUpCount(array, 5);
        System.out.println(nUpCount);
    }
    public static int nUpCount(int[] a, int n){
        int partialSum = 0; int nUpCount = 0;
        for (int i = 0; i < a.length; i++){
            if(partialSum <= n && partialSum + a[i] > n)
                nUpCount++;
            partialSum += a[i];
        }
        return nUpCount;
    }
    public static int nUpCount1(int[] array, int n){
        int partialSum = 0;
        int nUpCount = 0;
        for (int i = 0; i < array.length; i++){
            if(partialSum <= n && partialSum + array[i] > n){
                nUpCount++;
            }
            partialSum += array[i];
        }
        return nUpCount;
    }
}
