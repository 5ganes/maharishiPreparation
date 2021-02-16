package MumQuestions;

public class Smallest {
    public static void main(String[] args){
        int result = smallest(4);
        System.out.println(result);
    }
    static int smallest(int n){
        int result = 0; int multiple; int isTwo;
        int nMultiplesHave2;
        for (int i = 1; i < Integer.MAX_VALUE; i++){
            nMultiplesHave2 = 0;
            for (int  j = 1; j <= n; j++){
                multiple = i * j; isTwo = 0;
                while (multiple != 0){
                    if(multiple % 10 == 2){
                        isTwo = 1; nMultiplesHave2++; break;
                    }
                    multiple /= 10;
                }
                if(isTwo == 0){
                    break;
                }
            }
            if(nMultiplesHave2 == n){
                result = i;
                break;
            }
        }
        return result;
    }
}
