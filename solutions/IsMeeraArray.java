package MumQuestions;

public class IsMeeraArray {
    public static void main(String[] args){
        int[] a = {};
        int result = isMeera(a);
        System.out.println(result);
    }
    static int isMeera(int[] a){
        int isDoubleFound;
        for (int i = 0; i < a.length; i++){
            isDoubleFound = 0;
            for (int j = 0; j < a.length; j++){
                if( 2 * a[i] == a[j] ){
                    isDoubleFound = 1;
                    break;
                }
            }
            if(isDoubleFound == 1)
                return 0;
        }
        return 1;
    }
}