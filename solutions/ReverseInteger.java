package MumQuestions;

public class ReverseInteger {
    public  static void main(String[] args){
        int number = 123;
        int reverse = reverseInteger(number);
        System.out.println(reverse);
    }
    public static int reverseInteger(int number){
        int reverse = 0;
        while(number != 0){
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        return reverse;
    }
}
