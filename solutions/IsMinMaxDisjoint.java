package MumQuestions;

public class IsMinMaxDisjoint {
    public static void main(String[] args){
        int[] a =  {1, 3};
        int result = isMinMaxDisjoint(a);
        System.out.println(result);
    }
    static int isMinMaxDisjoint(int[] a){
        if(a.length == 0)
            return 0;
        int min = a[0];
        int max = a[0]; int minCount = 0; int maxCount = 0;
        for (int i = 0; i < a.length; i++){
            if(a[i] < min) min = a[i];
            if(a[i] > max) max = a[i];
        }
        if(min == max || min == max-1 || min == max+1)
            return 0;
        for (int i = 0; i < a.length; i++){
            if(min == a[i]) minCount++;
            if(max == a[i]) maxCount++;
        }
        if(minCount == 1 && maxCount == 1)
            return 1;
        else
            return 0;
    }
}
