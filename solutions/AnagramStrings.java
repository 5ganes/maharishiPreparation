package MumQuestions;

import java.util.Arrays;

public class AnagramStrings {
    public static void main(String[] args){
        char[] a1 = { 'p', 'o', 'o', 'l' };
        char[] a2 = {'p', 'o', 'l', 'l'};
        int result = areAnagrams(a1, a2);
        System.out.println(result);
    }
    static int areAnagrams(char[] a1, char[] a2){
        if(a1.length == 0 && a2.length == 0)
            return 1;
        if(a1.length != a2.length)
            return 0;
        int[] indexedArray = new int[a1.length]; int found; int j;
        for (int i = 0; i < indexedArray.length; i++){
            indexedArray[i] = -1;
        }
        int areAnagrams = 1; int present;
        for (int i = 0, k = 0; i < a1.length; i++, k++){
            found = 0;
            for (j = 0; j < a2.length; j++){
                present = 0;
                for (int l = 0; l < indexedArray.length; l++){
                    if(indexedArray[l] == j){
                        present++; break;
                    }
                }
                if(a1[i] == a2[j] && present == 0){
                    found++; break;
                }
            }
            if(found == 1)
                indexedArray[k] = j;
            else{
                areAnagrams--;
                break;
            }
        }
        System.out.println(Arrays.toString(indexedArray));
        return areAnagrams;
    }
}
