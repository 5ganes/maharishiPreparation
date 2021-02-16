package MumQuestions;

public class MadhavArray {
    public static void main(String[] args){
        int[] a = {3, 1, 2, 3, 0};
        int result = isMadhavArray(a);
        System.out.println(result);
    }
    public static int isMadhavArray(int[] a){
        int condition = 0; int isMadhav = 1;
        for (int i = 1; i <= a.length; i++){
            if((i * (i+1)) / 2 == a.length){
                condition = 1; break;
            }
            if((i * (i+1)) / 2 > a.length)
                break;
        }
        if(condition == 1){
            int counter = 0; int sum;
            for (int j = 0; j < a.length; j = j+counter){
                sum = 0;
                for (int k = j; k <= j+counter; k++){
                    sum += a[k];
                }
                if(sum != a[0]){
                    isMadhav = 0; break;
                }
                counter++;
            }
        }
        else
            isMadhav = 0;
        return isMadhav;
    }
    public static int isMadhavArray1(int[] madhavArray){
        int arrLen = madhavArray.length;
        int madhavCondition = 0;
        for (int i = 0; i <= arrLen; i++){
            if(i*(i+1)/2 == arrLen){
                madhavCondition = 1;
            }
        }
        if(arrLen == 0 || arrLen == 1 || madhavCondition == 0)
            return 0;
        else{
            int increment = 2;
            int sum;
            for (int i = 0; i < arrLen; i +=increment++){
                sum = 0;
                if(i+1 < arrLen){
                    for (int j = i+1; j <= i+increment; j++){
                        sum += madhavArray[j];
                    }
                    if(madhavArray[0] != sum)
                        return 0;
                }
            }
        }
        return 1;
    }
}
