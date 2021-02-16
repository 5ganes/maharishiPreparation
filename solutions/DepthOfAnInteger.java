package MumQuestions;

import java.util.ArrayList;

public class DepthOfAnInteger {
    public static void main(String[] args){
        int result = computeDepth(42);
        System.out.println(result);
    }
    static int computeDepth(int n){
        int multiple; int d; int multipleCount = 0;
        ArrayList<Integer> conDigits = new ArrayList<Integer>();
        for (int i = 1; i <= Integer.MAX_VALUE; i++){
            multiple = n * i;
            while (multiple != 0){
                d = multiple % 10;
                if(!conDigits.contains(d)){
                    conDigits.add(d);
                }
                multiple /= 10;
            }
            multipleCount++;
            if(conDigits.size() == 10){
                break;
            }
        }
        return multipleCount;
    }
}
