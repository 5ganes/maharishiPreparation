package MumQuestions;

public class IsSetEqual {
    public static void main(String[] args){
        int[] a =   {};
        int[] b =  {};
        int result = isSetEqual(a, b);
        System.out.println(result);
    }
    static int isSetEqual(int[] a, int[] b){
        for (int i = 0; i < a.length; i++){
            if(inArray(b, a[i]) == 0)
                return 0;
        }
        for (int i = 0; i < b.length; i++){
            if(inArray(a, b[i]) == 0)
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
