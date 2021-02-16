package MumQuestions;

public class AreFactorsEqualNumbers {
    public static void main(String[] args){
        int result = factorEqual(20, 30);
        System.out.println(result);
    }
    static int factorEqual(int n, int m){
        if(n <= 0 || m <= 0)
            return 0;
        int nFactorCount = 0; int mFactorCount = 0;
        for (int i = 1; i <= (n > m ? n : m); i++){
            if(n % i == 0)
                nFactorCount++;
            if(m % i ==0)
                mFactorCount++;
        }
        System.out.println(nFactorCount + " / " + mFactorCount);
        return nFactorCount == mFactorCount ? 1 : 0;
    }
}
