package MumQuestions;

public class GetExponent {
    public static void main(String[] args){
        int result = getExponent(128, 4);
        System.out.println(result);
    }
    static int getExponent(int n, int p){
        int exp = 0;
        if(p <= 1)
            return -1;
        for (int i = 1; i < Integer.MAX_VALUE; i++){
            if(n % (int)Math.pow((double)p, (double)i) != 0){
                exp = i-1; break;
            }
        }
        return exp;
    }
}
