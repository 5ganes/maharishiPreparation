package MumQuestions;

public class CountOnesInBinaryRepresentationOfANumber {
    public static void main(String[] args){
        System.out.println(countOnes(63));
    }
    static int countOnes(int n){
        int countOnes = 0;
        while (n != 0){
            if(n % 2 == 1)
                countOnes++;
            n /= 2;
        }
        return countOnes;
    }
}
