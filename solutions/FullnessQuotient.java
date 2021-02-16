package MumQuestions;

public class FullnessQuotient {
    public static void main(String[] args){
        int result = fullnessQuotient(360);
        System.out.println(result);
    }
    static int fullnessQuotient(int n){
        int fullnessQuotient = 0; int full;
        for (int i = 2; i <= 9; i++){
            int m = n; String iBasedNum = ""; full = 1;
            while(m != 0){
                iBasedNum += m % i;
                m /= i;
            }
            for (int j = 0; j < iBasedNum.length(); j++){
                if(j < iBasedNum.length()-1 && (int)iBasedNum.charAt(j) == 0){
                    full = 0;
                    break;
                }
            }
            if(full == 1){
                fullnessQuotient++;
            }
        }
        return fullnessQuotient;
    }
}
