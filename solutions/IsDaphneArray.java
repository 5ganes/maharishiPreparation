package MumQuestions;

public class IsDaphneArray {
    public static void main(String[] args){
        int[] a = {1, 3, 17, -5};
        int result = isDaphne(a);
        System.out.println(result);
    }
    static int isDaphne(int[] a){
        int oddCount = 0; int evenCount = 0;
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i] % 2);
            if(a[i] % 2 == 1 || a[i] % 2 == -1)
                oddCount++;
            else
                evenCount++;
        }
        return oddCount > 0 && evenCount > 0 ? 0 : 1;
    }
}
