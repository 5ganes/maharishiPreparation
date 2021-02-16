package MumQuestions;

public class IsCubePerfectArray {
    public static void main(String[] args){
        int[] a = {3, 7, 21, 36};
        int result = isCubePerfect(a);
        System.out.println(result);
    }
    static int isCubePerfect(int[] a){
        int isCubePerfect = 1; int isCube; int min; int max;
        for (int i = 0; i < a.length; i++){
            isCube = 0;
            min = a[i] < 0 ? a[i] : 0;
            max = a[i] < 0 ? -1 : a[i];
            // System.out.println(min);
            for (int j = min; j <= max; j++){
                if(j * j * j == a[i]){
                    isCube = 1; break;
                }
            }
            if(isCube== 0){
                isCubePerfect = 0; break;
            }
        }
        return isCubePerfect;
    }
}
