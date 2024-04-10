import java.util.*;
public class Hashing {
    public static int[] twoSum(int arr[],int target){
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int diff = target-arr[i];
            if(hm.containsKey(diff)){
                return new int[]{hm.get(diff),i};
            }
            hm.put(arr[i],i);
        }
        return new int[]{0,0};
    }
    public static void main(String args[]){
        int arr[] = {2,7,11,15};
        int result[] = twoSum(arr,18);
        System.out.println(result[0]+" "+result[1]);
    }
}
