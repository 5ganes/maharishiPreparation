package MumQuestions;

public class BEQNumber {
    public static void main(String[] args){
        System.out.println(findSmallestBEQ());
    }
    static int findSmallestBEQ(){
        int beq = 0; int cube; int sixCount;
        for (int i = 1; i <= Integer.MAX_VALUE; i++){
            sixCount = 0;
            cube = i * i * i;
            while (cube != 0){
                if(cube % 10 == 6)
                    sixCount++;
                cube /= 10;
            }
            if(sixCount == 4){
                beq = i; break;
            }
        }
        return beq;
    }
}
