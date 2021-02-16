package MumTestExam;

public class CharArrayTrim {
    public static void main(String[] args){
        char[] array = {'a', 'b', 'c'};
        char[] resultArray = trimArray(array, 0, 3);
        System.out.println(resultArray);
    }
    static char[] trimArray(char[] array, int start, int len){
        char[] nullA = {};
        if(array.length == 0 || start < 0 || len < 0 || start + len > array.length)
            return nullA;
        char[] sub = new char[len];
        for (int i = start, j =0; j < len; i++, j++){
            sub[j] = array[i];
        }
        return sub;
    }
}
