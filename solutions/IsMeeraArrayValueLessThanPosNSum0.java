package MumQuestions;

public class IsMeeraArrayValueLessThanPosNSum0 {
    public static void main(String[] args){
        int[] a = {-4, 0, 1, 0, 2, 1};
        int result = isMeera(a);
        System.out.println(result);
    }
    static int isMeera(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            if(a[i] >= i)
                return  0;
            sum += a[i];
        }
        System.out.println(sum);
        return sum == 0 ? 1 : 0;
    }
}
