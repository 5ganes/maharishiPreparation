package MumQuestions;

public class IsTripleArray {
    public static void main(String[] args){
        int[] a = {1, 1, 1};
        int result = isTriple(a);
        System.out.println(result);
    }
    static int isTriple(int[] a){
        int triple;
        for (int i = 0; i < a.length; i++){
            triple = 0;
            for (int j = 0; j < a.length; j++){
                if(a[i] == a[j])
                    triple++;
            }
            if(triple != 3)
                return 0;
        }
        return 1;
    }
}
