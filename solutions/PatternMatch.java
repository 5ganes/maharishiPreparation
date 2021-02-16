package MumQuestions;

public class PatternMatch {
    public static void main(String[] args){
        int[] a =  {1, 3, -5, 6, 2, -3, 18};
        int[] p =  {2, -1, 1, 1, -1, 1};
        int result = matches(a, p);
        System.out.println(result);
    }
    static int matches(int[] a, int[] p){
        int nPatternCount; int pPatternCount;
        int isMatched = 1;
        for (int i = 0, k = 0; i < p.length; i++, k = k+Math.abs(p[i-1])){
            nPatternCount = 0;
            pPatternCount= 0;
            for (int j = k; j < k+Math.abs(p[i]); j++){
                if(p[i] < 0 && a[j] < 0){
                    nPatternCount++;
                }
                else if(p[i] > 0 && a[j] > 0){
                    pPatternCount++;
                }
            }
            if(nPatternCount != Math.abs(p[i]) && pPatternCount != Math.abs(p[i])){
                isMatched = 0;
                break;
            }
        }
        return isMatched;
    }
}
