package MumQuestions;

public class IsCompleteArray {
    public static void main(String[] args){
        int[] a = {3, 2, 1, 1, 5, 6};
        int result = isComplete(a);
        System.out.println(result);
    }
    static int isComplete(int[] a){
        int perSqrCount = 0; int evenCount = 0; int diffElSum8Count = 0;
        for (int i = 0; i < a.length; i++){
            System.out.println(i);
            if(perSqrCount == 0){
                for (int j = 0; j <= a[i]; j++){
                    if(j * j == a[i]){
                        perSqrCount++; break;
                    }
                }
            }
            if(evenCount == 0 && a[i] > 0 && a[i] % 2 == 0)
                evenCount++;
            if(diffElSum8Count == 0){
                for (int j = i + 1; j < a.length; j++){
                    if(j < a.length && a[i] + a[j] == 8){
                        diffElSum8Count++; break;
                    }
                }
            }
            if(perSqrCount == 1 && evenCount == 1 && diffElSum8Count == 1)
                return 1;
        }
        return 0;
    }
}
