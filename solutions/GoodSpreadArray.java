package MumQuestions;

public class GoodSpreadArray {
    public static void main(String[] args){
         int[] a = {1,1,1} ;
        int result = goodSpread(a);
        System.out.println(result);
    }
    static int goodSpread(int[] a){
        int count;
        for (int i = 0; i < a.length; i++){
            count = 0;
            for (int j = 0; j < a.length; j++){
                if(a[i] == a[j])
                    count++;
            }
            if(count > 3)
                return 0;
        }
        return 1;
    }
}
