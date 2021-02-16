package MumQuestions;

public class Is235Array {
    public static void main(String[] args){
        int[] a = {7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7};
        int result = is235Array(a);
        System.out.println(result);
    }
    static int is235Array(int[] a){
        int count2 = 0; int count3 = 0; int count5 = 0; int countNot = 0;
        for (int i = 0; i< a.length; i++){
            if(a[i] % 2 == 0)
                count2++;
            if(a[i] % 3 == 0)
                count3++;
            if(a[i] % 5 == 0)
                count5++;
            if(a[i] % 2 != 0 && a[i] % 3 != 0 && a[i] % 5 != 0)
                countNot++;
        }
        return count2 + count3 + count5 + countNot == a.length ? 1 : 0;
    }
}
