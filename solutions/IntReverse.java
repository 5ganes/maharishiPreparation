package MumTestExam;

public class IntReverse {
    public static void main(String[] args){
        int result = f(-12345);
        System.out.println(result);
    }
    static int f(int n){
        int r = 0;
        while (n != 0){
            r = r * 10 + n % 10;
            n /= 10;
        }
        return r;
    }
}
