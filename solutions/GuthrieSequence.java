package MumQuestions;

public class GuthrieSequence {
    public static void main(String[] args){
        int[] a = {3, 10, 5, 16, 8, 3, 2, 1};
        int result = isGuthrieSequence(a);
        System.out.println(result);
    }
    public static int isGuthrieSequence(int[] a){
        if(a.length == 0 || a[0] <= 0 || a[a.length-1] != 1)
            return 0;
        for (int i = 0; i < a.length-1; i++){
            if( (a[i] % 2 == 0 && a[i]/2 != a[i+1]) || (a[i] % 2 == 1 && a[i]*3+1 != a[i+1]) )
                return 0;
        }
        return 1;
    }
    public static int isGuthrieSequence1(int[] array){
        int next;
        if(array[array.length-1] != 1)
            return  0;
        for (int i = 0; i < array.length-1; i++){
            if(array[i] % 2 == 0)
                next = array[i] / 2;
            else
                next = array[i] * 3 + 1;
            if(next != array[i+1])
                return 0;
        }
        return 1;
    }
}
