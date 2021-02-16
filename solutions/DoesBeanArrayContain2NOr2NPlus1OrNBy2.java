package MumQuestions;

public class DoesBeanArrayContain2NOr2NPlus1OrNBy2 {
    public static void main(String[] args){
        int[] a = {3, 8, 6, 4};
        int result = isBean(a);
        System.out.println(result);
    }
    static int isBean(int[] a){
        for (int i = 0; i < a.length; i++){
            if(inArray(a, 2*a[i]) == 0 && inArray(a, 2*a[i]+1) == 0 &&
                    inArray(a, a[i]/2) == 0)
                return 0;
        }
        return 1;
    }
    static int inArray(int[] a, int n){
        for (int i = 0; i < a.length; i++){
            if(a[i] == n)
                return 1;
        }
        return 0;
    }
}
