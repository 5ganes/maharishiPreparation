package MumQuestions;

public class SameNumberOfFactors {
    public static void main(String[] args){
        int result = sameNumberOfFactors(0, 0);
        System.out.println(result);
    }
    static int sameNumberOfFactors(int n1, int n2){
        if(n1 < 0 || n2 < 0)
            return -1;
        if(n1 == n2)
            return 1;
        if(n1 == 0 || n2 == 0)
            return 0;
        int n1FactorCount = 0; int n2FactorCount = 0; int max = n1 > n2 ? n1 : n2;
        for (int i = 1; i <= max; i++){
            if(n1 % i == 0)
                n1FactorCount++;
            if (n2 % i == 0)
                n2FactorCount++;
        }
        return n1FactorCount == n2FactorCount ? 1 : 0;
    }
}
