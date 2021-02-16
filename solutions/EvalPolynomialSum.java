package MumQuestions;

public class EvalPolynomialSum {
    public static void main(String[] args){
        int[] a = {0, 1};
        double result = eval(10.0, a);
        System.out.println(result);
    }
    static double eval(double x, int[] a){
        if(a.length == 0)
            return 0.0;
        else{
            double sum = 0; double pow;
            for (int i = a.length-1; i >= 0; i--){
                pow = 1.0;
                for (int j =0; j < i; j++)
                    pow *= x;
                sum += a[i] * pow;
            }
            return sum;
        }
    }
}
