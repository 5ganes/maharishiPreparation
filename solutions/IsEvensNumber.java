package MumQuestions;

public class IsEvensNumber {
    public static void main(String[] args){
        int result = isEvens(2084);
        System.out.println(result);
    }
    static int isEvens(int n){
        if(n < 0) n = -n;
        int isEvens = 1;
        while (n != 0){
            if( n % 10 == 0 || (n % 10) % 2 == 1 ){
                isEvens = 0;
                break;
            }
            n /= 10;
        }
        return isEvens;
    }
}
