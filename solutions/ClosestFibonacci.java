package MumQuestions;

public class ClosestFibonacci {
    public static void main(String[] args){
        int result = closestFibonacci(33);
        System.out.println(result);
    }
    static int closestFibonacci(int n){
        if(n < 1) return 0;
        int f1 = 1; int f2 = 1; int tempf;
        do{
            tempf = f2;
            f2 = f1 + f2;
            f1 = tempf;
        }while (f2 < n);
        return f2 > n ? f1 : f2;
    }
}
