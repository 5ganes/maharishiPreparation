package MumQuestions;

//import java.util.Arrays;

public class SumIsPowerArray {
    public static void main(String[] args){
        int[] a = {8, 8, 8};
        boolean result = sumIsPower(a);
        System.out.println(result);
    }
    static boolean sumIsPower(int[] a){
        if(a.length == 0)
            return false;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        int power = 1;
        for (int j = 0; j < sum; j++){
            power *= 2;
            if(power == sum)
                return true;
            if(power > sum)
                break;
        }
        return false;
    }
}
