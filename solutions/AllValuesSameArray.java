package MumQuestions;

public class AllValuesSameArray {
    public static void main(String[] args){
        int[] a = {83, 83, 83};
        int result = allValuesTheSame(a);
        System.out.println(result);
    }
    static int allValuesTheSame(int[] a){
        if(a.length == 0)
            return 0;
        int result = 1;
        int value = a[0];
        for (int i = 1; i < a.length; i++){
            if(value != a[i]){
                result = 0; break;
            }
        }
        return result;
    }
}
