package MumQuestions;

public class PatternMatchArray {
    public static void main(String[] args){
        int[] a =  {1, 1, 2, 2, 2, 2, 3};
        int[] pattern =  {1, 2, 3};
        int result = patternMatch(a, 7, pattern, 2);
        System.out.println(result);
    }
    static int patternMatch(int[] a, int len, int[] pattern, int patternLen){
        int i = 0; int k = 0; int matches = 0;
        for (i = 0; i < len; i++){
            if(a[i] == pattern[k])
                matches++;
            else if(matches == 0 || k == patternLen-1)
                return 0;
            else {
                k++;
                if(a[i] == pattern[k])
                    matches++;
            }
        }
        if(i == len && k == patternLen-1)
            return 1;
        else
            return 0;
    }
}
