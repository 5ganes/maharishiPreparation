package MumQuestions;

public class IsOddValentArray {
    public static void main(String[] args){
        int[] a =  {8, 8, 8, 4, 4, 7, 2};
        int result = isOddValent(a);
        System.out.println(result);
    }
    static int isOddValent(int[] a){
        int isRepeatedNum = 0; int isOdd = 0;
        for (int i = 0; i < a.length; i++){
            for (int j = i+1; j < a.length && isRepeatedNum == 0; j++){
                if(a[i] == a[j]){
                    isRepeatedNum = 1; break;
                }
            }
            if(a[i] % 2 == 1)
                isOdd = 1;
            if(isRepeatedNum == 1 && isOdd == 1)
                return 1;
        }
        return 0;
    }
}
