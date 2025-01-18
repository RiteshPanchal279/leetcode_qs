import java.util.Arrays;

public class BagOfTokensScore {
    public static void main(String[] args) {
    int[] tokens = {100,200,300,400};
    int  power = 200;
    int answer=bagOfTokensScore(tokens,power);
        System.out.println(answer);
    }
    static int bagOfTokensScore(int[] tokens, int power) {
//        sorting the array
        Arrays.sort(tokens);
        int score=0;
        int left=0,right=tokens.length-1;
        int maxScore=0;
// Iterate through array till last element include
        while(left <= right ){
// check power is grater then first token of array
            if(power>=tokens[left]){
                power-=tokens[left];             // reduce power by token
                left++;                          //move ahead
                score++;                            // increase the score
                maxScore=Math.max(maxScore,score);  // compare maxScore and score
            }else if(score > 0){
                power+=tokens[right];               // increase the power by right element which is high valued
                score--;                            // reduce score
                right--;                            // reduce right by 1 so it doesn't repeat
            }else{
                break;
            }
        }
        return maxScore; // the maxScore
    }
}
