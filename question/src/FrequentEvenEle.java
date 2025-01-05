import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FrequentEvenEle {
    public static void main(String[] args) {
        int[] arr= {2,2,3,4};
        int ans=evenFreqElement(arr);
        System.out.println(ans);
    }

    static int evenFreqElement(int[] arr){
//        note: in HashMap no duplication "key" allowed
        Map<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0, res = -1, curFre = 0;
        for(int val : arr){
            if(val % 2 == 1) continue;//skip the odd number
//    curFre will contain the current frequency of one even number
//    incrementing with +1 if some even number comes again and that is current frequency
//            eg: curFre = 0 + 1
            curFre = map.getOrDefault(val, 0) + 1;
//            now putting key,value as eg:2=1 next 2=2,3=1,4=1
            map.put(val, curFre);
            if(curFre > maxFreq || curFre == maxFreq && val < res){
//               assign the map key,value to other variable
                maxFreq = curFre;
                res = val;
            }
        }
        return res;
    }
}
