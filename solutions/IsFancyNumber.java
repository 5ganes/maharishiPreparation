package MumQuestions;

public class IsFancyNumber {
    public static void main(String[] args){
        int result = isFancy(1);
        System.out.println(result);
    }
    static int isFancy(int n){
        if(n <= 0)
            return 0;
        int fancy1 = 1;
        int fancy2 = 1; int temp;
        while (fancy2 < n){
            temp =fancy2;
            fancy2 = 3 * fancy2 + 2 * fancy1;
            fancy1 = temp;
        }
        return fancy2 == n ? 1 : 0;
    }
}
