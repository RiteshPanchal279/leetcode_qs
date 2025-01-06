import java.util.Arrays;

public class SqrOfSortedArr {
    public static void main(String[] args) {
    int[] arr= {-4,-1,0,3,10};
    int[] ans=sortedSquares(arr);
    for(int i:ans){
        System.out.print(i+",");
    }
    }
    static int[] sortedSquares(int[] nums) {
        int[] newarr = new int[nums.length];
        int k=0;
        for(int i:nums){
            newarr[k++] = i*i;
        }
        Arrays.sort(newarr);
        return newarr;
    }
}
