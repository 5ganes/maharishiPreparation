package MumQuestions;

public class ConvertToBase10 {
    public static void main(String[] args){
        int[] a = {3, 7, 1};
        int result = convertToBase10(a, 6);
        System.out.println(result);
    }
    static int convertToBase10(int[] a, int base){
        int isLegal = 1;
        int base10Number = 0;
        for (int i = 0; i <  a.length; i++){
            if(a[i] < 0 || a[i] >= base){
                isLegal = 0;
                break;
            }
        }
        if(isLegal == 1){
            for (int j = a.length-1, k = 0; j >= 0; j--, k++){
                base10Number += a[j] * Math.pow(base, k);
            }
            return base10Number;
        }
        else{
            return -1;
        }
    }
}