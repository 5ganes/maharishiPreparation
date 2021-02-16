package MumQuestions;

public class VesuvianNumber {
    public static void main(String[] args){
        int result = isVesuvian(50);
        System.out.println(result);
    }
    static int isVesuvian(int n){
        if(n <= 1) return 0;
        int sqrSumCnt = 0; int fSquare; int sSquare;
        for (int i = 1; i < n; i++){
            for (int j = i; j < n; j++){
                fSquare = 0; sSquare = 0;
                for (int k = 1; k <= i; k++){
                    if(k * k == i){
                        fSquare++; break;
                    }
                }
                for (int k = 1; k <= j; k++){
                    if(k * k == j){
                        sSquare++; break;
                    }
                }
                if(fSquare == 1 && sSquare == 1 && i + j == n)
                    sqrSumCnt++;
                if(sqrSumCnt == 2) return 1;
            }
        }
        return 0;
    }
}
