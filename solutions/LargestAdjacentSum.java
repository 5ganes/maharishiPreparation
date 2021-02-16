package MumQuestions;

public class LargestAdjacentSum {
    public static void main(String[] args){
        int[] a =  {1,2};
        int result = largestAdjacentSum(a);
        System.out.println(result);
    }
    static int largestAdjacentSum(int[] a){
        int las = a[0] + a[1];
        for (int i = 1; i < a.length-1; i++){
            if(a[i] + a[i+1] > las){
                las = a[i] + a[i+1];
            }
        }
        return las;
    }
}
