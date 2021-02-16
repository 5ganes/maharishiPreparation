package MumQuestions;

public class InertialArray {
    public static void main(String[] args){
        int[] a = {};
        int result = isInertial(a);
        System.out.println(result);
    }
    static int isInertial(int[] a){
        if(a.length == 0)
            return 0;
        int hasOdd = 0; int max = a[0];
        for (int i = 0; i < a.length; i++){
            if(hasOdd == 0 && a[i] % 2 == 1)
                hasOdd = 1;
            if(a[i] > max)
                max = a[i];
        }
        if(hasOdd == 1 && max % 2 == 0){
            for (int i = 0; i < a.length; i++){
                if(a[i] % 2 == 1){
                    for (int j = 0; j < a.length; j++){
                        if(a[i] <= a[j] && a[j] != max && a[j] % 2 == 0)
                            return 0;
                    }
                }
            }
        }
        else
            return 0;
        return 1;
    }
    public static int isInertial1(int[] inertialArray){
        int max = inertialArray[0];
        int oddcount = 0;
        int evenConut = 0;
        for (int i = 0; i< inertialArray.length; i++){
            if(inertialArray[i] > max)
                max = inertialArray[i];
            if(inertialArray[i] % 2 == 1)
                oddcount++;
            else
                evenConut++;
        }
        if(oddcount == 0 || max % 2 == 1){
            return 0;
        }
        else{
            int[] oddArray = new int[oddcount];
            int[] evenArray = new int[evenConut];
            int j = 0; int k = 0;
            for (int i = 0; i < inertialArray.length; i++){
                if(inertialArray[i] % 2 == 1)
                    oddArray[j++] = inertialArray[i];
                else
                    evenArray[k++] = inertialArray[i];
            }
            for (int l = 0; l < oddcount; l++){
                for (int m = 0; m < evenConut; m++){
                    if(oddArray[l] < evenArray[m] && evenArray[m] != max)
                        return 0;
                }
            }
        }
        return 1;
    }
}
