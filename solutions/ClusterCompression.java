package MumQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class ClusterCompression {
    public static void main(String[] args){
        int[] a = {8, 8, 6, 6, -2, -2, -2};
        ArrayList result = clusterCompression(a);
        System.out.println(result.toString());
    }
    static ArrayList clusterCompression(int[] a){
        if(a.length ==0)
            return new ArrayList<Integer>();
        int cEl = a[0]; int sC; int i = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        while (i < a.length){
            sC = 0;
            for (int j = i; j < a.length; j++){
                if(cEl == a[j])
                    sC++;
                else
                    break;
            }
            temp.add(a[i]);
            if(i+sC >= a.length)
                break;
            cEl = a[i+sC];
            i += sC;
        }
        return temp;
    }
}
