package MumQuestions;

public class DecodeArrayToNumber1 {
    public static void main(String[] args){
        int[] a  = {-1, 0, 1};
        int result = decodeArray(a);
        System.out.println(result);
    }
    static int decodeArray(int[] a){
        int sign = 1;
        if(a[0] == -1) sign = -1;
        int num = 0; int f = 0; int zeroCount = 0;
        for (int i = a.length-2; i >= 0; i--){
            if(a[i] == 0) zeroCount++;
            if(a[i] == 1 || i == 0){
                num += zeroCount * (int)Math.pow(10, f++);
                zeroCount = 0;
            }
        }
        return sign * num;
    }
}
