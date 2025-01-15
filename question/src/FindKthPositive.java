// https://leetcode.com/problems/kth-missing-positive-number/?envType=study-plan-v2&envId=binary-search
public class FindKthPositive {
    public static void main(String[] args) {
    int [] arr = {2,3,4,7,11};
    int ans=findKthPositive(arr,5);
        System.out.println(ans);
    }
    static int findKthPositive(int[] arr, int k) {
        for(int i : arr){
            if(i <= k){
                k++;
            }
            else{
//              (i > k)
                break;
            }
        }
        return k;
    }
}
