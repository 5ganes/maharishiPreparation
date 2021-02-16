package MumQuestions;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class IsTrivalentArray {
    public static void main(String[] args){
        int[] a =  {-1, 0, 1, 0, 0, 0};
        int result = isTrivalent(a);
        System.out.println(result);
    }
    static int isTrivalent(int[] a){
        ArrayList<Integer> tempArray = new ArrayList<>();
        int present;
        if(a.length == 0)
            return 0;
        for (int i = 0; i < a.length; i++){
            present = 0;
            for (int j = 0; j < tempArray.size(); j++){
                if(a[i] == tempArray.get(j)){
                    present = 1;
                    break;
                }
            }
            if(present == 0){
                tempArray.add(a[i]);
            }
        }
//        System.out.println(tempArray.size());
//        System.out.println(tempArray.toString());
        if(tempArray.size() == 3)
            return 1;
        else return 0;
    }
}
