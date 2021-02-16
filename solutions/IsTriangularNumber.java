package MumQuestions;

public class IsTriangularNumber {
    public static void main(String[] args){
        int result = isTriangular(3);
        System.out.println(result);
    }
    static int isTriangular(int n){
        if(n < 1)
            return 0;
        int sum = 0; int isTriangular = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
            if(sum == n){
                isTriangular++;
                break;
            }
            if(sum > n)
                break;
        }
        return isTriangular;
    }
}
