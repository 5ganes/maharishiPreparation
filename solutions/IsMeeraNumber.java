package MumQuestions;

public class IsMeeraNumber {
    public static void main(String[] args){
        // int[] a = {};
        int result = isMeera(30);
        System.out.println(result);
    }
    static int isMeera(int n){
        int nonTriFactsCount = 0;
        for (int i = 2; i <= n/2; i++){
            if( n % i == 0)
                nonTriFactsCount++;
        }
        System.out.println(nonTriFactsCount);
        return nonTriFactsCount != 0 && n % nonTriFactsCount == 0 ? 1 : 0;
    }
}
