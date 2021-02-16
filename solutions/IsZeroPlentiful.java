package MumQuestions;

public class IsZeroPlentiful {
    public static void main(String[] args){
        int[] a  = {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0};
        int result = isZeroPlentiful(a);
        System.out.println(result);
    }
    static int isZeroPlentiful(int[] a){
        if(a.length < 4)
            return 0;
        int noOfZeroSeq = 0; int singleZeroSeqCount = 0;
        for (int i = 0; i < a.length; i++){
            if(a[i] == 0)
                singleZeroSeqCount++;
            if(a[i] != 0 || i == a.length-1){
                if(singleZeroSeqCount >= 4){
                    noOfZeroSeq++;
                    singleZeroSeqCount = 0;
                }
                else
                    return 0;
            }
        }
        return noOfZeroSeq;
    }
}
