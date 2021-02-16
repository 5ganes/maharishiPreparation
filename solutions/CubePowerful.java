package MumQuestions;

public class CubePowerful {
    public static void main(String[] args){
        int result = isCubePowerful(153);
        System.out.println(result);
    }
    static int isCubePowerful(int n){
        if(n <= 0)
            return 0;
        int digitCubeSum = 0;
        int nBackup = n;
        int digit;
        while (n != 0){
            digit = n % 10;
            digitCubeSum += digit * digit * digit;
            n /= 10;
        }
        int result = digitCubeSum == nBackup ? 1 : 0;
        return result;
    }
}
