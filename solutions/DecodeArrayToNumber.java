package MumQuestions;

public class DecodeArrayToNumber {
    public static void main(String[] args){
        int[] a  = {2, -3, -2, 6, 9, 18};
        int result = decodeArray(a);
        System.out.println(result);
    }
    static int decodeArray(int[] a){
        int sign = 1; int number = 0; int f = 0;
        if(a[0] < 0)
            sign = -1;
        for (int i = a.length-1; i > 0; i--){
            number += Math.abs(a[i-1] - a[i]) * Math.pow(10, f++);
        }
        number = sign * number;
        return number;
    }
}
