package MumQuestions;

public class IsWaveArray {
    public static void main(String[] args){
        int[] a = {2, -7, 2, 9};
        int result = isWave(a);
        System.out.println(result);
    }
    static int isWave(int[] a){
        int isWave = 1;
        for (int i = 0; i < a.length-1; i++){
            if(a[i] < 0) a[i] = -a[i];
            if(a[i+1] < 0) a[i+1] = -a[i+1];
            if(a[i] % 2 == a[i+1] % 2){
                isWave = 0;
                break;
            }
        }
        return isWave;
    }
}
