package MumQuestions;

public class IsMercuricalNumber {
    public static void main(String[] args){
        int[] a = {1, 3, 1, 1};
        int result = isMercurical(a);
        System.out.println(result);
    }
    static int isMercurical(int[] a){
        int isMercurical = 1; int oneCount = 0; int threeCount = 0;
        for (int i = 0; i < a.length; i++){
            if(a[i] == 1 && oneCount == 0)
                oneCount++;
            if(oneCount > 0 && a[i] == 3)
                threeCount++;
            if(oneCount > 0 && a[i] == 1 && threeCount > 0){
                isMercurical= 0; break;
            }
        }
        return isMercurical;
    }
}
