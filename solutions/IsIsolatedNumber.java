package MumQuestions;

import java.util.ArrayList;

public class IsIsolatedNumber {
    public static void main(String[] args){
        int result = isIsolated(57);
        System.out.println(result);
    }
    static int isIsolated(long n){
        long square; long cube; int isIsolated = 1;
        ArrayList<Long> squareArray = new ArrayList<>();
        ArrayList<Long> cubeArray = new ArrayList<>();
        if(n < 1 || n > 2097151)
            return -1;
        else{
            square = n * n;
            cube = square * n;
            while (cube != 0){
                if(square != 0)
                    squareArray.add(square % 10);
                cubeArray.add(cube % 10);
                square /= 10;
                cube /= 10;
            }
            for (int i = 0; i < squareArray.size(); i++){
                if(cubeArray.contains(squareArray.get(i))){
                    isIsolated = 0;
                    break;
                }
            }
        }
        return isIsolated;
    }
}
