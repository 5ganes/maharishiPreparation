package MumQuestions;

public class ArrayDivisible {
    public static void main(String[] args){
        int[] array = { };
        int divisor = 12;
        int result = isDivisible(array, divisor);
        System.out.println(result);
    }
    public static int isDivisible(int[] a, int divisor){
        for (int i = 0; i < a.length; i++){
            if(a[i] % divisor != 0)
                return 0;
        }
        return 1;
    }
}
