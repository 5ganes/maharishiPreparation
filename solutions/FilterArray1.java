package MumQuestions;

public class FilterArray1 {
    public static void main(String[] args){
        int[] a = {7, 13};
        int result = isFilter(a);
        System.out.println(result);
    }
    static int isFilter(int[] a){
        int has9 = 0; int has11 = 0; int has7 = 0; int has13 = 0;
        for (int i = 0; i < a.length; i++){
            if(has9 == 0 && a[i] == 9)
                has9 = 1;
            if(has11 == 0 && a[i] == 11)
                has11 = 1;
            if(has7 == 0 && a[i] == 7)
                has7 = 1;
            if(has13 == 0 && a[i] == 13)
                has13 = 1;
        }
        return (has9 == 1 && has11 == 0) || (has7 == 1 && has13 == 1) ? 0 : 1;
    }
}
