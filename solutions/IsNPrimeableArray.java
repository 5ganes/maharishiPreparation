package MumQuestions;

public class IsNPrimeableArray {
    public static void main(String[] args){
        int[] a = {6};
        int result = isNPrimeable(a, 2);
        System.out.println(result);
    }
    static int isNPrimeable(int[] a, int n){
        int number;
        for (int i = 0; i < a.length; i++){
            number = a[i] + n;
            for (int j = 2; j <= number / 2; j++){
                if(number % j == 0)
                    return 0;
            }
        }
        return 1;
    }
}
