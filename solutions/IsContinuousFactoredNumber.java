package MumQuestions;

public class IsContinuousFactoredNumber {
    public static void main(String[] args){
        int result = isContinuousFactored(90);
        System.out.println(result);
    }
    static int isContinuousFactored(int n){
        int factorsProduct; int factorsCount;
        for (int i = 2; i <= n/2; i++){
            if( n % i == 0 ) {
                factorsProduct = 1; factorsCount = 0;
                for (int j = i; j <= n/2; j++){
                    factorsProduct *= j;
                    factorsCount++;
                    if(factorsProduct == n && factorsCount > 1)
                        return 1;
                }
            }
        }
        return 0;
    }
}
