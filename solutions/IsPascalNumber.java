package MumQuestions;

public class IsPascalNumber {
    public static void main(String[] args){
        int result = isPascal(1);
        System.out.println(result);
    }
    static int isPascal(int n){
        if(n <= 0)
            return 0;
        for (int i = 1; i <= n; i++){
            if( (i*(i+1)) / 2 == n )
                return 1;
        }
        return 0;
    }
}
