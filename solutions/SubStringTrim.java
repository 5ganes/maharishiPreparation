package MumQuestions;

public class SubStringTrim {
    public static void main(String[] args){
        char[] array = { };
        char[] result = subStringTrim(array, -1, 3);
        System.out.println(result);
    }
    public static char[] subStringTrim(char[] array, int index, int size){
        char[] subArray = new char[size];
        if(index < 0 || size < 0 || index + size > array.length){
            subArray[0] = '0';
            return subArray;
        }
        else{
            for (int i = index, j = 0; j < size; i++, j++){
                subArray[j] = array[i];
            }
        }
        return subArray;
    }
}
