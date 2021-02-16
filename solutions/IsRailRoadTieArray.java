package MumQuestions;

public class IsRailRoadTieArray {
    public static void main(String[] args){
        int[] a = {1, 3, 0, 3, 5, 0};
        int result = isRailRoadTie(a);
        System.out.println(result);
    }
    static int isRailRoadTie(int[] a){
        int oneNonZero = 0; int isRailRoadTie = 1;
        int lExists; int rExists;
        if(a.length == 0 || a[0] == 0 || a[a.length-1] == 0)
            return 0;
        for (int i = 0; i < a.length; i++){
            if(a[i] != 0){
                oneNonZero = 1; break;
            }
        }
        if(oneNonZero == 1){
            for (int j = 0; j < a.length; j++){
                lExists = (j == 0 ? 0 : 1);
                rExists = (j == a.length-1 ? 0 : 1);
                if(lExists == 1 && rExists == 1){
                    if(a[j]!=0 && ((a[j-1]!=0 && a[j+1]!=0) || (a[j-1]==0 && a[j+1]==0))){
                        isRailRoadTie = 0; break;
                    }
                    if(a[j] == 0 && (a[j-1] == 0 || a[j+1] == 0)){
                        isRailRoadTie = 0; break;
                    }
                }
                else if(lExists == 1 && rExists == 0){
                    if(a[j]!=0 && a[j-1] == 0){
                        isRailRoadTie = 0; break;
                    }
                    if(a[j] == 0 && a[j-1] == 0){
                        isRailRoadTie = 0; break;
                    }
                }
                else if(lExists == 0 && rExists == 1){
                    if(a[j]!=0 && a[j+1] == 0){
                        isRailRoadTie = 0; break;
                    }
                    if(a[j] == 0 && a[j+1] == 0){
                        isRailRoadTie = 0; break;
                    }
                }
            }
        }
        else {
            isRailRoadTie = 0;
        }
        return isRailRoadTie;
    }
}
