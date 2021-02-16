package MumQuestions;

public class IsSquareInteger {
    public static void main(String[] args){
        int result = isSquare(4);
        System.out.println(result);
    }
    static int isSquare(int n){
        int isSquare = 0;
        for (int i = 0; i <= n; i++){
            if( i*i == n ){
                isSquare = 1;
                break;
            }
        }
        return isSquare;
    }
}
