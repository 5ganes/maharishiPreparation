package MumQuestions;

public class NextPerfectSquare {
    public static void main(String[] args){
        int nextPerfectSquare = nextPerfectSquare(-5);
        System.out.println("Next Perfect Square = " + nextPerfectSquare);
    }
    public static int nextPerfectSquare(int n){
        int square = 0; int i = 1;
        while (square <= n){
            square = i * i;
            i++;
        }
        return square;
    }
}
