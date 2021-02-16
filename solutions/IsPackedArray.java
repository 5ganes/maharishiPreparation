package MumQuestions;

public class IsPackedArray {
    public static void main(String[] args){
        int[] a =  {-3, -3, -3};
        int result = isPacked(a);
        System.out.println(result);
    }
    static int isPacked(int[] a){
        int isPacked = 1;
        for (int i = 0; i < a.length; i++){
            if(a[i] < 1)
                return 0;
        }
        for (int j = 0; j < a.length; j++){
            int count = 0;
            for (int k = 0; k < a.length; k++){
                if(a[k] == a[j])
                    count++;
            }
            if(count != a[j]){
                isPacked = 0; break;
            }
            if(j + a[j] - 1 >= a.length)
                break;
            j = j + a[j] - 1;
        }
        return isPacked;
    }
}
