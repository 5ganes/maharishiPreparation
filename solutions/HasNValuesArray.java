package MumQuestions;

public class HasNValuesArray {
    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10};
        int result = hasNValuesArray(a, 10);
        System.out.println(result);
    }
    static int hasNValuesArray(int[] a, int n){
        if(n < 0) return 0;
        int alreadyPicked;
        int[] uArray = new int[n]; int uIndex = 0;
        for (int i = 0; i < a.length; i++){
            alreadyPicked = 0;
            for (int j = 0; j < uArray.length; j++){
                if(uArray[j] == a[i]){
                    alreadyPicked = 1; break;
                }
            }
            if(alreadyPicked == 0){
                if(uIndex == uArray.length)
                    return 0;
                else
                    uArray[uIndex++] = a[i];
            }
        }
        return uIndex == uArray.length ? 1 : 0;
    }
}
