import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
       int[] nums = {5,3,7,9,0,1,1};
       int and=majEle(nums);
       Arrays.sort(nums);
        System.out.println(and);
        for(int a:nums){
            System.out.print(a+",");
        }
    }

    public static int majEle(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        return arr[n/2];
    }
}
