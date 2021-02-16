package MumQuestions;

public class IsLegalNumber {
    public static void main(String[] args){
        int[] a = {3, 7, 1};
        int result = isLegalNumber(a, 6);
        System.out.println(result);
    }
    static int isLegalNumber(int[] a, int base){
        int isLegal = 1;
        for (int i = 0; i <  a.length; i++){
            if(a[i] < 0 || a[i] >= base){
                isLegal = 0;
                break;
            }
        }
        return isLegal;
    }
}
