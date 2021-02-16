package MumQuestions;

public class HasKSmallFactors {
    public static void main(String[] args){
        boolean result = hasKSmallFactors(10, 20);
        System.out.println(result);
    }
    static boolean hasKSmallFactors(int k, int n){
        if(k <= 0 || n <= 0)
            return false;
        for (int i = 1; i < k; i++){
            if(n % i == 0 && n % (n/i) == 0 && n/i < k && i * (n/i) == n)
                return true;
        }
        return false;
    }
}
