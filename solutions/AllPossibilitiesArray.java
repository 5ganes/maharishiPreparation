package MumQuestions;

public class AllPossibilitiesArray {
    public static void main(String[] args){
        int[] a = {0, 2, 2};
        int result = isAllPossibilities(a);
        System.out.println(result);
    }
    static int isAllPossibilities(int[] a){
        if(a.length == 0)
            return 0;
        else{
            int found;
            for (int i = 0; i < a.length; i++){
                found = 0;
                for (int j = 0; j< a.length; j++){
                    if(i == a[j]){
                        found = 1; break;
                    }
                }
                if(found == 0){
                    return 0;
                }
            }
            return 1;
        }
    }
}
