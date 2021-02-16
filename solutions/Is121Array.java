package MumQuestions;

public class Is121Array {
    public static void main(String[] args){
        int[] a = {2, 2, 2};
        int result = is123Array(a);
        System.out.println(result);
    }
    static int is123Array(int[] a){
        int is121Array = 1; int fOneCount = 0;
        if(a.length == 0 || a.length ==  1 || a.length == 2 || a[0] != 1 || a[a.length-1] != 1)
            return 0;
        for (int i  = 0;i < a.length; i++){
            if(a[i] == 2){
                fOneCount = i; break;
            }
        }
        for (int j = fOneCount; j < a.length - fOneCount; j++){
            if(a[j] != 2){
                is121Array = 0; break;
            }
        }
        for(int k  = a.length-fOneCount; k < a.length; k++){
            if(a[k] != 1){
                is121Array = 0; break;
            }
        }
        return is121Array;
    }
}
