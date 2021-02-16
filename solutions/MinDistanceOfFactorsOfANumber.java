package MumQuestions;

public class MinDistanceOfFactorsOfANumber {
    public static void main(String[] args){
        int result = minDistance(75);
        System.out.println(result);
    }
    static int minDistance(int n){
        if(n <= 1)
            return 0;
        int minDistance = n;
        for (int i = 1; i <= n; i++){
            if(n % i == 0){
                for (int j = i + 1; j <= n; j++){
                    if(n % j == 0 && j-i < minDistance){
                        minDistance = j-i; break;
                    }
                }
            }
        }
        return minDistance;
    }
}
