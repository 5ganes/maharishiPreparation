package MumQuestions;

public class IsNormalNumber {
    public static void main(String[] args){
        int result = isNormal(8);
        System.out.println(result);
    }
    static int isNormal(int n){
        if(n <= 0)
            return 0;
        int isNormal = 1;
        for (int i = 2; i <= n/2; i++){
            if(n % i == 0 && i % 2 == 1){
                isNormal = 0; break;
            }
        }
        return isNormal;
    }
}
