import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[]nums = {1,2,3};
        List<List<Integer>> answer= permute(nums);
        System.out.println(answer);

    }
    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();

//        if length is 1 so it will add and return
        if(nums.length==1){
            List<Integer>singleList = new ArrayList<>();
            singleList.add(nums[0]);
            ans.add(singleList);
            return ans;
        }

        for(int i=0;i<nums.length;i++){
            int n=nums[i]; // taking each element of nums to add at the end of subArray or subList
            int[] remainingNums = new int[nums.length-1];// new array remaining element
            int index=0;
            for(int j=0;j<nums.length;j++){
                if(j != i){
                    remainingNums[index]=nums[j]; // assign the value nums to remainingNums array
                    index++;
                }
            }
//  Recursive call of permute
            List<List<Integer>> perms = permute(remainingNums);
            for(List<Integer> p:perms){
                p.add(n); // adding each nums element to end of subArray
            }
            ans.addAll(perms);// adding all subArray into one main List
        }
        return ans;
    }
}
